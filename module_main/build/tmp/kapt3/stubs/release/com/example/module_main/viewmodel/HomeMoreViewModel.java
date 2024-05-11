package com.example.module_main.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/module_main/viewmodel/HomeMoreViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "isRefresh", "", "()Z", "setRefresh", "(Z)V", "mPage", "", "getMPage", "()I", "setMPage", "(I)V", "mPageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/HomeMoreData;", "getMPageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mPageSize", "loadData", "", "configurationColumnId", "module_main_release"})
public final class HomeMoreViewModel extends com.example.lib_common.vm.CommonViewModel {
    private boolean isRefresh = true;
    private int mPage = 1;
    private final int mPageSize = 10;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeMoreData> mPageLiveData = null;
    
    public HomeMoreViewModel() {
        super();
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final void setRefresh(boolean p0) {
    }
    
    public final int getMPage() {
        return 0;
    }
    
    public final void setMPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeMoreData> getMPageLiveData() {
        return null;
    }
    
    public final void loadData(int configurationColumnId) {
    }
}