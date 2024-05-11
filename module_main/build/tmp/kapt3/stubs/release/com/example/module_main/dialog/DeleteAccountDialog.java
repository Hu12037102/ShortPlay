package com.example.module_main.dialog;

import java.lang.System;

/**
 * 删除账号Dialog
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/module_main/dialog/DeleteAccountDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isCheck", "", "mAivCheck", "Landroidx/appcompat/widget/AppCompatImageView;", "mAtvCancel", "Landroidx/appcompat/widget/AppCompatTextView;", "mAtvDelete", "mClContentParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mOnItemInfoClickListener", "Lcom/example/module_main/dialog/DeleteAccountDialog$OnItemInfoClickListener;", "getCancelTextBackground", "Landroid/graphics/drawable/Drawable;", "getContentParentBackground", "initData", "", "initEvent", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setOnItemInfoClickListener", "onItemInfoClickListener", "updateCheckImage", "OnItemInfoClickListener", "module_main_release"})
public final class DeleteAccountDialog extends android.app.Dialog {
    private androidx.constraintlayout.widget.ConstraintLayout mClContentParent;
    private androidx.appcompat.widget.AppCompatImageView mAivCheck;
    private androidx.appcompat.widget.AppCompatTextView mAtvDelete;
    private androidx.appcompat.widget.AppCompatTextView mAtvCancel;
    private boolean isCheck = false;
    private com.example.module_main.dialog.DeleteAccountDialog.OnItemInfoClickListener mOnItemInfoClickListener;
    
    public DeleteAccountDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void setOnItemInfoClickListener(@org.jetbrains.annotations.Nullable()
    com.example.module_main.dialog.DeleteAccountDialog.OnItemInfoClickListener onItemInfoClickListener) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void initData() {
    }
    
    private final void updateCheckImage() {
    }
    
    private final void initEvent() {
    }
    
    private final android.graphics.drawable.Drawable getContentParentBackground() {
        return null;
    }
    
    private final android.graphics.drawable.Drawable getCancelTextBackground() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/module_main/dialog/DeleteAccountDialog$OnItemInfoClickListener;", "", "onClickCancel", "", "view", "Landroid/view/View;", "onClickDelete", "module_main_release"})
    public static abstract interface OnItemInfoClickListener {
        
        public abstract void onClickCancel(@org.jetbrains.annotations.Nullable()
        android.view.View view);
        
        public abstract void onClickDelete(@org.jetbrains.annotations.Nullable()
        android.view.View view);
    }
}