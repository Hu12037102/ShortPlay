package com.example.module_main.ui.wallet;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/1
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/me/MeFragment/WalletActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0014J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0003J\b\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J0\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0002J\b\u00103\u001a\u00020\u0012H\u0016J\u0010\u00104\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/example/module_main/ui/wallet/StoreActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/wallet/StoreViewModel;", "Lcom/example/module_main/databinding/MainActivityStoreBinding;", "()V", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "mAdapter", "Lcom/example/module_main/adapter/WalletAdapter;", "mSubAdapter", "Lcom/example/module_main/adapter/StoreSubAdapter;", "monthDialog", "Lcom/example/lib_common/dialog/MonthNewSubDialog;", "storeData", "Lcom/example/lib_http/bean/data/StoreData;", "weekDiaLog", "Lcom/example/lib_common/dialog/WeekNewSubDialog;", "createObserver", "", "dismissLoading", "dismissLoadingDialog", "init", "savedInstanceState", "Landroid/os/Bundle;", "initView", "listener", "loadData", "data", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "onDestroy", "onResume", "queryGoogleProductPrice", "recommendProduct", "Lcom/example/lib_http/bean/data/StoreData$RecommendProduct;", "requestOrderId", "orderId", "", "productId", "requestStatusUpdate", "restore", "showLoading", "showLoadingDialog", "showNetworkEmpty", "successDialog", "coins", "", "bonus", "expiredDay", "isSubscriptionProduct", "", "productType", "tryAgainClick", "weekDialog", "module_main_debug"})
public final class StoreActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.wallet.StoreViewModel, com.example.module_main.databinding.MainActivityStoreBinding> {
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    private com.example.module_main.adapter.WalletAdapter mAdapter;
    private com.example.lib_http.bean.data.StoreData storeData;
    private com.example.module_main.adapter.StoreSubAdapter mSubAdapter;
    private com.example.lib_common.dialog.MonthNewSubDialog monthDialog;
    private com.example.lib_common.dialog.WeekNewSubDialog weekDiaLog;
    
    public StoreActivity() {
        super();
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
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 获取对应的商品ID的订单ID
     */
    private final java.lang.String requestStatusUpdate(java.lang.String productId) {
        return null;
    }
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    /**
     * 设置订单ID
     */
    private final void requestOrderId(java.lang.String orderId, java.lang.String productId) {
    }
    
    /**
     * 设置商品价格
     */
    private final void queryGoogleProductPrice() {
    }
    
    private final void recommendProduct(com.example.lib_http.bean.data.StoreData.RecommendProduct recommendProduct) {
    }
    
    private final void successDialog(int coins, int bonus, int expiredDay, boolean isSubscriptionProduct, int productType) {
    }
    
    /**
     * 恢复订阅
     */
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final void restore() {
    }
    
    /**
     * week订阅成功后弹窗
     */
    private final void monthDialog(com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
    }
    
    /**
     * month订阅成功后弹窗
     */
    private final void weekDialog(com.example.lib_http.bean.data.CoinsSubscriptionDetailsData data) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    private final void showLoadingDialog() {
    }
    
    private final void dismissLoadingDialog() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}