package com.inshort.play.aliyun.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.inshort.base.entity.VideoUrlEntity;

/**
 * @author: 张勇
 * @date: 2024/5/24
 */
public class PlayListDiffCallback extends DiffUtil.ItemCallback<VideoUrlEntity.PlayData> {
    @Override
    public boolean areItemsTheSame(@NonNull VideoUrlEntity.PlayData oldItem, @NonNull VideoUrlEntity.PlayData newItem) {
        return oldItem.getId() == newItem.getId();
    }

    @Override
    public boolean areContentsTheSame(@NonNull VideoUrlEntity.PlayData oldItem, @NonNull VideoUrlEntity.PlayData newItem) {
        return oldItem.equals(newItem);
    }
}
