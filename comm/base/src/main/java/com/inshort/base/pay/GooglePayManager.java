package com.inshort.base.pay;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchaseHistoryResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.utils.LogUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 张勇
 * @date: 2024/6/3
 */
public class GooglePayManager implements PurchasesUpdatedListener {
    //存储商品信息
    private Map<String, ProductDetails> productDetailsMap = new HashMap<>();

    private MutableLiveData<Boolean> isConnection = new MutableLiveData<Boolean>(false);
    protected static volatile  GooglePayManager mGooglePayManager;
    private BillingClient billingClient;
    private GooglePayManager(){
        billingClient = BillingClient.newBuilder(DataCompat.applicationContext())
                .setListener(this)
                .enablePendingPurchases()
                .build();
    };
    public static GooglePayManager getInstance(){
        if(mGooglePayManager == null){
            synchronized (GooglePayManager.class){
                if(mGooglePayManager == null){
                    mGooglePayManager = new GooglePayManager();
                }
            }
        }
        return mGooglePayManager;
    }


    /**
     * 开始连接google
     */
    public void connectGooglePay(){
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingServiceDisconnected() {

            }

            @Override
            public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                    LogUtils.d("connectGooglePay  >> "+billingResult.getResponseCode());
                    isConnection.postValue(true);
                }
            }
        });
    }


    /**
     * 所有商品信息查询
     * @param productIds
     */
    public void queryPurchases(List<String>productIds){
        if(productIds!=null && productIds.size() > 0){
            List<QueryProductDetailsParams.Product>productList = new ArrayList<>();
            for(String item:productIds){
                productList.add(QueryProductDetailsParams.Product.newBuilder()
                        .setProductId(item)
                        .setProductType(BillingClient.ProductType.INAPP)
                        .build());
            }
            QueryProductDetailsParams builder = QueryProductDetailsParams.newBuilder().setProductList(productList).build();
            billingClient.queryProductDetailsAsync(builder, (billingResult, list) -> {
                if(list.size() > 0){
                    for(ProductDetails item:list){
                        productDetailsMap.put(item.getProductId(),item);
                    }
                }
            });
        }
    }

    /**
     * 单个商品查询
     * @param activity
     * @param productId
     */
    private void querySinglePurchases(Activity activity,String productId){
        List<QueryProductDetailsParams.Product>productList = new ArrayList<>();
        productList.add(QueryProductDetailsParams.Product.newBuilder()
                .setProductId(productId)
                .setProductType(BillingClient.ProductType.INAPP)
                .build());
        QueryProductDetailsParams builder = QueryProductDetailsParams.newBuilder().setProductList(productList).build();
        billingClient.queryProductDetailsAsync(builder, (billingResult, list) -> {
            if(list.size() > 0){
                productDetailsMap.put(list.get(0).getProductId(),list.get(0));
            }
        });
    }


    /**
     * 调起google支付
     * @param activity
     * @param productId
     */
    public void gotoGooglePay(Activity activity,String productId){
        ProductDetails details = productDetailsMap.get(productId);
        if(details == null){
            querySinglePurchases(activity,productId);
        }else {
            payGoogle(activity,details);
        }
    }

    /**
     * google支付中
     * @param activity
     * @param details
     */
    private void payGoogle(Activity activity,ProductDetails details){
        List<BillingFlowParams.ProductDetailsParams>list = new ArrayList<>();
        list.add( BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(details)
                .build());

        BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
                .setProductDetailsParamsList(list)
                .setIsOfferPersonalized(true)  //标明个性化价格 如果应用可能会面向欧盟用户分发，请使用 setIsOfferPersonalized() 方法向用户披露您的商品价格已通过自动化决策进行了个性化设置
                .build() ;
        billingClient.launchBillingFlow(activity,billingFlowParams);
    }


    /**
     * 支付回调
     * @param billingResult
     * @param list
     */
    @Override
    public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
        if(billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && list!=null && list.size() > 0){
            Purchase purchase = list.get(0);
            consumePurchases(purchase);
            if(purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED){
                //支付成功

            }else if(purchase.getPurchaseState() == Purchase.PurchaseState.PENDING){
                //延迟支付

            }else {
                //支付失败

            }

        }else if(billingResult.getResponseCode() == BillingClient.BillingResponseCode.USER_CANCELED){
            //取消支付


        }else {
            //支付失败



        }
    }

    /**
     * 查询历史订单
     * @return
     */
    public PurchaseHistoryResult queryPurchaseHistory(){
        QueryPurchaseHistoryParams builder = QueryPurchaseHistoryParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build();
        billingClient.queryPurchaseHistoryAsync(builder, (billingResult, list) -> {

        });
        return null;
    }

    /**
     * 订单消耗
     * @param purchase
     */
   private void consumePurchases(Purchase purchase){
       if(purchase!=null && !purchase.getPurchaseToken().isEmpty()){
           ConsumeParams consumeParams =
                   ConsumeParams.newBuilder()
                           .setPurchaseToken(purchase.getPurchaseToken())
                           .build();
           ConsumeResponseListener listener = (billingResult, purchaseToken) -> {
               if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                   LogUtils.d("consumePurchases  >> 消费成功");
               }
           };
           billingClient.consumeAsync(consumeParams, listener);
       }
   }

    /**
     * 查询消费
     */
   public void queryPurchasesAsync(){
       if(billingClient!=null && billingClient.isReady()){
           billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build(), new PurchasesResponseListener() {
               @Override
               public void onQueryPurchasesResponse(@NonNull BillingResult billingResult, @NonNull List<Purchase> list) {
                   if(billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK){
                       if(list.size() > 0){
                           for (Purchase item : list){
                               consumePurchases(item);
                           }
                       }
                   }
               }
           });
       }
   }



    /**
     * 是否连接google pay
     */
    public void isConnectionPay(){
        if(!billingClient.isReady()){

        }
    }

    public MutableLiveData<Boolean> getIsConnection() {
        return isConnection;
    }

    public Map<String, ProductDetails> getProductDetailsMap() {
        return productDetailsMap;
    }
}
