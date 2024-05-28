package com.example.module_main.ui.setting;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/29
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/example/module_main/ui/setting/SettingViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "checkVersionData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/UpdateInfo$UpdateInfo;", "getCheckVersionData", "()Landroidx/lifecycle/MutableLiveData;", "setCheckVersionData", "(Landroidx/lifecycle/MutableLiveData;)V", "checkVersionRequest", "", "isShowDialog", "", "module_main_debug"})
public final class SettingViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UpdateInfo.UpdateInfo> checkVersionData;
    
    public SettingViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UpdateInfo.UpdateInfo> getCheckVersionData() {
        return null;
    }
    
    public final void setCheckVersionData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UpdateInfo.UpdateInfo> p0) {
    }
    
    /**
     * 版本检测
     */
    public final void checkVersionRequest(boolean isShowDialog) {
    }
}