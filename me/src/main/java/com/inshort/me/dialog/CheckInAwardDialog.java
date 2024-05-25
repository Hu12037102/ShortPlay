package com.inshort.me.dialog;

import android.os.Bundle;

import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.weight.text.SpanTextHelper;
import com.inshort.me.databinding.DialogCheckInAwardBinding;
import com.inshort.me.viewmodel.CheckInAwardViewModel;

@Route(path = ARouterConfig.Path.Me.DIALOG_CHECK_IN_AWARD)
public class CheckInAwardDialog extends BaseCompatDialog<DialogCheckInAwardBinding, CheckInAwardViewModel> {
    @Override
    protected DialogCheckInAwardBinding getViewBinding() {
        return DialogCheckInAwardBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<CheckInAwardViewModel> getViewModelClass() {
        return CheckInAwardViewModel.class;
    }

    @Override
    protected void initView() {
        Bundle bundle = getArguments();
        if (DataCompat.notNull(bundle)) {
            int number = bundle.getInt(ARouterConfig.Key.NUMBER, 0);
            SpanTextHelper.with()
                    .append(DataCompat.getResString(requireContext(), com.inshort.base.R.string.add_content_s, DataCompat.toString(number)))
                    .setSize(24, true)
                    .appendBlank()
                    .append(DataCompat.getResString(requireContext(), com.inshort.base.R.string.bonus_content))
                    .setSize(16, true)
                    .crete(mViewBinding.atvContent);
        }
        mViewModel.delayed(1500);
    }

    @Override
    protected void initData() {


    }


    @Override
    protected void initEvent() {

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getDelayedLiveData().observe(this, new Observer<Long>() {
            @Override
            public void onChanged(Long aLong) {
                dismiss();
            }
        });
    }
}
