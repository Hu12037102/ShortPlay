package com.example.module_main.ui.invite;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/me/InviteFriendActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/module_main/ui/invite/InviteFriendActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/bonusCenter/BonusCenterViewModel;", "Lcom/example/module_main/databinding/MainActivityInviteFriendBinding;", "()V", "data", "Lcom/example/lib_http/bean/data/ActivityDetailsData;", "mAdapter", "Lcom/example/module_main/adapter/InviteFriendAdapter;", "convertRewardConins", "", "rewardCoins", "", "createObserver", "dismissLoading", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "loadFriendList", "inviteFriendList", "", "Lcom/example/lib_http/bean/data/ActivityDetailsData$InviteFriend$FriendList;", "setClBackground", "Landroid/graphics/drawable/GradientDrawable;", "setInviteDataBg", "setInviteDataInsideBg", "setViewShapeBackground", "showLoading", "showNetworkEmpty", "showRuleDialog", "tryAgainClick", "module_main_debug"})
public final class InviteFriendActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.bonusCenter.BonusCenterViewModel, com.example.module_main.databinding.MainActivityInviteFriendBinding> {
    private com.example.module_main.adapter.InviteFriendAdapter mAdapter;
    private com.example.lib_http.bean.data.ActivityDetailsData data;
    
    public InviteFriendActivity() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    private final void showRuleDialog() {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void convertRewardConins(int rewardCoins) {
    }
    
    private final void loadFriendList(java.util.List<com.example.lib_http.bean.data.ActivityDetailsData.InviteFriend.FriendList> inviteFriendList) {
    }
    
    private final void setViewShapeBackground() {
    }
    
    private final android.graphics.drawable.GradientDrawable setInviteDataInsideBg() {
        return null;
    }
    
    private final android.graphics.drawable.GradientDrawable setInviteDataBg() {
        return null;
    }
    
    private final android.graphics.drawable.GradientDrawable setClBackground() {
        return null;
    }
}