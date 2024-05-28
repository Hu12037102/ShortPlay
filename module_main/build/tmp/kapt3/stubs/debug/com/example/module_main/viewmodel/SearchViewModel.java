package com.example.module_main.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/example/module_main/viewmodel/SearchViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "isRefresh", "", "()Z", "setRefresh", "(Z)V", "mPage", "", "getMPage", "()I", "setMPage", "(I)V", "mPageSize", "mSearchError", "Landroidx/lifecycle/MutableLiveData;", "getMSearchError", "()Landroidx/lifecycle/MutableLiveData;", "mSearchLiveData", "Lcom/example/lib_http/bean/data/SearchInfoData;", "getMSearchLiveData", "requestSearchByKey", "", "searchKey", "", "tikTokPlayRecord", "videoId", "module_main_debug"})
public final class SearchViewModel extends com.example.lib_common.vm.CommonViewModel {
    private int mPage = 1;
    private boolean isRefresh = true;
    private final int mPageSize = 20;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.SearchInfoData> mSearchLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mSearchError = null;
    
    public SearchViewModel() {
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
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.SearchInfoData> getMSearchLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMSearchError() {
        return null;
    }
    
    public final void requestSearchByKey(boolean isRefresh, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
    }
    
    public final void tikTokPlayRecord(@org.jetbrains.annotations.NotNull()
    java.lang.String videoId) {
    }
}