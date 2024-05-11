package com.example.module_main.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002\u00a8\u0006\r"}, d2 = {"Lcom/example/module_main/adapter/WatchAdAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/example/lib_http/bean/data/ActivityDetailsData$AdsMonetization$WatchAd;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "convert", "", "holder", "item", "setTvWatchAdBgByTime", "Landroid/graphics/drawable/GradientDrawable;", "setTvWatchAdByByNormal", "Companion", "module_main_debug"})
public final class WatchAdAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization.WatchAd, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.adapter.WatchAdAdapter.Companion Companion = null;
    public static final int WATCH_DONE = 4;
    public static final int WATCH_WATING = 3;
    public static final int WATCH_NONE_NOT = 2;
    public static final int WATCH_NONE = 1;
    
    public WatchAdAdapter() {
        super(0, null);
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization.WatchAd item) {
    }
    
    private final android.graphics.drawable.GradientDrawable setTvWatchAdByByNormal() {
        return null;
    }
    
    private final android.graphics.drawable.GradientDrawable setTvWatchAdBgByTime() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/module_main/adapter/WatchAdAdapter$Companion;", "", "()V", "WATCH_DONE", "", "WATCH_NONE", "WATCH_NONE_NOT", "WATCH_WATING", "module_main_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}