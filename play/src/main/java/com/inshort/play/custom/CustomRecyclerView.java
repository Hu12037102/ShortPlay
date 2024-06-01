package com.inshort.play.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.utils.LogUtils;

/**
 * @author: 张勇
 * @date: 2024/6/1
 */
public class CustomRecyclerView extends RecyclerView {
    private float initialY;
    private boolean isScrollingUp = false;
    private boolean isScroll = true;

    public CustomRecyclerView(Context context) {
        super(context);
    }

    public CustomRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * 设置快速滑动时间间隔
     * @param velocityX Initial horizontal velocity in pixels per second
     * @param velocityY Initial vertical velocity in pixels per second
     * @return
     */
    @Override
    public boolean fling(int velocityX, int velocityY) {
        // 调整滑动速度，减小滑动距离
        velocityY = (int) (velocityY * 0.2); // 表示滑动速度减半
        LogUtils.d("");
        return super.fling(velocityX, velocityY);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        if (e.getAction() == MotionEvent.ACTION_DOWN) {
            initialY = e.getY();
            isScrollingUp = isScroll; // 重置滚动方向
        } else if (e.getAction() == MotionEvent.ACTION_MOVE) {
            float currentY = e.getY();
            if (currentY > initialY) {
                isScrollingUp = true;
            }
        }

        // 如果正在向下滚动（非向上滚动），则拦截事件
        if (!isScrollingUp) {
            return false;
        }

        return super.onInterceptTouchEvent(e);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        if (e.getAction() == MotionEvent.ACTION_MOVE) {
            float currentY = e.getY();
            if (currentY > initialY) {
                isScrollingUp = true;
            } else {
                isScrollingUp = isScroll;
            }

            initialY = currentY; // 更新初始Y坐标
        }

        // 如果正在向下滚动（非向上滚动），则不处理触摸事件
        if (!isScrollingUp) {
            return false;
        }

        return super.onTouchEvent(e);
    }

    public void setScrollingUp(boolean isScroll) {
        this.isScroll = isScroll;
    }
}
