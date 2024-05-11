package com.example.module_main.fragment.home;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/16
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/home/MainFragment")
@kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\b\u0010C\u001a\u00020AH\u0017J\b\u0010D\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020AH\u0002J\u0010\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020AH\u0002J\b\u0010J\u001a\u00020AH\u0002J\b\u0010K\u001a\u00020#H\u0002J\u0012\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020\u0014H\u0002J\b\u0010O\u001a\u00020AH\u0003J\b\u0010P\u001a\u00020AH\u0002J\b\u0010Q\u001a\u00020AH\u0016J\u0012\u0010R\u001a\u00020A2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u00020AH\u0002J\b\u0010V\u001a\u00020AH\u0016J\u0012\u0010W\u001a\u00020A2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0010\u00105\u001a\u00020A2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020AH\u0002J\u0010\u0010[\u001a\u00020A2\u0006\u0010X\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020AH\u0016J\b\u0010^\u001a\u00020AH\u0016J\b\u0010_\u001a\u00020AH\u0016J\b\u0010`\u001a\u00020AH\u0002J\u0010\u0010a\u001a\u00020A2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010b\u001a\u00020AH\u0002J\b\u0010c\u001a\u00020AH\u0002J\b\u0010d\u001a\u00020AH\u0016J\u0012\u0010e\u001a\u00020A2\b\u0010f\u001a\u0004\u0018\u00010,H\u0002J\b\u0010g\u001a\u00020AH\u0002J\b\u0010h\u001a\u00020AH\u0002J\b\u0010i\u001a\u00020AH\u0002J\u0012\u0010j\u001a\u00020A2\b\b\u0002\u0010k\u001a\u00020\u0014H\u0002J\b\u0010l\u001a\u00020AH\u0002J \u0010m\u001a\u00020A2\u0006\u0010n\u001a\u0002092\u0006\u0010o\u001a\u0002092\u0006\u0010p\u001a\u000209H\u0002J\b\u0010q\u001a\u00020AH\u0016J\u0012\u0010r\u001a\u00020A2\b\b\u0002\u0010N\u001a\u00020\u0014H\u0002J\b\u0010s\u001a\u00020AH\u0002J\b\u0010t\u001a\u00020AH\u0002J\u0010\u0010u\u001a\u00020A2\u0006\u0010X\u001a\u00020YH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\"\u001a\n $*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u000b\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010*0*0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010,0,0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010*0*0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b2\u00103R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006v"}, d2 = {"Lcom/example/module_main/fragment/home/HomeFragment;", "Lcom/example/lib_base/fragment/BaseFragment;", "Lcom/example/module_main/fragment/home/HomeViewModel;", "Lcom/example/module_main/databinding/MainFragmentHomeBinding;", "Lcom/example/module_main/listen/ClickToPlayListener;", "()V", "countDownTimer", "Lcom/example/lib_common/util/CountDownTimerUtils;", "getCountDownTimer", "()Lcom/example/lib_common/util/CountDownTimerUtils;", "countDownTimer$delegate", "Lkotlin/Lazy;", "dialog", "Lcom/example/lib_common/dialog/FlashPurchaseNewDialog;", "heideAnimator", "Landroid/animation/ObjectAnimator;", "heideWatchingAnimator", "homeAdapter", "Lcom/example/module_main/adapter/HomeAdapter;", "isChange", "", "isFirst", "isPause", "isResumeLoadIndex", "isShowFlash", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "mAnnounceDialog", "Lcom/example/lib_common/dialog/AnnounceDialog;", "mBannerAdapter", "Lcom/example/module_main/adapter/BannerAdapter;", "mBannerViewPager", "Lcom/zhpan/bannerview/BannerViewPager;", "Lcom/example/lib_http/bean/data/HomeData$Banner;", "mFootView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getMFootView", "()Landroid/view/View;", "mFootView$delegate", "mOpenNotificationActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "mRequestNotificationPermissionResult", "", "mSearchForActivityResult", "mSubscriberEntity", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "mUpdate", "Lcom/example/module_main/update/UpdateGradation;", "getMUpdate", "()Lcom/example/module_main/update/UpdateGradation;", "mUpdate$delegate", "monthDialog", "Lcom/example/lib_common/dialog/MonthNewSubDialog;", "objectAnimator", "recordScrollCount", "", "screenHeight", "showAnimator", "showWatchingAnimator", "totalCount", "weekDiaLog", "Lcom/example/lib_common/dialog/WeekNewSubDialog;", "checkNotificationPermission", "", "collectingUser", "createObserver", "dismissLoading", "dismissLoadingDialog", "flashDialog", "mData", "Lcom/example/lib_http/bean/data/FlashSaleData;", "flashHeideAnimation", "flashShowAnimation", "getHeadView", "getSearchBackground", "Landroid/graphics/drawable/Drawable;", "isNormal", "handAnimation", "heideAnimation", "initData", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isNetworkAndTrySub", "lazyLoadData", "listener", "data", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "newPlayReminder", "onClick", "Lcom/example/lib_http/bean/data/PlayRequestData;", "onDestroy", "onPause", "onResume", "resetLoadMore", "setFlashData", "setupBlurView", "showAnimation", "showLoading", "showLoadingDialog", "string", "showNetworkEmpty", "showRequestNotificationPermissionDialog", "showRetry", "startToSearchActivity", "isAutoSearch", "subReward", "successDialog", "coins", "bonus", "expiredDay", "tryAgainClick", "updateSearchView", "watchingHeideAnimation", "watchingShowAnimation", "weekDialog", "module_main_debug"})
public final class HomeFragment extends com.example.lib_base.fragment.BaseFragment<com.example.module_main.fragment.home.HomeViewModel, com.example.module_main.databinding.MainFragmentHomeBinding> implements com.example.module_main.listen.ClickToPlayListener {
    private final kotlin.Lazy countDownTimer$delegate = null;
    private final kotlin.Lazy mUpdate$delegate = null;
    private com.example.module_main.adapter.BannerAdapter mBannerAdapter;
    private com.example.module_main.adapter.HomeAdapter homeAdapter;
    private com.zhpan.bannerview.BannerViewPager<com.example.lib_http.bean.data.HomeData.Banner> mBannerViewPager;
    private android.animation.ObjectAnimator objectAnimator;
    private android.animation.ObjectAnimator heideAnimator;
    private android.animation.ObjectAnimator showAnimator;
    private android.animation.ObjectAnimator heideWatchingAnimator;
    private android.animation.ObjectAnimator showWatchingAnimator;
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    private boolean isShowFlash = true;
    private boolean isFirst = true;
    private boolean isPause = false;
    private int screenHeight = -1;
    private int totalCount = 0;
    private int recordScrollCount = 0;
    private boolean isChange = false;
    private com.example.lib_common.dialog.MonthNewSubDialog monthDialog;
    private com.example.lib_common.dialog.WeekNewSubDialog weekDiaLog;
    private final kotlin.Lazy mFootView$delegate = null;
    private com.example.lib_http.bean.data.HomeData.Column.DramaSeries mSubscriberEntity;
    private com.example.lib_common.dialog.AnnounceDialog mAnnounceDialog;
    private boolean isResumeLoadIndex = true;
    
