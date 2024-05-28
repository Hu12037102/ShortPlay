package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2024/2/21
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001c\u0010\f\u001a\u00020\u00072\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0006J(\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J0\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/module_main/adapter/StoreSubAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/example/lib_http/bean/data/StoreData$CoinsSubscription;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "subPayTime", "Lkotlin/Function1;", "", "convert", "holder", "item", "monthSub", "onClickPay", "setFontColor", "color", "", "isWeek", "", "setLinearGradientTextColor", "textView", "Landroid/widget/TextView;", "colors", "", "positions", "", "setTextSize", "totalCoins", "text", "", "startColor", "endColor", "textPrice", "price", "end", "weekSub", "module_main_debug"})
public final class StoreSubAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.example.lib_http.bean.data.StoreData.CoinsSubscription, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.StoreData.CoinsSubscription, kotlin.Unit> subPayTime;
    
    public StoreSubAdapter() {
        super(0, null);
    }
    
    public final void onClickPay(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.StoreData.CoinsSubscription, kotlin.Unit> subPayTime) {
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.StoreData.CoinsSubscription item) {
    }
    
    private final void textPrice(android.widget.TextView textView, java.lang.String price, java.lang.String end) {
    }
    
    private final void monthSub(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.example.lib_http.bean.data.StoreData.CoinsSubscription item) {
    }
    
    private final void weekSub(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.example.lib_http.bean.data.StoreData.CoinsSubscription item) {
    }
    
    private final void setTextSize(int totalCoins, java.lang.String text, android.widget.TextView textView, int startColor, int endColor) {
    }
    
    private final void setLinearGradientTextColor(android.widget.TextView textView, @androidx.annotation.ColorInt()
    int[] colors, float[] positions) {
    }
    
    private final void setFontColor(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.example.lib_http.bean.data.StoreData.CoinsSubscription item, int color, boolean isWeek) {
    }
}