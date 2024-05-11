package com.example.module_main.fragment.mylist;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/example/module_main/fragment/mylist/MyListViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "myListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/lib_common/bean/TemporaryBean;", "getMyListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setMyListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "requestMyListData", "", "isSHowDialog", "", "listType", "", "module_main_debug"})
public final class MyListViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_common.bean.TemporaryBean>> myListLiveData;
    
    public MyListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_common.bean.TemporaryBean>> getMyListLiveData() {
        return null;
    }
    
    public final void setMyListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_common.bean.TemporaryBean>> p0) {
    }
    
    public final void requestMyListData(boolean isSHowDialog, int listType) {
    }
}