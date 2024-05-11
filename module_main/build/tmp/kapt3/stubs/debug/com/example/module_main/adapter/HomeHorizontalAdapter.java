package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/19
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\r\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/module_main/adapter/HomeHorizontalAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "mBlockSubscribe", "Lkotlin/Function1;", "", "convert", "holder", "item", "getSubscribeBackground", "Landroid/graphics/drawable/GradientDrawable;", "setSubscribeListener", "blockSubscribe", "module_main_debug"})
public final class HomeHorizontalAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.example.lib_http.bean.data.HomeData.Column.DramaSeries, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> mBlockSubscribe;
    
    public HomeHorizontalAdapter() {
        super(0, null);
    }
    
    public final void setSubscribeListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> blockSubscribe) {
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData.Column.DramaSeries item) {
    }
    
    private final android.graphics.drawable.GradientDrawable getSubscribeBackground() {
        return null;
    }
}