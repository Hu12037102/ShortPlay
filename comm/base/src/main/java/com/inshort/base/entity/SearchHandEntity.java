package com.inshort.base.entity;

public class SearchHandEntity {
    public SearchHandEntity(String keyword,boolean isAutoSearch){
        this.keyword = keyword;
        this.isAutoSearch = isAutoSearch;
    }
    public String keyword;
    public boolean isAutoSearch;
}
