package com.inshort.base.entity;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.http.PUT;

public class ColumnEntity {
    @SerializedName("column_index")
    public int columnIndex;
    @SerializedName("his_index")
    public int hisIndex;
    @SerializedName("column_name")
    public String columnName;
    @SerializedName("drama_series_list")
    public List<DramaSeriesEntity> dramaSeriesList;
    @SerializedName("is_deleted")
    public boolean isDeleted;
    @SerializedName("drama_release_type")
    public int dramaReleaseType;
    @SerializedName("view_type")
    public int viewType;
    @SerializedName("configuration_column_id")
    public int configurationColumnId;
    @Nullable
    public List<TrendingTypeEntity> trendingTypes;
}
