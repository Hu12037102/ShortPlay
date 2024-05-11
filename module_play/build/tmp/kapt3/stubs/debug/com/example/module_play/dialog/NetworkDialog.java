package com.example.module_play.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u0019J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0015J\u001a\u0010\u001f\u001a\u00020\u00192\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190\u0014J\u0006\u0010!\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R)\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/module_play/dialog/NetworkDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TotalTime", "", "getTotalTime", "()J", "setTotalTime", "(J)V", "contentTv", "Landroid/widget/TextView;", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isAgree", "", "removeTv", "cancels", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setOnClick", "block", "start", "module_play_debug"})
public final class NetworkDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClick;
    private android.widget.TextView contentTv;
    private android.widget.TextView removeTv;
    private long TotalTime = 15000L;
    @org.jetbrains.annotations.NotNull()
    private android.os.CountDownTimer countDownTimer;
    
    public NetworkDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final long getTotalTime() {
        return 0L;
    }
    
    public final void setTotalTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.CountDownTimer getCountDownTimer() {
        return null;
    }
    
    public final void setCountDownTimer(@org.jetbrains.annotations.NotNull()
    android.os.CountDownTimer p0) {
    }
    
    public final void start() {
    }
    
    public final void cancels() {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
}