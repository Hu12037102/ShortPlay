package com.example.lib_common.vm;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/6
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020&J4\u0010)\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u001fH\u0002J2\u0010/\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001fH\u0002J \u00100\u001a\u00020&2\f\u00101\u001a\b\u0012\u0004\u0012\u00020-022\b\b\u0002\u00103\u001a\u00020\u000eH\u0002J\u0006\u00104\u001a\u00020&J(\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010-J\u0014\u0010:\u001a\u00020&2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<02J\b\u0010=\u001a\u00020&H\u0002JD\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020-2\u0006\u00109\u001a\u00020-2\b\b\u0002\u0010@\u001a\u00020\u001f2\b\b\u0002\u0010A\u001a\u00020\u001f2\u0006\u00106\u001a\u00020-2\b\u0010B\u001a\u0004\u0018\u00010-2\u0006\u0010C\u001a\u00020\u001fJ\b\u0010D\u001a\u00020&H\u0004J\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020&J\u001e\u0010K\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u001fJ\"\u0010N\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u001fH\u0002J\u0006\u0010O\u001a\u00020&J`\u0010P\u001a\u00020&2\u0006\u0010Q\u001a\u00020\u001f2\b\b\u0002\u0010R\u001a\u00020\u001f2\u0006\u00106\u001a\u00020-2\u0006\u0010S\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020-2\b\b\u0002\u0010\'\u001a\u00020\u001f2\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010C\u001a\u00020\u001f2\b\b\u0002\u0010V\u001a\u00020\u001fJ\u0018\u0010W\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0002J6\u0010X\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020\u001f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\u001fJ:\u0010Y\u001a\u00020&2\u0006\u0010Z\u001a\u00020-2\u0006\u00108\u001a\u00020\u001f2\b\u00109\u001a\u0004\u0018\u00010-2\u0006\u00106\u001a\u00020-2\u0006\u0010C\u001a\u00020\u001f2\b\u0010[\u001a\u0004\u0018\u00010-J\u0006\u0010\\\u001a\u00020&J\u001e\u0010]\u001a\u00020&2\u0014\b\u0002\u0010^\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020`0_H\u0002J\u0006\u0010a\u001a\u00020&J\u000e\u0010b\u001a\u00020&2\u0006\u0010c\u001a\u00020dJ8\u0010e\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020f022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010+\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0002J*\u0010g\u001a\u00020&2\u0006\u00107\u001a\u00020-2\u0006\u0010h\u001a\u00020\u001f2\b\u0010[\u001a\u0004\u0018\u00010-2\u0006\u00108\u001a\u00020\u001fH\u0002J\u000e\u0010i\u001a\u00020&2\u0006\u0010j\u001a\u00020\u0015J\u001c\u0010k\u001a\u00020&2\u0014\b\u0002\u0010^\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020`0_R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010$\u00a8\u0006l"}, d2 = {"Lcom/example/lib_common/vm/CommonViewModel;", "Lcom/example/lib_base/vm/BaseViewModel;", "()V", "mCloseRecommendEpisodeLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getMCloseRecommendEpisodeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mDeleteAccountFailLiveData", "Lcom/example/lib_http/request/error/AppException;", "getMDeleteAccountFailLiveData", "mDeleteAccountLiveData", "getMDeleteAccountLiveData", "mPayFailLiveData", "", "getMPayFailLiveData", "mRecommendReportLiveData", "getMRecommendReportLiveData", "mRequestErrorLiveData", "getMRequestErrorLiveData", "mUpdateTiktokRemindersLiveData", "Lcom/example/lib_http/bean/data/SearchInfoData$TiktokVideoDict;", "getMUpdateTiktokRemindersLiveData", "playLiveData", "Lcom/example/lib_base/event/SingleLiveEvent;", "Lcom/example/lib_http/bean/data/BalanceData;", "getPlayLiveData", "()Lcom/example/lib_base/event/SingleLiveEvent;", "setPlayLiveData", "(Lcom/example/lib_base/event/SingleLiveEvent;)V", "requestNum", "", "storeInitializeLiveData", "Lcom/example/lib_http/bean/data/StoreInitialize;", "getStoreInitializeLiveData", "setStoreInitializeLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "closeRecommendEpisode", "", "dramaSeriesId", "deleteAccount", "getCachedData", "episodeNumber", "searchDramId", "archivedPath", "", "maxUnlockedEpisode", "getPlayListData", "getPurchases", "productIds", "", "isSub", "loadPayFailFeedbackData", "payErrorEvent", "productId", "orderId", "responseCode", "purchaseToken", "payFailFeedbackSubmit", "data", "Lcom/example/lib_http/bean/data/PayFailFeedbackData$Option;", "payFailUpdate", "payStoreValidation", "order_id", "drama_series_id", "episode_number", "purchaseOrder", "eventType", "paySucceedUpdate", "playPagerData", "Lcom/example/lib_http/bean/data/PlayBeanData;", "playBeanData", "item", "Lcom/example/lib_http/bean/data/PlayBeanInfo$Episode;", "productIdList", "recommendReport", "sceneType", "triggerType", "requestData", "requestFlash", "requestInitialize", "transactionType", "type", "productType", "currency", "formattedPrice", "purchaseScenario", "requestPlay", "requestPlayData", "requestStatus", "requestOrderId", "zbb", "requestUserGoogleLogin", "requestUserInfo", "map", "", "Lokhttp3/RequestBody;", "requestUserReconnect", "saveUserInfo", "it", "Lcom/example/lib_http/bean/data/UserInfoData;", "setPlayData", "Lcom/example/lib_http/bean/data/PlayUrlData$Data;", "transactionStatusUpdate", "transactionStatus", "updateTiktokReminders", "entity", "userLogin", "lib_common_release"})
public class CommonViewModel extends com.example.lib_base.vm.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.BalanceData> playLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreInitialize> storeInitializeLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> mCloseRecommendEpisodeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> mDeleteAccountLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.request.error.AppException> mDeleteAccountFailLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.request.error.AppException> mRequestErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mPayFailLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> mRecommendReportLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.SearchInfoData.TiktokVideoDict> mUpdateTiktokRemindersLiveData = null;
    
    /**
     * 交易验证
     */
    private int requestNum = 2;
    
    public CommonViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.BalanceData> getPlayLiveData() {
        return null;
    }
    
    public final void setPlayLiveData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.BalanceData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreInitialize> getStoreInitializeLiveData() {
        return null;
    }
    
    public final void setStoreInitializeLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreInitialize> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getMCloseRecommendEpisodeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getMDeleteAccountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.request.error.AppException> getMDeleteAccountFailLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.request.error.AppException> getMRequestErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMPayFailLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getMRecommendReportLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.SearchInfoData.TiktokVideoDict> getMUpdateTiktokRemindersLiveData() {
        return null;
    }
    
    /**
     * 用户信息获取
     */
    private final void requestUserInfo(java.util.Map<java.lang.String, okhttp3.RequestBody> map) {
    }
    
    /**
     * 保存用户数据
     */
    public final void saveUserInfo(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.UserInfoData it) {
    }
    
    /**
     * 判断用哪种方式获取播放数据
     */
    public final void requestPlayData(int dramaSeriesId, int episodeNumber, int searchDramId, @org.jetbrains.annotations.Nullable()
    java.lang.String archivedPath, int maxUnlockedEpisode) {
    }
    
    private final void getCachedData(int dramaSeriesId, int episodeNumber, int searchDramId, java.lang.String archivedPath, int maxUnlockedEpisode) {
    }
    
    /**
     * 获取播放数据
     */
    private final void getPlayListData(int dramaSeriesId, int episodeNumber, int searchDramId, java.lang.String archivedPath, int maxUnlockedEpisode) {
    }
    
    private final void setPlayData(int dramaSeriesId, java.util.List<com.example.lib_http.bean.data.PlayUrlData.Data> data, java.lang.String archivedPath, int searchDramId, int maxUnlockedEpisode) {
    }
    
    private final void requestPlay(int dramaSeriesId, int searchDramId) {
    }
    
    /**
     * 子剧集请求分页数据
     */
    private final void requestData(int dramaSeriesId, int episodeNumber, int searchDramId) {
    }
    
    /**
     * 获取闪购数据
     */
    public final void requestFlash() {
    }
    
    /**
     * 游客登录过期
     */
    public final void requestUserReconnect() {
    }
    
    /**
     * 第三方登录过期
     */
    public final void requestUserGoogleLogin() {
    }
    
    /**
     * 获取商品信息
     */
    public final void productIdList() {
    }
    
    private final void getPurchases(java.util.List<java.lang.String> productIds, boolean isSub) {
    }
    
    private final void payFailUpdate() {
    }
    
    protected final void paySucceedUpdate() {
    }
    
    /**
     * 失败请求
     */
    public final void requestStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String requestOrderId, int responseCode, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseToken, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, int eventType, @org.jetbrains.annotations.Nullable()
    java.lang.String zbb) {
    }
    
    /**
     * 支付异常上报
     */
    public final void payErrorEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String responseCode, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseToken) {
    }
    
    /**
     * 交易状态修改
     */
    private final void transactionStatusUpdate(java.lang.String orderId, int transactionStatus, java.lang.String zbb, int responseCode) {
    }
    
    public final void payStoreValidation(@org.jetbrains.annotations.NotNull()
    java.lang.String order_id, @org.jetbrains.annotations.NotNull()
    java.lang.String purchaseToken, int drama_series_id, int episode_number, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseOrder, int eventType) {
    }
    
    /**
     * 交易初始化
     */
    public final void requestInitialize(int transactionType, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, int productType, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String formattedPrice, int dramaSeriesId, int episodeNumber, int eventType, int purchaseScenario) {
    }
    
    /**
     * 登录
     */
    public final void userLogin(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, okhttp3.RequestBody> map) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_http.bean.data.PlayBeanData playPagerData(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayBeanData playBeanData, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayBeanInfo.Episode item) {
        return null;
    }
    
    public final void closeRecommendEpisode(int dramaSeriesId) {
    }
    
    public final void deleteAccount() {
    }
    
    public final void loadPayFailFeedbackData() {
    }
    
    public final void payFailFeedbackSubmit(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_http.bean.data.PayFailFeedbackData.Option> data) {
    }
    
    /**
     * @param dramaSeriesId 剧情id
     * @param sceneType 场景类型：
     * SCENE_INDEX_POP_UP = 1 # 首页弹窗
     * SCENE_MY_LIST_POP_UP = 2 # My List 弹窗
     * SCENE_PLAYER_POP_UP = 3 # 播放器弹窗
     * SCENE_COUNTDOWN_PLAYBACK_POP_UP_CPS = 4 # 倒计时播放弹窗_CPS
     * SCENE_COUNTDOWN_PLAYBACK_POP_UP_FB_AD = 5 # 倒计时播放弹窗_FB_AD
     * SCENE_COUNTDOWN_PLAYBACK_POP_UP_IOS_CONFIG = 6 # 倒计时播放弹窗_iOS后台配置
     * @param triggerType 触发类型：
     * TRIGGER_POP_UP = 1 # 弹窗弹出
     * TRIGGER_CLICK_PLAY = 2 # 点击播放
     */
    public final void recommendReport(int dramaSeriesId, int sceneType, int triggerType) {
    }
    
    public final void updateTiktokReminders(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.SearchInfoData.TiktokVideoDict entity) {
    }
}