package com.example.module_play.ui.play;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/9/22
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/forYou/PlayActivity2")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0018\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020!H\u0016J\b\u0010\'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\nH\u0016J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0002J\u0012\u00105\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u00020!H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\nH\u0016J\u0012\u00109\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u0010:\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010\u001b\u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020\nH\u0016J\u0012\u0010?\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u0010@\u001a\u00020!H\u0014J\u0006\u0010A\u001a\u00020!J\u0010\u0010B\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u0010\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020!H\u0014J\b\u0010G\u001a\u00020!H\u0014J\u001f\u0010H\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0002\u0010JJ\u0018\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020M2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u0010\u0010N\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u0010\u0010O\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020\u0007H\u0002J\b\u0010R\u001a\u00020!H\u0002J\u0010\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020\nH\u0016J\u0010\u0010U\u001a\u00020!2\u0006\u0010T\u001a\u00020\nH\u0016J\u0018\u0010V\u001a\u00020!2\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002J\b\u0010Y\u001a\u00020!H\u0016J\u0012\u0010Z\u001a\u00020!2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0002J\u0010\u0010]\u001a\u00020!2\u0006\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020!2\u0006\u0010a\u001a\u00020bH\u0002J\b\u0010c\u001a\u00020!H\u0016J\u0010\u0010d\u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006e"}, d2 = {"Lcom/example/module_play/ui/play/PlayActivity2;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_play/vm/PlayViewModel;", "Lcom/example/module_play/databinding/PlayActivityAliplayBinding;", "Lcom/example/module_play/ui/listentr/PlayerViewClickListener;", "()V", "currentEpisodes", "", "currentStart", "isAdPlay", "", "isFirst", "isShowFlash", "job", "Lkotlinx/coroutines/Job;", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "<set-?>", "mPlayFrom", "getMPlayFrom$module_play_debug", "()I", "mPushId", "getMPushId$module_play_debug", "mRequestSpecialAward", "Lcom/example/lib_http/bean/data/SpecialAwardRequestData;", "missTime", "", "monthDialog", "Lcom/example/lib_common/dialog/MonthNewSubDialog;", "totalTime", "weekDiaLog", "Lcom/example/lib_common/dialog/WeekNewSubDialog;", "adPop", "", "addCallback", "advertisement", "viewed", "total", "createObserver", "dismissLoading", "dismissLoadingDialog", "finishAll", "flashPlay", "getRedirectUrl", "position", "isPurchase", "init", "savedInstanceState", "Landroid/os/Bundle;", "initFCMPushData", "initNotificationData", "initPlayFromData", "initSpecialAward", "initView", "inviteFriend", "isAutoLock", "isLock", "listener", "loadData", "data", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "nestedScrollingEnabled", "isScroll", "onCreate", "onDestroy", "onDetachedView", "onItemClick", "onNetworkStateChanged", "netState", "Lcom/example/lib_base/network/NetState;", "onPause", "onResume", "onSeek", "seekPosition", "(ILjava/lang/Long;)V", "onViewDetachedFromWindow", "holder", "Lcom/example/module_play/aliplayer/auivideolistcommon/adapter/AUIVideoListViewHolder;", "playPagerData", "purchaseUnlock", "recordHis", "progressType", "requestAdsMonetization", "requestCollect", "is_cancel", "requestGive", "showAdvertisement", "residueNumber", "maxDailyWatchedNumber", "showLoading", "showLoadingDialog", "string", "", "showRecommendEpisodeDialog", "dramaEntity", "Lcom/example/lib_http/bean/data/RecommendEpisodeData$Details;", "showSpecialAward", "entity", "Lcom/example/lib_http/bean/data/SpecialAwardResultData;", "showViewEpisode", "weekDialog", "module_play_debug"})
public final class PlayActivity2 extends com.example.lib_base.activity.BaseActivity<com.example.module_play.vm.PlayViewModel, com.example.module_play.databinding.PlayActivityAliplayBinding> implements com.example.module_play.ui.listentr.PlayerViewClickListener {
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    private kotlinx.coroutines.Job job;
    private int currentStart = -1;
    private boolean isFirst = true;
    private boolean isAdPlay = false;
    private int currentEpisodes = 0;
    private boolean isShowFlash = false;
    private com.example.lib_http.bean.data.SpecialAwardRequestData mRequestSpecialAward;
    private com.example.lib_common.dialog.MonthNewSubDialog monthDialog;
    private com.example.lib_common.dialog.WeekNewSubDialog weekDiaLog;
    private int mPlayFrom = 0;
    private int mPushId = 0;
    private long missTime = 500L;
    private long totalTime = 7000L;
    
    public PlayActivity2() {
        super();
    }
    
    public final int getMPlayFrom$module_play_debug() {
        return 0;
    }
    
    public final int getMPushId$module_play_debug() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void initFCMPushData() {
    }
    
    private final void initNotificationData() {
    }
    
    private final void initPlayFromData() {
    }
    
    private final void initSpecialAward() {
    }
    
    @java.lang.Override()
    public void onNetworkStateChanged(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.network.NetState netState) {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    /**
     * monthNew订阅成功后弹窗
     */
    private final void monthDialog(com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
    }
    
    /**
     * weekNew订阅成功后弹窗
     */
    private final void weekDialog(com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
    }
    
    /**
     * 广告逻辑
     */
    private final void showAdvertisement(int residueNumber, int maxDailyWatchedNumber) {
    }
    
    /**
     * 广告弹窗
     */
    private final void advertisement(int viewed, int total) {
    }
    
    private final void showLoadingDialog(java.lang.String string) {
    }
    
    private final void dismissLoadingDialog() {
    }
    
    /**
     * 记录历史
     */
    private final void recordHis(int progressType) {
    }
    
    private final void requestAdsMonetization() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void onDetachedView() {
    }
    
    private final void finishAll() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    @java.lang.Override()
    public void requestGive(boolean is_cancel) {
    }
    
    @java.lang.Override()
    public void requestCollect(boolean is_cancel) {
    }
    
    @java.lang.Override()
    public void inviteFriend() {
    }
    
    @java.lang.Override()
    public void nestedScrollingEnabled(boolean isScroll) {
    }
    
    @java.lang.Override()
    public void purchaseUnlock(int currentEpisodes) {
    }
    
    @java.lang.Override()
    public void getRedirectUrl(int position, boolean isPurchase) {
    }
    
    @java.lang.Override()
    public void onSeek(int position, @org.jetbrains.annotations.Nullable()
    java.lang.Long seekPosition) {
    }
    
    @java.lang.Override()
    public void playPagerData(int position) {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
    
    @java.lang.Override()
    public void addCallback() {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.example.module_play.aliplayer.auivideolistcommon.adapter.AUIVideoListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void isAutoLock(boolean isLock) {
    }
    
    @java.lang.Override()
    public void adPop(int currentEpisodes) {
    }
    
    @java.lang.Override()
    public void showViewEpisode() {
    }
    
    @java.lang.Override()
    public void flashPlay(boolean isShowFlash) {
    }
    
    private final void showRecommendEpisodeDialog(com.example.lib_http.bean.data.RecommendEpisodeData.Details dramaEntity) {
    }
    
    private final void showSpecialAward(com.example.lib_http.bean.data.SpecialAwardResultData entity) {
    }
}