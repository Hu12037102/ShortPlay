package com.example.module_main.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 *  APP版本升级提示框
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0007J\u0006\u0010\'\u001a\u00020\u0016J\u001a\u0010(\u001a\u00020\u00162\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0012R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006+"}, d2 = {"Lcom/example/module_main/dialog/AppUpDataDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "isForce", "", "messages", "", "", "title", "(Landroid/content/Context;ZLjava/util/List;Ljava/lang/String;)V", "adapter", "Lcom/example/module_main/dialog/AppUpDataDialog$AppUpDataMessageAdapter;", "buttonLl", "Landroid/widget/LinearLayout;", "getMessages", "()Ljava/util/List;", "onClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isAgree", "", "progress", "Landroid/widget/ProgressBar;", "progressRl", "Landroid/widget/RelativeLayout;", "scheduleTv", "Landroid/widget/TextView;", "speedTv", "getTitle", "()Ljava/lang/String;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDownloadComplete", "onProgress", "progressPercent", "", "onStartDown", "setOnClick", "block", "AppUpDataMessageAdapter", "module_main_debug"})
public final class AppUpDataDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private final boolean isForce = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> messages = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private com.example.module_main.dialog.AppUpDataDialog.AppUpDataMessageAdapter adapter;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClick;
    private android.widget.ProgressBar progress;
    private android.widget.LinearLayout buttonLl;
    private android.widget.RelativeLayout progressRl;
    private android.widget.TextView scheduleTv;
    private android.widget.TextView speedTv;
    
    public AppUpDataDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isForce, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> messages, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onStartDown() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void onProgress(int progressPercent) {
    }
    
    public final void onDownloadComplete() {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcom/example/module_main/dialog/AppUpDataDialog$AppUpDataMessageAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "(Lcom/example/module_main/dialog/AppUpDataDialog;)V", "convert", "", "holder", "item", "module_main_debug"})
    public final class AppUpDataMessageAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<java.lang.String, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
        
        public AppUpDataMessageAdapter() {
            super(0, null);
        }
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
        java.lang.String item) {
        }
    }
}