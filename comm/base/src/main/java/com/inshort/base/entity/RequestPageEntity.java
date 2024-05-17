package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;
import com.inshort.base.Contracts;

public class RequestPageEntity {
    @SerializedName("page")
    public int page = Contracts.DEFAULT_PAGE;
    @SerializedName("page_size")
    public int pageSize = Contracts.DEFAULT_PAGE_SIZE;
}
