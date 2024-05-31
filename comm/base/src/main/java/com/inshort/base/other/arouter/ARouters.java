package com.inshort.base.other.arouter;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.core.fragment.BaseCompatFragment;

public final class ARouters {
    private ARouters() {
    }

    @NonNull
    public static Postcard build(@Nullable String path) {
        int flag = Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP;
        return ARouter.getInstance().build(path).withFlags(flag).greenChannel();
    }

    public static void startActivity(@Nullable String path) {
        try {
            if (TextUtils.isEmpty(path)) {
                return;
            }
            build(path).navigation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public static Fragment getFragment(String fragmentPath) {
        Fragment fragment = null;
        try {
            Object obj = build(fragmentPath).navigation();
            if (obj instanceof Fragment) {
                fragment = (Fragment) obj;
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


    public static Intent getIntent(@Nullable Context context, @Nullable String path) {
        if (DataCompat.isNull(context)) {
            context = DataCompat.applicationContext();
        }
        if (DataCompat.isNull(path)) {
            return null;
        }
        Postcard postcard = build(path);
        LogisticsCenter.completion(postcard);
        Intent intent = new Intent(context, postcard.getDestination());
        intent.putExtras(postcard.getExtras());
        if (context instanceof Application) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        return intent;
    }

    public static Intent getIntent(@Nullable Context context, @NonNull Postcard postcard) {
        context = DataCompat.checkContext(context);
        LogisticsCenter.completion(postcard);
        Intent intent = new Intent(context, postcard.getDestination());
        intent.putExtras(postcard.getExtras());
        if (context instanceof Application) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        return intent;
    }
}
