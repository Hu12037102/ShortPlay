package com.example.lib_common.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u00020\u00152\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\u0014\u0010(\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017J\u0018\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010-\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/lib_common/dialog/FlashPurchaseNewDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "mData", "Lcom/example/lib_http/bean/data/FlashSaleData;", "(Landroid/content/Context;Lcom/example/lib_http/bean/data/FlashSaleData;)V", "discountRatioTv", "Landroid/widget/TextView;", "discountTv", "doubtIv", "Landroid/widget/ImageView;", "hourTV", "ivClaimNow", "limitTv", "minuteTV", "objectAnimation", "Landroid/view/animation/Animation;", "onClick", "Lkotlin/Function1;", "", "", "onClickClaim", "Lkotlin/Function0;", "priceTv", "purchaseTv", "secondTV", "tvBonus", "tvCoins", "dismiss", "initAnimaion", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "setLimit", "limit", "", "setOnClick", "block", "setOnClickClaim", "setSpeciesNum", "coins", "bonus", "stopAnimation", "transactionType", "lib_common_debug"})
public final class FlashPurchaseNewDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private com.example.lib_http.bean.data.FlashSaleData mData;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClick;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickClaim;
    private android.widget.TextView hourTV;
    private android.widget.TextView minuteTV;
    private android.widget.TextView secondTV;
    private android.widget.TextView limitTv;
    private android.widget.ImageView doubtIv;
    private android.widget.TextView discountTv;
    private android.widget.TextView priceTv;
    private android.widget.TextView purchaseTv;
    private android.widget.TextView discountRatioTv;
    private android.widget.TextView tvCoins;
    private android.widget.TextView tvBonus;
    private android.widget.ImageView ivClaimNow;
    private android.view.animation.Animation objectAnimation;
    
    public FlashPurchaseNewDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.FlashSaleData mData) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAnimaion() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.FlashSaleData mData) {
    }
    
    private final void transactionType(int transactionType) {
    }
    
    private final void stopAnimation() {
    }
    
    private final void setLimit(int limit) {
    }
    
    private final void setSpeciesNum(int coins, int bonus) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    public final void setOnClickClaim(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickClaim) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
}