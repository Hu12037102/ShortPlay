package com.example.module_main.fragment.me;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/16
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/me/MeFragment")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/module_main/fragment/me/MeFragment;", "Lcom/example/lib_base/fragment/BaseFragment;", "Lcom/example/module_main/fragment/me/MeViewModel;", "Lcom/example/module_main/databinding/MainFragmentMeBinding;", "()V", "mLaunchLanguage", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "createObserver", "", "getSignBackground", "Landroid/graphics/drawable/GradientDrawable;", "initData", "initView", "savedInstanceState", "Landroid/os/Bundle;", "lazyLoadData", "listener", "onResume", "setUserState", "it", "", "updateBonusCountView", "userInfo", "Lcom/example/lib_http/bean/data/UserInfoData;", "userSetting", "module_main_debug"})
public final class MeFragment extends com.example.lib_base.fragment.BaseFragment<com.example.module_main.fragment.me.MeViewModel, com.example.module_main.databinding.MainFragmentMeBinding> {
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> mLaunchLanguage = null;
    
    public MeFragment() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void updateBonusCountView(com.example.lib_http.bean.data.UserInfoData userInfo) {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void lazyLoadData() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    /**
     * 设置用户信息
     */
    private final void userSetting(com.example.lib_http.bean.data.UserInfoData userInfo) {
    }
    
    /**
     * 设置用户状态
     */
    private final void setUserState(int it) {
    }
    
    private final android.graphics.drawable.GradientDrawable getSignBackground() {
        return null;
    }
}