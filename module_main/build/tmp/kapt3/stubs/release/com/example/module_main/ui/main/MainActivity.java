package com.example.module_main.ui.main;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/main/MainActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001^B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000203H\u0016J\u0010\u00107\u001a\u0002032\u0006\u00108\u001a\u00020\u001dH\u0002J\b\u00109\u001a\u00020\u001dH\u0002J\u0012\u0010:\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000203H\u0002J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u000203H\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0002J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u000203H\u0002J\u0012\u0010F\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010G\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010H\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010I\u001a\u000203H\u0002J\b\u0010J\u001a\u000203H\u0002J\u0010\u0010)\u001a\u0002032\u0006\u0010K\u001a\u00020\u001dH\u0002J\b\u0010L\u001a\u000203H\u0014J\u0010\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020OH\u0016J\u0012\u0010P\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010@H\u0014J\b\u0010Q\u001a\u000203H\u0014J\b\u0010R\u001a\u000203H\u0014J\u0010\u0010S\u001a\u0002032\u0006\u0010T\u001a\u000205H\u0016J\b\u0010U\u001a\u000203H\u0002J\b\u0010V\u001a\u000203H\u0002J\u0012\u0010W\u001a\u0002032\b\u0010X\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010Y\u001a\u0002032\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u000203H\u0002J\b\u0010]\u001a\u000203H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u001d0\u001d0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010.X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"}, d2 = {"Lcom/example/module_main/ui/main/MainActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/viewmodel/MainViewModel;", "Lcom/example/module_main/databinding/MainActivityMainBinding;", "Lcom/example/module_main/views/BnvVp2Mediator$OnSelectorPagerCallback;", "()V", "appUpDataDialog", "Lcom/example/module_main/dialog/AppUpDataDialog;", "bnvVp2Mediator", "Lcom/example/module_main/views/BnvVp2Mediator;", "exitTime", "", "getExitTime", "()J", "setExitTime", "(J)V", "isPause", "", "loginGetBonusDialog", "Lcom/example/lib_common/dialog/LoginGetBonusDialog;", "loginGetBonusDialog2", "mContinueWatching", "Lcom/example/lib_http/bean/data/UserInfoData$ContinueWatching;", "mFirstRecommendObserver", "Landroidx/lifecycle/Observer;", "Lcom/example/lib_http/bean/data/RecommendEpisodeData;", "mHandler", "Landroid/os/Handler;", "mLastUserId", "", "mMessageTime", "mOnRecommendCountdownCallback", "Lcom/example/lib_common/manger/RecommendEpisodeManger$OnCountdownCallback;", "mRecommendEpisodeDialog", "Lcom/example/lib_common/dialog/RecommendEpisodeDialog;", "mRecommendObserver", "mRequestNotificationPermissionResult", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "mainPageAdapter", "Lcom/example/module_main/adapter/MainPageAdapter;", "notServiceDialog", "Lcom/example/module_main/dialog/NotServiceDialog;", "openInstallShare", "Lcom/example/lib_common/openinstall/OpenInstallShare;", "tabImageViewList", "", "Landroid/widget/ImageView;", "tabTextViewList", "Landroid/widget/TextView;", "changeHomeBottomView", "", "it", "", "createObserver", "downAPk", "dirPath", "getFCMTokenKey", "init", "savedInstanceState", "Landroid/os/Bundle;", "initFCMPush", "initFCMPushIntent", "intent", "Landroid/content/Intent;", "initFirstRecommendDrama", "initFormLogin", "initOpenInstall", "initRequestNotificationPermission", "initUserAgreementDialog", "initView", "listener", "loadData", "loadPayFailFeedbackData", "loginToGet", "content", "onDestroy", "onNetworkStateChanged", "netState", "Lcom/example/lib_base/network/NetState;", "onNewIntent", "onPause", "onResume", "onSelectorPager", "index", "removeMessage", "sendRecommendMessage", "showLinkPlayDialog", "data", "showRecommendEpisodeDialog", "details", "Lcom/example/lib_http/bean/data/RecommendEpisodeData$Details;", "startWebActivity", "userAgreementLogin", "Companion", "module_main_release"})
public final class MainActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.viewmodel.MainViewModel, com.example.module_main.databinding.MainActivityMainBinding> implements com.example.module_main.views.BnvVp2Mediator.OnSelectorPagerCallback {
    private java.lang.String mLastUserId = "";
    private com.example.module_main.adapter.MainPageAdapter mainPageAdapter;
    private com.example.module_main.views.BnvVp2Mediator bnvVp2Mediator;
    private java.util.List<? extends android.widget.ImageView> tabImageViewList;
    private java.util.List<? extends android.widget.TextView> tabTextViewList;
    private com.example.module_main.dialog.AppUpDataDialog appUpDataDialog;
    private com.example.lib_common.dialog.LoginGetBonusDialog loginGetBonusDialog;
    private com.example.lib_common.dialog.LoginGetBonusDialog loginGetBonusDialog2;
    private boolean isPause = false;
    private com.example.lib_http.bean.data.UserInfoData.ContinueWatching mContinueWatching;
    private long mMessageTime = 0L;
    private com.example.lib_common.dialog.RecommendEpisodeDialog mRecommendEpisodeDialog;
    private com.example.lib_common.openinstall.OpenInstallShare openInstallShare;
    private final android.os.Handler mHandler = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.ui.main.MainActivity.Companion Companion = null;
    public static final int WHAT_RECOMMEND = 166;
    public static final int WHAT_NEW = 168;
    public static final int PAGE_HOME = 0;
    public static final int PAGE_MYLIST = 1;
    public static final int PAGE_ME = 2;
    private long exitTime = 0L;
    private final androidx.lifecycle.Observer<com.example.lib_http.bean.data.RecommendEpisodeData> mFirstRecommendObserver = null;
    private final com.example.lib_common.manger.RecommendEpisodeManger.OnCountdownCallback mOnRecommendCountdownCallback = null;
    private final androidx.lifecycle.Observer<com.example.lib_http.bean.data.RecommendEpisodeData> mRecommendObserver = null;
    private com.example.module_main.dialog.NotServiceDialog notServiceDialog;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> mRequestNotificationPermissionResult = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initFormLogin() {
    }
    
