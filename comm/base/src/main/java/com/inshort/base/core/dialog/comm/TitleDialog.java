package com.inshort.base.core.dialog.comm;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.DialogTitleBinding;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.weight.click.DelayedClick;

@Route(path = ARouterConfig.Path.Comm.DIALOG_TITLE)
public class TitleDialog extends BaseCompatDialog<DialogTitleBinding, BaseCompatViewModel> {
    public static final String KEY_TITLE = "key_title";
    public static final String KEY_LEFT = "key_left";
    public static final String KEY_RIGHT = "key_right";

    @Nullable
    private OnDialogInfoClickListener mOnDialogInfoClickListener = null;

    public void setOnDialogInfoClickListener(@Nullable OnDialogInfoClickListener onDialogInfoClickListener) {
        this.mOnDialogInfoClickListener = onDialogInfoClickListener;
    }

    @Override
    protected DialogTitleBinding getViewBinding() {
        return DialogTitleBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.clContentParent, getContentBackground());

    }

   /* public void setLeftText(@NonNull CharSequence text) {
        UICompat.setText(mViewBinding.atvLeft, text);
    }

    public void setRightText(@NonNull CharSequence text) {
        UICompat.setText(mViewBinding.atvRight, text);
    }

    public void setContentText(@NonNull CharSequence text) {
        UICompat.setText(mViewBinding.atvTitle, text);
    }*/

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            UICompat.setText(mViewBinding.atvTitle, bundle.getString(KEY_TITLE));
            UICompat.setText(mViewBinding.atvLeft, bundle.getString(KEY_LEFT));
            UICompat.setText(mViewBinding.atvRight, bundle.getString(KEY_RIGHT));
        }

    }

    @Override
    protected void initEvent() {
        mViewBinding.atvLeft.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (mOnDialogInfoClickListener != null) {
                    mOnDialogInfoClickListener.onClickLeftView(view);
                }
            }
        });
        mViewBinding.atvRight.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (mOnDialogInfoClickListener != null) {
                    mOnDialogInfoClickListener.onClickRightView(view);
                }
            }
        });
    }

    private Drawable getContentBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(Color.WHITE);
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 6));
        return drawable;
    }

    public interface OnDialogInfoClickListener {
        void onClickLeftView(View view);

        void onClickRightView(View view);
    }
}
