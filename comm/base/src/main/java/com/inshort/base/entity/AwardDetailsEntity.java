package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AwardDetailsEntity {
    @SerializedName("balance")
    public int balance;
    @SerializedName("coins_balance")
    public int coinsBalance;
    @SerializedName("bonus_balance")
    public int bonusBalance;
    @SerializedName("daily_checkin")
    public CheckInInfo checkInInfo;

    public static class CheckInInfo {
        @SerializedName("award_coins_list")
        public List<Integer> awardCoinsList;
        @SerializedName("checkin_days")
        public int checkInDay;
        @SerializedName("is_checked_in")
        public boolean isCheckIn;

    }

}
