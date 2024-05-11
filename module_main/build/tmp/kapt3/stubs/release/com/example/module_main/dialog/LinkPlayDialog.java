package com.example.module_main.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0002\'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0013J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/module_main/dialog/LinkPlayDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAivBackground", "Landroidx/appcompat/widget/AppCompatImageView;", "mAivClose", "mAivContent", "mAtvClickPlay", "Landroidx/appcompat/widget/AppCompatTextView;", "mAtvTitle", "mClPlayParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mCountDown", "", "mHandler", "Landroid/os/Handler;", "mOnClickPlayListener", "Lcom/example/module_main/dialog/LinkPlayDialog$OnClickPlayListener;", "dismiss", "", "getPlayBackground", "Landroid/graphics/drawable/GradientDrawable;", "initData", "initEvent", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "removeMessage", "sendMessage", "setData", "data", "Lcom/example/lib_http/bean/data/UserInfoData$ContinueWatching;", "setOnClickPlayListener", "onClickPlayListener", "setPlayText", "show", "Companion", "OnClickPlayListener", "module_main_release"})
public final class LinkPlayDialog extends android.app.Dialog {
    private androidx.appcompat.widget.AppCompatImageView mAivBackground;
    private androidx.appcompat.widget.AppCompatImageView mAivContent;
    private androidx.appcompat.widget.AppCompatTextView mAtvTitle;
    private androidx.constraintlayout.widget.ConstraintLayout mClPlayParent;
    private androidx.appcompat.widget.AppCompatImageView mAivClose;
    private androidx.appcompat.widget.AppCompatTextView mAtvClickPlay;
    private com.example.module_main.dialog.LinkPlayDialog.OnClickPlayListener mOnClickPlayListener;
    private final android.os.Handler mHandler = null;
    private int mCountDown = 10;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.dialog.LinkPlayDialog.Companion Companion = null;
    public static final int WHAT = 100;
    
    public LinkPlayDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void setOnClickPlayListener(@org.jetbrains.annotations.Nullable()
    com.example.module_main.dialog.LinkPlayDialog.OnClickPlayListener onClickPlayListener) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void initData() {
    }
    
    private final void setPlayText() {
    }
    
    private final void initEvent() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    private final void sendMessage() {
    }
    
    private final void removeMessage() {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.UserInfoData.ContinueWatching data) {
    }
    
    private final android.graphics.drawable.GradientDrawable getPlayBackground() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/module_main/dialog/LinkPlayDialog$OnClickPlayListener;", "", "onClose", "", "onPlay", "view", "Landroid/view/View;", "module_main_release"})
    public static abstract interface OnClickPlayListener {
        
        public abstract void onPlay(@org.jetbrains.annotations.Nullable()
        android.view.View view);
        
        public abstract void onClose();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/module_main/dialog/LinkPlayDialog$Companion;", "", "()V", "WHAT", "", "module_main_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}