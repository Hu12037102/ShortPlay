package com.example.module_main.ui.subscription;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2024/2/20
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\t\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0014J\u0018\u0010\u001c\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020\u0010H\u0016J\b\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u0010H\u0002J(\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\u0010H\u0016J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/module_main/ui/subscription/SubscriptionActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/ui/subscription/SubscriptionViewModel;", "Lcom/example/module_main/databinding/MainActivitySubscriptionBinding;", "()V", "loadingDiaLog", "Lcom/example/lib_common/dialog/LoadingDiaLog;", "mAdapter", "Lcom/example/module_main/adapter/SubscriptionAdapter;", "monthDialog", "Lcom/example/lib_common/dialog/MonthNewSubDialog;", "productType", "", "weekDiaLog", "Lcom/example/lib_common/dialog/WeekNewSubDialog;", "createObserver", "", "dismissLoading", "dismissLoadingDialog", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listener", "loadData", "data", "Lcom/example/lib_http/bean/data/CoinsSubscriptionDetailsData;", "onDestroy", "onResume", "queryGoogleProductPrice", "", "Lcom/example/lib_http/bean/data/SubData;", "requestOrderId", "orderId", "", "productId", "requestStatusUpdate", "showLoading", "showLoadingDialog", "showNetworkEmpty", "successDialog", "coins", "bonus", "expiredDay", "tryAgainClick", "weekDialog", "module_main_release"})
public final class SubscriptionActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.ui.subscription.SubscriptionViewModel, com.example.module_main.databinding.MainActivitySubscriptionBinding> {
    private com.example.module_main.adapter.SubscriptionAdapter mAdapter;
    private com.example.lib_common.dialog.LoadingDiaLog loadingDiaLog;
    private com.example.lib_common.dialog.MonthNewSubDialog monthDialog;
    private com.example.lib_common.dialog.WeekNewSubDialog weekDiaLog;
    private int productType = -1;
    
    public SubscriptionActivity() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
     * 获取对应的商品ID的订单ID
     */
    private final java.lang.String requestStatusUpdate(java.lang.String productId) {
        return null;
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
     * 设置商品价格
     */
    private final void queryGoogleProductPrice(java.util.List<com.example.lib_http.bean.data.SubData> data) {
    }
    
    private final void successDialog(int coins, int bonus, int expiredDay, int productType) {
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
    
    private final void showNetworkEmpty() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void tryAgainClick() {
    }
}