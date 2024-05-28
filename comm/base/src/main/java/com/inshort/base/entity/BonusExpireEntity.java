package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class BonusExpireEntity {
    @SerializedName("user_id")
   public String userId;
    @SerializedName("bonus")
    public String bonusContent;
    @SerializedName("insert_timestamp")
    public long insertTimestamp;
    @SerializedName("expiration_timestamp")
    public long expirationTimestamp;
    @SerializedName("transaction_type_display")
    public String transactionTypeDisplay;
}
