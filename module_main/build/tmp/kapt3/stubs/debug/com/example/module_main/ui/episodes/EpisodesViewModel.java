package com.example.module_main.ui.episodes;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/7
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rR4\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/module_main/ui/episodes/EpisodesViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "episodesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/lib_http/bean/data/TransactionHisAndEpisodesData;", "Lkotlin/collections/ArrayList;", "getEpisodesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setEpisodesLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "requestEpisodesUnlocked", "", "module_main_debug"})
public final class EpisodesViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.TransactionHisAndEpisodesData>> episodesLiveData;
    
    public EpisodesViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.TransactionHisAndEpisodesData>> getEpisodesLiveData() {
        return null;
    }
    
    public final void setEpisodesLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.TransactionHisAndEpisodesData>> p0) {
    }
    
    public final void requestEpisodesUnlocked() {
    }
}