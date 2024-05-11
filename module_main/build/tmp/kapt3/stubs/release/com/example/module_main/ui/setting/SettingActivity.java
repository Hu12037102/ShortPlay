package com.example.module_main.ui.setting;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/8
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0003J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0012\u0010 \u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\u0012\u0010!\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/module_main/ui/setting/SettingActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/setting/SettingViewModel;", "Lcom/example/module_main/databinding/MainActivitySettingBinding;", "()V", "clearDialog", "Lcom/example/module_main/dialog/ClearCacheDialog;", "googleLoginSignManage", "Lcom/example/lib_common/sign/GoogleLoginSignManage;", "getGoogleLoginSignManage", "()Lcom/example/lib_common/sign/GoogleLoginSignManage;", "googleLoginSignManage$delegate", "Lkotlin/Lazy;", "index", "", "loginAccountDialog", "Lcom/example/lib_common/dialog/LoginAccountDialog;", "mUpdate", "Lcom/example/module_main/update/UpdateGradation;", "getMUpdate", "()Lcom/example/module_main/update/UpdateGradation;", "mUpdate$delegate", "signDialog", "Lcom/example/module_main/dialog/SignOutDialog;", "clearCacheShow", "", "createObserver", "finishSt", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isOpenWatching", "listener", "loadData", "loginAccount", "showDeleteAccountDialog", "showUserAgreementDialog", "signOutLogin", "signOutShow", "module_main_release"})
public final class SettingActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.setting.SettingViewModel, com.example.module_main.databinding.MainActivitySettingBinding> {
    private final kotlin.Lazy googleLoginSignManage$delegate = null;
    private final kotlin.Lazy mUpdate$delegate = null;
    private com.example.module_main.dialog.ClearCacheDialog clearDialog;
    private com.example.module_main.dialog.SignOutDialog signDialog;
    private com.example.lib_common.dialog.LoginAccountDialog loginAccountDialog;
    private int index = 0;
    
    public SettingActivity() {
        super();
    }
    
    private final com.example.lib_common.sign.GoogleLoginSignManage getGoogleLoginSignManage() {
        return null;
    }
    
    private final com.example.module_main.update.UpdateGradation getMUpdate() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void isOpenWatching() {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    private final void clearCacheShow() {
    }
    
    private final void signOutShow() {
    }
    
    private final void loginAccount() {
    }
    
    private final void signOutLogin() {
    }
    
    private final void finishSt() {
    }
    
    private final void showDeleteAccountDialog() {
    }
    
    private final void showUserAgreementDialog() {
    }
}