package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

public class RequestSearchEntity extends RequestPageEntity {
    @SerializedName("search_keyword")
    public String searchKeyword;
}
