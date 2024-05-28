package com.inshort.me.activity;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.TransactionHistoryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.me.adapter.TransactionHistoryAdapter;
import com.inshort.me.databinding.ActivityTransactionHistoryBinding;
import com.inshort.me.viewmodel.TransactionHistoryViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Me.ACTIVITY_TRANSACTION_HISTORY)
public class TransactionHistoryActivity extends BaseCompatActivity<ActivityTransactionHistoryBinding, TransactionHistoryViewModel> {
    @Override
    protected ActivityTransactionHistoryBinding getViewBinding() {
        return ActivityTransactionHistoryBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<TransactionHistoryViewModel> getViewModelClass() {
        return TransactionHistoryViewModel.class;
    }

    private final ArrayList<TransactionHistoryEntity> mData = new ArrayList<>();
    private TransactionHistoryAdapter mAdapter = null;

    @Override
    protected void initView() {
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        mViewModel.loadData();
    }

    @Override
    protected void initData() {
        mAdapter = new TransactionHistoryAdapter(this, mData);
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getTransactionHistoriesLiveData().observe(this, transactionHistoryEntities -> {
            LogUtils.w("getTransactionHistoriesLiveData", transactionHistoryEntities + "");
            AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(),
                    mData, transactionHistoryEntities, null);
        });
    }
    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }
}
