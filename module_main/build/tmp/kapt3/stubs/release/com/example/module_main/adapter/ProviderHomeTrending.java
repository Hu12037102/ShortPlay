package com.example.module_main.adapter;

import java.lang.System;

/**
 * 首页trending栏目
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BB\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004H\u0016R+\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/module_main/adapter/ProviderHomeTrending;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/example/lib_http/bean/data/HomeData$Column;", "itemViewType", "", "layoutId", "onClickToPlayListent", "Lcom/example/module_main/listen/ClickToPlayListener;", "block", "Lkotlin/Function1;", "Lcom/example/lib_http/bean/data/TrendingTypeBean;", "Lkotlin/ParameterName;", "name", "entity", "", "(IILcom/example/module_main/listen/ClickToPlayListener;Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "()I", "getLayoutId", "mTrendingAdapter", "Lcom/example/module_main/adapter/HomeTrendingAdapter;", "mTrendingTypeAdapter", "Lcom/example/module_main/adapter/HomeTrendingTypeAdapter;", "mTypeList", "", "convert", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "getCheckTypeContent", "", "isFirstCheck", "", "data", "onViewHolderCreated", "viewHolder", "viewType", "module_main_release"})
public final class ProviderHomeTrending extends com.chad.library.adapter.base.provider.BaseItemProvider<com.example.lib_http.bean.data.HomeData.Column> {
    private final int itemViewType = 0;
    private final int layoutId = 0;
    private final com.example.module_main.listen.ClickToPlayListener onClickToPlayListent = null;
    private final kotlin.jvm.functions.Function1<com.example.lib_http.bean.data.TrendingTypeBean, kotlin.Unit> block = null;
    private java.util.List<com.example.lib_http.bean.data.TrendingTypeBean> mTypeList;
    private com.example.module_main.adapter.HomeTrendingAdapter mTrendingAdapter;
    private com.example.module_main.adapter.HomeTrendingTypeAdapter mTrendingTypeAdapter;
    
    public ProviderHomeTrending(int itemViewType, int layoutId, @org.jetbrains.annotations.NotNull()
    com.example.module_main.listen.ClickToPlayListener onClickToPlayListent, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.bean.data.TrendingTypeBean, kotlin.Unit> block) {
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
    
    @java.lang.Override()
    public void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder helper, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData.Column item) {
    }
    
    private final java.lang.String getCheckTypeContent() {
        return null;
    }
    
    private final boolean isFirstCheck(java.util.List<com.example.lib_http.bean.data.TrendingTypeBean> data) {
        return false;
    }
    
    @java.lang.Override()
    public void onViewHolderCreated(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
    }
}