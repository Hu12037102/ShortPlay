package com.example.module_main.viewmodel;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/module_main/viewmodel/SplashViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "appUpData", "Lcom/example/lib_base/event/SingleLiveEvent;", "Lcom/example/lib_http/bean/data/UpdateInfo;", "getAppUpData", "()Lcom/example/lib_base/event/SingleLiveEvent;", "setAppUpData", "(Lcom/example/lib_base/event/SingleLiveEvent;)V", "splashData", "", "getSplashData", "setSplashData", "errorState", "", "errCode", "message", "", "getIP", "initialize", "userLoginSplash", "module_main_debug"})
public final class SplashViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> splashData;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.UpdateInfo> appUpData;
    
    public SplashViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> getSplashData() {
        return null;
    }
    
    public final void setSplashData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.UpdateInfo> getAppUpData() {
        return null;
    }
    
    public final void setAppUpData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.UpdateInfo> p0) {
    }
    
    /**
     * 获取用户IP
     */
    public final void getIP() {
    }
    
    /**
     * 初始化
     */
    public final void initialize() {
    }
    
    /**
     * 用户信息获取
     */
    public final void userLoginSplash() {
    }
    
    private final void errorState(int errCode, java.lang.String message) {
    }
}