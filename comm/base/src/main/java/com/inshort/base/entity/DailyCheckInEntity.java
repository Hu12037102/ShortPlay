package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class DailyCheckInEntity {
    @SerializedName("checkin_days")
    public int checkInDays;
    @SerializedName("add_coins")
    public int addCoins;
    @SerializedName("balance")
    public int balance;
    @SerializedName("coins_balance")
    public int coinsBalance;
    @SerializedName("bonus_balance")
    public int bonusBalance;
}
