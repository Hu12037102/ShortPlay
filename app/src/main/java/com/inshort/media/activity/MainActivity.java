package com.inshort.media.activity;


import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.NetworkCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.main.MainBottomTabEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.media.adapter.MainBottomTabAdapter;
import com.inshort.media.databinding.ActivityMainBinding;
import com.inshort.media.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Main.ACTIVITY_MAIN)
public class MainActivity extends BaseCompatActivity<ActivityMainBinding, MainViewModel> {
    @Nullable
    private MainBottomTabAdapter mBottomTabAdapter = null;
    private List<MainBottomTabEntity> mBottomTabData = new ArrayList<>();

    @Override
    protected void initView() {
        mViewBinding.rvBottom.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    @Override
    protected void initData() {
        initBottomTabAdapter();

    }

    private void initBottomTabAdapter() {
        List<MainBottomTabEntity> data = mViewModel.getBottomTabData(this);
        mBottomTabData.clear();
        mBottomTabData.addAll(data);
        mBottomTabAdapter = new MainBottomTabAdapter(this, mBottomTabData);
        mViewBinding.rvBottom.setAdapter(mBottomTabAdapter);
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
        LogUtils.w(NetworkCompat.isNetWorkAvailable() + "----");
    }


    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }
}