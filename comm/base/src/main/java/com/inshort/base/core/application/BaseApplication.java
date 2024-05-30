package com.inshort.base.core.application;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDexApplication;

import com.alibaba.android.arouter.launcher.ARouter;
import com.inshort.base.R;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.config.AppConfig;
import com.inshort.base.factory.FileFactory;
import com.inshort.base.manger.ActivityStateManger;
import com.scwang.smart.refresh.footer.BallPulseFooter;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.tencent.mmkv.MMKV;

import java.io.File;

public class BaseApplication extends MultiDexApplication {

    @SuppressLint("StaticFieldLeak")
    private static Context mContext = null;

    public static Context getContext() {
        return mContext;
    }

   /* private static AppViewModel mAppViewModel;

    public static AppViewModel getAppViewModel() {
        return mAppViewModel;
    }*/


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        BaseApplication.mContext = this;
        File file = FileFactory.createRootDir(FileFactory.TYPE_APP);
        if (file == null) {
            MMKV.initialize(this);
        } else {
            MMKV.initialize(this, file.getAbsolutePath());
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
   /*     ViewModelProvider.AndroidViewModelFactory factory = ViewModelProvider.AndroidViewModelFactory.getInstance(this);
        BaseApplication.mAppViewModel = new ViewModelProvider(this, factory).get(AppViewModel.class);*/
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
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((context, layout) -> new MaterialHeader(context).
                setColorSchemeResources(R.color.color_FFFF5C4F, R.color.color_FFFE2442));
        // SmartRefreshLayout.setDefaultRefreshFooterCreator(((context, layout) -> new ClassicsFooter(context)));
        SmartRefreshLayout.setDefaultRefreshFooterCreator(((context, layout) -> new BallPulseFooter(context)
                .setNormalColor(DataCompat.getColor(layout.getLayout().getContext(), R.color.color_FFFE2442))
                .setNormalColor(DataCompat.getColor(layout.getLayout().getContext(), R.color.color_FFFF5C4F))
                .setSpinnerStyle(SpinnerStyle.Translate)
        ));
    }

   /* @NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }*/
}
