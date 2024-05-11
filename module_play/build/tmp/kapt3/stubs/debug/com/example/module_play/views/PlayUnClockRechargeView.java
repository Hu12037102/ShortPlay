package com.example.module_play.views;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/22
 *  充值
 */
@kotlin.Suppress(names = {"DEPRECATION", "CAST_NEVER_SUCCEEDS"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010&\u001a\u00020\u0013H\u0007J\u0006\u0010\'\u001a\u00020\u0013J\u0014\u0010(\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010)\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u001a\u0010*\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0015J\u0014\u0010+\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0003J\u0018\u0010/\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0003J\u0018\u00100\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0003J\u0018\u00101\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0003J \u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0007J\b\u00106\u001a\u00020\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/example/module_play/views/PlayUnClockRechargeView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "black_rl", "Lcom/ruffian/library/widget/RRelativeLayout;", "black_tv", "Landroid/widget/TextView;", "check_isBox", "Landroid/widget/ImageView;", "clickBlack", "Lkotlin/Function0;", "", "clickLock", "Lkotlin/Function1;", "", "clickRed", "close", "giftAnima", "Landroid/graphics/drawable/AnimationDrawable;", "handIv", "mTvBonusContent", "mView", "Landroid/view/View;", "paramsRl", "recharge_balance_coins", "recharge_costs_num", "red_rl", "red_tv", "rl_check", "rl_unlock", "handAnimation", "listent", "onClickBlack", "onClickClose", "onClickLock", "onClickRed", "setBlackView", "id", "text", "setHeideBlackView", "setHeideRedView", "setRedView", "setView", "type", "balance", "episodeCoins", "stop", "module_play_debug"})
public final class PlayUnClockRechargeView extends android.widget.RelativeLayout {
    private android.view.View mView;
    private android.widget.TextView recharge_costs_num;
    private android.widget.TextView recharge_balance_coins;
    private android.widget.ImageView check_isBox;
    private android.widget.TextView red_tv;
    private android.widget.TextView black_tv;
    private com.ruffian.library.widget.RRelativeLayout red_rl;
    private com.ruffian.library.widget.RRelativeLayout black_rl;
    private android.widget.RelativeLayout rl_check;
    private android.widget.RelativeLayout rl_unlock;
    private android.widget.ImageView handIv;
    private android.widget.TextView mTvBonusContent;
    private android.widget.RelativeLayout paramsRl;
    private kotlin.jvm.functions.Function0<kotlin.Unit> clickRed;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> clickLock;
    private kotlin.jvm.functions.Function0<kotlin.Unit> clickBlack;
    private kotlin.jvm.functions.Function0<kotlin.Unit> close;
    private android.graphics.drawable.AnimationDrawable giftAnima;
    
    public PlayUnClockRechargeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PlayUnClockRechargeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams", "MissingInflatedId"})
    public PlayUnClockRechargeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyleAttr) {
        super(null);
    }
    
    public final void listent() {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    public final void setView(int type, int balance, int episodeCoins) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void setRedView(int id, int text) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void setBlackView(int id, int text) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void setHeideBlackView(int id, int text) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void setHeideRedView(int id, int text) {
    }
    
    public final void onClickRed(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> clickRed) {
    }
    
    public final void onClickLock(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> clickLock) {
    }
    
    public final void onClickBlack(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> clickBlack) {
    }
    
    public final void onClickClose(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> close) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    public final void handAnimation() {
    }
    
    private final void stop() {
    }
}