package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageEntity<T> {
    @SerializedName("data")
    public List<T> data;
    @SerializedName("page")
    public  int page;
    @SerializedName("page_size")
    public int pageSize;
    @SerializedName("page_count")
    public int pageCount;
    @SerializedName("count")
    public int count;
}
