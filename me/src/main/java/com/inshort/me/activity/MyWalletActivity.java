package com.inshort.me.activity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.mmkv.UserDataStore;
import com.inshort.me.databinding.ActivityMyWalletBinding;
import com.inshort.me.viewmodel.MyWalletViewModel;

@Route(path = ARouterConfig.Path.Me.ACTIVITY_MY_WALLET)
public class MyWalletActivity extends BaseCompatActivity<ActivityMyWalletBinding, MyWalletViewModel> {
    @Override
    protected ActivityMyWalletBinding getViewBinding() {
        return ActivityMyWalletBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MyWalletViewModel> getViewModelClass() {
        return MyWalletViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.atvTopUp, getTopUpBackground());
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        updateWalletInfo();
    }

    private void updateWalletInfo() {
        UserEntity.Info info = UserDataStore.get().getInfo();
        if (DataCompat.notNull(info)) {
            UICompat.setText(mViewBinding.atvCoinsCount, DataCompat.toString(info.coinsBalance));
            UICompat.setText(mViewBinding.atvBonusCount, DataCompat.toString(info.bonusBalance));
        }else {
            UICompat.setText(mViewBinding.atvCoinsCount, DataCompat.toString(0));
            UICompat.setText(mViewBinding.atvBonusCount, DataCompat.toString(0));
        }

    }

    @Override
    protected void initEvent() {

    }

    private Drawable getTopUpBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(this, 50));
        drawable.setColors(new int[]{
                DataCompat.getColor(this, com.inshort.base.R.color.color_FFFE2442),
                DataCompat.getColor(this, com.inshort.base.R.color.color_FFFF798B),
        });
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return drawable;
    }
}
