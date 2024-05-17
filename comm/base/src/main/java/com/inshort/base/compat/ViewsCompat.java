package com.inshort.base.compat;

import static android.os.Build.VERSION_CODES.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public final class ViewsCompat {
    private ViewsCompat() {
    }

    public static void setViewSize(@Nullable View view, int width, int height) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (DataCompat.isNull(layoutParams)) {
            layoutParams = new ViewGroup.LayoutParams(width, height);
        } else {
            layoutParams.width = width;
            layoutParams.height = height;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void setStatusTextColor(@Nullable Window window, boolean isDark) {
        if (DataCompat.isNull(window)) {
            return;
        }
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(isDark);
    }

    public static void hideStatusBar(@Nullable Window window) {
        if (window == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
       // WindowCompat.getInsetsController(window,window.getDecorView()).hide(WindowInsetsCompat.Type.statusBars());

        window.setStatusBarColor(Color.TRANSPARENT);
        window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @NonNull
            @Override
            public WindowInsets onApplyWindowInsets(@NonNull View v, @NonNull WindowInsets insets) {
                v.setPadding(
                        insets.getSystemWindowInsetLeft(),
                        0,
                        insets.getSystemWindowInsetRight(),
                        insets.getSystemWindowInsetBottom()
                );
                return insets.consumeSystemWindowInsets();
            }
        });
    }

    public static void setStatusBarMargin(@Nullable View view, @Nullable Activity activity, int addMargin) {
        if (view == null || activity == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        marginLayoutParams.topMargin = PhoneCompat.getStatusBarHeight(activity) + addMargin;
        view.setLayoutParams(marginLayoutParams);

    }


    public static void finishSetResult(@Nullable Activity activity, @Nullable Intent intent) {
        if (!DataCompat.isNull(activity)) {
            if (DataCompat.notNull(intent)) {
                activity.setResult(Activity.RESULT_OK, intent);
            } else {
                activity.setResult(Activity.RESULT_OK);
            }
            activity.finish();
        }
    }

    public static void finishSetResult(@Nullable Activity activity) {
        finishSetResult(activity, null);
    }

}
