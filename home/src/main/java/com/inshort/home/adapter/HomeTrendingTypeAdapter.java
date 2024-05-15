package com.inshort.home.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.TrendingTypeEntity;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.home.databinding.ItemHomeTrendingTypeViewBinding;

import java.util.List;

public class HomeTrendingTypeAdapter extends RecyclerView.Adapter<HomeTrendingTypeAdapter.ViewHolder> {
    private final Context mContext;
    private final List<TrendingTypeEntity> mData;
    @Nullable
    private OnItemClickListener<TrendingTypeEntity> mOnItemClickListener;

    public void setOnItemClickListener(@Nullable OnItemClickListener<TrendingTypeEntity> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public HomeTrendingTypeAdapter(Context context, List<TrendingTypeEntity> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeTrendingTypeViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TrendingTypeEntity entity = mData.get(position);
        UICompat.setText(holder.viewBinding.atvContent, entity.content);
        ViewCompat.setBackground(holder.viewBinding.atvContent, getTypeBackground(entity.isCheck));
        int laseIndex = CollectionCompat.getListSize(mData) - 1;
        if (position == 0) {
            holder.itemView.setPadding(PhoneCompat.dp2px(mContext, 12), 0, PhoneCompat.dp2px(mContext, 8), 0);
        } else if (position == laseIndex) {
            holder.itemView.setPadding(0, 0, PhoneCompat.dp2px(mContext, 12), 0);
        } else {
            holder.itemView.setPadding(PhoneCompat.dp2px(mContext, 0), 0, PhoneCompat.dp2px(mContext, 8), 0);
        }
        if (entity.isCheck) {
            UICompat.setTextColorRes(holder.viewBinding.atvContent, com.inshort.base.R.color.color_White);
        } else {
            UICompat.setTextColorRes(holder.viewBinding.atvContent, com.inshort.base.R.color.color_Black);
        }
        holder.itemView.setOnClickListener(new DelayedClick() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDelayedClick(View view) {
                if (!entity.isCheck){
                    for (TrendingTypeEntity child :mData){
                        child.isCheck = child == entity;
                    }
                    notifyDataSetChanged();
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.onItemClick(view, entity);
                    }
                }

            }
        });
    }


    @Override
    public int getItemCount() {
        return CollectionCompat.getListSize(mData);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemHomeTrendingTypeViewBinding viewBinding;

        public ViewHolder(@NonNull ItemHomeTrendingTypeViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }

    private Drawable getTypeBackground(boolean isSelector) {
        GradientDrawable drawable = new GradientDrawable();
        if (isSelector) {
            drawable.setColor(DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFFE2442));
        } else {
            drawable.setColor(DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFEEEEEE));
        }
        drawable.setCornerRadius(PhoneCompat.dp2px(mContext, 6));
        return drawable;
    }

}
