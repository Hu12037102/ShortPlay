package com.example.module_main.ui.bonusCenter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/8
 */
@kotlin.Suppress(names = {"DEPRECATION", "CAST_NEVER_SUCCEEDS"})
@com.alibaba.android.arouter.facade.annotation.Route(path = "/home/BonusCenterActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0003J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\fH\u0002J\u0012\u0010\'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\fH\u0002J\u0018\u0010,\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\f2\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u0010/\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u00100\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00101\u001a\u00020\u001cH\u0014J\b\u00102\u001a\u00020\u001cH\u0002J\u0018\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020#H\u0002J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010>\u001a\u00020\u001cH\u0002J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\u001cH\u0016J\u0012\u0010C\u001a\u00020\u001c2\b\u0010D\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010E\u001a\u00020\u001cH\u0002J\u0010\u0010F\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0010\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020#H\u0002J\b\u0010J\u001a\u00020\u001cH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/example/module_main/ui/bonusCenter/BonusCenterActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/bonusCenter/BonusCenterViewModel;", "Lcom/example/module_main/databinding/MainActivityBonusCenterBinding;", "()V", "adapter", "Lcom/example/module_main/adapter/FriendListAdapter;", "closeIv", "Landroid/widget/ImageView;", "data", "Lcom/example/lib_http/bean/data/ActivityDetailsData;", "isWatchState", "", "job", "Lkotlinx/coroutines/Job;", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "mView", "Landroid/view/View;", "missTime", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "steps", "", "", "totalTime", "bubbleWindow", "", "content", "createObserver", "dismissLoading", "dismissLoadingDialog", "getDays", "day", "", "size", "hideAdsMonetization", "isMaxResidueNumber", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isSignIn", "isSign", "isState", "textView", "Lcom/ruffian/library/widget/RTextView;", "listener", "loadData", "onDestroy", "recordsView", "renewBalance", "balance", "bonusCoins", "requestAdsMonetization", "setAdsMonetization", "adsMonetization", "Lcom/example/lib_http/bean/data/ActivityDetailsData$AdsMonetization;", "setAvaiable", "viewed", "total", "setDay", "setFiendsListView", "setFriendsView", "friends", "Lcom/example/lib_http/bean/data/ActivityDetailsData$InviteFriend;", "showLoading", "showLoadingDialog", "string", "showNetworkEmpty", "startGame", "customData", "successDialog", "coins", "tryAgainClick", "module_main_debug"})
public final class BonusCenterActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.bonusCenter.BonusCenterViewModel, com.example.module_main.databinding.MainActivityBonusCenterBinding> {
    private java.util.List<java.lang.String> steps;
    private com.example.lib_http.bean.data.ActivityDetailsData data;
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    private android.widget.ImageView closeIv;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.module_main.adapter.FriendListAdapter adapter;
    private android.view.View mView;
    private kotlinx.coroutines.Job job;
    private long missTime = 500L;
    private long totalTime = 10000L;
    private boolean isWatchState = false;
    
    public BonusCenterActivity() {
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
    
    private final void requestAdsMonetization() {
    }
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    /**
     * records
     */
    private final void recordsView() {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void showLoadingDialog(java.lang.String string) {
    }
    
    private final void dismissLoadingDialog() {
    }
    
    /**
     * 设置邀请
     */
    private final void setFriendsView(com.example.lib_http.bean.data.ActivityDetailsData.InviteFriend friends) {
    }
    
    /**
     * 设置广告
     */
    private final void setAdsMonetization(com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization adsMonetization) {
    }
    
    /**
     * 用户广告观看完毕，隐藏
     */
    private final void hideAdsMonetization(boolean isMaxResidueNumber) {
    }
    
    private final void setAvaiable(int viewed, int total) {
    }
    
    private final void setFiendsListView() {
    }
    
    private final void setDay(int day) {
    }
    
    private final void isSignIn(boolean isSign) {
    }
    
    private final void isState(boolean isSign, com.ruffian.library.widget.RTextView textView) {
    }
    
    /**
     * 开启广告
     */
    private final void startGame(java.lang.String customData) {
    }
    
    private final void renewBalance(int balance, int bonusCoins) {
    }
    
    private final java.util.List<java.lang.String> getDays(int day, int size) {
        return null;
    }
    
    private final void successDialog(int coins) {
    }
    
    /**
     * 气泡弹窗
     */
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    private final void bubbleWindow(android.view.View mView, java.lang.String content) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}