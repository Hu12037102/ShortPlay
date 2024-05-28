package com.inshort.play.aliyun.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.play.R;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoAdapter extends ListAdapter<String , PlayVideoViewHolder> {


    public PlayVideoAdapter(@NonNull DiffUtil.ItemCallback<String> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public PlayVideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.play_adapter_ui_view, parent, false);
        return new PlayVideoViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayVideoViewHolder holder, int position) {

    }

    @Override
    public void onViewAttachedToWindow(@NonNull PlayVideoViewHolder holder) {
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull PlayVideoViewHolder holder) {
        super.onViewDetachedFromWindow(holder);

    }





}
