package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/19
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0017J\u0010\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/module_main/adapter/ProviderHomeHorizontal;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/example/lib_http/bean/data/HomeData$Column;", "itemViewType", "", "layoutId", "clickToPlayListener", "Lcom/example/module_main/listen/ClickToPlayListener;", "blockSubscribe", "Lkotlin/Function1;", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "", "(IILcom/example/module_main/listen/ClickToPlayListener;Lkotlin/jvm/functions/Function1;)V", "homeHorizontalAdapter", "Lcom/example/module_main/adapter/HomeHorizontalAdapter;", "getItemViewType", "()I", "getLayoutId", "mOnShowClickNewEpisodeListener", "Lcom/example/module_main/adapter/ProviderHomeHorizontal$OnShowClickNewEpisodeListener;", "convert", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "setOnShowClickNewEpisodeListener", "onShowClickNewEpisodeListener", "OnShowClickNewEpisodeListener", "module_main_release"})
public final class ProviderHomeHorizontal extends com.chad.library.adapter.base.provider.BaseItemProvider<com.example.lib_http.bean.data.HomeData.Column> {
    private final int itemViewType = 0;
    private final int layoutId = 0;
    private final com.example.module_main.listen.ClickToPlayListener clickToPlayListener = null;
    private final kotlin.jvm.functions.Function1<com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> blockSubscribe = null;
    private com.example.module_main.adapter.HomeHorizontalAdapter homeHorizontalAdapter;
    private com.example.module_main.adapter.ProviderHomeHorizontal.OnShowClickNewEpisodeListener mOnShowClickNewEpisodeListener;
    
    public ProviderHomeHorizontal(int itemViewType, int layoutId, @org.jetbrains.annotations.NotNull()
    com.example.module_main.listen.ClickToPlayListener clickToPlayListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.HomeData.Column.DramaSeries, kotlin.Unit> blockSubscribe) {
        super();
    }
    
    @java.lang.Override()
    public int getItemViewType() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    public final void setOnShowClickNewEpisodeListener(@org.jetbrains.annotations.Nullable()
    com.example.module_main.adapter.ProviderHomeHorizontal.OnShowClickNewEpisodeListener onShowClickNewEpisodeListener) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder helper, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData.Column item) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/module_main/adapter/ProviderHomeHorizontal$OnShowClickNewEpisodeListener;", "", "onShowNewEpisode", "", "entity", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "module_main_release"})
    public static abstract interface OnShowClickNewEpisodeListener {
        
        public abstract void onShowNewEpisode(@org.jetbrains.annotations.NotNull()
        com.example.lib_http.bean.data.HomeData.Column.DramaSeries entity);
    }
}