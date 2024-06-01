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
import com.inshort.base.entity.TransactionHistoryEntity;
import com.inshort.me.databinding.ItemEpisodesUnlockedViewBinding;

import java.util.List;

public class EpisodesUnlockAdapter extends BaseRecyclerAdapter<TransactionHistoryEntity> {
    public EpisodesUnlockAdapter(@NonNull Context mContext, @NonNull List<? extends TransactionHistoryEntity> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        TransactionHistoryEntity entity = getMData().get(i);
        if (viewHolder instanceof ViewHolder holder) {
            UICompat.setText(holder.viewBinding.atvTitle, entity.title);
            UICompat.setText(holder.viewBinding.atvTime, DateCompat.getFormatYearMonthDayHourMinute(entity.createTime * 1000));
            UICompat.setText(holder.viewBinding.atvNum, DataCompat.getResString(getMContext(), com.inshort.base.R.string.episode_s, DataCompat.toString(entity.episodeNumber)));
            if (entity.coins > 0) {
                holder.viewBinding.atvCoinsCount.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvCoinsCount, "-" + entity.coins);

            } else {
                holder.viewBinding.atvCoinsCount.setVisibility(View.GONE);
            }
            if (entity.bonus>0){
                holder.viewBinding.atvBonusCount.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvBonusCount, "-" + entity.bonus);
            }else {
                holder.viewBinding.atvBonusCount.setVisibility(View.GONE);
            }
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(ItemEpisodesUnlockedViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemEpisodesUnlockedViewBinding viewBinding;

        public ViewHolder(@NonNull ItemEpisodesUnlockedViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
