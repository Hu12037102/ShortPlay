package com.inshort.base.http;

import java.net.HttpURLConnection;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IApiService {
    interface Path {
        //APP初始化接口
        String SPLASH_INIT = "/app/initialize";
        //初始化user登录接口
        String SPLASH_USER_LOGIN = "/app/user";
        //首页接口
        String HOME_INDEX = "/app/index";
        //通过trendingType 获取 Trending列表
        String FIND_TRENDING_LIST_BY_TYPE = "/app/index/trend_ranking";
        //所有的TrendingType
        String LOAD_ALL_TRENDING_TYPES="/app/index/ranking_classify";
        //首页更多数据
        String LOAD_HOME_MORE_LIST="/app/index/waterfall_column";
        //获取首页ViewMore列表
        String LOAD_HOME_VIEW_MORE_LIST="/app/index/get_column_dramas";
    }

    interface HttpCode {
        int SUCCEED = HttpURLConnection.HTTP_OK;
        int UNAVAILABLE = HttpURLConnection.HTTP_UNAVAILABLE;

    }

    interface Url {
        String FAQ = "https://www.funbl.com/feedback/fun.html";
    }
}
