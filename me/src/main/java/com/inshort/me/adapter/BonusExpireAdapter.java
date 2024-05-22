package com.inshort.me.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DateCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.BonusExpireEntity;
import com.inshort.me.databinding.ItemBonusExpireViewBinding;

import java.util.List;

public class BonusExpireAdapter extends BaseRecyclerAdapter<BonusExpireEntity> {
    public BonusExpireAdapter(@NonNull Context mContext, @NonNull List<? extends BonusExpireEntity> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        BonusExpireEntity entity = getMData().get(i);
        if (viewHolder instanceof ViewHolder holder) {
            UICompat.setText(holder.viewBinding.atvTitle, entity.transactionTypeDisplay);
            UICompat.setText(holder.viewBinding.atvCreateTime, DateCompat.getFormatYearMonthDayHourMinute(entity.insertTimestamp));
            UICompat.setText(holder.viewBinding.atvBonusCount, entity.bonusContent);
            long outTime = entity.expirationTimestamp * 1000;
            if (outTime <= 0) {
                UICompat.setTextColorRes(holder.viewBinding.atvOutTime, com.inshort.base.R.color.color_FF999999);
                UICompat.setText(holder.viewBinding.atvOutTime, DataCompat.getResString(getMContext(), com.inshort.base.R.string.expired_content));
            } else {
                UICompat.setTextColorRes(holder.viewBinding.atvOutTime, com.inshort.base.R.color.color_FFFE2442);
                UICompat.setText(holder.viewBinding.atvOutTime, DataCompat.getResString(getMContext(), com.inshort.base.R.string.expired_on_s,
                        DateCompat.getFormatYearMonthDayHourMinute(outTime)
                ));
            }

        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(ItemBonusExpireViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemBonusExpireViewBinding viewBinding;

        public ViewHolder(@NonNull ItemBonusExpireViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
