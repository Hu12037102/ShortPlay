package com.inshort.media.activity;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.NetworkCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.media.R;
import com.inshort.media.databinding.ActivityMainBinding;
import com.inshort.media.viewmodel.MainViewModel;
@Route(path = ARouterConfig.Path.Main.ACTIVITY_MAIN)
public class MainActivity extends BaseCompatActivity<ActivityMainBinding, MainViewModel> {
    @Override
    protected void initView() {
        mEmptyLayout.show();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected ActivityMainBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.w(NetworkCompat.isNetWorkAvailable()+"----");
    }



    @Override
    protected boolean isLoadEmptyView(){
        return true;
    }
}