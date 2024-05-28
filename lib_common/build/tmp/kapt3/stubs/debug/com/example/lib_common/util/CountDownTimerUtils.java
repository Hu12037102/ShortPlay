package com.example.lib_common.util;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/11/7
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\r\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\b\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/lib_common/util/CountDownTimerUtils;", "Landroid/os/CountDownTimer;", "TotalTime", "", "countDownInterval", "(JJ)V", "callback", "Lkotlin/Function1;", "", "isFinishStart", "", "onFinishCallBack", "Lkotlin/Function0;", "countDownIntervalTickCallBack", "isStart", "onDetachedView", "onFinish", "onFinishCallback", "onTick", "millisUntilFinished", "lib_common_debug"})
public final class CountDownTimerUtils extends android.os.CountDownTimer {
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback;
    private boolean isFinishStart = false;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFinishCallBack;
    
    public CountDownTimerUtils() {
        super(0L, 0L);
    }
    
    public CountDownTimerUtils(long TotalTime, long countDownInterval) {
        super(0L, 0L);
    }
    
    @java.lang.Override()
    public void onTick(long millisUntilFinished) {
    }
    
    @java.lang.Override()
    public void onFinish() {
    }
    
    public final void isFinishStart(boolean isStart) {
    }
    
    private final void onFinishCallback() {
    }
    
    public final void onFinishCallBack(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void countDownIntervalTickCallBack(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback) {
    }
    
    public final void onDetachedView() {
    }
}