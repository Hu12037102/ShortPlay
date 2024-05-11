package com.example.module_main.ui.home;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/home/HomeMoreActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0019\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\u001bR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/module_main/ui/home/HomeMoreActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/viewmodel/HomeMoreViewModel;", "Lcom/example/module_main/databinding/MainActivityHomeMoreBinding;", "()V", "mAdapter", "Lcom/example/module_main/adapter/HomeMoreAdapter;", "getMAdapter", "()Lcom/example/module_main/adapter/HomeMoreAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mConfigurationColumnId", "", "createObserver", "", "dismissLoading", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isEmptyData", "", "listener", "loadData", "loadPageList", "showLoading", "updateErrorLayout", "hasMore", "(Ljava/lang/Boolean;)V", "module_main_release"})
public final class HomeMoreActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.viewmodel.HomeMoreViewModel, com.example.module_main.databinding.MainActivityHomeMoreBinding> {
    private final kotlin.Lazy mAdapter$delegate = null;
    private int mConfigurationColumnId = -1;
    
    public HomeMoreActivity() {
        super();
    }
    
    private final com.example.module_main.adapter.HomeMoreAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadPageList() {
    }
    
    private final boolean isEmptyData() {
        return false;
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void updateErrorLayout(java.lang.Boolean hasMore) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
}