package com.example.lib_common.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\rJ\u001c\u0010#\u001a\u00020\u000e2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fJ\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/lib_common/dialog/AnnounceDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "announceCloseIv", "Landroid/widget/ImageView;", "mAivSubscribe", "Landroidx/appcompat/widget/AppCompatImageView;", "mAtvSubscribe", "Landroidx/appcompat/widget/AppCompatTextView;", "mBlockSubscribe", "Lkotlin/Function1;", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "", "mClSubscribe", "Landroid/view/ViewGroup;", "timeTv", "Landroid/widget/TextView;", "verticalContent", "verticalFlag", "verticalIntroduce", "verticalIv", "getFlag", "", "item", "getSubscribeBackground", "Landroid/graphics/drawable/GradientDrawable;", "isSubscribe", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setContent", "entity", "setSubscribeListener", "blockSubscribe", "updateSubscribeView", "lib_common_release"})
public final class AnnounceDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private android.widget.ImageView announceCloseIv;
    private android.widget.ImageView verticalIv;
    private android.widget.TextView verticalContent;
    private android.widget.TextView verticalFlag;
    private android.widget.TextView timeTv;
    private android.widget.TextView verticalIntroduce;
    private android.view.ViewGroup mClSubscribe;
    private androidx.appcompat.widget.AppCompatImageView mAivSubscribe;
    private androidx.appcompat.widget.AppCompatTextView mAtvSubscribe;
    private kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> mBlockSubscribe;
    
    public AnnounceDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData.Column.DramaSeries entity) {
    }
    
    private final java.lang.String getFlag(com.example.lib_http.bean.data.HomeData.Column.DramaSeries item) {
        return null;
    }
    
    public final void updateSubscribeView(boolean isSubscribe) {
    }
    
    private final android.graphics.drawable.GradientDrawable getSubscribeBackground(boolean isSubscribe) {
        return null;
    }
    
    public final void setSubscribeListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> blockSubscribe) {
    }
}