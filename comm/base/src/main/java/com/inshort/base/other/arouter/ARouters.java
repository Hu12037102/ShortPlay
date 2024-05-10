package com.inshort.base.other.arouter;

import android.content.Intent;
import android.text.TextUtils;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.inshort.base.core.fragment.BaseCompatFragment;

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

    @Nullable
    public static Fragment getFragment(String fragmentPath) {
        Fragment fragment = null;
        try {
            Postcard postcard = build(fragmentPath);
            if (postcard != null) {
                Object obj = postcard.navigation();
                if (obj instanceof Fragment) {
                    fragment = (Fragment) obj;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fragment;
    }

    @Nullable
    public static BaseCompatFragment<?, ?> getBaseCompatFragment(String fragmentPath) {
        Fragment fragment = getFragment(fragmentPath);
        return fragment instanceof BaseCompatFragment<?, ?> baseCompatFragment ? baseCompatFragment : null;
    }
}
