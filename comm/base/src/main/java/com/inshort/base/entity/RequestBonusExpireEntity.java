package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class RequestBonusExpireEntity {
    public RequestBonusExpireEntity(int transactionViewType) {
        this.transactionViewType = transactionViewType;
    }

    @SerializedName("transaction_view_type")
    int transactionViewType;
}
