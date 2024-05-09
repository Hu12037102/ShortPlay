package com.inshort.splash.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.splash.databinding.ActivitySplashBinding;
import com.inshort.splash.viewmodel.SplashViewModel;

@Route(path = ARouterConfig.Path.Splash.ACTIVITY_SPLASH)
public class SplashActivity extends BaseCompatActivity<ActivitySplashBinding, SplashViewModel> {
    @Override
    protected ActivitySplashBinding getViewBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<SplashViewModel> getViewModelClass() {
        return SplashViewModel.class;
    }

    @Override
    protected void initView() {
        ViewsCompat.hideStatusBar(getWindow());
        GlideCompat.loadImage(com.inshort.base.R.mipmap.icon_splash_background, mViewBinding.aivContent);
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initEvent() {

        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                // ARouters.startActivity(ARouterConfig.Path.Main.ACTIVITY_MAIN);
            }
        }, 5000);
    }
    @Override
    protected void onWindowFirstFocusChanged() {
        super.onWindowFirstFocusChanged();
        ViewsCompat.setStatusBarMargin(mViewBinding.aivService,this, PhoneCompat.dp2px(this,16));
    }
}
