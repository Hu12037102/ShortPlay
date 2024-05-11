package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/module_main/adapter/ProviderMyListHorizontal;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/example/lib_common/bean/TemporaryBean;", "itemViewType", "", "layoutId", "clickToPlayListener", "Lcom/example/module_main/listen/ClickToPlayListener;", "(IILcom/example/module_main/listen/ClickToPlayListener;)V", "getItemViewType", "()I", "getLayoutId", "mAdapter", "Lcom/example/module_main/adapter/ProviderItemHistoryAdapter;", "stub", "Landroid/view/ViewStub;", "convert", "", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "onViewHolderCreated", "viewHolder", "viewType", "showEmpty", "module_main_release"})
public final class ProviderMyListHorizontal extends com.chad.library.adapter.base.provider.BaseItemProvider<com.example.lib_common.bean.TemporaryBean> {
    private final int itemViewType = 0;
    private final int layoutId = 0;
    private final com.example.module_main.listen.ClickToPlayListener clickToPlayListener = null;
    private android.view.ViewStub stub;
    private com.example.module_main.adapter.ProviderItemHistoryAdapter mAdapter;
    
    public ProviderMyListHorizontal(int itemViewType, int layoutId, @org.jetbrains.annotations.NotNull()
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
    com.example.lib_common.bean.TemporaryBean item) {
    }
    
    @java.lang.Override()
    public void onViewHolderCreated(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder viewHolder, int viewType) {
    }
    
    private final void showEmpty(com.chad.library.adapter.base.viewholder.BaseViewHolder helper) {
    }
}