package com.inshort.home.dialog;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleCompat;
import androidx.core.os.ParcelableCompat;
import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DateCompat;
import com.inshort.base.compat.InShortCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.home.databinding.DialogNewEpisodeBinding;

import java.io.Serializable;
import java.text.DateFormat;

@Route(path = ARouterConfig.Path.Home.DIALOG_NEW_EPISODE)
public class NewEpisodeDialog extends BaseCompatDialog<DialogNewEpisodeBinding, BaseCompatViewModel> {
    @Override
    protected DialogNewEpisodeBinding getViewBinding() {
        return DialogNewEpisodeBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    protected void initView() {


    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        if (DataCompat.notNull(bundle)) {
            @Nullable
            DramaSeriesEntity entity = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
                entity = bundle.getSerializable(ARouterConfig.Key.SERIALIZABLE, DramaSeriesEntity.class);
            } else {
                Serializable serializable = bundle.getSerializable(ARouterConfig.Key.SERIALIZABLE);
                if (serializable instanceof DramaSeriesEntity) {
                    entity = (DramaSeriesEntity) serializable;
                }
            }
            if (DataCompat.notNull(entity)) {
                UICompat.setText(mViewBinding.atvTitle, entity.dramaTitle);
                UICompat.setText(mViewBinding.atvDesc, InShortCompat.getDramaClassifiesText(entity.dramaClassifies));
                ViewCompat.setBackground(mViewBinding.atvTime, getTimeBackground());
                int[] times = DateCompat.timestamp2MonthDay(entity.releaseTime * 1000);
                if (times.length == 2) {
                    UICompat.setText(mViewBinding.atvTime, DataCompat.getResString(
                            requireContext(),
                            com.inshort.base.R.string.launch_on_s_s, times[1], DateCompat.intMonth2English(requireContext(), times[0])
                    ));
                }
                GlideCompat.loadImage(entity.imageUrl, mViewBinding.aivContent);
                UICompat.setText(mViewBinding.atvContent, entity.introduction);
            }

        }
    }

    @Override
    protected int getGravity() {
        return Gravity.BOTTOM;
    }

    @Override
    protected void initEvent() {
        mViewBinding.aivClose.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                dismiss();
            }
        });
    }

    private Drawable getTimeBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(requireContext(), com.inshort.base.R.color.color_FF00C063));
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 4));
        return drawable;
    }
}
