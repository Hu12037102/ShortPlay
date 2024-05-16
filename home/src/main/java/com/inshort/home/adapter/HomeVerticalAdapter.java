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
import com.inshort.base.compat.GradientDrawableCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.TagEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.home.databinding.ItemHomeVerticalChildViewBinding;

import java.util.List;

public class HomeVerticalAdapter extends RecyclerView.Adapter<HomeVerticalAdapter.ViewHolder> {
    private final Context mContext;
    private final List<DramaSeriesEntity> mData;

    public HomeVerticalAdapter(Context context, List<DramaSeriesEntity> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeVerticalChildViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DramaSeriesEntity entity = mData.get(position);
        GlideCompat.loadImage(entity.imageUrl, holder.viewBinding.aivContent);
        if (entity.episodeUpdated == 0 || entity.isFinished) {
            holder.viewBinding.atvUpdate.setVisibility(View.GONE);
        } else {
            holder.viewBinding.atvUpdate.setVisibility(View.VISIBLE);
            UICompat.setText(holder.viewBinding.atvUpdate, DataCompat.getResString(mContext, com.inshort.base.R.string.update_to_s, DataCompat.toString(entity.episodeUpdated)));
            ViewCompat.setBackground(holder.viewBinding.atvUpdate, GradientDrawableCompat.getUpdateEpisodeBackground(mContext));
        }
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
        UICompat.setText(holder.viewBinding.atvTitle, entity.dramaTitle);
        UICompat.setText(holder.viewBinding.atvContent, entity.introduction);
        if (CollectionCompat.notEmptyList(entity.dramaClassifies)) {
            StringBuilder content = new StringBuilder();
            for (int i = 0; i < CollectionCompat.getListSize(entity.dramaClassifies); i++) {
                String text = entity.dramaClassifies.get(i);
                if (CollectionCompat.isLaseIndex(entity.dramaClassifies, i)) {
                    content.append(text);
                } else {
                    content.append(text).append("/");
                }

            }
            UICompat.setText(holder.viewBinding.atvDesc, content);
        }


    }

    @Override
    public int getItemCount() {
        return CollectionCompat.getListSize(mData);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final ItemHomeVerticalChildViewBinding viewBinding;

        public ViewHolder(@NonNull ItemHomeVerticalChildViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
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
}
