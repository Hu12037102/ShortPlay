package com.example.module_main.ui.history;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010*\u001a\u00020\u0006H\u0002J\b\u0010+\u001a\u00020\u0006H\u0002J\u0012\u0010,\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0017J\u0012\u0010-\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020\u001fH\u0014J\b\u0010/\u001a\u00020\u001fH\u0014J\u0018\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0003J\b\u00102\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020\u001fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/example/module_main/ui/history/PlayBackHistoryActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/history/PlayBackHistoryViewModel;", "Lcom/example/module_main/databinding/MainPlayHistoryBinding;", "()V", "currentSelectState", "", "deleteDialog", "Lcom/example/module_main/dialog/DeleteDialog;", "getDeleteDialog", "()Lcom/example/module_main/dialog/DeleteDialog;", "deleteDialog$delegate", "Lkotlin/Lazy;", "itemType", "", "listType", "mCollectAdapter", "Lcom/example/module_main/adapter/PlayBackCollectAdapter;", "getMCollectAdapter", "()Lcom/example/module_main/adapter/PlayBackCollectAdapter;", "mCollectAdapter$delegate", "mHistoryAdapter", "Lcom/example/module_main/adapter/PlayBackHistoryAdapter;", "getMHistoryAdapter", "()Lcom/example/module_main/adapter/PlayBackHistoryAdapter;", "mHistoryAdapter$delegate", "num", "position", "title", "", "callbackView", "", "isDelete", "cancelState", "createObserver", "deleteHisAndCollect", "deleteNum", "dismissLoading", "init", "savedInstanceState", "Landroid/os/Bundle;", "initView", "isAvailable", "isHisOrCollect", "listener", "loadData", "onDestroy", "onResume", "showDeleteButton", "isShow", "showHisEmpty", "showListEmpty", "showLoading", "showNetworkEmpty", "tryAgainClick", "module_main_debug"})
public final class PlayBackHistoryActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.history.PlayBackHistoryViewModel, com.example.module_main.databinding.MainPlayHistoryBinding> {
    private final kotlin.Lazy mHistoryAdapter$delegate = null;
    private final kotlin.Lazy mCollectAdapter$delegate = null;
    private final kotlin.Lazy deleteDialog$delegate = null;
    private int itemType = -1;
    private java.lang.String title;
    private int position = 0;
    private int num = 0;
    private boolean currentSelectState = false;
    private int listType = 1;
    
    public PlayBackHistoryActivity() {
        super();
    }
    
    private final com.example.module_main.adapter.PlayBackHistoryAdapter getMHistoryAdapter() {
        return null;
    }
    
    private final com.example.module_main.adapter.PlayBackCollectAdapter getMCollectAdapter() {
        return null;
    }
    
    private final com.example.module_main.dialog.DeleteDialog getDeleteDialog() {
        return null;
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    /**
     * 数据删除
     */
    private final void deleteHisAndCollect() {
    }
    
    private final void callbackView(boolean isDelete) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final boolean isAvailable() {
        return false;
    }
    
    private final void showHisEmpty() {
    }
    
    private final void showListEmpty() {
    }
    
    private final void cancelState() {
    }
    
    private final boolean isHisOrCollect() {
        return false;
    }
    
    private final void deleteNum() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void showDeleteButton(boolean isShow, boolean isDelete) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}