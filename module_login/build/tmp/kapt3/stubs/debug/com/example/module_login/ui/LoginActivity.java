package com.example.module_login.ui;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/login/LoginActivity")
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0016\u0010 \u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010(\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0016H\u0002J\"\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0015J\b\u00100\u001a\u00020\u0016H\u0014J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/example/module_login/ui/LoginActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_login/vm/LoginViewModel;", "Lcom/example/module_login/databinding/LoginActivityLoginBinding;", "()V", "accessToken", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "avatarUrl", "callbackManager", "Lcom/facebook/CallbackManager;", "googleLoginSignManage", "Lcom/example/lib_common/sign/GoogleLoginSignManage;", "getGoogleLoginSignManage", "()Lcom/example/lib_common/sign/GoogleLoginSignManage;", "googleLoginSignManage$delegate", "Lkotlin/Lazy;", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "name", "clickBack", "", "createObserver", "facebookCreate", "facebookRequest", "finishMain", "getFacebookUserPictureAsync", "facebookUserId", "getFbLoginInfo", "Lcom/facebook/AccessToken;", "googleSign", "googleSignResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "newStartToMain", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "updateBonusCountView", "userLogin", "Companion", "module_login_debug"})
public final class LoginActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_login.vm.LoginViewModel, com.example.module_login.databinding.LoginActivityLoginBinding> {
    private final kotlin.Lazy googleLoginSignManage$delegate = null;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    private com.facebook.CallbackManager callbackManager;
    private com.google.firebase.auth.FirebaseAuth auth;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_login.ui.LoginActivity.Companion Companion = null;
    public static final int CODE_SIGN_IN = 9999;
    private java.lang.String name = "";
    private java.lang.String avatarUrl = "";
    private java.lang.String accessToken;
    
    public LoginActivity() {
        super();
    }
    
    private final com.example.lib_common.sign.GoogleLoginSignManage getGoogleLoginSignManage() {
        return null;
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
    
    private final void clickBack() {
    }
    
    private final void updateBonusCountView() {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void finishMain() {
    }
    
    private final void newStartToMain() {
    }
    
    /**
     * 登录
     */
    private final void googleSign() {
    }
    
    /**
     * 游客登录
     */
    private final void userLogin() {
    }
    
    /**
     * google登录返回结果
     */
    private final void googleSignResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    private final void facebookCreate() {
    }
    
    /**
     * 获取Facebook个人信息
     */
    private final void getFbLoginInfo(com.facebook.AccessToken accessToken) {
    }
    
    private final void getFacebookUserPictureAsync(java.lang.String facebookUserId) {
    }
    
    private final void facebookRequest() {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/module_login/ui/LoginActivity$Companion;", "", "()V", "CODE_SIGN_IN", "", "module_login_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}