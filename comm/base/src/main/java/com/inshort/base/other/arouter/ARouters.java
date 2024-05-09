package com.inshort.base.other.arouter;

import android.content.Intent;
import android.text.TextUtils;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;

public final class ARouters {
    private ARouters() {
    }

    @Nullable
    public static Postcard build(@Nullable String path) {
        try {
            int flag = Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP;
            return ARouter.getInstance().build(path).withFlags(flag).greenChannel();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void startActivity(@Nullable String path) {
        try {
            if (TextUtils.isEmpty(path)) {
                return;
            }
            Postcard postcard = build(path);
            if (postcard != null) {
                postcard.navigation();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
