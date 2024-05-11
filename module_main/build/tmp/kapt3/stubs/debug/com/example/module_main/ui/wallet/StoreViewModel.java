package com.example.module_main.ui.wallet;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/2
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/example/module_main/ui/wallet/StoreViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "coinsSubData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "getCoinsSubData", "()Landroidx/lifecycle/MutableLiveData;", "setCoinsSubData", "(Landroidx/lifecycle/MutableLiveData;)V", "coinsSubscriptionDetailsLiveData", "Lcom/example/lib_http/bean/data/CoinsSubscriptionClaimData;", "getCoinsSubscriptionDetailsLiveData", "setCoinsSubscriptionDetailsLiveData", "storeLiveData", "Lcom/example/lib_http/bean/data/StoreData;", "getStoreLiveData", "setStoreLiveData", "coinsSubscriptionClaim", "", "productType", "", "coinsSubscriptionDetails", "isShowDialog", "", "requestPackagePrice", "module_main_debug"})
public final class StoreViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData> coinsSubData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> coinsSubscriptionDetailsLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreData> storeLiveData;
    
    public StoreViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData> getCoinsSubData() {
        return null;
    }
    
    public final void setCoinsSubData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> getCoinsSubscriptionDetailsLiveData() {
        return null;
    }
    
    public final void setCoinsSubscriptionDetailsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreData> getStoreLiveData() {
        return null;
    }
    
    public final void setStoreLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreData> p0) {
    }
    
    /**
     * 商城详情
     */
    public final void requestPackagePrice(boolean isShowDialog) {
    }
    
    /**
     * 订阅每日签到
     */
    public final void coinsSubscriptionDetails(int productType, boolean isShowDialog) {
    }
    
    /**
     * 领取
     */
    public final void coinsSubscriptionClaim(int productType) {
    }
}