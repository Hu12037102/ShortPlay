package com.inshort.base.other.arouter;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.Postcard;

public final class ARouterActivity {
    private ARouterActivity() {
    }

    public static void startToWebContentActivity(@Nullable String webUrl, @Nullable String webTitle) {
        Postcard postcard = ARouters.build(ARouterConfig.Path.Comm.ACTIVITY_WEB_CONTENT);
        if (postcard != null) {
            postcard.withString(ARouterConfig.Key.WEB_URL, webUrl)
                    .withString(ARouterConfig.Key.WEB_TITLE, webTitle)
                    .navigation();
        }
    }
}