    /**
     * 闪购弹窗
     */
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private com.example.lib_common.dialog.FlashPurchaseNewDialog dialog;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> mSearchForActivityResult = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> mRequestNotificationPermissionResult = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> mOpenNotificationActivityResult = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.lib_common.util.CountDownTimerUtils getCountDownTimer() {
        return null;
    }
    
    private final com.example.module_main.update.UpdateGradation getMUpdate() {
        return null;
    }
    
    private final android.view.View getMFootView() {
        return null;
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void heideAnimation() {
    }
    
    private final void showAnimation() {
    }
    
    @java.lang.Override()
    public void lazyLoadData() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    @java.lang.Override()
    public void createObserver() {
    }
    
    /**
     * 设置闪购数据
     */
    private final void setFlashData(com.example.lib_http.bean.data.FlashSaleData mData) {
    }
    
    private final void isNetworkAndTrySub() {
    }
    
    private final void collectingUser() {
    }
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
    
    private final void showRetry() {
    }
    
    /**
     * 金币弹出
     */
    private final void successDialog(int coins, int bonus, int expiredDay) {
    }
    
    /**
     * week订阅成功后弹窗
     */
    private final void weekDialog(com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
    }
    
    /**
     * month订阅成功后弹窗
     */
    private final void monthDialog(com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
    }
    
    /**
     * 查询订阅是否需要二次弹窗
     */
    private final void subReward() {
    }
    
    private final void flashDialog(com.example.lib_http.bean.data.FlashSaleData mData) {
    }
    
    /**
     * 头部/banner
     */
    private final android.view.View getHeadView() {
        return null;
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    private final void showLoadingDialog(java.lang.String string) {
    }
    
    private final void dismissLoadingDialog() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void handAnimation() {
    }
    
    private final void flashHeideAnimation() {
    }
    
    private final void flashShowAnimation() {
    }
    
    private final void watchingHeideAnimation() {
    }
    
    private final void watchingShowAnimation() {
    }
    
    /**
     * 进入子剧集
     * dramaSeriesId ： 剧集ID
     * episode_number : 当前集数
     * episode_charge_start：解锁集数
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayRequestData data) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final android.graphics.drawable.Drawable getSearchBackground(boolean isNormal) {
        return null;
    }
    
    private final void startToSearchActivity(boolean isAutoSearch) {
    }
    
    private final void setupBlurView() {
    }
    
    private final void resetLoadMore() {
    }
    
    private final void updateSearchView(boolean isNormal) {
    }
    
    private final void newPlayReminder() {
    }
    
    private final void showRequestNotificationPermissionDialog() {
    }
    
    private final void checkNotificationPermission() {
    }
}