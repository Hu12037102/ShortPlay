package com.example.module_main.ui.bonusCenter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/12
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010\u0017\u001a\u00020\u001cR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\t\u00a8\u0006!"}, d2 = {"Lcom/example/module_main/ui/bonusCenter/BonusCenterViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "advertisement", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/BalanceData;", "getAdvertisement", "()Landroidx/lifecycle/MutableLiveData;", "setAdvertisement", "(Landroidx/lifecycle/MutableLiveData;)V", "checkInLiveData", "getCheckInLiveData", "setCheckInLiveData", "detailsLiveData", "Lcom/example/lib_http/bean/data/ActivityDetailsData;", "getDetailsLiveData", "setDetailsLiveData", "inviteFriendLiveData", "Lcom/example/lib_http/bean/data/InviteFriendData;", "getInviteFriendLiveData", "setInviteFriendLiveData", "mOpenNotificationLiveData", "getMOpenNotificationLiveData", "startAdsMonetization", "", "getStartAdsMonetization", "setStartAdsMonetization", "adsMonetization", "", "checkIn", "inviteFriend", "openNotificationReward", "requestDetails", "module_main_debug"})
public final class BonusCenterViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.ActivityDetailsData> detailsLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> checkInLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> advertisement;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.InviteFriendData> inviteFriendLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> startAdsMonetization;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> mOpenNotificationLiveData = null;
    
    public BonusCenterViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.ActivityDetailsData> getDetailsLiveData() {
        return null;
    }
    
    public final void setDetailsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.ActivityDetailsData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> getCheckInLiveData() {
        return null;
    }
    
    public final void setCheckInLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> getAdvertisement() {
        return null;
    }
    
    public final void setAdvertisement(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.InviteFriendData> getInviteFriendLiveData() {
        return null;
    }
    
    public final void setInviteFriendLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.InviteFriendData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStartAdsMonetization() {
        return null;
    }
    
    public final void setStartAdsMonetization(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> getMOpenNotificationLiveData() {
        return null;
    }
    
    public final void requestDetails() {
    }
    
    public final void checkIn() {
    }
    
    public final void adsMonetization() {
    }
    
    /**
     * 记录开始观看
     */
    public final void startAdsMonetization() {
    }
    
    /**
     * 邀请好友
     */
    public final void inviteFriend() {
    }
    
    public final void openNotificationReward() {
    }
}