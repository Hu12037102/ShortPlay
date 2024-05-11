package com.example.lib_common.player;

import java.lang.System;

/**
 * use AliPlayer SDK [MediaLoader]
 * auto load next video after receive MediaLoader onCompleted/onError
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000fJ\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\u001e\u0010\"\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0018\u0010#\u001a\u00020\u00122\u0010\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0014J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/lib_common/player/AliPlayerPreload;", "", "()V", "mExecutorService", "Ljava/util/concurrent/ExecutorService;", "mIsLive", "", "mMediaLoader", "Lcom/aliyun/loader/MediaLoader;", "mOldPosition", "Ljava/util/concurrent/atomic/AtomicInteger;", "mUrlLinkedList", "", "Lcom/example/lib_http/bean/data/PlayBeanData;", "numIndex", "", "startIndex", "addUrls", "", "videoBeanList", "", "bindPrepareUrl", "mUrl", "", "cancel", "position", "url", "getRedirectUrl", "mPath", "hasNext", "currentPosition", "isLive", "load", "loadNext", "moveToSerial", "setUrls", "data", "startLoad", "Companion", "lib_common_release"})
public final class AliPlayerPreload {
    private final java.util.concurrent.atomic.AtomicInteger mOldPosition = null;
    private final com.aliyun.loader.MediaLoader mMediaLoader = null;
    private java.util.List<com.example.lib_http.bean.data.PlayBeanData> mUrlLinkedList;
    private final java.util.concurrent.ExecutorService mExecutorService = null;
    private boolean mIsLive = true;
    private int startIndex = 0;
    private int numIndex = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.player.AliPlayerPreload.Companion Companion = null;
    private static final java.lang.String TAG = "AliPlayerPreload";
    @kotlin.jvm.Volatile()
    private static volatile com.example.lib_common.player.AliPlayerPreload mInstance;
    
    private AliPlayerPreload() {
        super();
    }
    
    private final void load(java.lang.String url) {
    }
    
    private final void cancel(java.lang.String url) {
    }
    
    /**
     * cancel MediaLoad with position
     */
    public final void cancel(int position) {
    }
    
    /**
     * Load Next Video
     */
    private final void loadNext() {
    }
    
    /**
     * set DataSource
     */
    public final void setUrls(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.lib_http.bean.data.PlayBeanData> data) {
    }
    
    public final void addUrls(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.lib_http.bean.data.PlayBeanData> videoBeanList) {
    }
    
    /**
     * start load
     */
    public final void moveToSerial(int position, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.lib_http.bean.data.PlayBeanData> videoBeanList) {
    }
    
    private final void startLoad(int numIndex) {
    }
    
    private final boolean hasNext(int currentPosition) {
        return false;
    }
    
    public final void isLive(boolean isLive) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.example.lib_common.player.AliPlayerPreload getInstance() {
        return null;
    }
    
    private final void getRedirectUrl(java.lang.String mPath) {
    }
    
    private final void bindPrepareUrl(java.lang.String mUrl) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lib_common/player/AliPlayerPreload$Companion;", "", "()V", "TAG", "", "instance", "Lcom/example/lib_common/player/AliPlayerPreload;", "getInstance$annotations", "getInstance", "()Lcom/example/lib_common/player/AliPlayerPreload;", "mInstance", "lib_common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getInstance$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.lib_common.player.AliPlayerPreload getInstance() {
            return null;
        }
    }
}