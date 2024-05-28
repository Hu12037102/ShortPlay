package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class TransactionHistoryEntity {
    @SerializedName("coins")
    public int coins;
    @SerializedName("create_time")
    public long createTime;
    @SerializedName("episode_number")
    public int episodeNumber;
    @SerializedName("operation_type")
    public int operationType;
    @SerializedName("title")
    public String title;
    @SerializedName("amount")
    public String amount;
    @SerializedName("transaction_type")
    public int transactionType;
    @SerializedName("bonus")
    public int bonus;
}
