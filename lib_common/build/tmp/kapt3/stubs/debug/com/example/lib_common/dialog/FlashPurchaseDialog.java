package com.example.lib_common.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0015J\u0012\u0010\"\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0018H\u0002J\u001a\u0010%\u001a\u00020\u00122\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\u0014\u0010\'\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014J\u0018\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/lib_common/dialog/FlashPurchaseDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "mData", "Lcom/example/lib_http/bean/data/FlashSaleData;", "(Landroid/content/Context;Lcom/example/lib_http/bean/data/FlashSaleData;)V", "discountRatioTv", "Landroid/widget/TextView;", "discountTv", "doubtIv", "Landroid/widget/ImageView;", "hourTV", "limitTv", "minuteTV", "onClick", "Lkotlin/Function1;", "", "", "onClickClaim", "Lkotlin/Function0;", "onShow", "Lkotlin/Function3;", "", "", "onlyIv", "priceTv", "purchaseTv", "secondTV", "tvBonus", "tvCoins", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "setLimit", "limit", "setOnClick", "block", "setOnClickClaim", "setSpeciesNum", "coins", "bonus", "transactionType", "transaction_type", "lib_common_debug"})
public final class FlashPurchaseDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private com.example.lib_http.bean.data.FlashSaleData mData;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClick;
    private kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onShow;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickClaim;
    private android.widget.TextView hourTV;
    private android.widget.TextView minuteTV;
    private android.widget.TextView secondTV;
    private android.widget.TextView limitTv;
    private android.widget.TextView discountTv;
    private android.widget.TextView priceTv;
    private android.widget.TextView tvCoins;
    private android.widget.TextView tvBonus;
    private android.widget.TextView discountRatioTv;
    private android.widget.TextView purchaseTv;
    private android.widget.ImageView doubtIv;
    private android.widget.ImageView onlyIv;
    
    public FlashPurchaseDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.FlashSaleData mData) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.FlashSaleData mData) {
    }
    
    private final void setLimit(int limit) {
    }
    
    private final void setSpeciesNum(int coins, int bonus) {
    }
    
    private final void transactionType(int transaction_type) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    public final void setOnClickClaim(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickClaim) {
    }
}