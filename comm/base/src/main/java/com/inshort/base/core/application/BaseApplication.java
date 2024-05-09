package com.inshort.base.core.application;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDexApplication;

import com.alibaba.android.arouter.launcher.ARouter;
import com.inshort.base.config.AppConfig;
import com.inshort.base.manger.ActivityStateManger;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class BaseApplication extends MultiDexApplication {

    @SuppressLint("StaticFieldLeak")
    private static Context mContext = null;

    public static Context getContext() {
        return mContext;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        BaseApplication.mContext = this;
        init();

    }

    private void init() {
        this.registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks);
        initARouter();
    }

    private void initARouter() {
        if (AppConfig.isDebug()) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    private final ActivityLifecycleCallbacks mActivityLifecycleCallbacks = new ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
            ActivityStateManger.getInstance().create(activity);
        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {

        }

        @Override
        public void onActivityResumed(@NonNull Activity activity) {

        }

        @Override
        public void onActivityPaused(@NonNull Activity activity) {

        }

        @Override
        public void onActivityStopped(@NonNull Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

        }

        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {
            ActivityStateManger.getInstance().destroyed(activity);
        }
    };

    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((context, layout) -> new MaterialHeader(context));
        SmartRefreshLayout.setDefaultRefreshFooterCreator(((context, layout) -> new ClassicsFooter(context)));
    }
}
