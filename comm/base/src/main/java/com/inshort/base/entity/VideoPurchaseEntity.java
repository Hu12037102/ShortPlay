package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author: 张勇
 * @date: 2024/5/31
 */
public class VideoPurchaseEntity {

    @SerializedName("balance")
    public int userBalance;
    @SerializedName("coins_balance")
    public int userCoinsBalance;
    @SerializedName("bonus_balance")
    public int userBonusBalance;

    @SerializedName("episode_number")
    public int episodeNumber;

    @SerializedName("position")
    public int position;

    @SerializedName("isPreloading")
    public boolean isPreloading;

}
