package com.inshort.base.core.dialog.comm;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.R;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PackageInfoCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.DialogPrivacyAgreementBinding;
import com.inshort.base.http.IApiService;
import com.inshort.base.other.arouter.ARouterActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.mmkv.MMKVCompat;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.text.SpanTextHelper;

@Route(path = ARouterConfig.Path.Comm.DIALOG_PRIVACY_AGREEMENT)
public class PrivacyAgreementDialog extends BaseCompatDialog<DialogPrivacyAgreementBinding, BaseCompatViewModel> {
    @Override
    protected DialogPrivacyAgreementBinding getViewBinding() {
        return DialogPrivacyAgreementBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    public int getTheme() {
        return R.style.Theme_NoAnimation_Dialog;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.atvAgree, getAgreeBackground());

    }

    @Override
    protected void initData() {
        UICompat.setText(mViewBinding.atvWelcome, DataCompat.getResString(requireContext(), R.string.welcome_to_s_content, PackageInfoCompat.getAppName(requireContext())));
        SpanTextHelper.with().append(DataCompat.getResString(requireContext(), R.string.user_privacy_agreement_content_1))
                .appendBlank()
                .append(DataCompat.getResString(requireContext(), R.string.user_privacy_agreement_content_2))
                .setSize(12, true)
                .setClick(ContextCompat.getColor(requireContext(), R.color.color_FF222222), view -> ARouterActivity.startToWebContentActivity(IApiService.Url.TERMS_SERVICE,
                        DataCompat.getResString(requireContext(), R.string.terms_of_service_content)))
                .appendBlank()
                .append(DataCompat.getResString(requireContext(), R.string.user_privacy_agreement_content_3))
                .appendBlank()
                .append(DataCompat.getResString(requireContext(), R.string.privacy_policy_content))
                .setSize(12, true)
                .setClick(ContextCompat.getColor(requireContext(), R.color.color_FF222222), view -> ARouterActivity.startToWebContentActivity(IApiService.Url.PRIVACY_AGREEMENT,
                        DataCompat.getResString(requireContext(), R.string.privacy_policy_content)))
                .appendBlank()
                .append(DataCompat.getResString(requireContext(), R.string.user_privacy_agreement_content_4))
                .crete(mViewBinding.atvContent1);


    }

    @Override
    protected void initEvent() {
        mViewBinding.atvAgree.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                //dismiss();

                if (mOnDialogInfoListener != null) {
                    mOnDialogInfoListener.onClickSure(view, null);
                }

                LogUtils.w("DialogPrivacyAgreementBinding", "我 onDelayedClick 了->ony you right");
            }
        });
        mViewBinding.atvLater.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
               // dismiss();
                if (mOnDialogInfoListener != null) {
                    mOnDialogInfoListener.onClickCancel(view, null);
                }
                LogUtils.w("DialogPrivacyAgreementBinding", "我 onDelayedClick 了->ony you left");
            }
        });

    }

    @Override
    public void dismiss() {
        super.dismiss();
        LogUtils.w("DialogPrivacyAgreementBinding", "我 dismiss 了");
    }

    @Override
    public void onCancel(@NonNull DialogInterface dialog) {
        super.onCancel(dialog);
        LogUtils.w("DialogPrivacyAgreementBinding", "我 onCancel 了");
        MMKVCompat.putPrivacyAgreementStatus(MMKVCompat.PRIVACY_AGREEMENT_STATUS_LATER);
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        LogUtils.w("DialogPrivacyAgreementBinding", "我 onDismiss 了");
    }

    private Drawable getAgreeBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFE2442),
                DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFF798B)});
        return drawable;
    }
}
