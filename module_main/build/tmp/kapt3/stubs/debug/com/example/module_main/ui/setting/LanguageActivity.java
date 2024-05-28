package com.example.module_main.ui.setting;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/me/languageActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/module_main/ui/setting/LanguageActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/viewmodel/LanguageViewModel;", "Lcom/example/module_main/databinding/ActivityLanguageBinding;", "()V", "mAdapter", "Lcom/example/module_main/adapter/LanguageAdapter;", "mData", "Ljava/util/ArrayList;", "Lcom/example/lib_http/bean/data/LanguageData;", "createObserver", "", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "showSwitchLanguageDialog", "entity", "position", "", "module_main_debug"})
public final class LanguageActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.viewmodel.LanguageViewModel, com.example.module_main.databinding.ActivityLanguageBinding> {
    private final java.util.ArrayList<com.example.lib_http.bean.data.LanguageData> mData = null;
    private com.example.module_main.adapter.LanguageAdapter mAdapter;
    
    public LanguageActivity() {
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
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showSwitchLanguageDialog(com.example.lib_http.bean.data.LanguageData entity, int position) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
}