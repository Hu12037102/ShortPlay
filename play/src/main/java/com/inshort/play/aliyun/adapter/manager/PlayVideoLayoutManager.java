package com.inshort.play.aliyun.adapter.manager;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.play.listener.OnViewPagerListener;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoLayoutManager  extends LinearLayoutManager {

    protected PagerSnapHelper mPagerSnapHelper;
    protected OnViewPagerListener mOnViewPagerListener;

    public int mCurrentPosition;

    public PlayVideoLayoutManager(Context context) {
        super(context);
    }

    public PlayVideoLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public PlayVideoLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    public void setOnViewPagerListener(OnViewPagerListener listener) {
        this.mOnViewPagerListener = listener;
    }


    @Override
    protected int getExtraLayoutSpace(RecyclerView.State state) {
        return 200;
    }

    @Override
    public boolean canScrollVertically() {
        return super.canScrollVertically();
    }
}
