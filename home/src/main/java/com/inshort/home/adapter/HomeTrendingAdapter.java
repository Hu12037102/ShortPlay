package com.inshort.home.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.Contracts;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.GradientDrawableCompat;
import com.inshort.base.compat.NumberCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.home.databinding.ItemHomeTrendingChildViewBinding;

import java.util.List;

public class HomeTrendingAdapter extends RecyclerView.Adapter<HomeTrendingAdapter.ViewHolder> {
    private final Context mContext;
    private final List<DramaSeriesEntity> mData;


    public HomeTrendingAdapter(Context context, List<DramaSeriesEntity> data) {
        this.mContext = context;
        this.mData = data;
    }

    @Nullable
    private OnItemClickListener<DramaSeriesEntity> mOnItemClickListener;

    public void setOnItemClickListener(@Nullable OnItemClickListener<DramaSeriesEntity> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeTrendingChildViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DramaSeriesEntity entity = mData.get(position);
        if (entity.episodeUpdated == 0 || entity.isFinished) {
            holder.viewBinding.atvUpdate.setVisibility(View.GONE);
        } else {
            holder.viewBinding.atvUpdate.setVisibility(View.VISIBLE);
            UICompat.setText(holder.viewBinding.atvUpdate, DataCompat.getResString(mContext, com.inshort.base.R.string.update_to_s, DataCompat.toString(entity.episodeUpdated)));
            ViewCompat.setBackground(holder.viewBinding.atvUpdate, GradientDrawableCompat.getUpdateEpisodeBackground(mContext));
        }
        if (position == 0) {
            holder.viewBinding.aivKing.setVisibility(View.VISIBLE);
            UICompat.setImageRes(holder.viewBinding.aivKing, com.inshort.base.R.mipmap.icon_trending_king_1);
        } else if (position == 1) {
            holder.viewBinding.aivKing.setVisibility(View.VISIBLE);
            UICompat.setImageRes(holder.viewBinding.aivKing, com.inshort.base.R.mipmap.icon_trending_king_2);
        } else if (position == 2) {
            holder.viewBinding.aivKing.setVisibility(View.VISIBLE);
            UICompat.setImageRes(holder.viewBinding.aivKing, com.inshort.base.R.mipmap.icon_trending_king_3);
        } else {
            holder.viewBinding.aivKing.setVisibility(View.INVISIBLE);
        }
        GlideCompat.loadImage(entity.imageUrl, holder.viewBinding.aivContent);
        int rank = position + 1;
        UICompat.setText(holder.viewBinding.atvRanking, DataCompat.toString(rank));
        ViewCompat.setBackground(holder.viewBinding.atvRanking, getRankBackground(position));
        UICompat.setText(holder.viewBinding.atvTitle, entity.dramaTitle);
        UICompat.setText(holder.viewBinding.atvHot, NumberCompat.getHotText(entity.heatValue, Contracts.DEFAULT_STRING));
        if (CollectionCompat.notEmptyList(entity.dramaClassifies)) {
            ViewCompat.setBackground(holder.viewBinding.atvLabel, getLabelBackground());
            holder.viewBinding.atvLabel.setVisibility(View.VISIBLE);
            UICompat.setText(holder.viewBinding.atvLabel, entity.dramaClassifies.get(0));
        } else {
            holder.viewBinding.atvLabel.setVisibility(View.INVISIBLE);
        }
        holder.itemView.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(view, entity);
                }
            }
        });
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
        private final ItemHomeTrendingChildViewBinding viewBinding;

        public ViewHolder(@NonNull ItemHomeTrendingChildViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }

    private Drawable getRankBackground(int index) {
        GradientDrawable drawable = new GradientDrawable();
        @ColorInt int color = switch (index) {
            case 0 -> DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFFF0056);
            case 1 -> DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFFF8200);
            case 2 -> DataCompat.getColor(mContext, com.inshort.base.R.color.color_FF7699D5);
            default -> DataCompat.getColor(mContext, com.inshort.base.R.color.color_FF333333);
        };
        drawable.setColor(color);
        drawable.setCornerRadii(
                new float[]{
                        PhoneCompat.dp2px(mContext, 6),
                        PhoneCompat.dp2px(mContext, 6),
                        0, 0,
                        PhoneCompat.dp2px(mContext, 6),
                        PhoneCompat.dp2px(mContext, 6),
                        0, 0
                }
        );
        return drawable;
    }

    private Drawable getLabelBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(mContext, com.inshort.base.R.color.color_1AFFFFFF));
        drawable.setCornerRadius(PhoneCompat.dp2px(mContext, 50f));
        return drawable;
    }

}
