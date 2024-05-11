package com.example.module_play.vm;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/22
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\'J\u000e\u0010k\u001a\u00020i2\u0006\u0010l\u001a\u00020\u0013J\u0010\u0010m\u001a\u00020i2\u0006\u0010j\u001a\u00020\'H\u0002J\u0010\u0010n\u001a\u00020i2\u0006\u0010j\u001a\u00020\'H\u0002J\u000e\u0010o\u001a\u00020i2\u0006\u0010p\u001a\u00020\'J\u0018\u0010q\u001a\u00020i2\u0006\u0010p\u001a\u00020\'2\b\b\u0002\u0010r\u001a\u00020\u0013J&\u0010s\u001a\u00020i2\u0006\u0010t\u001a\u00020[2\u0006\u0010j\u001a\u00020\'2\u0006\u0010&\u001a\u00020\'2\u0006\u0010u\u001a\u00020[J\u0006\u0010v\u001a\u00020iJ\u0006\u0010w\u001a\u00020iJ\u0010\u0010x\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\'H\u0002J\u000e\u0010y\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\'J\u000e\u0010z\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\'J\u000e\u0010{\u001a\u00020i2\u0006\u0010|\u001a\u00020}J\b\u0010~\u001a\u00020iH\u0014JC\u0010\u007f\u001a\u00020i2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010[2\u0006\u0010u\u001a\u00020[2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\'2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\'2\u0007\u0010\u0083\u0001\u001a\u00020[2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010[J\u0018\u0010\u0085\u0001\u001a\u00020i2\u0006\u0010j\u001a\u00020\'2\u0007\u0010\u0086\u0001\u001a\u00020\u0013J\u0006\u0010K\u001a\u00020iJ\u001c\u0010\u0087\u0001\u001a\u00020i2\b\b\u0002\u0010j\u001a\u00020\'2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\'J\u001b\u0010\u0088\u0001\u001a\u00020i2\u0007\u0010\u0089\u0001\u001a\u00020\u00132\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0013J\u0011\u0010\u008b\u0001\u001a\u00020i2\b\u0010 \u001a\u0004\u0018\u00010!J\u001d\u0010\u008c\u0001\u001a\u00020i2\b\b\u0002\u0010r\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\u008d\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020\u0013J\u001b\u0010\u008f\u0001\u001a\u00020\u00132\u0007\u0010\u0090\u0001\u001a\u00020\'2\t\b\u0002\u0010\u0091\u0001\u001a\u00020\'J%\u0010T\u001a\u00020i2\u0007\u0010\u0092\u0001\u001a\u00020\'2\t\b\u0002\u0010\u0093\u0001\u001a\u00020\'2\t\b\u0002\u0010\u0094\u0001\u001a\u00020\'J\u000f\u0010^\u001a\u00020i2\u0007\u0010\u0082\u0001\u001a\u00020\'R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR \u0010*\u001a\b\u0012\u0004\u0012\u00020\'0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR \u0010-\u001a\b\u0012\u0004\u0012\u00020\'0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R \u00100\u001a\b\u0012\u0004\u0012\u0002010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b2\u0010\u0017R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0015R \u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R \u0010<\u001a\b\u0012\u0004\u0012\u00020\'0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R \u0010?\u001a\b\u0012\u0004\u0012\u00020\'0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010\u0017R\u000e\u0010B\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010C\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002040Dj\b\u0012\u0004\u0012\u000204`E0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0015\"\u0004\bJ\u0010\u0017R \u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR \u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0007\"\u0004\bR\u0010\tR\u000e\u0010S\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010T\u001a\b\u0012\u0004\u0012\u00020\'0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\tR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0015\"\u0004\bY\u0010\u0017R\"\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0007\"\u0004\b]\u0010\tR\"\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\tR \u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010\u0017R \u0010e\u001a\b\u0012\u0004\u0012\u00020\'0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0007\"\u0004\bg\u0010\t\u00a8\u0006\u0095\u0001"}, d2 = {"Lcom/example/module_play/vm/PlayViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "advertisement", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/ActivityDetailsData$AdsMonetization;", "getAdvertisement", "()Landroidx/lifecycle/MutableLiveData;", "setAdvertisement", "(Landroidx/lifecycle/MutableLiveData;)V", "balanceLiveData", "Lcom/example/lib_http/bean/data/BalanceData;", "getBalanceLiveData", "buyDetailsLiveData", "Lcom/example/lib_http/bean/data/StoreData;", "getBuyDetailsLiveData", "setBuyDetailsLiveData", "callbackEpisode", "Lcom/example/lib_base/event/SingleLiveEvent;", "", "getCallbackEpisode", "()Lcom/example/lib_base/event/SingleLiveEvent;", "setCallbackEpisode", "(Lcom/example/lib_base/event/SingleLiveEvent;)V", "coinsSubData", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "getCoinsSubData", "setCoinsSubData", "coinsSubscriptionDetailsLiveData", "Lcom/example/lib_http/bean/data/CoinsSubscriptionClaimData;", "getCoinsSubscriptionDetailsLiveData", "setCoinsSubscriptionDetailsLiveData", "context", "Landroid/content/Context;", "currentSeek", "", "getCurrentSeek", "setCurrentSeek", "dramaSeriesId", "", "getDramaSeriesId", "setDramaSeriesId", "episodeNumber", "getEpisodeNumber", "setEpisodeNumber", "goldPurchase", "getGoldPurchase", "setGoldPurchase", "isPurchasedLiveData", "Lcom/example/module_play/bean/PurchasedBean;", "setPurchasedLiveData", "isPurchasedLiveData2", "Lcom/example/lib_http/bean/data/PlayBeanData;", "isUserInputEnabled", "setUserInputEnabled", "job", "Lkotlinx/coroutines/Job;", "mSpecialAwardLiveData", "Lcom/example/lib_http/bean/data/SpecialAwardResultData;", "getMSpecialAwardLiveData", "nextPlay", "getNextPlay", "setNextPlay", "nextPlayCache", "getNextPlayCache", "setNextPlayCache", "page", "playData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getPlayData", "setPlayData", "rechargeLiveData", "getRechargeLiveData", "setRechargeLiveData", "refreshState", "Lcom/example/lib_http/bean/data/DetailsData;", "getRefreshState", "setRefreshState", "requestAdvertisement", "Lcom/example/lib_http/bean/data/DramaPlayAdsData;", "getRequestAdvertisement", "setRequestAdvertisement", "requestNum", "requestPlayBackHis", "getRequestPlayBackHis", "setRequestPlayBackHis", "returnActivity", "getReturnActivity", "setReturnActivity", "shareDrama", "", "getShareDrama", "setShareDrama", "startAdsMonetization", "getStartAdsMonetization", "setStartAdsMonetization", "sumLiveData", "Lcom/example/lib_http/bean/data/PlaySumData;", "getSumLiveData", "setSumLiveData", "updateData", "getUpdateData", "setUpdateData", "adsMonetization", "", "currentEpisodes", "autoLockDrama", "is_auto_unlock", "changState", "changStateAll", "coinsSubscriptionClaim", "productType", "coinsSubscriptionDetails", "isShowDialog", "dramaSeries", "orderID", "purchaseToken", "episodeUpdateAddPush", "inviteFriend", "isLast", "isStartCharge", "lastFreeEpisode", "loadSpecialAward", "entity", "Lcom/example/lib_http/bean/data/SpecialAwardRequestData;", "onCleared", "payStore", "order_id", "drama_series_id", "episode_number", "productId", "purchaseOrder", "purchaseUnlock", "isPager", "requestBuyDetails", "requestCollect", "isCancel", "isDetached", "requestContext", "requestForYou", "requestGive", "is_cancel", "requestPagerData", "position", "isUpdate", "progress_type", "playFrom", "pushId", "module_play_release"})
public final class PlayViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.PlayBeanData> isPurchasedLiveData2 = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> currentSeek;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.PlayBeanData>> playData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> updateData;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> nextPlay;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> rechargeLiveData;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> goldPurchase;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> nextPlayCache;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> callbackEpisode;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> isUserInputEnabled;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> returnActivity;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.PlaySumData> sumLiveData;
    @org.jetbrains.annotations.NotNull()
    private com.example.lib_base.event.SingleLiveEvent<com.example.module_play.bean.PurchasedBean> isPurchasedLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreData> buyDetailsLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> balanceLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> dramaSeriesId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> episodeNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> shareDrama;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> requestPlayBackHis;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization> advertisement;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.DramaPlayAdsData> requestAdvertisement;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> startAdsMonetization;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.DetailsData> refreshState;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.SpecialAwardResultData> mSpecialAwardLiveData = null;
    private int page = 0;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private android.content.Context context;
    
    /**
     * 播放记录更新
     */
    private kotlinx.coroutines.Job job;
    
    /**
     * 充值
     */
    private int requestNum = 2;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionDetailsData> coinsSubData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.CoinsSubscriptionClaimData> coinsSubscriptionDetailsLiveData;
    
    public PlayViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.PlayBeanData> isPurchasedLiveData2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getCurrentSeek() {
        return null;
    }
    
    public final void setCurrentSeek(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.PlayBeanData>> getPlayData() {
        return null;
    }
    
    public final void setPlayData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.lib_http.bean.data.PlayBeanData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUpdateData() {
        return null;
    }
    
    public final void setUpdateData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> getNextPlay() {
        return null;
    }
    
    public final void setNextPlay(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> getRechargeLiveData() {
        return null;
    }
    
    public final void setRechargeLiveData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> getGoldPurchase() {
        return null;
    }
    
    public final void setGoldPurchase(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> getNextPlayCache() {
        return null;
    }
    
    public final void setNextPlayCache(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> getCallbackEpisode() {
        return null;
    }
    
    public final void setCallbackEpisode(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> isUserInputEnabled() {
        return null;
    }
    
    public final void setUserInputEnabled(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> getReturnActivity() {
        return null;
    }
    
    public final void setReturnActivity(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.PlaySumData> getSumLiveData() {
        return null;
    }
    
    public final void setSumLiveData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<com.example.lib_http.bean.data.PlaySumData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_base.event.SingleLiveEvent<com.example.module_play.bean.PurchasedBean> isPurchasedLiveData() {
        return null;
    }
    
    public final void setPurchasedLiveData(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.event.SingleLiveEvent<com.example.module_play.bean.PurchasedBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreData> getBuyDetailsLiveData() {
        return null;
    }
    
    public final void setBuyDetailsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.StoreData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.BalanceData> getBalanceLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDramaSeriesId() {
        return null;
    }
    
    public final void setDramaSeriesId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getEpisodeNumber() {
        return null;
    }
    
    public final void setEpisodeNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShareDrama() {
        return null;
    }
    
    public final void setShareDrama(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRequestPlayBackHis() {
        return null;
    }
    
    public final void setRequestPlayBackHis(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization> getAdvertisement() {
        return null;
    }
    
    public final void setAdvertisement(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.DramaPlayAdsData> getRequestAdvertisement() {
        return null;
    }
    
    public final void setRequestAdvertisement(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.DramaPlayAdsData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStartAdsMonetization() {
        return null;
    }
    
    public final void setStartAdsMonetization(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.DetailsData> getRefreshState() {
        return null;
    }
    
    public final void setRefreshState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.DetailsData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.SpecialAwardResultData> getMSpecialAwardLiveData() {
        return null;
    }
    
    public final void requestContext(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    /**
     * 请求分页数据
     */
    public final boolean requestPagerData(int position, int isUpdate) {
        return false;
    }
    
    /**
     * 请求foryou数据
     */
    public final void requestForYou(boolean isShowDialog, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    /**
     * 更新剧集自动解锁
     */
    public final void autoLockDrama(boolean is_auto_unlock) {
    }
    
    /**
     * 点赞
     */
    public final void requestGive(boolean is_cancel) {
    }
    
    /**
     * 收藏
     */
    public final void requestCollect(boolean isCancel, boolean isDetached) {
    }
    
    /**
     * 快速购买详情
     */
    public final void requestBuyDetails(int currentEpisodes, int drama_series_id) {
    }
    
    public final void requestPlayBackHis(int progress_type, int playFrom, int pushId) {
    }
    
    /**
     * 记录开始观看
     */
    public final void startAdsMonetization(int episode_number) {
    }
    
    /**
     * 邀请好友
     */
    public final void inviteFriend() {
    }
    
    /**
     * 默认购买单集
     */
    public final void purchaseUnlock(int currentEpisodes, boolean isPager) {
    }
    
    public final void payStore(@org.jetbrains.annotations.Nullable()
    java.lang.String order_id, @org.jetbrains.annotations.NotNull()
    java.lang.String purchaseToken, int drama_series_id, int episode_number, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseOrder) {
    }
    
    /**
     * 整剧购买
     */
    public final void dramaSeries(@org.jetbrains.annotations.NotNull()
    java.lang.String orderID, int currentEpisodes, int dramaSeriesId, @org.jetbrains.annotations.NotNull()
    java.lang.String purchaseToken) {
    }
    
    /**
     * 广告播放完成
     */
    public final void adsMonetization(int currentEpisodes) {
    }
    
    /**
     * 解锁当前currentEpisodes
     */
    private final void changState(int currentEpisodes) {
    }
    
    /**
     * 是否最后一集
     */
    private final boolean isLast(int currentEpisodes) {
        return false;
    }
    
    /**
     * 用户每新解锁一部剧的付费集数
     */
    public final boolean isStartCharge(int currentEpisodes) {
        return false;
    }
    
    /**
     * 用户看完免费集数的最后一集
     */
    public final boolean lastFreeEpisode(int currentEpisodes) {
        return false;
    }
    
    /**
     * 解锁ALl
     */
    private final void changStateAll(int currentEpisodes) {
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
    
    public final void refreshState() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void loadSpecialAward(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.SpecialAwardRequestData entity) {
    }
    
    public final void episodeUpdateAddPush() {
    }
}