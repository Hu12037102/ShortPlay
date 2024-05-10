package com.inshort.base.http;

import java.net.HttpURLConnection;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IApiService {
    interface Path {
        //APP初始化接口
       String SPLASH_INIT="/app/initialize";
    }

    interface HttpCode {
        int SUCCEED = HttpURLConnection.HTTP_OK;

    }

    interface Url {
        String FAQ = "https://www.funbl.com/feedback/fun.html";
    }
}
