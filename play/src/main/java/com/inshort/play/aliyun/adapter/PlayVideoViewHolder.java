package com.inshort.play.aliyun.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.play.R;

/**
 * @author: 张勇
 * @date: 2024/5/23
 */
public class PlayVideoViewHolder extends RecyclerView.ViewHolder {

    private FrameLayout mRootFragment;
    public PlayVideoViewHolder(@NonNull View view) {
        super(view);
        mRootFragment = view.findViewById(R.id.root);


        mRootFragment.setOnClickListener(v -> {

        });
    }


    /**
     * 获取根布局View
     * @return
     */
    public ViewGroup getRootView(){
        return mRootFragment;
    }


}
