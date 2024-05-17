package com.inshort.splash.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.InitEntity;
import com.inshort.base.entity.ResponseErrorEntity;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.http.IApiService;
import com.inshort.base.other.arouter.ARouterActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.weight.click.DelayedClick;
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
        initialize();
    }

    private void initialize(){
        mViewBinding.aivService.setVisibility(View.GONE);
        mViewModel.initialize();
    }


    @Override
    protected void initEvent() {
        mViewBinding.aivService.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                Intent intent = ARouterActivity.getWebContentIntent(SplashActivity.this, IApiService.Url.FAQ, DataCompat.getResString(SplashActivity.this,
                        com.inshort.base.R.string.feedback_content));
                if (DataCompat.notNull(intent)) {
                    mServiceLauncher.launch(intent);
                }
               /* ARouterActivity.startToWebContentActivity(IApiService.Url.FAQ, DataCompat.getResString(SplashActivity.this,
                        com.inshort.base.R.string.feedback_content));*/
            }
        });
    }

    @Override
    protected void onClickEmptyView(@NonNull View view) {
        super.onClickEmptyView(view);
        initialize();
    }

    private final ActivityResultLauncher<Intent> mServiceLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult o) {
            if (o != null && o.getResultCode() == Activity.RESULT_OK) {
                initialize();
            }
        }
    });

    @Override
    protected void onUserUpdate(@NonNull UserEntity userEntity) {
        super.onUserUpdate(userEntity);
        ARouters.startActivity(ARouterConfig.Path.Main.ACTIVITY_MAIN);
        ViewsCompat.finishSetResult(this);
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getInitializeLiveData().observe(this, new Observer<InitEntity>() {
            @Override
            public void onChanged(InitEntity initEntity) {
                mViewBinding.aivService.setVisibility(View.GONE);
                mViewModel.initUserLogin();

            }
        });
        mViewModel.getHttpErrorLiveData().observe(this, new Observer<ResponseErrorEntity>() {
            @Override
            public void onChanged(ResponseErrorEntity responseErrorEntity) {
                mViewBinding.aivService.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }

    @Override
    protected void onWindowFirstFocusChanged() {
        super.onWindowFirstFocusChanged();
        ViewsCompat.setStatusBarMargin(mViewBinding.aivService, this, PhoneCompat.dp2px(this, 16));
    }
}
