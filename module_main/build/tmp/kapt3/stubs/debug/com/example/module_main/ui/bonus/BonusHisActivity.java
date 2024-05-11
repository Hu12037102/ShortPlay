package com.example.module_main.ui.bonus;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/7
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/module_main/ui/bonus/BonusHisActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/bonus/BonusHisViewModel;", "Lcom/example/module_main/databinding/MainActivityBonusBinding;", "()V", "mAdapter", "Lcom/example/module_main/adapter/BonusHisAdapter;", "getMAdapter", "()Lcom/example/module_main/adapter/BonusHisAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "view", "Landroid/view/View;", "createObserver", "", "dismissLoading", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "requestAll", "transactionType", "", "showEmpty", "showLoading", "showNetworkEmpty", "tryAgainClick", "module_main_debug"})
public final class BonusHisActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.bonus.BonusHisViewModel, com.example.module_main.databinding.MainActivityBonusBinding> {
    private final kotlin.Lazy mAdapter$delegate = null;
    private android.view.View view;
    
    public BonusHisActivity() {
        super();
    }
    
    private final com.example.module_main.adapter.BonusHisAdapter getMAdapter() {
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
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestAll(int transactionType) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    private final void showEmpty() {
    }
}