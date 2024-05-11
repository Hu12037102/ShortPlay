package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/19
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/module_main/adapter/ProviderHomeVertical;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/example/lib_http/bean/data/HomeData$Column;", "itemViewType", "", "layoutId", "clickToPlayListener", "Lcom/example/module_main/listen/ClickToPlayListener;", "(IILcom/example/module_main/listen/ClickToPlayListener;)V", "homeVerticalAdapter", "Lcom/example/module_main/adapter/HomeVerticalAdapter;", "getItemViewType", "()I", "getLayoutId", "convert", "", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "onViewHolderCreated", "viewHolder", "viewType", "module_main_release"})
public final class ProviderHomeVertical extends com.chad.library.adapter.base.provider.BaseItemProvider<com.example.lib_http.bean.data.HomeData.Column> {
    private final int itemViewType = 0;
    private final int layoutId = 0;
    private final com.example.module_main.listen.ClickToPlayListener clickToPlayListener = null;
    private com.example.module_main.adapter.HomeVerticalAdapter homeVerticalAdapter;
    
    public ProviderHomeVertical(int itemViewType, int layoutId, @org.jetbrains.annotations.NotNull()
    com.example.module_main.listen.ClickToPlayListener clickToPlayListener) {
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
    
    @java.lang.Override()
    public void onViewHolderCreated(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
    }
}