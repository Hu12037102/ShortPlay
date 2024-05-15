package com.inshort.home.fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.RequestTrendsByTypeEntity;
import com.inshort.base.entity.TrendsPageEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.home.databinding.FragmentTrendingContentBinding;
import com.inshort.home.viewmodel.TrendingContentViewModel;

@Route(path = ARouterConfig.Path.Home.FRAGMENT_TRENDING_CONTENT)
public class TrendingContentFragment extends BaseCompatFragment<FragmentTrendingContentBinding, TrendingContentViewModel> {
    @Nullable
    public String mIntentContent;

    @Override
    protected FragmentTrendingContentBinding getViewBinding() {
        return FragmentTrendingContentBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<TrendingContentViewModel> getViewModelClass() {
        return TrendingContentViewModel.class;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void loadSmartData(boolean isRefresh) {
        super.loadSmartData(isRefresh);
        RequestTrendsByTypeEntity entity = new RequestTrendsByTypeEntity();
        entity.type = mIntentContent;
        entity.isHomeIndex = false;
        mViewModel.findTrendsByType(entity, true, true, true);
    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            mIntentContent = bundle.getString(ARouterConfig.Key.CONTENT);
        }

        loadSmartData(true);
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getTrendsPageLiveData().observe(this, trendsPageEntity -> {





        });
    }

    @Override
    protected void initEvent() {

    }
}
