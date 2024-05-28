package com.example.lib_common.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J \u0010!\u001a\u00020\u00162\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\"\u001a\u00020\u0016H\u0003R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/lib_common/dialog/MonthNewSubDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "data", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "(Landroid/content/Context;Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;)V", "adapter", "Lcom/example/lib_common/dialog/MonthNewSubDialog$WeeklySubAdapter;", "bonus", "", "claimDateTv", "Landroid/widget/TextView;", "claimedCoinsTv", "index", "indexDay", "isClaimed", "", "isClaimedIv", "Landroid/widget/ImageView;", "onClickClaim", "Lkotlin/Function2;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "totalAwardsTv", "totalBonusTv", "totalCoinsTv", "claimedAward", "dismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setOnClickClaim", "setView", "WeeklySubAdapter", "lib_common_debug"})
public final class MonthNewSubDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data;
    private kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> onClickClaim;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView totalCoinsTv;
    private android.widget.TextView totalBonusTv;
    private android.widget.TextView claimedCoinsTv;
    private android.widget.TextView claimDateTv;
    private android.widget.TextView totalAwardsTv;
    private android.widget.ImageView isClaimedIv;
    private com.example.lib_common.dialog.MonthNewSubDialog.WeeklySubAdapter adapter;
    private boolean isClaimed = false;
    private int bonus = 0;
    private int index = 0;
    private int indexDay = 0;
    
    public MonthNewSubDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId", "SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setView() {
    }
    
    /**
     * 领取后
     */
    private final void claimedAward(int bonus) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    public final void setOnClickClaim(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> onClickClaim) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/lib_common/dialog/MonthNewSubDialog$WeeklySubAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData$ClaimBonusList;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "(Lcom/example/lib_common/dialog/MonthNewSubDialog;)V", "giftAnima", "Landroid/graphics/drawable/AnimationDrawable;", "handIv", "Landroid/widget/ImageView;", "checkingIn", "", "holder", "convert", "item", "handAnimation", "notCheckedIn", "stop", "successfulCheckIn", "lib_common_debug"})
    public final class WeeklySubAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData.ClaimBonusList, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
        private android.graphics.drawable.AnimationDrawable giftAnima;
        private android.widget.ImageView handIv;
        
        public WeeklySubAdapter() {
            super(0, null);
        }
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
        com.example.lib_http.bean.data.CoinsSubscriptionDetailsData.ClaimBonusList item) {
        }
        
        private final void successfulCheckIn(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        }
        
        private final void checkingIn(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        }
        
        private final void notCheckedIn(com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        }
        
        @android.annotation.SuppressLint(value = {"Recycle"})
        public final void handAnimation() {
        }
        
        public final void stop() {
        }
    }
}