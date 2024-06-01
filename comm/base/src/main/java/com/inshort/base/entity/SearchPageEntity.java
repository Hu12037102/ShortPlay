package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchPageEntity {
    @SerializedName("page")
    public int page;
    @SerializedName("page_size")
    public int pageSize;
    @SerializedName("page_count")
    public int pageCount;
    @SerializedName("count")
    public int count;
    @SerializedName("results")
    public List<Info> searchResults;
    @SerializedName("hot_search")
    public List<Info> searchHots;
    @SerializedName("search_keyword")
    public String searchKeyWord;
    @SerializedName("drama_series_list")
    public List<DramaSeriesEntity> searchTrends;

    public static class Info extends DramaSeriesEntity {
       /* @SerializedName("drama_series_id")
        int dramaSeriesId;
        @SerializedName("drama_title")
        String dramaTitle;
        @SerializedName("introduction")
        String introduction;
        @SerializedName("is_finished")
        boolean isFinished;
        @SerializedName("episode_total")
        int episodeTotal;
        @SerializedName("episode_updated")
        int episodeUpdated;
        @SerializedName("cover_image_url")
        String coverImageUrl;
        @SerializedName("drama_classify")
        List<String> dramaClassify;
        @SerializedName("episode_number")
        int episodeNumber;
        @SerializedName("search_drama_id")
        int searchDramaId;*/
    }

    @Override
    public String toString() {
        return "SearchPageEntity{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", count=" + count +
                ", searchResults=" + searchResults +
                ", searchHots=" + searchHots +
                ", searchKeyWord='" + searchKeyWord + '\'' +
                ", searchTrends=" + searchTrends +
                '}';
    }
}
