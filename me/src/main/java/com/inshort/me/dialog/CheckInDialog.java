package com.inshort.me.dialog;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.entity.AwardDetailsEntity;
import com.inshort.base.entity.DailyCheckInEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.base.weight.text.SpanTextHelper;
import com.inshort.me.adapter.CheckInAdapter;
import com.inshort.me.databinding.DialogCheckInBinding;
import com.inshort.me.viewmodel.CheckInViewModel;

import java.util.ArrayList;

@Route(path = ARouterConfig.Path.Me.DIALOG_CHECK_IN)
public class CheckInDialog extends BaseCompatDialog<DialogCheckInBinding, CheckInViewModel> {
    private final ArrayList<Integer> mData = new ArrayList<>();
    private CheckInAdapter mAdapter = null;

    private OnItemClickListener<DailyCheckInEntity> mOnItemClickListener;
    public void setOnCheckInClickListener(OnItemClickListener<DailyCheckInEntity> onItemClickListener){
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override
    protected DialogCheckInBinding getViewBinding() {
        return DialogCheckInBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<CheckInViewModel> getViewModelClass() {
        return CheckInViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.atvCheckIn, getCheckBackground());
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    @Override
    protected void initData() {
        mAdapter = new CheckInAdapter(requireContext(), mData);
        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();


    }

    @Override
    protected int getGravity() {
        return Gravity.CENTER;
    }


    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        mViewModel.loadData();
    }

    @Override
    protected void initEvent() {
        mViewBinding.atvCheckIn.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                mViewModel.dailyCheckIn();
            }
        });
    }

    @Override
    protected void onClickEmptyView(@NonNull View view) {
        super.onClickEmptyView(view);
        loadSmartData();
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getAwardDetailsLiveData().observe(this, awardDetailsEntity -> {
            if (awardDetailsEntity != null) {
                mViewBinding.clContentParent.setVisibility(View.VISIBLE);
                AwardDetailsEntity.CheckInInfo checkInInfo = awardDetailsEntity.checkInInfo;
                if (DataCompat.notNull(checkInInfo)) {
                    SpanTextHelper.with()
                            .append(DataCompat.getResString(requireContext(), com.inshort.base.R.string.check_in_streak_say_content))
                            .appendBlank()
                            .append(DataCompat.toString(checkInInfo.checkInDay + 1))
                            .appendBlank()
                            .setColor(DataCompat.getColor(requireContext(), com.inshort.base.R.color.color_FFFE2442))
                            .append(DataCompat.getResString(requireContext(), com.inshort.base.R.string.day_say_content))
                            .crete(mViewBinding.atvTitle);
                    if (checkInInfo.isCheckIn) {
                        ViewCompat.setBackground(mViewBinding.atvCheckIn, getNormalBackground());
                        UICompat.setText(mViewBinding.atvCheckIn, DataCompat.getResString(requireContext(), com.inshort.base.R.string.return_tomorrow_content));
                        mViewBinding.atvCheckIn.setEnabled(false);
                    } else {
                        ViewCompat.setBackground(mViewBinding.atvCheckIn, getCheckBackground());
                        UICompat.setText(mViewBinding.atvCheckIn, DataCompat.getResString(requireContext(), com.inshort.base.R.string.check_in));
                        mViewBinding.atvCheckIn.setEnabled(true);
                    }
                    mAdapter.notifyData(checkInInfo.checkInDay, checkInInfo.awardCoinsList, checkInInfo.isCheckIn);
                }


            }
        });
        mViewModel.getDailyCheckInLiveData().observe(this, new Observer<DailyCheckInEntity>() {
            @Override
            public void onChanged(DailyCheckInEntity dailyCheckInEntity) {
                loadSmartData();
                if (mOnItemClickListener!=null){
                    mOnItemClickListener.onItemClick(mViewBinding.atvCheckIn,dailyCheckInEntity);
                }
            }
        });

    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }

    private Drawable getCheckBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50f));
        drawable.setColor(DataCompat.getColor(requireContext(), com.inshort.base.R.color.color_FFFE2442));
        return drawable;
    }

    private Drawable getNormalBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(requireContext(), com.inshort.base.R.color.color_FFCCCCCC));
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        return drawable;
    }
}
