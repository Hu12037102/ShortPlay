package com.inshort.play.listener;

/**
 * @author: 张勇
 * @date: 2024/5/28
 */
public interface OnAdapterClick {

    void setPlayUrl(int position,boolean isPurchase);

    void onItemClick(int position);

    void onSeek(int position,long seekPosition);

    void setCurrentNumber(int currentNumber);

}
