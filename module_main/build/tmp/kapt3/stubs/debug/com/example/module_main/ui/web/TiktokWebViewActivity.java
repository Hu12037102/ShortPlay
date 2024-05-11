package com.example.module_main.ui.web;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/7/6
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/module_main/ui/web/TiktokWebViewActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/web/TiktokWebViewModel;", "Lcom/example/module_main/databinding/MainAcitivityTiktokWebBinding;", "()V", "coverImageUrl", "", "isUrge", "", "searchDramaId", "", "tag", "videoId", "webUrl", "webView", "Landroid/webkit/WebView;", "createObserver", "", "dismissLoading", "finish", "getUrgeForUpdatesDrawable", "Landroid/graphics/drawable/GradientDrawable;", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "onDestroy", "showLoading", "urgeState", "Companion", "module_main_debug"})
public final class TiktokWebViewActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.web.TiktokWebViewModel, com.example.module_main.databinding.MainAcitivityTiktokWebBinding> {
    private android.webkit.WebView webView;
    private java.lang.String webUrl;
    private java.lang.String tag = "";
    private java.lang.String videoId = "";
    private java.lang.String coverImageUrl = "";
    private boolean isUrge = false;
    private int searchDramaId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.ui.web.TiktokWebViewActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_ID = "video_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COVER_IMAGE_URL = "cover_image_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMBEDLINK = "embedLink";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_REMINDER = "is_reminder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_DRAMA_ID = "search_drama_id";
    
    public TiktokWebViewActivity() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void urgeState() {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final android.graphics.drawable.GradientDrawable getUrgeForUpdatesDrawable() {
        return null;
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/module_main/ui/web/TiktokWebViewActivity$Companion;", "", "()V", "COVER_IMAGE_URL", "", "EMBEDLINK", "IS_REMINDER", "SEARCH_DRAMA_ID", "VIDEO_ID", "module_main_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}