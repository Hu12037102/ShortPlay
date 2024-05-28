package com.example.module_play.views;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/22
 *  充值
 */
@kotlin.Suppress(names = {"DEPRECATION", "CAST_NEVER_SUCCEEDS"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010M\u001a\u00020\u0011H\u0003J\u0006\u0010N\u001a\u00020\u0011J\u0006\u0010O\u001a\u00020\u0011J\b\u0010P\u001a\u0004\u0018\u00010QJ\b\u0010R\u001a\u000200H\u0002J\b\u0010S\u001a\u000200H\u0002J\u0006\u0010T\u001a\u00020\tJ\b\u0010U\u001a\u00020\u0011H\u0002J\u0010\u0010V\u001a\u00020\u00112\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010W\u001a\u00020\u0011H\u0002J\b\u0010X\u001a\u00020\u0011H\u0002J\b\u0010Y\u001a\u00020\u0011H\u0002J\b\u0010Z\u001a\u00020\u0011H\u0003J\b\u0010[\u001a\u00020\u0010H\u0002J\u0006\u0010\\\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020\u0010J(\u0010^\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010a\u001a\u00020bH\u0002J\b\u0010c\u001a\u00020\u0011H\u0002J0\u0010d\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u00142\u0006\u0010f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010g\u001a\u00020\u0014H\u0002J\u0016\u0010h\u001a\u00020\u00112\u0006\u0010i\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\u0014J\u0010\u0010j\u001a\u0004\u0018\u00010\u00142\u0006\u0010_\u001a\u00020\u0014J\u0012\u0010k\u001a\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\u0010\u0010l\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u0014H\u0002J\u0018\u0010n\u001a\u00020\u00112\u0006\u0010o\u001a\u00020\t2\u0006\u0010m\u001a\u00020\u0014H\u0003J\u0006\u0010p\u001a\u00020\u0011J\u0010\u0010q\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u0014H\u0002J\u001a\u0010r\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\u0014\u0010s\u001a\u00020\u00112\f\u0010t\u001a\b\u0012\u0004\u0012\u00020u0JJ5\u0010v\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00142\b\u0010h\u001a\u0004\u0018\u00010\u00142\u0006\u0010w\u001a\u00020\u00142\b\u0010x\u001a\u0004\u0018\u00010\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010yJ8\u0010z\u001a\u00020\u001120\u00108\u001a,\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001109J\u0016\u0010{\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010|\u001a\u00020\tJ\u0010\u0010}\u001a\u00020\u00112\u0006\u0010~\u001a\u00020\tH\u0016J\b\u0010\u007f\u001a\u00020\u0011H\u0002J\t\u0010\u0080\u0001\u001a\u00020\u0011H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u00107\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R:\u00108\u001a.\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/example/module_play/views/PlayRechargeView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Rlcheck", "balanceTv", "Landroid/widget/TextView;", "close", "Lkotlin/Function1;", "", "", "costsNumTv", "currency", "", "currentEpisodeCoin", "currentEpisodes", "discountMoneyTv", "discountTv", "Lcom/ruffian/library/widget/RTextView;", "discountedPrice", "drama_series_id", "entirePrice", "episodeNumTv", "episodeOriginalTv", "includeRechargeAll", "Lcom/ruffian/library/widget/RRelativeLayout;", "includeRechargeEpisode", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "mAtvBonusContent", "Landroidx/appcompat/widget/AppCompatTextView;", "mBannerViewPager", "Landroidx/recyclerview/widget/RecyclerView;", "mHeight", "", "getMHeight", "()F", "setMHeight", "(F)V", "mPosition", "mView", "Landroid/view/View;", "mViewModel", "Lcom/example/module_play/vm/PlayViewModel;", "getMViewModel", "()Lcom/example/module_play/vm/PlayViewModel;", "setMViewModel", "(Lcom/example/module_play/vm/PlayViewModel;)V", "moreTv", "playNow", "Lkotlin/Function6;", "playrechAdapter", "Lcom/example/module_play/adapter/PlayRechargeAdapter;", "rCheckBox", "Landroid/widget/ImageView;", "racharqePlayRv", "rechargeCloseIv", "rechargeDiscount", "rechargeInstantly", "rechargeOnlyTv", "rechargePlayNow", "relativeLayout", "storeData", "Lcom/example/lib_http/bean/data/StoreData;", "subAdapter", "Lcom/example/module_play/adapter/PlaySubAdapter;", "tradeOrder", "", "tryStub", "Landroid/view/ViewStub;", "buyDetailsListen", "closeRechargeAll", "dismissLoading", "getAdsMonetization", "Lcom/example/lib_http/bean/data/ActivityDetailsData$AdsMonetization;", "getHeadSubView", "getHeadView", "getRechargeEpisodeHeight", "includeRechargeAllShow", "includeRechargeData", "includeRechargeEpisodeView", "includeRechargeListener", "initDisposableView", "initView", "isAvailable", "isIncludeRechargeAll", "isIncludeRechargeEpisodeView", "notifyList", "productId", "price", "priceAmountMicros", "", "queryGoogleProductPrice", "requestInitialize", "transactionType", "productType", "packagePrice", "requestOrderId", "orderId", "requestStatusUpdate", "setData", "setDiscountMoney", "money", "setEpisodesOnly", "episodes", "setGong", "setInstantly", "setOnClose", "setOnGoogleCommodity", "productIds", "Lcom/example/lib_http/bean/data/PlayPrice;", "setOnGooglePlayResult", "purchaseToken", "purchaseOrder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPlayNow", "setViewShow", "episodeCoin", "setVisibility", "visibility", "shoLoading", "showRetry", "module_play_debug"})
public final class PlayRechargeView extends android.widget.RelativeLayout {
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    @org.jetbrains.annotations.Nullable()
    private com.example.module_play.vm.PlayViewModel mViewModel;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> close;
    private kotlin.jvm.functions.Function6<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> playNow;
    private android.view.View mView;
    private int currentEpisodes = 0;
    private int currentEpisodeCoin = 0;
    private int drama_series_id = 0;
    private int mPosition = -1;
    private java.util.List<java.lang.Integer> tradeOrder;
    private com.example.lib_http.bean.data.StoreData storeData;
    private java.lang.String currency = "";
    private java.lang.String entirePrice;
    private android.widget.TextView discountMoneyTv;
    private android.widget.TextView rechargeDiscount;
    private android.widget.TextView rechargeOnlyTv;
    private android.widget.TextView rechargeInstantly;
    private com.ruffian.library.widget.RRelativeLayout includeRechargeAll;
    private android.widget.ImageView rechargeCloseIv;
    private com.ruffian.library.widget.RTextView rechargePlayNow;
    private android.widget.TextView balanceTv;
    private android.widget.TextView costsNumTv;
    private com.ruffian.library.widget.RTextView discountTv;
    private android.widget.TextView episodeNumTv;
    private android.widget.TextView moreTv;
    private android.widget.TextView episodeOriginalTv;
    private androidx.recyclerview.widget.RecyclerView mBannerViewPager;
    private android.widget.ImageView rCheckBox;
    private androidx.recyclerview.widget.RecyclerView racharqePlayRv;
    private android.widget.RelativeLayout relativeLayout;
    private com.ruffian.library.widget.RTextView discountedPrice;
    private com.example.module_play.adapter.PlayRechargeAdapter playrechAdapter;
    private com.example.module_play.adapter.PlaySubAdapter subAdapter;
    private com.ruffian.library.widget.RRelativeLayout includeRechargeEpisode;
    private android.widget.RelativeLayout Rlcheck;
    private androidx.appcompat.widget.AppCompatTextView mAtvBonusContent;
    private android.view.ViewStub tryStub;
    private float mHeight = -1.0F;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.module_play.vm.PlayViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.Nullable()
    com.example.module_play.vm.PlayViewModel p0) {
    }
    
    public PlayRechargeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PlayRechargeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams", "MissingInflatedId"})
    public PlayRechargeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyleAttr) {
        super(null);
    }
    
    private final void initDisposableView() {
    }
    
    private final void includeRechargeListener() {
    }
    
    public final void closeRechargeAll() {
    }
    
    private final void includeRechargeData(com.example.lib_http.bean.data.StoreData storeData) {
    }
    
    /**
     * Episodes only
     */
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void setEpisodesOnly(int episodes, java.lang.String money) {
    }
    
    /**
     * Save   instantly！
     */
    private final void setInstantly(java.lang.String money) {
    }
    
    /**
     * 折后 $49.99
     */
    private final void setDiscountMoney(java.lang.String money) {
    }
    
    /**
     * 初始化
     */
    @android.annotation.SuppressLint(value = {"CutPasteId"})
    private final void initView() {
    }
    
    private final android.view.View getHeadView() {
        return null;
    }
    
    private final android.view.View getHeadSubView() {
        return null;
    }
    
    private final void setData(com.example.lib_http.bean.data.StoreData storeData) {
    }
    
    /**
     * 设置商品价格
     */
    private final void queryGoogleProductPrice() {
    }
    
    /**
     * 设置订单ID
     */
    public final void requestOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables", "NotifyDataSetChanged"})
    private final void buyDetailsListen() {
    }
    
    private final void requestInitialize(int transactionType, java.lang.String productId, int productType, java.lang.String currency, java.lang.String packagePrice) {
    }
    
    private final void notifyList(java.lang.String productId, java.lang.String price, java.lang.String currency, long priceAmountMicros) {
    }
    
    private final void showRetry() {
    }
    
    private final boolean isAvailable() {
        return false;
    }
    
    public final void setViewShow(int currentEpisodes, int episodeCoin) {
    }
    
    public final void setOnGoogleCommodity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_http.bean.data.PlayPrice> productIds) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setOnGooglePlayResult(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String requestOrderId, @org.jetbrains.annotations.NotNull()
    java.lang.String purchaseToken, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseOrder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * 获取对应的商品ID的订单ID
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String requestStatusUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
        return null;
    }
    
    private final void shoLoading() {
    }
    
    public final void dismissLoading() {
    }
    
    private final void includeRechargeAllShow() {
    }
    
    private final void includeRechargeEpisodeView() {
    }
    
    public final boolean isIncludeRechargeAll() {
        return false;
    }
    
    public final boolean isIncludeRechargeEpisodeView() {
        return false;
    }
    
    public final void setGong() {
    }
    
    /**
     * 关闭弹窗
     */
    public final void setOnClose(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> close) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.lib_http.bean.data.ActivityDetailsData.AdsMonetization getAdsMonetization() {
        return null;
    }
    
    public final void setPlayNow(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function6<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> playNow) {
    }
    
    public final int getRechargeEpisodeHeight() {
        return 0;
    }
    
    public final float getMHeight() {
        return 0.0F;
    }
    
    public final void setMHeight(float p0) {
    }
    
    @java.lang.Override()
    public void setVisibility(int visibility) {
    }
}