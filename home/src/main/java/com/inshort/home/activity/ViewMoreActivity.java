package com.inshort.home.activity;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.DramaSeriesPageEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.home.adapter.ViewMoreAdapter;
import com.inshort.home.databinding.ActivityViewMoreBinding;
import com.inshort.home.viewmodel.ViewMoreViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Home.ACTIVITY_VIEW_MORE)
public class ViewMoreActivity extends BaseCompatActivity<ActivityViewMoreBinding, ViewMoreViewModel> {
    private final ArrayList<DramaSeriesEntity> mData = new ArrayList<>();
    private ViewMoreAdapter mAdapter = null;

    private int mIntentId;

    @Override
    protected ActivityViewMoreBinding getViewBinding() {
        return ActivityViewMoreBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<ViewMoreViewModel> getViewModelClass() {
        return ViewMoreViewModel.class;
    }

    @Override
    protected void initView() {
        String intentTitle = getIntent().getStringExtra(ARouterConfig.Key.CONTENT);
        mIntentId = getIntent().getIntExtra(ARouterConfig.Key.ID, 0);
        UICompat.setText(mViewBinding.pvTitle.getCenterView(), intentTitle);
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(this));
        UICompat.setTextFont(mViewBinding.pvTitle.getCenterView(), com.inshort.base.R.font.sofia_pro_bold);
    }

    @Override
    protected void initData() {
        mAdapter = new ViewMoreAdapter(this, mData);
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData(true);
    }

    @Override
    protected void loadSmartData(boolean isRefresh) {
        super.loadSmartData(isRefresh);
        mViewModel.loadData(mIntentId);

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

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getViewMoreListLiveData().observe(this, dramaSeriesPageEntity -> {
            if (dramaSeriesPageEntity != null) {
                List<DramaSeriesEntity> data = dramaSeriesPageEntity.data;
                AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(), mData, data, null);

                LogUtils.d("getRefreshLiveData--", "---" + mViewModel.getPage());
            }

        });
    }
}
