package com.inshort.base.http;

import java.net.HttpURLConnection;

public interface IApiService {
    interface Path{

    }

    interface HttpCode{
        int SUCCEED= HttpURLConnection.HTTP_OK;

    }

    interface Url{
    String FAQ="https://www.funbl.com/feedback/fun.html";
    }
}
