package com.inshort.me.activity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.me.databinding.ActivitySettingBinding;
import com.inshort.me.viewmodel.SettingViewModel;

@Route(path = ARouterConfig.Path.Me.ACTIVITY_SETTING)
public class SettingActivity extends BaseCompatActivity<ActivitySettingBinding, SettingViewModel> {
    @Override
    protected ActivitySettingBinding getViewBinding() {
        return ActivitySettingBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<SettingViewModel> getViewModelClass() {
        return SettingViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.atvSignOut, getSignOutBackground());

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    private Drawable getSignOutBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(this, com.inshort.base.R.color.color_FFF5F5F5));
        drawable.setCornerRadius(PhoneCompat.dp2px(this, 50));
        return drawable;
    }
}
