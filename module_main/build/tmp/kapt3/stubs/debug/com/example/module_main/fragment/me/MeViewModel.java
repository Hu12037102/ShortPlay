package com.example.module_main.fragment.me;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/17
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/module_main/fragment/me/MeViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "userInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/UserInfoData;", "getUserInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setUserInfoLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "requestUserInfo", "", "module_main_debug"})
public final class MeViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData> userInfoLiveData;
    
    public MeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData> getUserInfoLiveData() {
        return null;
    }
    
    public final void setUserInfoLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData> p0) {
    }
    
    /**
     * 用户详情
     */
    public final void requestUserInfo() {
    }
}