package com.example.module_play.aliplayer.auivideostandradlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cJ\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u001aJ\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0015J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0014\u0010*\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cJ\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\bJ\u0010\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010/J\u000e\u00100\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u00101\u001a\u00020\u001a2\u0006\u00101\u001a\u00020$J\u0006\u00102\u001a\u00020\u001aJ\u0006\u00103\u001a\u00020\u001aJ\u000e\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020(J\u0010\u00106\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u00010\u0018J\u000e\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\bJ\u0010\u0010:\u001a\u00020\u001a2\b\u0010;\u001a\u0004\u0018\u00010<J\u0006\u0010=\u001a\u00020\u001aJ\u0010\u0010>\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0006\u0010?\u001a\u00020\u001aJ\u0006\u0010@\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/example/module_play/aliplayer/auivideostandradlist/AUIVideoStandardListController;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "aliListPlayer", "Lcom/aliyun/player/AliListPlayer;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "mAliPlayerPreload", "Lcom/example/lib_common/player/AliPlayerPreload;", "mCurrentPlayerState", "mData", "", "Lcom/example/lib_http/bean/data/PlayBeanData;", "mIndexWithUUID", "Landroid/util/SparseArray;", "", "mOldPosition", "mPlayerListener", "Lcom/example/lib_common/player/listener/PlayerListener;", "addSource", "", "videoBeanList", "", "bindPrepareUrl", "position", "mUrl", "clear", "destroy", "enableLocalCache", "enable", "", "path", "getCurrentPosition", "extraValue", "", "getRedirectUrl", "loadSource", "listVideo", "onPageSelected", "onPlayStateChange", "viewHolder", "Lcom/example/module_play/aliplayer/auivideolistcommon/adapter/AUIVideoListViewHolder;", "onPrepared", "openLoopPlay", "pause", "reload", "seek", "seekPosition", "setPlayerListener", "listener", "setPreloadCount", "preloadCount", "setSurface", "surface", "Landroid/view/Surface;", "start", "startPlay", "stop", "surfaceChanged", "module_play_release"})
public final class AUIVideoStandardListController {
    private final com.aliyun.player.AliListPlayer aliListPlayer = null;
    private int mOldPosition = 0;
    private int mCurrentPlayerState = 0;
    private final com.example.lib_common.player.AliPlayerPreload mAliPlayerPreload = null;
    private final android.util.SparseArray<java.lang.String> mIndexWithUUID = null;
    private java.util.List<com.example.lib_http.bean.data.PlayBeanData> mData;
    private com.example.lib_common.player.listener.PlayerListener mPlayerListener;
    private int index = 0;
    
    public AUIVideoStandardListController(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void loadSource(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_http.bean.data.PlayBeanData> listVideo) {
    }
    
    public final void addSource(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_http.bean.data.PlayBeanData> videoBeanList) {
    }
    
    public final void openLoopPlay(boolean openLoopPlay) {
    }
    
    public final void pause() {
    }
    
    public final void start() {
    }
    
    public final void clear() {
    }
    
    public final void getCurrentPosition(long extraValue) {
    }
    
    public final void reload() {
    }
    
    public final void setPlayerListener(@org.jetbrains.annotations.Nullable()
    com.example.lib_common.player.listener.PlayerListener listener) {
    }
    
    public final void onPageSelected(int position) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    private final void startPlay(java.lang.String mUrl) {
    }
    
    public final void stop() {
    }
    
    public final void setSurface(@org.jetbrains.annotations.Nullable()
    android.view.Surface surface) {
    }
    
    public final void surfaceChanged() {
    }
    
    public final void destroy() {
    }
    
    public final void onPrepared(int position) {
    }
    
    public final void onPlayStateChange(@org.jetbrains.annotations.Nullable()
    com.example.module_play.aliplayer.auivideolistcommon.adapter.AUIVideoListViewHolder viewHolder) {
    }
    
    public final void seek(long seekPosition) {
    }
    
    public final void setPreloadCount(int preloadCount) {
    }
    
    public final void enableLocalCache(boolean enable, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    private final void getRedirectUrl(int position) {
    }
    
    private final void bindPrepareUrl(int position, java.lang.String mUrl) {
    }
}