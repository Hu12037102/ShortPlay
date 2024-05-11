package com.example.lib_common.manger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/lib_common/manger/AdCounDownTimer;", "", "()V", "controlTime", "", "counDownTimer", "Lcom/example/lib_common/util/CountDownTimerUtils;", "mAdCounDownTimers", "", "Lcom/example/lib_common/manger/AdCounDownTimer$onAdSecondCallBack;", "addOnAdSecondCallBack", "", "onAdSecondCallBack", "getControlTime", "onAdFinishCallBack", "time", "removeOnAdSecondCallBack", "start", "stop", "Companion", "lib_common_release"})
public final class AdCounDownTimer {
    private com.example.lib_common.util.CountDownTimerUtils counDownTimer;
    private java.util.List<com.example.lib_common.manger.AdCounDownTimer.onAdSecondCallBack> mAdCounDownTimers;
    private int controlTime = 25;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.manger.AdCounDownTimer.Companion Companion = null;
    private static final kotlin.Lazy instance$delegate = null;
    
    private AdCounDownTimer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.lib_common.manger.AdCounDownTimer get() {
        return null;
    }
    
    /**
     * 加入监听
     */
    public final void addOnAdSecondCallBack(@org.jetbrains.annotations.NotNull()
    com.example.lib_common.manger.AdCounDownTimer.onAdSecondCallBack onAdSecondCallBack) {
    }
    
    /**
     * 移除监听
     */
    public final void removeOnAdSecondCallBack(@org.jetbrains.annotations.NotNull()
    com.example.lib_common.manger.AdCounDownTimer.onAdSecondCallBack onAdSecondCallBack) {
    }
    
    /**
     * 广告计时监听
     */
    private final void onAdSecondCallBack(int time) {
    }
    
    /**
     * 广告计时完成监听
     */
    private final void onAdFinishCallBack() {
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    /**
     * 获取当前到第几秒
     */
    public final int getControlTime() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/lib_common/manger/AdCounDownTimer$onAdSecondCallBack;", "", "onCallBack", "", "time", "", "onFinishCallBack", "lib_common_release"})
    public static abstract interface onAdSecondCallBack {
        
        public abstract void onCallBack(int time);
        
        public abstract void onFinishCallBack();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/lib_common/manger/AdCounDownTimer$Companion;", "", "()V", "instance", "Lcom/example/lib_common/manger/AdCounDownTimer;", "getInstance", "()Lcom/example/lib_common/manger/AdCounDownTimer;", "instance$delegate", "Lkotlin/Lazy;", "get", "lib_common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.example.lib_common.manger.AdCounDownTimer getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.lib_common.manger.AdCounDownTimer get() {
            return null;
        }
    }
}