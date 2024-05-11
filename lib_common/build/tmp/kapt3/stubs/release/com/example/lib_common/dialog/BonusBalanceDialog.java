package com.example.lib_common.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0015J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/lib_common/dialog/BonusBalanceDialog;", "Landroid/app/Dialog;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "contentTv", "Landroid/widget/TextView;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isAgree", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setContentText", "content", "", "show", "lib_common_release"})
public final class BonusBalanceDialog extends android.app.Dialog {
    private final android.app.Activity context = null;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClick;
    private android.widget.TextView contentTv;
    
    public BonusBalanceDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    public final void setContentText(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
}