    private final void initOpenInstall() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public final long getExitTime() {
        return 0L;
    }
    
    public final void setExitTime(long p0) {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void changeHomeBottomView(int it) {
    }
    
    @java.lang.Override()
    public void onNetworkStateChanged(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.network.NetState netState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void notServiceDialog(java.lang.String content) {
    }
    
    private final void startWebActivity() {
    }
    
    /**
     * apk下载
     */
    private final void downAPk(java.lang.String dirPath) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void loadPayFailFeedbackData() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void userAgreementLogin() {
    }
    
    private final void loginToGet() {
    }
    
    private final void showRecommendEpisodeDialog(com.example.lib_http.bean.data.RecommendEpisodeData.Details details) {
    }
    
    @java.lang.Override()
    public void onSelectorPager(int index) {
    }
    
    private final void sendRecommendMessage() {
    }
    
    private final void removeMessage() {
    }
    
    private final void initFirstRecommendDrama() {
    }
    
    private final void initUserAgreementDialog() {
    }
    
    private final void showLinkPlayDialog(com.example.lib_http.bean.data.UserInfoData.ContinueWatching data) {
    }
    
    private final void initFCMPush() {
    }
    
    private final void initFCMPushIntent(android.content.Intent intent) {
    }
    
    private final java.lang.String getFCMTokenKey() {
        return null;
    }
    
    private final void initRequestNotificationPermission() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/module_main/ui/main/MainActivity$Companion;", "", "()V", "PAGE_HOME", "", "PAGE_ME", "PAGE_MYLIST", "WHAT_NEW", "WHAT_RECOMMEND", "module_main_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}