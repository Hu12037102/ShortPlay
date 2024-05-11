package com.example.lib_common.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010\u001c\u001a\u00020\u00102\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/lib_common/dialog/PayFailFeedbackDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/example/lib_common/dialog/PayFailFeedbackDialog$Adapter;", "mAtvDesc", "Landroidx/appcompat/widget/AppCompatTextView;", "mAtvSubmit", "mAtvTitle", "mRvData", "Landroidx/recyclerview/widget/RecyclerView;", "mSubmitBlock", "Lkotlin/Function1;", "Lcom/example/lib_http/bean/data/PayFailFeedbackData$Option;", "", "getSubmitBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "initData", "initEvent", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "data", "Lcom/example/lib_http/bean/data/PayFailFeedbackData;", "setSubmitListener", "submitBlock", "Adapter", "Companion", "lib_common_debug"})
public final class PayFailFeedbackDialog extends androidx.appcompat.app.AppCompatDialog {
    private androidx.appcompat.widget.AppCompatTextView mAtvDesc;
    private androidx.recyclerview.widget.RecyclerView mRvData;
    private com.example.lib_common.dialog.PayFailFeedbackDialog.Adapter mAdapter;
    private kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.PayFailFeedbackData.Option, kotlin.Unit> mSubmitBlock;
    private androidx.appcompat.widget.AppCompatTextView mAtvSubmit;
    private androidx.appcompat.widget.AppCompatTextView mAtvTitle;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.dialog.PayFailFeedbackDialog.Companion Companion = null;
    
    public PayFailFeedbackDialog(@org.jetbrains.annotations.NotNull()
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
    
    private final void initEvent() {
    }
    
    public final void setSubmitListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.PayFailFeedbackData.Option, kotlin.Unit> submitBlock) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PayFailFeedbackData data) {
    }
    
    private final android.graphics.drawable.GradientDrawable getSubmitBackgroundDrawable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.example.lib_http.bean.data.PayFailFeedbackData.Option getFeedbackData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.lib_http.bean.data.PayFailFeedbackData.Option> data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/example/lib_common/dialog/PayFailFeedbackDialog$Adapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/example/lib_http/bean/data/PayFailFeedbackData$Option;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "convert", "", "holder", "item", "getCheckEntity", "getContentBackground", "Landroid/graphics/drawable/GradientDrawable;", "isCheck", "", "lib_common_debug"})
    public static final class Adapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.example.lib_http.bean.data.PayFailFeedbackData.Option, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
        
        public Adapter() {
            super(0, null);
        }
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
        com.example.lib_http.bean.data.PayFailFeedbackData.Option item) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.lib_http.bean.data.PayFailFeedbackData.Option getCheckEntity() {
            return null;
        }
        
        private final android.graphics.drawable.GradientDrawable getContentBackground(boolean isCheck) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/lib_common/dialog/PayFailFeedbackDialog$Companion;", "", "()V", "getFeedbackData", "Lcom/example/lib_http/bean/data/PayFailFeedbackData$Option;", "data", "", "lib_common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.example.lib_http.bean.data.PayFailFeedbackData.Option getFeedbackData(@org.jetbrains.annotations.Nullable()
        java.util.List<com.example.lib_http.bean.data.PayFailFeedbackData.Option> data) {
            return null;
        }
    }
}