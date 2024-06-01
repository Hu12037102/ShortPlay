package com.inshort.play.listener;

/**
 * @author: 张勇
 * @date: 2024/5/23
 */
public interface OnViewPagerListener {
    void onInitComplete();

    void onPageShow(int position);

    void onPageSelected(int position,boolean isManager);

    void onPageRelease(int position);
}
