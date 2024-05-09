package com.inshort.base.compat;

import android.content.Context;
import android.text.TextUtils;

import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import com.inshort.base.core.application.BaseApplication;

public final class DataCompat {


    private DataCompat() {
    }

    public static Context applicationContext() {
        return BaseApplication.getContext();
    }

    @NonNull
    public static Context checkContext(@Nullable Context context) {
        if (DataCompat.isNull(context)) {
            return applicationContext();
        } else {
            return context;
        }
    }

    public static boolean isNull(@Nullable Object obj) {
        return obj == null;
    }

    public static int dimen2px(@Nullable Context context, @DimenRes int dimenRes) {
        if (isNull(context)) {
            return 0;
        }
        try {
            return context.getResources().getDimensionPixelSize(dimenRes);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getResString(@Nullable Context context, @StringRes int resString) {
        if (isNull(context)) {
            return "";
        }
        try {
            return context.getString(resString);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getResString(@Nullable Context context, @StringRes int resString, Object... formatArgs) {
        if (isNull(context)) {
            return "";
        }
        try {
            return context.getString(resString, formatArgs);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
