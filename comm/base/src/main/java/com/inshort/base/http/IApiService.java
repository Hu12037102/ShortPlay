package com.inshort.base.http;

import java.net.HttpURLConnection;

public interface IApiService {
    interface Path {
        //APP初始化接口
       String SPLASH_INIT="/app/initialize";
       //初始化user登录接口
       String SPLASH_USER_LOGIN="/app/user";
       //首页接口
        String HOME_INDEX="/app/index";

        //mylist
        String MY_LIST_INDEX="/app/my_list";

        //back his
        String PLAYBACK_HISTORY_LIST="/app/my_list/playback_history/list";

        //back love
        String PLAYBACK_LOVE_LIST="/app/my_list/collect_history/list";

        //通过trendingType 获取 Trending列表
        String FIND_TRENDING_LIST_BY_TYPE = "/app/index/trend_ranking";
        //所有的TrendingType
        String LOAD_ALL_TRENDING_TYPES="/app/index/ranking_classify";
        //首页更多数据
        String LOAD_HOME_MORE_LIST="/app/index/waterfall_column";
        //获取首页ViewMore列表
        String LOAD_HOME_VIEW_MORE_LIST="/app/index/get_column_dramas";
        //删除用户信息
        String DELETE_USER_ACCOUNT="/app/user/delete_account";
        //搜索剧集
        String SEARCH_LIST_BY_KEYWORD="/app/drama_series/search";
        //获取TransactionHistory历史记录
        String LOAD_TRANSACTION_HISTORY_LIST="/app/user/transaction_history";
        //获取EpisodesUnlocked记录
        String LOAD_EPISODE_UNLOCK_LIST="/app/user/episodes_unlocked";
        //获取bonus过期时间
        String LOAD_BONUS_EXPIRE_LIST="/app/user/bonus_hitory";
        //获取商品列表
        String LOAD_STORE_LIST="/app/store/details";
        //获取奖励中心详情
        String LOAD_AWARD_DETAILS ="/app/activity/details";
        //每日签到
        String DAILY_CHECK_IN="/app/activity/daily_check_in";

    }

    interface HttpCode {
        int SUCCEED = HttpURLConnection.HTTP_OK;
        int UNAVAILABLE = HttpURLConnection.HTTP_UNAVAILABLE;

    }

    interface Url {
        String FAQ = "https://www.funbl.com/feedback/fun.html";
        String PRIVACY_AGREEMENT = "https://h5.quanzishuzi.com/#/pages/my/conceal";
        String TERMS_SERVICE = "https://www.funbl.com/termsPage.html?app=true";
    }
}
