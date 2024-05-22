package com.inshort.me.activity;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.BonusExpireEntity;
import com.inshort.base.entity.PageEntity;
import com.inshort.base.entity.TransactionHistoryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.me.adapter.BonusExpireAdapter;
import com.inshort.me.databinding.ActivityBonusExpireBinding;
import com.inshort.me.viewmodel.BonusExpireViewModel;

import java.util.ArrayList;

@Route(path = ARouterConfig.Path.Me.ACTIVITY_BONUS_EXPIRE)
public class BonusExpireActivity extends BaseCompatActivity<ActivityBonusExpireBinding, BonusExpireViewModel> {
    private final ArrayList<BonusExpireEntity> mData = new ArrayList<>();
    private BonusExpireAdapter mAdapter = null;

    @Override
    protected ActivityBonusExpireBinding getViewBinding() {
        return ActivityBonusExpireBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BonusExpireViewModel> getViewModelClass() {
        return BonusExpireViewModel.class;
    }

    @Override
    protected void initView() {
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        mAdapter = new BonusExpireAdapter(this, mData);
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        mViewModel.loadData();
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getBonusExpireLiveData().observe(this, pageEntity -> {
            if (DataCompat.notNull(pageEntity)) {
                AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(), mData, pageEntity.data, null);
            }
        });
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }
}
