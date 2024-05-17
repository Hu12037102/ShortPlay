package com.inshort.home.adapter;

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

import com.huxiaobai.adapter.BaseRecyclerAdapter;
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
import com.inshort.home.databinding.ItemTrendingViewBinding;

import java.util.List;

public class TrendingAdapter extends BaseRecyclerAdapter<DramaSeriesEntity> {
    @Nullable
    private OnItemClickListener<DramaSeriesEntity> mOnItemClickListener;

    public void setOnItemClickListener(@Nullable OnItemClickListener<DramaSeriesEntity> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public TrendingAdapter(@NonNull Context mContext, @NonNull List<? extends DramaSeriesEntity> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof TrendingAdapter.ViewHolder holder) {
            DramaSeriesEntity entity = getMData().get(position);
            if (entity.episodeUpdated == 0 || entity.isFinished) {
                holder.viewBinding.atvUpdate.setVisibility(View.GONE);
            } else {
                holder.viewBinding.atvUpdate.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvUpdate, DataCompat.getResString(getMContext(), com.inshort.base.R.string.update_to_s, DataCompat.toString(entity.episodeUpdated)));
                ViewCompat.setBackground(holder.viewBinding.atvUpdate, GradientDrawableCompat.getUpdateEpisodeBackground(getMContext()));
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
            UICompat.setText(holder.viewBinding.atvRank, DataCompat.toString(rank));
            ViewCompat.setBackground(holder.viewBinding.atvRank, getRankBackground(position));
            UICompat.setText(holder.viewBinding.atvTitle, entity.dramaTitle);
            UICompat.setText(holder.viewBinding.atvDesc,entity.introduction);
            UICompat.setText(holder.viewBinding.atvHot, NumberCompat.getHotText(entity.heatValue, Contracts.DEFAULT_STRING));
            if (CollectionCompat.notEmptyList(entity.dramaClassifies)) {
                ViewCompat.setBackground(holder.viewBinding.atvTag, getLabelBackground());
                holder.viewBinding.atvTag.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvTag, entity.dramaClassifies.get(0));
            } else {
                holder.viewBinding.atvTag.setVisibility(View.INVISIBLE);
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

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(ItemTrendingViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public final ItemTrendingViewBinding viewBinding;

        public ViewHolder(@NonNull ItemTrendingViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }

    private Drawable getRankBackground(int index) {
        GradientDrawable drawable = new GradientDrawable();
        @ColorInt int color = switch (index) {
            case 0 -> DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FFFF0056);
            case 1 -> DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FFFF8200);
            case 2 -> DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FF7699D5);
            default -> DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FF333333);
        };
        drawable.setColor(color);
        drawable.setCornerRadii(
                new float[]{
                        PhoneCompat.dp2px(getMContext(), 6),
                        PhoneCompat.dp2px(getMContext(), 6),
                        0, 0,
                        PhoneCompat.dp2px(getMContext(), 6),
                        PhoneCompat.dp2px(getMContext(), 6),
                        0, 0
                }
        );
        return drawable;
    }

    private Drawable getLabelBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_1A000000));
        drawable.setCornerRadius(PhoneCompat.dp2px(getMContext(), 50f));
        return drawable;
    }
}
