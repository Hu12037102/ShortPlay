package com.example.module_main.ui.bonus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/module_main/ui/bonus/BonusHistoryViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "isRefresh", "", "()Z", "setRefresh", "(Z)V", "mBonusHistoriesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/PageData;", "Lcom/example/lib_http/bean/data/BonusHistoryData;", "getMBonusHistoriesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mErrorLiveData", "", "getMErrorLiveData", "mPage", "", "getMPage", "()I", "setMPage", "(I)V", "mPageSize", "requestBonusHistories", "", "module_main_release"})
public final class BonusHistoryViewModel extends com.example.lib_common.vm.CommonViewModel {
    private int mPage = 1;
    private final int mPageSize = 20;
    private boolean isRefresh = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.PageData<com.example.lib_http.bean.data.BonusHistoryData>> mBonusHistoriesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> mErrorLiveData = null;
    
    public BonusHistoryViewModel() {
        super();
    }
    
    public final int getMPage() {
        return 0;
    }
    
    public final void setMPage(int p0) {
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final void setRefresh(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.PageData<com.example.lib_http.bean.data.BonusHistoryData>> getMBonusHistoriesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getMErrorLiveData() {
        return null;
    }
    
    public final void requestBonusHistories() {
    }
}