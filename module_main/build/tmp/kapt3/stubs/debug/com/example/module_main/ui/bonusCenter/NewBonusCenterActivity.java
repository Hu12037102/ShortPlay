package com.example.module_main.ui.bonusCenter;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/home/NewBonusCenterActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u001a\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0006H\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0002J\u0012\u0010*\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0017J\u0012\u0010+\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0014J\b\u0010.\u001a\u00020\u001eH\u0014J\u0016\u0010/\u001a\u00020\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u0018\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020\u001eH\u0002J\b\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0002J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u000208H\u0002J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0003J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020AH\u0002J\u0016\u0010B\u001a\u00020\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\u0015H\u0002J\b\u0010E\u001a\u00020\u001eH\u0016J\u0012\u0010F\u001a\u00020\u001e2\b\u0010G\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010H\u001a\u00020\u001eH\u0002J\b\u0010I\u001a\u00020\u001eH\u0002J\u0010\u0010J\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u0015H\u0002J\u0010\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\u0006H\u0002J\b\u0010N\u001a\u00020\u001eH\u0016J\b\u0010O\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00150\u00150\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"}, d2 = {"Lcom/example/module_main/ui/bonusCenter/NewBonusCenterActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/bonusCenter/BonusCenterViewModel;", "Lcom/example/module_main/databinding/MainActivityNewBonusCenterBinding;", "()V", "curPos", "", "data", "Lcom/example/lib_http/bean/data/ActivityDetailsData;", "datas", "", "Lcom/example/lib_common/bean/BonusSignBean;", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "mAdapter", "Lcom/example/module_main/adapter/BonusSignAdapter;", "mOpenNotificationActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "mRequestNotificationPermissionResult", "", "missTime", "", "onCallBack", "Lcom/example/lib_common/manger/AdCounDownTimer$onAdSecondCallBack;", "totalTime", "watchAdAdapter", "Lcom/example/module_main/adapter/WatchAdAdapter;", "checkNotificationPermission", "", "createObserver", "dataConversion", "dailyCheckin", "Lcom/example/lib_http/bean/data/ActivityDetailsData$DailyCheckin;", "type", "dismissLoading", "dismissLoadingDialog", "initView", "savedInstanceState", "Landroid/os/Bundle;", "initViewShape", "listener", "loadData", "loginGetTo", "onDestroy", "onResume", "reLoadWatchAdData", "watchList", "", "Lcom/example/lib_http/bean/data/ActivityDetailsData$AdsMonetization$WatchAd;", "renewBalance", "balance", "bonusCoins", "requestAdsMonetization", "setBonusBg", "Landroid/graphics/drawable/GradientDrawable;", "setBonusSign", "checkinDays", "setCheckInBtnBgNoSelect", "setCheckInBtnBgSelected", "setInviteFriendData", "rewardCoins", "setSignBtnBg", "checkedIn", "", "setWatchAdData", "showDescDialog", "text", "showLoading", "showLoadingDialog", "string", "showNetworkEmpty", "showRequestNotificationPermissionDialog", "startGame", "customData", "successDialog", "coins", "tryAgainClick", "updateWallet", "module_main_debug"})
public final class NewBonusCenterActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.bonusCenter.BonusCenterViewModel, com.example.module_main.databinding.MainActivityNewBonusCenterBinding> {
    private com.example.module_main.adapter.BonusSignAdapter mAdapter;
    private com.example.lib_http.bean.data.ActivityDetailsData data;
    private final java.util.List<com.example.lib_common.bean.BonusSignBean> datas = null;
    private com.example.module_main.adapter.WatchAdAdapter watchAdAdapter;
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    private long missTime = 500L;
    private long totalTime = 10000L;
    private int curPos = -1;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> mRequestNotificationPermissionResult = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> mOpenNotificationActivityResult = null;
    
    /**
     * 倒计时回调
     */
    private final com.example.lib_common.manger.AdCounDownTimer.onAdSecondCallBack onCallBack = null;
    
    public NewBonusCenterActivity() {
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
    
    private final void showNetworkEmpty() {
    }
    
    private final void loginGetTo() {
    }
    
    private final void showRequestNotificationPermissionDialog() {
    }
    
    private final void checkNotificationPermission() {
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
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    /**
     * 刚开始的状态
     */
    private final void setWatchAdData(java.util.List<com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization.WatchAd> watchList) {
    }
    
    private final void reLoadWatchAdData(java.util.List<com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization.WatchAd> watchList) {
    }
    
    private final void initViewShape() {
    }
    
    private final android.graphics.drawable.GradientDrawable setCheckInBtnBgNoSelect() {
        return null;
    }
    
    private final android.graphics.drawable.GradientDrawable setCheckInBtnBgSelected() {
        return null;
    }
    
    private final android.graphics.drawable.GradientDrawable setBonusBg() {
        return null;
    }
    
    private final void setSignBtnBg(boolean checkedIn) {
    }
    
    private final void renewBalance(int balance, int bonusCoins) {
    }
    
    private final void successDialog(int coins) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setInviteFriendData(int rewardCoins) {
    }
    
    private final void setBonusSign(int checkinDays) {
    }
    
    private final void dataConversion(com.example.lib_http.bean.data.ActivityDetailsData.DailyCheckin dailyCheckin, int type) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void requestAdsMonetization() {
    }
    
    /**
     * 开启广告
     */
    private final void startGame(java.lang.String customData) {
    }
    
    private final void showDescDialog(java.lang.String text) {
    }
    
    private final void showLoadingDialog(java.lang.String string) {
    }
    
    private final void dismissLoadingDialog() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void updateWallet() {
    }
}