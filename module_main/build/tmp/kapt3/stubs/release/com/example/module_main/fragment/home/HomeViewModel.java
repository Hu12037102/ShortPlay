package com.example.module_main.fragment.home;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/23
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020 J\u0006\u00107\u001a\u000205J\b\u00108\u001a\u000205H\u0002J\u0010\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0002J\u001e\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002J\u0006\u0010?\u001a\u000205J\u0006\u0010@\u001a\u000205J\u000e\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020CJ\u000e\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020$J\u0010\u0010F\u001a\u0002052\b\b\u0002\u0010G\u001a\u00020\u0014J\u0018\u0010H\u001a\u0002052\u0006\u0010I\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020CH\u0002J\u0010\u0010K\u001a\u0002052\u0006\u0010I\u001a\u00020\u001aH\u0002J\u000e\u0010L\u001a\u0002052\u0006\u0010:\u001a\u00020\u0010Jl\u0010M\u001a\u0002052\b\b\u0002\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020P2!\u0010Q\u001a\u001d\u0012\u0013\u0012\u00110S\u00a2\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(V\u0012\u0004\u0012\u0002050R2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002050X2!\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110 \u00a2\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002050RR(\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\bR\u001a\u0010&\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020 X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\b\u00a8\u0006Z"}, d2 = {"Lcom/example/module_main/fragment/home/HomeViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "coinsSubData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "getCoinsSubData", "()Landroidx/lifecycle/MutableLiveData;", "setCoinsSubData", "(Landroidx/lifecycle/MutableLiveData;)V", "coinsSubscriptionDetailsLiveData", "Lcom/example/lib_http/bean/data/CoinsSubscriptionClaimData;", "getCoinsSubscriptionDetailsLiveData", "setCoinsSubscriptionDetailsLiveData", "homeLiveData", "Lcom/example/lib_http/bean/data/HomeData;", "getHomeLiveData", "setHomeLiveData", "isRefresh", "", "()Z", "setRefresh", "(Z)V", "mDequeue", "Lkotlin/collections/ArrayDeque;", "Lcom/example/lib_common/db/UserPayData;", "getMDequeue", "()Lkotlin/collections/ArrayDeque;", "setMDequeue", "(Lkotlin/collections/ArrayDeque;)V", "mInitPage", "", "getMInitPage", "()I", "mNewPlayReminderLiveData", "Lcom/example/lib_http/bean/data/HomeData$Column$DramaSeries;", "getMNewPlayReminderLiveData", "mPage", "getMPage", "setMPage", "(I)V", "mPagerSize", "mRecommendErrorLiveData", "", "getMRecommendErrorLiveData", "mRecommendLiveData", "Lcom/example/lib_http/bean/data/HomeRecommendData;", "getMRecommendLiveData", "mTrendingTypeData", "Lcom/example/lib_http/bean/data/HomeTrendingPageData;", "getMTrendingTypeData", "coinsSubscriptionClaim", "", "productType", "coinsSubscriptionDetails", "dequeList", "getHomeData", "data", "getWatching", "his", "", "Lcom/example/lib_http/bean/data/MyListData$HistoryData;", "googleVerifyToken", "loadRecommendData", "loadTrendTypeList", "type", "", "newPlayReminder", "seriesEntity", "requestHome", "isShowDialog", "requestPayValidation", "userPayData", "token", "requestSQLPayData", "requestWatching", "startCountDownByTime", "time", "interval", "", "start", "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "scop", "end", "Lkotlin/Function0;", "next", "module_main_release"})
public final class HomeViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeData> homeLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> coinsSubscriptionDetailsLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData>> coinsSubData;
    private final int mInitPage = 2;
    private int mPage;
    private final int mPagerSize = 6;
    private boolean isRefresh = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeRecommendData> mRecommendLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> mRecommendErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeTrendingPageData> mTrendingTypeData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeData.Column.DramaSeries> mNewPlayReminderLiveData = null;
    
    /**
     * google支付确认
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.collections.ArrayDeque<com.example.lib_common.db.UserPayData> mDequeue;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeData> getHomeLiveData() {
        return null;
    }
    
    public final void setHomeLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> getCoinsSubscriptionDetailsLiveData() {
        return null;
    }
    
    public final void setCoinsSubscriptionDetailsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData>> getCoinsSubData() {
        return null;
    }
    
    public final void setCoinsSubData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData>> p0) {
    }
    
    public final int getMInitPage() {
        return 0;
    }
    
    public final int getMPage() {
        return 0;
    }
    
    public final void setMPage(int p0) {
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final void setRefresh(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeRecommendData> getMRecommendLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getMRecommendErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeTrendingPageData> getMTrendingTypeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.HomeData.Column.DramaSeries> getMNewPlayReminderLiveData() {
        return null;
    }
    
    /**
     * 请求首页数据
     */
    public final void requestHome(boolean isShowDialog) {
    }
    
    /**
     * 订阅每日签到
     */
    public final void coinsSubscriptionDetails() {
    }
    
    /**
     * 订阅每日签到
     */
    public final void coinsSubscriptionClaim(int productType) {
    }
    
    /**
     * 获取历史记录
     */
    public final void requestWatching(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData data) {
    }
    
    private final com.example.lib_http.bean.data.HomeData getHomeData(com.example.lib_http.bean.data.HomeData data) {
        return null;
    }
    
    private final com.example.lib_http.bean.data.HomeData getWatching(com.example.lib_http.bean.data.HomeData data, java.util.List<com.example.lib_http.bean.data.MyListData.HistoryData> his) {
        return null;
    }
    
    public final void loadRecommendData() {
    }
    
    /**
     * <<<<<<< HEAD
     * 倒计时
     */
    public final void startCountDownByTime(int time, long interval, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, kotlin.Unit> start, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> end, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> next) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.collections.ArrayDeque<com.example.lib_common.db.UserPayData> getMDequeue() {
        return null;
    }
    
    public final void setMDequeue(@org.jetbrains.annotations.Nullable()
    kotlin.collections.ArrayDeque<com.example.lib_common.db.UserPayData> p0) {
    }
    
    public final void googleVerifyToken() {
    }
    
    private final void requestSQLPayData(com.example.lib_common.db.UserPayData userPayData) {
    }
    
    private final void requestPayValidation(com.example.lib_common.db.UserPayData userPayData, java.lang.String token) {
    }
    
    /**
     * 每次取第一个，并且删除
     */
    private final void dequeList() {
    }
    
    public final void loadTrendTypeList(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void newPlayReminder(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.HomeData.Column.DramaSeries seriesEntity) {
    }
}