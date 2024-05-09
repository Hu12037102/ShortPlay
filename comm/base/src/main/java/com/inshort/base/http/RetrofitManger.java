package com.inshort.base.http;

import androidx.annotation.NonNull;

import com.inshort.base.config.AppConfig;
import com.inshort.base.utils.LogUtils;

import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public final class RetrofitManger {
    private OkHttpClient mOkHttpClient = null;
    private Retrofit mRetrofit = null;
    private static final long DEFAULT_TIME_OUT_MILLISECONDS = 15 * 1000L;

    private RetrofitManger() {
        init();
    }

    private static final RetrofitManger mInstance = new RetrofitManger();

    public static RetrofitManger getInstance() {
        return mInstance;
    }

    private void init() {
        initOkHttpClient();
        initRetrofit();
    }

    private final HttpLoggingInterceptor mHttpLoggingInterceptor = new HttpLoggingInterceptor(msg -> LogUtils.w("HttpLoggingInterceptor--", msg));

    private final Interceptor mHeadInterceptor = new Interceptor() {
        @NonNull
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {
            Request request = chain.request();

            return chain.proceed(request);
        }
    };

    private void initOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .callTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                .writeTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                .connectTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                .readTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                .proxy(Proxy.NO_PROXY);
        if (AppConfig.isDebug()) {
            builder.addInterceptor(mHttpLoggingInterceptor);
        }
        mOkHttpClient = builder.build();
    }

    private void initRetrofit() {
        mRetrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .baseUrl(AppConfig.baseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public <T> T create(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }

}
