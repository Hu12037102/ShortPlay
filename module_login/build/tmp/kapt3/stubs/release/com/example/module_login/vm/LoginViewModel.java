package com.example.module_login.vm;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/29
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0006\u0010\b\u001a\u00020\u0010R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/module_login/vm/LoginViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "mNetRequestErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/request/error/AppException;", "getMNetRequestErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "userLogin", "Lcom/example/lib_base/event/SingleLiveEvent;", "", "getUserLogin", "()Lcom/example/lib_base/event/SingleLiveEvent;", "setUserLogin", "(Lcom/example/lib_base/event/SingleLiveEvent;)V", "faceBookLogin", "", "accessToken", "", "googleLogin", "idToken", "requestUserInfo", "map", "", "Lokhttp3/RequestBody;", "module_login_release"})
public final class LoginViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> userLogin;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.request.error.AppException> mNetRequestErrorLiveData = null;
    
    public LoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> getUserLogin() {
        return null;
    }
    
    public final void setUserLogin(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.request.error.AppException> getMNetRequestErrorLiveData() {
        return null;
    }
    
    /**
     * google登录
     */
    public final void googleLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String idToken) {
    }
    
    /**
     * faceBook登录
     */
    public final void faceBookLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
    }
    
    /**
     * 游客登录
     */
    public final void userLogin() {
    }
    
    /**
     * 用户信息获取
     */
    private final void requestUserInfo(java.util.Map<java.lang.String, okhttp3.RequestBody> map) {
    }
}