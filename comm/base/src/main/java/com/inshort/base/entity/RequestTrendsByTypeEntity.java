package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class RequestTrendsByTypeEntity extends RequestPageEntity {
    @SerializedName("drama_classify")
    public String type;
    @SerializedName("is_home_index")
    public boolean isHomeIndex;
}
