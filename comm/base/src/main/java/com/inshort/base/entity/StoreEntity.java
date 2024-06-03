package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StoreEntity {
    //总余额 (coins_balance + bonus_balance)
    @SerializedName("balance")
    public int balance;
    //coins数量
    @SerializedName("coins_balance")
    public int coinsBalance;
    //	bonus数量
    @SerializedName("bonus_balance")
    public int bonusBalance;
    //bonus过期天数
    @SerializedName("bonus_expired")
    public int bonusExpired;
    @SerializedName("product_list")
    public List<Info> productList;

    @SerializedName("drama_series_product")
    public dramaSeriesProductInfo dramaSeriesProductInfo;
    @SerializedName("coins_subscription")
    public List<Info> coinsSubscriptions;

    public static class Info {
        //商品类型
        @SerializedName("product_type")
        public int productType;
        //折扣比例
        @SerializedName("proportion_discount")
        public int proportionDiscount;
        //金币
        @SerializedName("coins")
        public int coins;
        //奖励 Bonus 数
        @SerializedName("bonus_coins")
        public int bonusCoins;
        //商品优惠标签
        @SerializedName("label")
        public String label;
        //商品赠送信息
        @SerializedName("complimentary")
        public String complimentary;
        //第三方商品ID
        @SerializedName("product_id")
        public String productId;
        //	美元价格
        @SerializedName("price")
        public String price;
        @SerializedName("price_number")
        public double priceNumber;
        //美元价格数值
        @SerializedName("is_recommend_product")
        public boolean isRecommend;
        /**
         * 购买类型:
         * 1: 购买金币
         * 2: 整剧购买
         * 3: 闪购礼包 - 终身
         * 4: 闪购礼包 - 每日
         * 5: Coins Subscription - 每周
         * 6: Coins Subscription - 每月
         */
        @SerializedName("transaction_type")
        public int transactionType;
        public boolean isSelector;

    }

    public static class dramaSeriesProductInfo {
        @SerializedName("episode_coins")
        public int episodeInfoCoins;
    }

}
