package com.inshort.base.other.arouter;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.Postcard;

public final class ARouterActivity {
    private ARouterActivity() {
    }

    public static void startToWebContentActivity(@Nullable String webUrl, @Nullable String webTitle) {
         ARouters.build(ARouterConfig.Path.Comm.ACTIVITY_WEB_CONTENT).withString(ARouterConfig.Key.WEB_URL, webUrl)
                .withString(ARouterConfig.Key.WEB_TITLE, webTitle)
                .navigation();

    }

    public static Intent getWebContentIntent(@Nullable Context context, @Nullable String webUrl, @Nullable String webTitle) {
        Postcard postcard = ARouters.build(ARouterConfig.Path.Comm.ACTIVITY_WEB_CONTENT)
                .withString(ARouterConfig.Key.WEB_URL, webUrl)
                .withString(ARouterConfig.Key.WEB_TITLE, webTitle);

        return ARouters.getIntent(context, postcard);
    }


}
