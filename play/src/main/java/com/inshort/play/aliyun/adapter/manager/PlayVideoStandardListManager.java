package com.inshort.play.aliyun.adapter.manager;


import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.utils.LogUtils;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoStandardListManager  extends PlayVideoLayoutManager implements View.OnTouchListener{
    private int mState;
    private int mdy;
    public PlayVideoStandardListManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
        init();
    }

    private void init(){
        mPagerSnapHelper = new PagerSnapHelper();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onAttachedToWindow(RecyclerView view) {
        super.onAttachedToWindow(view);
        if(view.getOnFlingListener()==null){
            mPagerSnapHelper.attachToRecyclerView(view);
        }
        view.addOnChildAttachStateChangeListener(mChildAttachStateChangeListener);
        view.setOnTouchListener(this);
        view.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                mState = newState;
                if (mState == SCROLL_STATE_IDLE) {
                    View viewIdle = mPagerSnapHelper.findSnapView(PlayVideoStandardListManager.this);
                    if (viewIdle == null) {
                        return;
                    }
                    int positionIdle = getPosition(viewIdle);
                    if (mOnViewPagerListener != null && mCurrentPosition!= positionIdle) {
                        mOnViewPagerListener.onPageSelected(positionIdle, true);
                    }
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                mdy = dy;
            }
        });
    }


    private final RecyclerView.OnChildAttachStateChangeListener mChildAttachStateChangeListener = new RecyclerView.OnChildAttachStateChangeListener() {
        @Override
        public void onChildViewAttachedToWindow(@NonNull View view) {
            if (mOnViewPagerListener != null && getChildCount() == 1) {
                mOnViewPagerListener.onInitComplete();
            } else {
                int position = getPosition(view);
                mOnViewPagerListener.onPageShow(position);
            }
        }

        @Override
        public void onChildViewDetachedFromWindow(View view) {
            if (mOnViewPagerListener != null) {
                mOnViewPagerListener.onPageRelease(getPosition(view));
            }

        }
    };

    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            if (mPagerSnapHelper != null) {
                View snapView = mPagerSnapHelper.findSnapView(PlayVideoStandardListManager.this);
                if (snapView != null) {
                    int position = getPosition(snapView);
                    //如果是第一个视频,并且
                    if (position == 0 && mdy < 0) {
                        if (mOnViewPagerListener != null && getChildCount() == 1) {
                            LogUtils.d("onTouch  >>> " + position);
                            mOnViewPagerListener.onPageSelected(position, true);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try{
            super.onLayoutChildren(recycler, state);
        }catch (IndexOutOfBoundsException ignored){
        }
    }
}
