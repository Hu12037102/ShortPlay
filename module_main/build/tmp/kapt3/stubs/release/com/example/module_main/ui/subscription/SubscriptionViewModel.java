package com.example.module_main.ui.subscription;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2024/2/22
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR(\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/example/module_main/ui/subscription/SubscriptionViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "coinsSubData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "getCoinsSubData", "()Landroidx/lifecycle/MutableLiveData;", "setCoinsSubData", "(Landroidx/lifecycle/MutableLiveData;)V", "coinsSubscriptionDetailsLiveData", "Lcom/example/lib_http/bean/data/CoinsSubscriptionClaimData;", "getCoinsSubscriptionDetailsLiveData", "setCoinsSubscriptionDetailsLiveData", "subscriptionData", "", "Lcom/example/lib_http/bean/data/SubData;", "getSubscriptionData", "setSubscriptionData", "coinsSubscriptionClaim", "", "productType", "", "coinsSubscriptionDetails", "isShowDialog", "", "subscriptionList", "module_main_release"})
public final class SubscriptionViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData> coinsSubData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> coinsSubscriptionDetailsLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.SubData>> subscriptionData;
    
    public SubscriptionViewModel() {
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
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.SubData>> getSubscriptionData() {
        return null;
    }
    
    public final void setSubscriptionData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.SubData>> p0) {
    }
    
    /**
     * 订阅列表
     */
    public final void subscriptionList(boolean isShowDialog) {
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