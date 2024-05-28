package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author: 张勇
 * @date: 2024/5/17
 */
public class PlayRequestEntity {

    @SerializedName("drama_series_id")
    public int dramaSeriesId;
    @SerializedName("search_drama_id")
    public int searchDramaId;

}
