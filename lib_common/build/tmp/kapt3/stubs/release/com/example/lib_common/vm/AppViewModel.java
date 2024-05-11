package com.example.lib_common.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0010R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0010R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u0010R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0010R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\u0010R \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\u0010R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0010R \u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u001f\u00100\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\t0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007R\u0019\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R \u00108\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\u0010R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007\u00a8\u0006D"}, d2 = {"Lcom/example/lib_common/vm/AppViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "appUpData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/UpdateInfo;", "getAppUpData", "()Landroidx/lifecycle/MutableLiveData;", "bonusBalance", "", "getBonusBalance", "coinsBalance", "getCoinsBalance", "dailyWatchedNumber", "getDailyWatchedNumber", "setDailyWatchedNumber", "(Landroidx/lifecycle/MutableLiveData;)V", "fingerAnimation", "", "getFingerAnimation", "setFingerAnimation", "flashSaleInfoLiveData", "Lcom/example/lib_http/bean/data/FlashSaleData;", "getFlashSaleInfoLiveData", "setFlashSaleInfoLiveData", "isAdUserData", "setAdUserData", "isAlreadyWatchedLifetimeAds", "setAlreadyWatchedLifetimeAds", "isButtonOrder", "setButtonOrder", "isCheckHomePager", "setCheckHomePager", "isNecessaryLiveData", "setNecessaryLiveData", "isTradeOrder", "setTradeOrder", "isUserData", "setUserData", "mAFLinkLiveData", "Lcom/example/lib_base/event/SingleLiveEvent;", "", "getMAFLinkLiveData", "()Lcom/example/lib_base/event/SingleLiveEvent;", "setMAFLinkLiveData", "(Lcom/example/lib_base/event/SingleLiveEvent;)V", "mFCMTokenLiveData", "getMFCMTokenLiveData", "mInviteTokenFromLiveData", "kotlin.jvm.PlatformType", "getMInviteTokenFromLiveData", "mPayFailFeedbackDataLiveData", "Lcom/example/lib_http/bean/data/PayFailFeedbackData;", "getMPayFailFeedbackDataLiveData", "mPaymentFailurePopupNum", "getMPaymentFailurePopupNum", "maxDailyWatchedNumber", "getMaxDailyWatchedNumber", "setMaxDailyWatchedNumber", "moneyInfo", "getMoneyInfo", "notService", "getNotService", "userInfo", "Lcom/example/lib_http/bean/data/UserInfoData;", "getUserInfo", "userPlatform", "getUserPlatform", "lib_common_release"})
public final class AppViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData> userInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> moneyInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> coinsBalance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> bonusBalance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> userPlatform = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> notService = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UpdateInfo> appUpData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isUserData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAdUserData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> isButtonOrder;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> fingerAnimation;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> isTradeOrder;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> maxDailyWatchedNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAlreadyWatchedLifetimeAds;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> dailyWatchedNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNecessaryLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.FlashSaleData> flashSaleInfoLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> isCheckHomePager;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.String> mAFLinkLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mPaymentFailurePopupNum = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.PayFailFeedbackData> mPayFailFeedbackDataLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mInviteTokenFromLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mFCMTokenLiveData = null;
    
    public AppViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMoneyInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCoinsBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getBonusBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUserPlatform() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNotService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UpdateInfo> getAppUpData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isUserData() {
        return null;
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAdUserData() {
        return null;
    }
    
    public final void setAdUserData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> isButtonOrder() {
        return null;
    }
    
    public final void setButtonOrder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFingerAnimation() {
        return null;
    }
    
    public final void setFingerAnimation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> isTradeOrder() {
        return null;
    }
    
    public final void setTradeOrder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMaxDailyWatchedNumber() {
        return null;
    }
    
    public final void setMaxDailyWatchedNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAlreadyWatchedLifetimeAds() {
        return null;
    }
    
    public final void setAlreadyWatchedLifetimeAds(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDailyWatchedNumber() {
        return null;
    }
    
    public final void setDailyWatchedNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNecessaryLiveData() {
        return null;
    }
    
    public final void setNecessaryLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.FlashSaleData> getFlashSaleInfoLiveData() {
        return null;
    }
    
    public final void setFlashSaleInfoLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.FlashSaleData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> isCheckHomePager() {
        return null;
    }
    
    public final void setCheckHomePager(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.String> getMAFLinkLiveData() {
        return null;
    }
    
    public final void setMAFLinkLiveData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMPaymentFailurePopupNum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.PayFailFeedbackData> getMPayFailFeedbackDataLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMInviteTokenFromLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMFCMTokenLiveData() {
        return null;
    }
}