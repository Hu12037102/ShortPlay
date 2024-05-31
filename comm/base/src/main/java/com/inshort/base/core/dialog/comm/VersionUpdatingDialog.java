package com.inshort.base.core.dialog.comm;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.R;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.DialogVersionUpdatingBinding;
import com.inshort.base.entity.InitEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.other.mmkv.MMKVCompat;
import com.inshort.base.weight.click.DelayedClick;


@Route(path = ARouterConfig.Path.Comm.DIALOG_VERSION_UPDATING)
public class VersionUpdatingDialog extends BaseCompatDialog<DialogVersionUpdatingBinding, BaseCompatViewModel> {
    private InitEntity.UpdateInfo mIntentUpdateInfo;

    @Override
    protected DialogVersionUpdatingBinding getViewBinding() {
        return DialogVersionUpdatingBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.atvCancel, getCancelBackground());
        ViewCompat.setBackground(mViewBinding.atvSure, getUpdateBackground());
        ViewCompat.setBackground(mViewBinding.atvMustSure, getUpdateBackground());

    }

    @Override
    protected void initData() {
        GlideCompat.loadImage(R.mipmap.icon_comm_version_updating, mViewBinding.aivTop);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mIntentUpdateInfo = bundle.getParcelable(ARouterConfig.Key.PARCELABLE);
            if (DataCompat.notNull(mIntentUpdateInfo)) {
                UICompat.setText(mViewBinding.atvDesc, mIntentUpdateInfo.title);
                StringBuilder sb = new StringBuilder();
                if (CollectionCompat.notEmptyList(mIntentUpdateInfo.message)) {
                    for (String text : mIntentUpdateInfo.message) {
                        if (CollectionCompat.isLaseIndex(mIntentUpdateInfo.message, mIntentUpdateInfo.message.indexOf(text))) {
                            sb.append(text);
                        } else {
                            sb.append(text).append("\n");
                        }
                    }
                }
                UICompat.setText(mViewBinding.atvContent, DataCompat.toString(sb));
                setCancelable(false);
               // setCancelable(!mIntentUpdateInfo.isNecessary);
                //requireDialog().setCanceledOnTouchOutside(!mIntentUpdateInfo.isNecessary);
                requireDialog().setCanceledOnTouchOutside(false);
                if (mIntentUpdateInfo.isNecessary) {
                    mViewBinding.atvCancel.setVisibility(View.GONE);
                    mViewBinding.atvSure.setVisibility(View.GONE);
                    mViewBinding.atvMustSure.setVisibility(View.VISIBLE);
                } else {
                    mViewBinding.atvCancel.setVisibility(View.VISIBLE);
                    mViewBinding.atvSure.setVisibility(View.VISIBLE);
                    mViewBinding.atvMustSure.setVisibility(View.GONE);
                }
            }
        }
    }

    @Override
    protected void initEvent() {
        mViewBinding.atvCancel.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                MMKVCompat.putVersionUpdateTimestamp(System.currentTimeMillis());
                dismiss();
            }
        });
        mViewBinding.atvSure.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                MMKVCompat.putVersionUpdateTimestamp(System.currentTimeMillis());
                startToGooglePlayStore();
                dismiss();
            }
        });
        mViewBinding.atvMustSure.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                startToGooglePlayStore();
            }
        });
    }

    private Drawable getUpdateBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFE2442),
                DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFF798B)});
        return drawable;
    }

    private Drawable getCancelBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setColor(DataCompat.getColor(requireContext(), R.color.color_1A000000));
        return drawable;
    }

    private void startToGooglePlayStore() {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + requireContext().getPackageName()));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            if (DataCompat.notNull(mIntentUpdateInfo)) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mIntentUpdateInfo.downloadUrl));
                startActivity(intent);
            }
        }
    }
}

