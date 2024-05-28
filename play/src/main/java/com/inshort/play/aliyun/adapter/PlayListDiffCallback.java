package com.inshort.play.aliyun.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

/**
 * @author: 张勇
 * @date: 2024/5/24
 */
public class PlayListDiffCallback extends DiffUtil.ItemCallback<String> {
    @Override
    public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
        return oldItem.equals(newItem);
    }
}
