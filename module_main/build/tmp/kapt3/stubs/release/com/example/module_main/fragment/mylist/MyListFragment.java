package com.example.module_main.fragment.mylist;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/16
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/myList/MyListFragment")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/module_main/fragment/mylist/MyListFragment;", "Lcom/example/lib_base/fragment/BaseFragment;", "Lcom/example/module_main/fragment/mylist/MyListViewModel;", "Lcom/example/module_main/databinding/MainFragmentMylistBinding;", "Lcom/example/module_main/listen/ClickToPlayListener;", "()V", "listType", "", "mAdapter", "Lcom/example/module_main/adapter/MyListAdapter;", "createObserver", "", "dismissLoading", "initData", "initView", "savedInstanceState", "Landroid/os/Bundle;", "lazyLoadData", "onClick", "data", "Lcom/example/lib_http/bean/data/PlayRequestData;", "onResume", "showLoading", "showNetworkEmpty", "switchItem", "type", "tryAgainClick", "Companion", "module_main_release"})
public final class MyListFragment extends com.example.lib_base.fragment.BaseFragment<com.example.module_main.fragment.mylist.MyListViewModel, com.example.module_main.databinding.MainFragmentMylistBinding> implements com.example.module_main.listen.ClickToPlayListener {
    private int listType = 1;
    private com.example.module_main.adapter.MyListAdapter mAdapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_main.fragment.mylist.MyListFragment.Companion Companion = null;
    public static final int COMPLETE_TYPE = 1;
    public static final int UPDATE_TYPE = 2;
    public static final int FOLLOW_TYPE = 3;
    
    public MyListFragment() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void switchItem(int type) {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void lazyLoadData() {
    }
    
    /**
     * 每次切换都进行请求 确保数据最新
     */
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void createObserver() {
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
     * 进入子剧集
     * dramaSeriesId ： 剧集ID
     * episode_number : 当前集数
     * episode_charge_start：解锁集数
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayRequestData data) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/module_main/fragment/mylist/MyListFragment$Companion;", "", "()V", "COMPLETE_TYPE", "", "FOLLOW_TYPE", "UPDATE_TYPE", "module_main_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}