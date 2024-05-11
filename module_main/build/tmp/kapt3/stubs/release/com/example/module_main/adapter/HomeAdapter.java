package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/18
 */
@kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BF\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012#\b\u0002\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0014J\u0010\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/module_main/adapter/HomeAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/example/lib_http/bean/data/HomeData$Column;", "clickToPlayListener", "Lcom/example/module_main/listen/ClickToPlayListener;", "block", "Lkotlin/Function1;", "Lcom/example/lib_http/bean/data/TrendingTypeBean;", "Lkotlin/ParameterName;", "name", "entity", "", "blockSubscribe", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "(Lcom/example/module_main/listen/ClickToPlayListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "mOnShowClickNewEpisodeListener", "Lcom/example/module_main/adapter/HomeAdapter$OnShowClickNewEpisodeListener;", "getItemType", "", "data", "", "position", "setOnShowClickNewEpisodeListener", "onShowClickNewEpisodeListener", "Companion", "OnShowClickNewEpisodeListener", "module_main_release"})
public final class HomeAdapter extends com.chad.library.adapter.base.BaseProviderMultiAdapter<com.example.lib_http.bean.data.HomeData.Column> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.adapter.HomeAdapter.Companion Companion = null;
    public static final int VERTICAL_TYPE = 1;
    public static final int HORIZONTAL_TYPE = 2;
    public static final int WATERFALL_TYPE = 3;
    public static final int WATERFALL_HIS_TYPE = 4;
    public static final int TRENDING_TYPE = 5;
    private com.example.module_main.adapter.HomeAdapter.OnShowClickNewEpisodeListener mOnShowClickNewEpisodeListener;
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    com.example.module_main.listen.ClickToPlayListener clickToPlayListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.TrendingTypeBean, kotlin.Unit> block, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> blockSubscribe) {
        super(null);
    }
    
    @java.lang.Override()
    protected int getItemType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_http.bean.data.HomeData.Column> data, int position) {
        return 0;
    }
    
    public final void setOnShowClickNewEpisodeListener(@org.jetbrains.annotations.Nullable()
    com.example.module_main.adapter.HomeAdapter.OnShowClickNewEpisodeListener onShowClickNewEpisodeListener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/module_main/adapter/HomeAdapter$OnShowClickNewEpisodeListener;", "", "onShowNewEpisode", "", "entity", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "module_main_release"})
    public static abstract interface OnShowClickNewEpisodeListener {
        
        public abstract void onShowNewEpisode(@org.jetbrains.annotations.NotNull()
        com.example.lib_http.bean.data.HomeData.Column.DramaSeries entity);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/module_main/adapter/HomeAdapter$Companion;", "", "()V", "HORIZONTAL_TYPE", "", "TRENDING_TYPE", "VERTICAL_TYPE", "WATERFALL_HIS_TYPE", "WATERFALL_TYPE", "module_main_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}