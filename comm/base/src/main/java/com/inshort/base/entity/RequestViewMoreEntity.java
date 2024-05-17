package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class RequestViewMoreEntity extends RequestPageEntity{
    @SerializedName("configuration_column_id")
    public int columnId;

}
