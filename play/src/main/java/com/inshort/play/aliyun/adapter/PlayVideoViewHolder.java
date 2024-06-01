package com.inshort.play.aliyun.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.play.R;
import com.inshort.play.listener.OnAdapterClick;
import com.inshort.play.aliyun.ui.UIVideoManger;

/**
 * @author: 张勇
 * @date: 2024/5/23
 */
public class PlayVideoViewHolder extends RecyclerView.ViewHolder {
    private UIVideoManger mManger;
    private FrameLayout mRootFragment;
    public PlayVideoViewHolder(@NonNull View view) {
        super(view);
        mRootFragment = view.findViewById(R.id.root);
        mManger = view.findViewById(R.id.video_ui_manger);
        LogUtils.d("mManger >> "+mManger);
        mRootFragment.setOnClickListener(new DelayedClick(500) {
            @Override
            public void onDelayedClick(View view) {
                mManger.onBlankClick();
            }
        });
    }



    /**
     * UI管理数据
     * @param position
     */
    public void setUIMangerData(int position,OnAdapterClick onAdapterClick){
        mManger.setData(position);
        mManger.setOnAdapterClick(onAdapterClick);
    }


    /**
     * 获取根布局View
     * @return
     */
    public ViewGroup getRootView(){
        return mRootFragment;
    }

    /**
     * 获取UI管理
     * @return
     */
    public UIVideoManger getManger(){
        return mManger;
    }



}
