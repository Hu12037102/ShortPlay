package com.inshort.home.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DateCompat;
import com.inshort.base.compat.GradientDrawableCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.TagEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.weight.text.SpanTextHelper;
import com.inshort.home.databinding.ItemHomeHorizontalChildViewBinding;

import java.util.List;

public class HomeHorizontalAdapter extends RecyclerView.Adapter<HomeHorizontalAdapter.ViewHolder> {
    private final Context mContext;
    private final List<DramaSeriesEntity> mData;

    public HomeHorizontalAdapter(@NonNull Context context, @NonNull List<DramaSeriesEntity> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeHorizontalChildViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        try {
            DramaSeriesEntity entity = mData.get(position);
            GlideCompat.loadImage(entity.imageUrl, holder.viewBinding.aivContent);
            UICompat.setText(holder.viewBinding.atvTitle, entity.dramaTitle);
            if (entity.episodeUpdated == 0 || entity.isFinished) {
                holder.viewBinding.atvUpdate.setVisibility(View.GONE);
            } else {
                holder.viewBinding.atvUpdate.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvUpdate, DataCompat.getResString(mContext, com.inshort.base.R.string.update_to_s, DataCompat.toString(entity.episodeUpdated)));
                ViewCompat.setBackground(holder.viewBinding.atvUpdate, GradientDrawableCompat.getUpdateEpisodeBackground(mContext));
            }
            //预告剧
            if (entity.dramaReleaseType == 2) {
                holder.viewBinding.atvTitle.setVisibility(View.VISIBLE);
                holder.viewBinding.atvTime.setVisibility(View.VISIBLE);
                ViewCompat.setBackground(holder.viewBinding.atvTime, GradientDrawableCompat.getNewEpisodeBackground(mContext));
                int[] dates = DateCompat.timestamp2MonthDay(entity.releaseTime * 1000);
                SpanTextHelper.with()
                        .append(DateCompat.intMonth2English(mContext, dates[0]) + "").setSize(10, true)
                        .appendLine().append(dates[1] + "").setSize(16, true)
                        .crete(holder.viewBinding.atvTime);
            } else {
                holder.viewBinding.atvTitle.setVisibility(View.VISIBLE);
                holder.viewBinding.atvTime.setVisibility(View.GONE);
                TagEntity tagEntity = entity.columnTag;
                if (DataCompat.notNull(tagEntity)) {
                    if (!TextUtils.isEmpty(tagEntity.stringColor) && !TextUtils.isEmpty(tagEntity.label)) {
                        ViewCompat.setBackground(holder.viewBinding.atvLabel, GradientDrawableCompat.getLabelEpisodeBackground(mContext, tagEntity.stringColor));
                        holder.viewBinding.atvLabel.setVisibility(View.VISIBLE);
                    } else {
                        holder.viewBinding.atvLabel.setVisibility(View.GONE);
                    }
                } else {
                    holder.viewBinding.atvLabel.setVisibility(View.GONE);
                }
            }

            if (position == 0) {
                holder.itemView.setPadding(PhoneCompat.dp2px(mContext, 10), 0, PhoneCompat.dp2px(mContext, 10), 0);
            } else {
                holder.itemView.setPadding(0, 0, PhoneCompat.dp2px(mContext, 10), 0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public void notifyRefreshData(@Nullable List<DramaSeriesEntity> data) {
        mData.clear();
        if (DataCompat.notNull(data)) {
            mData.addAll(data);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return CollectionCompat.getListSize(mData);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemHomeHorizontalChildViewBinding viewBinding;

        public ViewHolder(@NonNull ItemHomeHorizontalChildViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }

}
