package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/module_main/adapter/ProviderMyListVertical;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/example/lib_common/bean/TemporaryBean;", "itemViewType", "", "layoutId", "clickToPlayListener", "Lcom/example/module_main/listen/ClickToPlayListener;", "onClickItem", "Lkotlin/Function1;", "", "(IILcom/example/module_main/listen/ClickToPlayListener;Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "()I", "getLayoutId", "listType", "mAdapter", "Lcom/example/module_main/adapter/ProviderItemMyListAdapter;", "stub", "Landroid/view/ViewStub;", "clickItem", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "convert", "item", "itemState", "tipsDict", "Lcom/example/lib_http/bean/data/MyListData$TipsDict;", "onViewHolderCreated", "viewHolder", "viewType", "showEmpty", "switch", "module_main_release"})
public final class ProviderMyListVertical extends com.chad.library.adapter.base.provider.BaseItemProvider<com.example.lib_common.bean.TemporaryBean> {
    private final int itemViewType = 0;
    private final int layoutId = 0;
    private final com.example.module_main.listen.ClickToPlayListener clickToPlayListener = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onClickItem = null;
    private int listType = 1;
    private android.view.ViewStub stub;
    private com.example.module_main.adapter.ProviderItemMyListAdapter mAdapter;
    
    public ProviderMyListVertical(int itemViewType, int layoutId, @org.jetbrains.annotations.NotNull()
    com.example.module_main.listen.ClickToPlayListener clickToPlayListener, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem) {
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
    com.example.lib_common.bean.TemporaryBean item) {
    }
    
    @java.lang.Override()
    public void onViewHolderCreated(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
    }
    
    /**
     * complete / update / follow item切换
     */
    private final void clickItem(com.chad.library.adapter.base.viewholder.BaseViewHolder helper) {
    }
    
    private final void itemState(com.chad.library.adapter.base.viewholder.BaseViewHolder helper, com.example.lib_http.bean.data.MyListData.TipsDict tipsDict) {
    }
    
    private final void showEmpty(com.chad.library.adapter.base.viewholder.BaseViewHolder helper) {
    }
}