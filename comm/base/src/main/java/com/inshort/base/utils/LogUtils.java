package com.inshort.base.utils;

import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.inshort.base.config.AppConfig;


public final class LogUtils {
    private LogUtils() {
    }

    private static final int MAX_LOG_LENGTH = 800;

    public static void w(@Nullable String tag, @Nullable String msg) {
        try {
            if (!AppConfig.isShowLog()) {
                return;
            }
            if (TextUtils.isEmpty(tag)||TextUtils.isEmpty(msg)) {
              return;
            }

            if (msg.length() > MAX_LOG_LENGTH) {
                int i = 0;
                while (i < msg.length()) {
                    if (i + MAX_LOG_LENGTH < msg.length()) {
                        Log.w(tag,msg.substring(i,i+MAX_LOG_LENGTH));
                    } else {
                        Log.w(tag,msg.substring(i));
                    }
                    i += MAX_LOG_LENGTH;
                }


            }else {
                Log.w(tag,msg);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void w(@Nullable String msg){
       w(null,msg);
    }


    public static void d(@Nullable String tag, @Nullable String msg) {
        try {
            if (!AppConfig.isShowLog()) {
                return;
            }
            if (TextUtils.isEmpty(tag)||TextUtils.isEmpty(msg)) {
                return;
            }
            if (msg.length() > MAX_LOG_LENGTH) {
                int i = 0;
                while (i < msg.length()) {
                    if (i + MAX_LOG_LENGTH < msg.length()) {
                        Log.d(tag,msg.substring(i,i+MAX_LOG_LENGTH));
                    } else {
                        Log.d(tag,msg.substring(i));
                    }
                    i += MAX_LOG_LENGTH;
                }


            }else {
                Log.d(tag,msg);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void d(@Nullable String msg){
        d(null,msg);
    }

}
