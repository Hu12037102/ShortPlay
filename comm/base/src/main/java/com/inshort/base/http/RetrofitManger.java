package com.inshort.base.http;


import static okio.Okio.buffer;

import androidx.annotation.Nullable;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.config.AppConfig;
import com.inshort.base.digest.MD5Compat;
import com.inshort.base.entity.base.RequestEntity;
import com.inshort.base.other.mmkv.UserInfoStore;
import com.inshort.base.utils.LogUtils;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
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

    private final HttpLoggingInterceptor mHttpLoggingInterceptor = new HttpLoggingInterceptor(msg -> LogUtils.d("HttpLoggingInterceptor--", msg));

    private final Interceptor mHeadInterceptor = chain -> {
        Request request = chain.request();
        try {
            RequestBody requestBody = request.body();
            Object baseRequestBody;
            if (!DataCompat.isNull(requestBody) && requestBody.contentLength() > 0) {
                Buffer buffer = new Buffer();
                requestBody.writeTo(buffer);
                String json = buffer.readString(StandardCharsets.UTF_8);
                Gson gson = new Gson();
                baseRequestBody = gson.fromJson(json, Object.class);
                LogUtils.w("mHeadInterceptor", "Interceptor1:" + json);
            } else {
                baseRequestBody = new Object();
            }

            RequestEntity.PublicEntity publicEntity = new RequestEntity.PublicEntity();
            Map<String, Object> publicMap = entityKeyValues(publicEntity);
            final Map<String, Object> map = new HashMap<>(publicMap);

            RequestEntity.ExtendEntity extendEntity = new RequestEntity.ExtendEntity();
            Map<String, Object> extendMap = entityKeyValues(extendEntity);
            map.putAll(extendMap);

            Map<String, Object> requestMap = entityKeyValues(baseRequestBody);
            map.putAll(requestMap);

            Set<String> set = map.keySet();
            List<String> keyList = new ArrayList<>(set);

            Collections.sort(keyList);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < CollectionCompat.getListSize(keyList); i++) {
                String key = keyList.get(i);
                if (map.containsKey(key)) {
                    Object objectValue = map.get(key);
                    String value;
                    if (DataCompat.isNull(objectValue)) {
                        value = "null";
                    } else {
                        value = objectValue + "";
                    }
                    LogUtils.w("CollectionCompat", "key:" + key + "----" + "ObjectValue:" + objectValue + "----value:" + value);
                    sb.append(key).append("=").append(value);
                }

            }
            sb.append("M&N@Xe6%zlOa#SsjSKD5gry9BSgM1IUE");
            String sig = sb.toString().replaceAll("\"", "");
            sig = MD5Compat.stringToString(sig);
            LogUtils.w("mHeadInterceptor", "sort:" + sb);
            RequestEntity.PostDataEntity postDataEntity = new RequestEntity.PostDataEntity(
                    baseRequestBody, publicEntity, extendEntity, UserInfoStore.get().getAccessToken(), sig);

            RequestEntity requestEntity = new RequestEntity(postDataEntity);
            Gson gson = new Gson();
            String bodyJson = gson.toJson(requestEntity);
            request = request.newBuilder().post(RequestBody.create(bodyJson, MediaType.parse("application/json")))
                    .build();
            LogUtils.w("mHeadInterceptor", "Interceptor2:" + bodyJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chain.proceed(request);
    };

    private Map<String, Object> entityKeyValues(@Nullable Object object) {
        Map<String, Object> map = new HashMap<>();
        if (object == null) {
            return map;
        }
        String json = new Gson().toJson(object);
       /* LogUtils.w("entityKeyValues1", object.getClass().getSimpleName() + "Json:" + json);
        Map<String, Object> types = new Gson().fromJson(json, new TypeToken<Map<String, Object>>() {
        }.getType());
        if (!CollectionCompat.isEmptyMap(types)) {
            map.putAll(types);
        }
        for (String key : map.keySet()) {
            LogUtils.w("entityKeyValues2", object.getClass().getSimpleName() + "Key:" + key + "-----value:" + map.get(key));
        }*/
        JsonElement element = JsonParser.parseString(json);
        if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();
            for (String key : jsonObject.keySet()) {
                map.put(key, jsonObject.get(key));
            }
        }
        return map;
    }


    private void initOkHttpClient() {
        if (mOkHttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder()
                    .retryOnConnectionFailure(true)
                    .callTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                    .writeTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                    .connectTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                    .readTimeout(DEFAULT_TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS)
                    .addInterceptor(mHeadInterceptor)
                    .addInterceptor(mHttpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY))
                    //.proxy(Proxy.NO_PROXY)
                    ;
            mOkHttpClient = builder.build();
        }

    }

    private void initRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .client(mOkHttpClient)
                    .baseUrl(AppConfig.baseUrl())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }

    }

    public <T> T create(Class<T> clazz) {

        return mRetrofit.create(clazz);
    }

}
