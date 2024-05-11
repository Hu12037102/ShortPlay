package com.example.lib_common.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u001c\u0010\u0015\u001a\u00020\u000b2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/lib_common/dialog/ReleaseReminderDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAtvCancel", "Landroidx/appcompat/widget/AppCompatTextView;", "mAtvTurnOn", "mBlock", "Lkotlin/Function1;", "", "", "getCancelBackground", "Landroid/graphics/drawable/GradientDrawable;", "getTurnOnBackground", "initData", "initEvent", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setClickBlock", "block", "lib_common_release"})
public final class ReleaseReminderDialog extends android.app.Dialog {
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> mBlock;
    private androidx.appcompat.widget.AppCompatTextView mAtvCancel;
    private androidx.appcompat.widget.AppCompatTextView mAtvTurnOn;
    
    public ReleaseReminderDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void initData() {
    }
    
    public final void setClickBlock(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    private final void initEvent() {
    }
    
    private final android.graphics.drawable.GradientDrawable getCancelBackground() {
        return null;
    }
    
    private final android.graphics.drawable.GradientDrawable getTurnOnBackground() {
        return null;
    }
}