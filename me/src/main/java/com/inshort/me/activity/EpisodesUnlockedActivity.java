package com.inshort.me.activity;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.TransactionHistoryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.me.adapter.EpisodesUnlockAdapter;
import com.inshort.me.databinding.ActivityEpisodesUnlockedBinding;
import com.inshort.me.viewmodel.EpisodesUnlockedViewModel;

import java.util.ArrayList;
import java.util.List;
@Route(path = ARouterConfig.Path.Me.ACTIVITY_EPISODES_UNLOCKED)
public class EpisodesUnlockedActivity extends BaseCompatActivity<ActivityEpisodesUnlockedBinding, EpisodesUnlockedViewModel> {
    private final ArrayList<TransactionHistoryEntity> mData = new ArrayList<>();
    private EpisodesUnlockAdapter mAdapter = null;

    @Override
    protected ActivityEpisodesUnlockedBinding getViewBinding() {
        return ActivityEpisodesUnlockedBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<EpisodesUnlockedViewModel> getViewModelClass() {
        return EpisodesUnlockedViewModel.class;
    }

    @Override
    protected void initView() {
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void initData() {
        mAdapter = new EpisodesUnlockAdapter(this,mData);
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        mViewModel.loadData();
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getEpisodesUnlockLiveData().observe(this, new Observer<List<TransactionHistoryEntity>>() {
            @Override
            public void onChanged(List<TransactionHistoryEntity> transactionHistoryEntities) {
                AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout,mAdapter,mViewModel.isRefresh(),mData,transactionHistoryEntities,null);
            }
        });
    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }
}
