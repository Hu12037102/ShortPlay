package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0014\u00a8\u0006\u000f"}, d2 = {"Lcom/example/module_main/adapter/MyListAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/example/lib_common/bean/TemporaryBean;", "clickToPlayListener", "Lcom/example/module_main/listen/ClickToPlayListener;", "onClickItem", "Lkotlin/Function1;", "", "", "(Lcom/example/module_main/listen/ClickToPlayListener;Lkotlin/jvm/functions/Function1;)V", "getItemType", "data", "", "position", "Companion", "module_main_debug"})
public final class MyListAdapter extends com.chad.library.adapter.base.BaseProviderMultiAdapter<com.example.lib_common.bean.TemporaryBean> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.adapter.MyListAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_BACK = "PlayBack";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_BACK_LIST_TYPE = "listType";
    public static final int HISTORY = 1;
    public static final int MY_LIST = 2;
    
    public MyListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.module_main.listen.ClickToPlayListener clickToPlayListener, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem) {
        super(null);
    }
    
    @java.lang.Override()
    protected int getItemType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_common.bean.TemporaryBean> data, int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/module_main/adapter/MyListAdapter$Companion;", "", "()V", "HISTORY", "", "MY_LIST", "PLAY_BACK", "", "PLAY_BACK_LIST_TYPE", "module_main_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}