package com.example.module_play.ui.listentr;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/9/27
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\nH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\nH&J\b\u0010 \u001a\u00020\u0003H&\u00a8\u0006!"}, d2 = {"Lcom/example/module_play/ui/listentr/PlayerViewClickListener;", "", "adPop", "", "currentEpisodes", "", "addCallback", "dismissLoading", "flashPlay", "isShowFlash", "", "getRedirectUrl", "position", "isPurchase", "inviteFriend", "isAutoLock", "isLock", "nestedScrollingEnabled", "isScroll", "onItemClick", "onSeek", "seekPosition", "", "(ILjava/lang/Long;)V", "onViewDetachedFromWindow", "holder", "Lcom/example/module_play/aliplayer/auivideolistcommon/adapter/AUIVideoListViewHolder;", "playPagerData", "purchaseUnlock", "requestCollect", "is_cancel", "requestGive", "showViewEpisode", "module_play_debug"})
public abstract interface PlayerViewClickListener {
    
    public abstract void requestGive(boolean is_cancel);
    
    public abstract void requestCollect(boolean is_cancel);
    
    public abstract void inviteFriend();
    
    public abstract void nestedScrollingEnabled(boolean isScroll);
    
    public abstract void purchaseUnlock(int currentEpisodes);
    
    public abstract void getRedirectUrl(int position, boolean isPurchase);
    
    public abstract void onSeek(int position, @org.jetbrains.annotations.Nullable()
    java.lang.Long seekPosition);
    
    public abstract void playPagerData(int position);
    
    public abstract void onItemClick(int position);
    
    public abstract void addCallback();
    
    public abstract void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.example.module_play.aliplayer.auivideolistcommon.adapter.AUIVideoListViewHolder holder, int position);
    
    public abstract void isAutoLock(boolean isLock);
    
    public abstract void adPop(int currentEpisodes);
    
    public abstract void showViewEpisode();
    
    public abstract void flashPlay(boolean isShowFlash);
    
    public abstract void dismissLoading();
}