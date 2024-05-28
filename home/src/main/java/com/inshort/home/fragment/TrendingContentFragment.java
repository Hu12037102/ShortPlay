package com.inshort.home.fragment;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.RequestTrendsByTypeEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.home.adapter.TrendingAdapter;
import com.inshort.home.databinding.FragmentTrendingContentBinding;
import com.inshort.home.viewmodel.TrendingContentViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Home.FRAGMENT_TRENDING_CONTENT)
public class TrendingContentFragment extends BaseCompatFragment<FragmentTrendingContentBinding, TrendingContentViewModel> {
    @Nullable
    public String mIntentContent;
    private final ArrayList<DramaSeriesEntity> mData = new ArrayList<>();
    private TrendingAdapter mAdapter = null;

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
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
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
        mAdapter = new TrendingAdapter(requireContext(), mData);
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getTrendsPageLiveData().observe(this, trendsPageEntity -> {
            LogUtils.w("getTrendsPageLiveData--",trendsPageEntity+"---");
            if (trendsPageEntity != null) {
                List<DramaSeriesEntity> data = trendsPageEntity.data;
                SmartRefreshLayoutCompat.setEnableMore(mRefreshLayout, CollectionCompat.getListSize(data), mViewModel.getPageSize());
                AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(), mData, data, null);
            }
        });
    }

    @Override
    protected void initEvent() {
        if (mAdapter != null) {
            mAdapter.setOnItemClickListener(new OnItemClickListener<DramaSeriesEntity>() {
                @Override
                public void onItemClick(@Nullable View view, @Nullable DramaSeriesEntity entity) {

                }
            });
        }
    }
}
