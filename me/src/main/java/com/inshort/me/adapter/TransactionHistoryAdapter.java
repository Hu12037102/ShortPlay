package com.inshort.me.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.compat.DateCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.TransactionHistoryEntity;
import com.inshort.me.databinding.ItemTransactionHistoryViewBinding;

import java.util.List;

public class TransactionHistoryAdapter extends BaseRecyclerAdapter<TransactionHistoryEntity> {

    public TransactionHistoryAdapter(@NonNull Context mContext, @NonNull List<? extends TransactionHistoryEntity> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        TransactionHistoryEntity entity = getMData().get(i);
        if (viewHolder instanceof ViewHolder holder) {
            UICompat.setText(holder.viewBinding.atvAmount, entity.amount);
            UICompat.setText(holder.viewBinding.atvTime, DateCompat.getFormatYearMonthDayHourMinute(entity.createTime * 1000));
            UICompat.setText(holder.viewBinding.atvTitle, entity.title);
            UICompat.setText(holder.viewBinding.atvCoinsCount, "+" + entity.coins);
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(ItemTransactionHistoryViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemTransactionHistoryViewBinding viewBinding;

        public ViewHolder(@NonNull ItemTransactionHistoryViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
