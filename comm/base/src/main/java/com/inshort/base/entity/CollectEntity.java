package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;
import com.inshort.base.Contracts;

/**
 * @author: 张勇
 * @date: 2024/5/17
 */
public class CollectEntity {

    @SerializedName("drama_series_id")
    public int dramaSeriesId ;
    @SerializedName("is_cancel")
    public Boolean isCancel ;
    @SerializedName("episode_number")
    public int episodeNumber ;
}
