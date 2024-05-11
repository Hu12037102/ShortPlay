package com.example.module_main.ui.splash;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/8
 */
@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010 \u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\u0012\u0010#\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010$\u001a\u00020\u0012H\u0014J\u0012\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u00020\u0012H\u0002J\b\u00100\u001a\u00020\u0012H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/module_main/ui/splash/SplashActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/viewmodel/SplashViewModel;", "Lcom/example/module_main/databinding/MainActivitySplashBinding;", "()V", "dialog", "Lcom/example/lib_common/dialog/ToastDiaLog;", "isFirst", "", "job", "Lkotlinx/coroutines/Job;", "mFCMPushData", "Lcom/example/lib_http/bean/data/FCMPushData;", "openInstallWakeUp", "Lcom/example/lib_common/openinstall/OpenInstallShare;", "userAgreementDialog", "Lcom/example/module_main/dialog/UserAgreementDialog;", "agreementShow", "", "createObserver", "dismissDialog", "dismissLoading", "failPermissions", "getUriToken", "uri", "Landroid/net/Uri;", "initFacebook", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isShowBar", "listener", "loadData", "loginActivity", "mainActivity", "onCreate", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "passPermissions", "requestLogin", "showDialog", "showLoading", "showNetworkEmpty", "startMain", "startWebActivity", "testDialog", "tryAgainClick", "module_main_debug"})
public final class SplashActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.viewmodel.SplashViewModel, com.example.module_main.databinding.MainActivitySplashBinding> {
    private com.example.module_main.dialog.UserAgreementDialog userAgreementDialog;
    private boolean isFirst = false;
    private com.example.lib_common.openinstall.OpenInstallShare openInstallWakeUp;
    private com.example.lib_http.bean.data.FCMPushData mFCMPushData;
    private kotlinx.coroutines.Job job;
    private com.example.lib_common.dialog.ToastDiaLog dialog;
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void initFacebook() {
    }
    
    private final void getUriToken(android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startWebActivity() {
    }
    
    @java.lang.Override()
    public void createObserver() {
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
    
    @java.lang.Override()
    public boolean isShowBar() {
        return false;
    }
    
    /**
     * 权限申请成功
     */
    @java.lang.Override()
    public void passPermissions() {
    }
    
    private final void testDialog() {
    }
    
    /**
     * 登录
     */
    private final void requestLogin() {
    }
    
    private final void mainActivity() {
    }
    
    private final void loginActivity() {
    }
    
    /**
     * 协议弹窗
     */
    private final void agreementShow() {
    }
    
    private final void showDialog() {
    }
    
    private final void dismissDialog() {
    }
    
    /**
     * 权限失败
     */
    @java.lang.Override()
    public void failPermissions() {
    }
    
    private final void startMain() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}