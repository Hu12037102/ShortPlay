package com.inshort.base.compat;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

import com.inshort.base.core.application.BaseApplication;

import java.util.UUID;

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

    public static boolean notNull(@Nullable Object object) {
        return !isNull(object);
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

    @NonNull
    public static String checkString(@Nullable String content) {
        return checkString(content, null);
    }

    @NonNull
    public static String checkString(@Nullable String content, @Nullable String defaultContent) {
        if (DataCompat.isNull(defaultContent)) {
            defaultContent = "";
        }
        if (TextUtils.isEmpty(content)) {
            return defaultContent;
        } else {
            return content;
        }
    }

    @NonNull
    public static String toString(@Nullable Object object) {
        return object + "";
    }

    @ColorInt
    public static int getColor(@Nullable Context context, @ColorRes int colorRes) {
        return ContextCompat.getColor(checkContext(context), colorRes);
    }

    public static ColorStateList getColorStateList(@Nullable Context context, @ColorRes int colorRes) {
        return ContextCompat.getColorStateList(DataCompat.checkContext(context), colorRes);

    }

    @NonNull
    public static CharSequence getText(@Nullable TextView text) {
        if (text == null) {
            return "";
        }
        return text.getText() + "";
    }

    public static boolean isTextViewTextEmpty(@Nullable TextView textView) {
        if (DataCompat.isNull(textView)) {
            return true;
        }
        return TextUtils.getTrimmedLength(getText(textView)) == 0;
    }

    @NonNull
    public static String getOnlyId() {
        String id = "";
        String uuid = "" + UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        if (uuid.length() > 8) {
            uuid = uuid.substring(uuid.length() - 8);
        }
        id += uuid;
        var timestamp = System.currentTimeMillis() + "";
        if (timestamp.length() > 8) {
            timestamp = timestamp.substring(timestamp.length() - 8);
        }
        id += timestamp;
        id += (Math.random() * 10000);
        return id;
    }

    public static int getTextLength(@Nullable CharSequence text) {
        if (DataCompat.isNull(text)) {
            return 0;
        } else {
            return text.length();
        }
    }
}
