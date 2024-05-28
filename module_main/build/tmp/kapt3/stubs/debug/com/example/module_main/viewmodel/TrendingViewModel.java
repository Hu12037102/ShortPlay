package com.example.module_main.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lcom/example/module_main/viewmodel/TrendingViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "isRefresh", "", "()Z", "setRefresh", "(Z)V", "<set-?>", "", "mPage", "getMPage", "()I", "mPageSize", "mTrendingListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/TrendingPageData;", "getMTrendingListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mTypesLiveData", "", "", "getMTypesLiveData", "loadAllTypes", "", "loadTrendList", "type", "module_main_debug"})
public final class TrendingViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> mTypesLiveData = null;
    private final int mPageSize = 10;
    private int mPage = 1;
    private boolean isRefresh = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.TrendingPageData> mTrendingListLiveData = null;
    
    public TrendingViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getMTypesLiveData() {
        return null;
    }
    
    public final int getMPage() {
        return 0;
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final void setRefresh(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.TrendingPageData> getMTrendingListLiveData() {
        return null;
    }
    
    public final void loadAllTypes() {
    }
    
    public final void loadTrendList(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
}