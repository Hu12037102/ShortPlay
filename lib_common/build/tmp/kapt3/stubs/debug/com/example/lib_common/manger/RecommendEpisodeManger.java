package com.example.lib_common.manger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u000223B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0017\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000bJ\b\u0010 \u001a\u0004\u0018\u00010\u001dJ\u0006\u0010!\u001a\u00020\u000eJ\b\u0010\"\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u0006\u0010$\u001a\u00020\u000eJ\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0012\u0010\'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000bJ\u0014\u0010-\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0/J\u0012\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/example/lib_common/manger/RecommendEpisodeManger;", "Landroid/os/Handler$Callback;", "()V", "isRunning", "", "mHandler", "Landroid/os/Handler;", "mOnCountdownCallbacks", "Ljava/util/ArrayList;", "Lcom/example/lib_common/manger/RecommendEpisodeManger$OnCountdownCallback;", "mSelectorMainBarIndex", "", "mTodayReduceCount", "addOnCountdownCallback", "", "onCountdownCallback", "getKey", "", "getSelectorMainBarIndex", "handleMessage", "msg", "Landroid/os/Message;", "initialize", "isToday", "timestamp", "", "(Ljava/lang/Long;)Z", "notifyData", "newEntity", "Lcom/example/lib_http/bean/data/RecommendEpisodeData;", "putOnceShow", "atOnceShowStatus", "queryData", "reduceTodayReduceCount", "removeMessage", "removeOnCountdownCallback", "reset", "sendMessage", "delayMillis", "setData", "entity", "setReduceCount", "reduceCount", "setSelectorMainBarIndex", "index", "start", "request", "Lkotlin/Function0;", "updateData", "episodeEntity", "Companion", "OnCountdownCallback", "lib_common_debug"})
public final class RecommendEpisodeManger implements android.os.Handler.Callback {
    private int mTodayReduceCount = 0;
    private final android.os.Handler mHandler = null;
    private boolean isRunning = false;
    private int mSelectorMainBarIndex = 0;
    private final java.util.ArrayList<com.example.lib_common.manger.RecommendEpisodeManger.OnCountdownCallback> mOnCountdownCallbacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.manger.RecommendEpisodeManger.Companion Companion = null;
    private static final kotlin.Lazy mInstance$delegate = null;
    private static final java.lang.String KEY_PARCELABLE = "key_parcelable";
    public static final int WHAT = 100;
    
    private RecommendEpisodeManger() {
        super();
    }
    
    public final void setSelectorMainBarIndex(int index) {
    }
    
    public final void initialize() {
    }
    
    public final int getSelectorMainBarIndex() {
        return 0;
    }
    
    public final void addOnCountdownCallback(@org.jetbrains.annotations.Nullable()
    com.example.lib_common.manger.RecommendEpisodeManger.OnCountdownCallback onCountdownCallback) {
    }
    
    public final void removeOnCountdownCallback(@org.jetbrains.annotations.Nullable()
    com.example.lib_common.manger.RecommendEpisodeManger.OnCountdownCallback onCountdownCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.lib_common.manger.RecommendEpisodeManger get() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getResidueTime(int popUpDelayTime) {
        return 0;
    }
    
    private final void setReduceCount(int reduceCount) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> request) {
    }
    
    private final boolean isToday(java.lang.Long timestamp) {
        return false;
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.lib_http.bean.data.RecommendEpisodeData queryData() {
        return null;
    }
    
    private final java.lang.String getKey() {
        return null;
    }
    
    private final void setData(com.example.lib_http.bean.data.RecommendEpisodeData entity) {
    }
    
    public final void putOnceShow(int atOnceShowStatus) {
    }
    
    private final void updateData(com.example.lib_http.bean.data.RecommendEpisodeData episodeEntity) {
    }
    
    public final void notifyData(@org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.RecommendEpisodeData newEntity) {
    }
    
    private final void sendMessage(int delayMillis) {
    }
    
    private final void removeMessage() {
    }
    
    @java.lang.Override()
    public boolean handleMessage(@org.jetbrains.annotations.NotNull()
    android.os.Message msg) {
        return false;
    }
    
    public final void reduceTodayReduceCount() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/lib_common/manger/RecommendEpisodeManger$OnCountdownCallback;", "", "onComplete", "", "lib_common_debug"})
    public static abstract interface OnCountdownCallback {
        
        public abstract void onComplete();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/example/lib_common/manger/RecommendEpisodeManger$Companion;", "", "()V", "KEY_PARCELABLE", "", "WHAT", "", "mInstance", "Lcom/example/lib_common/manger/RecommendEpisodeManger;", "getMInstance", "()Lcom/example/lib_common/manger/RecommendEpisodeManger;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "getResidueTime", "popUpDelayTime", "lib_common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.example.lib_common.manger.RecommendEpisodeManger getMInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.lib_common.manger.RecommendEpisodeManger get() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final int getResidueTime(int popUpDelayTime) {
            return 0;
        }
    }
}