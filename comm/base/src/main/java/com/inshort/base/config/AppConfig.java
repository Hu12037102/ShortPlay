package com.inshort.base.config;


import com.inshort.base.BuildConfig;

public final class AppConfig {
    private AppConfig() {
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    public static boolean isShowLog() {
        return isDebug();
    }

    public static String baseUrl(){
        return BuildConfig.BASE_URL;
    }
}
