package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0011\u001a\u00020\b2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/module_main/adapter/PlayBackCollectAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/example/lib_http/bean/data/MyListData$CollectData;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "delete", "Lkotlin/Function2;", "", "", "convert", "holder", "item", "getGatherColor", "Landroid/text/Spanned;", "current", "", "total", "setOnClickView", "showDelete", "module_main_release"})
public final class PlayBackCollectAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.example.lib_http.bean.data.MyListData.CollectData, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.example.lib_http.bean.data.MyListData.CollectData, kotlin.Unit> delete;
    
    public PlayBackCollectAdapter() {
        super(0, null);
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.MyListData.CollectData item) {
    }
    
    private final android.text.Spanned getGatherColor(int current, int total) {
        return null;
    }
    
    private final void showDelete(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.example.lib_http.bean.data.MyListData.CollectData item) {
    }
    
    public final void setOnClickView(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.example.lib_http.bean.data.MyListData.CollectData, kotlin.Unit> delete) {
    }
}