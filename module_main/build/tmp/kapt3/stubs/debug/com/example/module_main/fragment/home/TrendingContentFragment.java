package com.example.module_main.fragment.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0019\u0010\u001b\u001a\u00020\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0002\u0010\u001dR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/module_main/fragment/home/TrendingContentFragment;", "Lcom/example/lib_base/fragment/BaseFragment;", "Lcom/example/module_main/viewmodel/TrendingViewModel;", "Lcom/example/module_main/databinding/TrendingContentFragmentBinding;", "()V", "mAdapter", "Lcom/example/module_main/adapter/TrendingMoreAdapter;", "getMAdapter", "()Lcom/example/module_main/adapter/TrendingMoreAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mType", "", "createObserver", "", "dismissLoading", "initData", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isEmptyData", "", "lazyLoadData", "listener", "loadTrendingData", "onResume", "showLoading", "updateErrorLayout", "hasMore", "(Ljava/lang/Boolean;)V", "Companion", "module_main_debug"})
public final class TrendingContentFragment extends com.example.lib_base.fragment.BaseFragment<com.example.module_main.viewmodel.TrendingViewModel, com.example.module_main.databinding.TrendingContentFragmentBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.fragment.home.TrendingContentFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALL = "all";
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.lang.String mType = "all";
    
    public TrendingContentFragment() {
        super();
    }
    
    private final com.example.module_main.adapter.TrendingMoreAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void lazyLoadData() {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void loadTrendingData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final boolean isEmptyData() {
        return false;
    }
    
    private final void updateErrorLayout(java.lang.Boolean hasMore) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/module_main/fragment/home/TrendingContentFragment$Companion;", "", "()V", "ALL", "", "module_main_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}