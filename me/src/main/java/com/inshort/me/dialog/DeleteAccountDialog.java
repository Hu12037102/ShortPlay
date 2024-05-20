package com.inshort.me.dialog;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.me.databinding.DialogDeleteAccountBinding;

@Route(path = ARouterConfig.Path.Me.DIALOG_DELETE_ACCOUNT)
public class DeleteAccountDialog extends BaseCompatDialog<DialogDeleteAccountBinding, BaseCompatViewModel> {
    @Nullable
    private OnItemClickListener<Object> mOnItemClickListener;

    public void setOnDeleteClickListener(@Nullable OnItemClickListener<Object> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    private boolean isCheck = false;

    @Override
    protected DialogDeleteAccountBinding getViewBinding() {
        return DialogDeleteAccountBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.clContentParent, getBackground());
        ViewCompat.setBackground(mViewBinding.atvCancel, getDeleteBackground());
    }

    @Override
    protected void initData() {
        updateCheckView();
    }

    private void updateCheckView() {
        if (isCheck) {
            UICompat.setImageRes(mViewBinding.aivCheck, com.inshort.base.R.mipmap.icon_delete_account_selector);
        } else {
            UICompat.setImageRes(mViewBinding.aivCheck, com.inshort.base.R.mipmap.icon_delete_account_normal);
        }
    }

    @Override
    protected void initEvent() {
        mViewBinding.aivCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCheck = !isCheck;
                updateCheckView();
            }
        });
        mViewBinding.atvCancel.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                dismiss();
            }
        });
        mViewBinding.atvDelete.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (!isCheck) {
                    mViewModel.showToast(DataCompat.getResString(requireContext(), com.inshort.base.R.string.you_must_check_the_agreement_before_delete_the_account_content));
                    return;
                }
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, null);
                }
                dismiss();
            }
        });

    }

    private Drawable getDeleteBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setColor(DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFE2442));
        return drawable;
    }

    private Drawable getBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(Color.WHITE);
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 6));
        return drawable;
    }
}
