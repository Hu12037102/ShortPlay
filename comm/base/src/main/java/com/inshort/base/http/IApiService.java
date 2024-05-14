package com.inshort.base.http;

import java.net.HttpURLConnection;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IApiService {
    interface Path {
        //APP初始化接口
       String SPLASH_INIT="/app/initialize";
       String SPLASH_USER_LOGIN="/app/user";
    }

    interface HttpCode {
        int SUCCEED = HttpURLConnection.HTTP_OK;
        int UNAVAILABLE = HttpURLConnection.HTTP_UNAVAILABLE;

    }

    interface Url {
        String FAQ = "https://www.funbl.com/feedback/fun.html";
    }
}
