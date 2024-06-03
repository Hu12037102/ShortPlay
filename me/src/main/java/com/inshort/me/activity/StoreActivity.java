package com.inshort.me.activity;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.StoreEntity;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.mmkv.UserDataStore;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.text.SpanTextHelper;
import com.inshort.me.adapter.StoreAdapter;

import com.inshort.me.databinding.ActivityStoreBinding;
import com.inshort.me.databinding.ItemStoreFooterViewBinding;
import com.inshort.me.databinding.ItemStoreHeadViewBinding;
import com.inshort.me.viewmodel.StoreViewModel;

import java.util.ArrayList;

@Route(path = ARouterConfig.Path.Me.ACTIVITY_STORE)
public class StoreActivity extends BaseCompatActivity<ActivityStoreBinding, StoreViewModel> {
    private final ArrayList<StoreEntity.Info> mData = new ArrayList<>();
    private StoreAdapter mAdapter = null;
    private ItemStoreHeadViewBinding mHeadViewBinding;
    private ItemStoreFooterViewBinding mFootViewBinding;


    @Override
    protected ActivityStoreBinding getViewBinding() {
        return ActivityStoreBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<StoreViewModel> getViewModelClass() {
        return StoreViewModel.class;
    }

    @Override
    protected void initView() {
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(this));
        iniHeadView();
    }


    private void iniHeadView() {
        mHeadViewBinding = ItemStoreHeadViewBinding.inflate(getLayoutInflater(), mViewBinding.getRoot(), false);

    }

    private void initFooterView() {
        if (mFootViewBinding == null) {
            mFootViewBinding = ItemStoreFooterViewBinding.inflate(getLayoutInflater(), mViewBinding.getRoot(), false);
            SpanTextHelper.with()
                    .append(DataCompat.getResString(StoreActivity.this, com.inshort.base.R.string.tips_content))
                    .appendBlank()
                    .setSize(12, true)
                    .appendLine()
                    .append(DataCompat.getResString(StoreActivity.this, com.inshort.base.R.string.store_tip_1))
                    .appendLine()
                    .append(DataCompat.getResString(StoreActivity.this, com.inshort.base.R.string.store_tip_2))
                    .appendLine()
                    .append(DataCompat.getResString(StoreActivity.this, com.inshort.base.R.string.store_tip_3))
                    .appendLine()
                    .append(DataCompat.getResString(StoreActivity.this, com.inshort.base.R.string.store_tip_4))
                    .crete(mFootViewBinding.atvContent);
        }
    }

    @Override
    protected void initData() {
        mAdapter = new StoreAdapter(this, mData);
        mAdapter.addHeadView(mHeadViewBinding.getRoot());
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();
    }

    @Override
    protected void onUserUpdate(@NonNull UserEntity userEntity) {
        super.onUserUpdate(userEntity);
        updateBalance();
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateBalance();
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        mViewModel.loadData();
    }

    @Override
    protected void initEvent() {
        mViewBinding.pvTitle.getRightView().setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                ARouters.startActivity(ARouterConfig.Path.Me.ACTIVITY_TRANSACTION_HISTORY);
            }
        });

    }

    private void updateBalance() {
        UserEntity.Info info = UserDataStore.get().getInfo();
        if (DataCompat.isNull(info)) {
            return;
        }
        if (mHeadViewBinding != null) {
            UICompat.setText(mHeadViewBinding.atvCoinsCount, DataCompat.toString(info.coinsBalance));
            UICompat.setText(mHeadViewBinding.atvBonusCount, DataCompat.toString(info.bonusBalance));

        }

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getStoreLiveData().observe(this, new Observer<StoreEntity>() {
            @Override
            public void onChanged(StoreEntity storeEntity) {
                LogUtils.w("getStoreLiveData", storeEntity + "---");
                if (storeEntity != null) {
                    initFooterView();
                    AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(), mData, storeEntity.productList, mFootViewBinding.getRoot());
                }
            }
        });
    }
}
