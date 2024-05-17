package com.inshort.me.fragment;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.other.mmkv.UserDataStore;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.me.databinding.FragmentMeBinding;
import com.inshort.me.viewmodel.MeViewModel;

import io.google.projectview.weight.ProjectView;

@Route(path = ARouterConfig.Path.Me.FRAGMENT_ME)
public class MeFragment extends BaseCompatFragment<FragmentMeBinding, MeViewModel> {
    @Override
    protected FragmentMeBinding getViewBinding() {
        return FragmentMeBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MeViewModel> getViewModelClass() {
        return MeViewModel.class;
    }

    @Override
    protected void initView() {
        ViewsCompat.setStatusBarMargin(mViewBinding.clHeadParent, requireActivity(), PhoneCompat.dp2px(requireContext(), 10));
        ViewCompat.setBackground(mViewBinding.viewTop, getTopBackground());
        ViewCompat.setBackground(mViewBinding.atvSignIn, getSignInBackground());
        ViewCompat.setBackground(mViewBinding.atvTopUp, getTopUpBackground());


    }

    @Override
    protected void initData() {

    }

    private void updateUserInfo() {
        UserEntity.Info userInfo = UserDataStore.get().getInfo();
        if (userInfo != null) {
            GlideCompat.loadImage(userInfo.avatar, mViewBinding.aivHead, com.inshort.base.R.mipmap.icon_head_placeholder);
            UICompat.setText(mViewBinding.atvName, userInfo.nickName);
            UICompat.setText(mViewBinding.atvId, DataCompat.getResString(getContext(), com.inshort.base.R.string.id_content_s, DataCompat.toString(userInfo.userId)));
            UICompat.setText(mViewBinding.atvCoinsCount, DataCompat.toString(userInfo.coinsBalance));
            UICompat.setText(mViewBinding.atvBonusCount, DataCompat.toString(userInfo.bonusBalance));
            if (userInfo.platform == UserEntity.Info.PLATFORM_DEFAULT) {
                mViewBinding.atvSignIn.setVisibility(View.VISIBLE);
            } else {
                mViewBinding.atvSignIn.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUserInfo();
    }

    @Override
    protected void initEvent() {
        mViewBinding.aivSetting.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                ARouters.startActivity(ARouterConfig.Path.Me.ACTIVITY_SETTING);
            }
        });
    }

    private Drawable getTopBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setSize(PhoneCompat.screenWidth(requireContext()), PhoneCompat.dp2px(requireContext(), 170));
        drawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFFE0EA), DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFF7F7F7)});
        return drawable;
    }

    private Drawable getSignInBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFE2442),
                DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFF798B)});
        return drawable;
    }

    private Drawable getTopUpBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFFFAF4),
                DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFFE3CA)});
        return drawable;
    }
}
