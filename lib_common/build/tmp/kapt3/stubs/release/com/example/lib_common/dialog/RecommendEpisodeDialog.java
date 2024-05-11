package com.example.lib_common.dialog;

import java.lang.System;

/**
 * 推荐剧集dialog
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\fJ\b\u0010\"\u001a\u00020\u0011H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/lib_common/dialog/RecommendEpisodeDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAivClose", "Landroidx/appcompat/widget/AppCompatImageView;", "mAtvTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "mClPlayParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mOnDialogInfoClickListener", "Lcom/example/lib_common/dialog/RecommendEpisodeDialog$OnDialogInfoClickListener;", "mRivBackground", "Lcom/ruffian/library/widget/RImageView;", "mRivContent", "dismiss", "", "getPlayBackground", "Landroid/graphics/drawable/GradientDrawable;", "coverBackgroundId", "", "initData", "initEvent", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "setData", "entity", "Lcom/example/lib_http/bean/data/RecommendEpisodeData$Details;", "setOnDialogInfoClickListener", "onDialogInfoClickListener", "show", "OnDialogInfoClickListener", "lib_common_release"})
public final class RecommendEpisodeDialog extends android.app.Dialog {
    private com.ruffian.library.widget.RImageView mRivBackground;
    private com.ruffian.library.widget.RImageView mRivContent;
    private androidx.appcompat.widget.AppCompatTextView mAtvTitle;
    private androidx.appcompat.widget.AppCompatImageView mAivClose;
    private com.example.lib_common.dialog.RecommendEpisodeDialog.OnDialogInfoClickListener mOnDialogInfoClickListener;
    private androidx.constraintlayout.widget.ConstraintLayout mClPlayParent;
    
    public RecommendEpisodeDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void setOnDialogInfoClickListener(@org.jetbrains.annotations.Nullable()
    com.example.lib_common.dialog.RecommendEpisodeDialog.OnDialogInfoClickListener onDialogInfoClickListener) {
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
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.RecommendEpisodeData.Details entity) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    @java.lang.Override()
    public void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    private final android.graphics.drawable.GradientDrawable getPlayBackground(int coverBackgroundId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/lib_common/dialog/RecommendEpisodeDialog$OnDialogInfoClickListener;", "", "onClose", "", "view", "Landroid/view/View;", "onPlay", "lib_common_release"})
    public static abstract interface OnDialogInfoClickListener {
        
        public abstract void onClose(@org.jetbrains.annotations.Nullable()
        android.view.View view);
        
        public abstract void onPlay(@org.jetbrains.annotations.Nullable()
        android.view.View view);
    }
}