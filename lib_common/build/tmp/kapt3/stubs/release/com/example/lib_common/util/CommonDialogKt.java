package com.example.lib_common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a(\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0007\u001a8\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u001a\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u001a\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a(\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a0\u0010\u001a\u001a\u00020\u001b*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\b2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a,\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010!\u001a(\u0010\"\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001f\u001a\u00020#2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0007\u001a*\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a \u0010&\u001a\u00020\u0001*\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a,\u0010\'\u001a\u00020(*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010!\u00a8\u0006)"}, d2 = {"advertisementDialog", "", "Landroid/content/Context;", "viewed", "", "total", "block", "Lkotlin/Function1;", "", "announceInAdvance", "Lcom/example/lib_common/dialog/AnnounceDialog;", "entity", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "bonusAndCoinsDialog", "coins", "bonus", "expiredDay", "bonusDialog", "Landroid/app/Activity;", "bubbleWindowDialog", "mView", "Landroid/view/View;", "content", "", "bubbleWindowFlashDialog", "coinsDialog", "loginToGetDialog", "Lcom/example/lib_common/dialog/LoginGetBonusDialog;", "isLogin", "monthNewDialog", "Lcom/example/lib_common/dialog/MonthNewSubDialog;", "data", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "Lkotlin/Function2;", "payFailFeedBackDialog", "Lcom/example/lib_http/bean/data/PayFailFeedbackData;", "Lcom/example/lib_http/bean/data/PayFailFeedbackData$Option;", "speciesDialog", "toMyListDialog", "weekNewDialog", "Lcom/example/lib_common/dialog/WeekNewSubDialog;", "lib_common_release"})
public final class CommonDialogKt {
    
    /**
     * 金币弹窗
     */
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public static final void speciesDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$speciesDialog, int coins, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * 广告弹窗
     */
    public static final void advertisementDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$advertisementDialog, int viewed, int total, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * 气泡弹窗
     */
    public static final void bubbleWindowDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$bubbleWindowDialog, @org.jetbrains.annotations.NotNull()
    android.view.View mView, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    /**
     * 气泡弹窗
     */
    public static final void bubbleWindowFlashDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$bubbleWindowFlashDialog, @org.jetbrains.annotations.NotNull()
    android.view.View mView, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    /**
     * 预告弹窗
     */
    @org.jetbrains.annotations.Nullable()
    public static final com.example.lib_common.dialog.AnnounceDialog announceInAdvance(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$announceInAdvance, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData.Column.DramaSeries entity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> block) {
        return null;
    }
    
    /**
     * Bonus弹窗
     */
    public static final void bonusDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$bonusDialog, int coins) {
    }
    
    /**
     * Bonus And Coins 弹窗
     */
    public static final void bonusAndCoinsDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$bonusAndCoinsDialog, int coins, int bonus, int expiredDay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * Bonus And Coins 弹窗
     */
    public static final void coinsDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$coinsDialog, int coins, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    public static final void payFailFeedBackDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$payFailFeedBackDialog, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PayFailFeedbackData data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.PayFailFeedbackData.Option, kotlin.Unit> block) {
    }
    
    /**
     * to My list弹窗
     */
    public static final void toMyListDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toMyListDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * Login to get弹窗
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.dialog.LoginGetBonusDialog loginToGetDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$loginToGetDialog, int coins, boolean isLogin, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.dialog.MonthNewSubDialog monthNewDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$monthNewDialog, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.dialog.WeekNewSubDialog weekNewDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$weekNewDialog, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> block) {
        return null;
    }
}