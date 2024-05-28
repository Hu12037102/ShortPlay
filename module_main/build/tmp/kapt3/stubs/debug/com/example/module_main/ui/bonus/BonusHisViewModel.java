package com.example.module_main.ui.bonus;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/8
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR4\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/module_main/ui/bonus/BonusHisViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "bonusHisLive", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/lib_http/bean/data/TransactionHisAndEpisodesData;", "Lkotlin/collections/ArrayList;", "getBonusHisLive", "()Landroidx/lifecycle/MutableLiveData;", "setBonusHisLive", "(Landroidx/lifecycle/MutableLiveData;)V", "requestBonusHis", "", "transactionType", "", "module_main_debug"})
public final class BonusHisViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.TransactionHisAndEpisodesData>> bonusHisLive;
    
    public BonusHisViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.TransactionHisAndEpisodesData>> getBonusHisLive() {
        return null;
    }
    
    public final void setBonusHisLive(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.TransactionHisAndEpisodesData>> p0) {
    }
    
    public final void requestBonusHis(int transactionType) {
    }
}