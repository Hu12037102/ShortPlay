package com.example.module_main.ui.bonus;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/me/MeFragment/BonusHistoryActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0002J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/module_main/ui/bonus/BonusHistoryActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/bonus/BonusHistoryViewModel;", "Lcom/example/module_main/databinding/MainActivityBonusHistoryBinding;", "()V", "mAdapter", "Lcom/example/module_main/adapter/BonusHistoryAdapter;", "mAtvEmptyContent", "Landroidx/appcompat/widget/AppCompatTextView;", "mViewTryAgain", "Landroid/view/View;", "createObserver", "", "dismissLoading", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isEmptyData", "", "listener", "loadBonusHistories", "loadData", "showLoading", "updateEmptyLayout", "updateNetLayout", "module_main_release"})
public final class BonusHistoryActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.bonus.BonusHistoryViewModel, com.example.module_main.databinding.MainActivityBonusHistoryBinding> {
    private com.example.module_main.adapter.BonusHistoryAdapter mAdapter;
    private android.view.View mViewTryAgain;
    private androidx.appcompat.widget.AppCompatTextView mAtvEmptyContent;
    
    public BonusHistoryActivity() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateNetLayout() {
    }
    
    private final void updateEmptyLayout() {
    }
    
    private final boolean isEmptyData() {
        return false;
    }
    
    private final void loadBonusHistories() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
}