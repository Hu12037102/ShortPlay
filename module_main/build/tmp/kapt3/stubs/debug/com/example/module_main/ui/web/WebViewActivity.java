package com.example.module_main.ui.web;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/7/6
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/main/WebViewActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0014J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/module_main/ui/web/WebViewActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/lib_common/vm/CommonViewModel;", "Lcom/example/module_main/databinding/MainAcitivityWebBinding;", "()V", "tag", "", "webUrl", "webView", "Landroid/webkit/WebView;", "createObserver", "", "finish", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "onDestroy", "parseUriActivity", "url", "Companion", "module_main_debug"})
public final class WebViewActivity extends com.example.lib_base.activity.BaseActivity<com.example.lib_common.vm.CommonViewModel, com.example.module_main.databinding.MainAcitivityWebBinding> {
    private android.webkit.WebView webView;
    private java.lang.String webUrl;
    private java.lang.String tag = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.ui.web.WebViewActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URL = "url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TAG";
    
    public WebViewActivity() {
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
    
    private final void parseUriActivity(java.lang.String url) {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/module_main/ui/web/WebViewActivity$Companion;", "", "()V", "NAME", "", "TAG", "URL", "module_main_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}