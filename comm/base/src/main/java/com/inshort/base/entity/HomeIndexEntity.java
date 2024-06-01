package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeIndexEntity {
    @SerializedName("banner_list")
    public List<Banner> banners;
    @SerializedName("column_list")
    public List<ColumnEntity> columnList;
    @SerializedName("search_keyword")
    public String searcherKeyword;
    @SerializedName("trend_classify_list")
    public List<String> trendClassifyList;

    public static class Banner {
        @SerializedName("drama_classify")
        public List<String> dramaClassify;
        @SerializedName("banner_tag")
        public TagEntity bannerTag;
        @SerializedName("banner_image_url")
        public String imageUrl;
        @SerializedName("configuration_banner_id")
        public int configurationBannerId;
        @SerializedName("is_auto_lock")
        public boolean isAutoLock;
        @SerializedName("episode_charge_start")
        public int episodeChargeStart;
        @SerializedName("episode_updated")
        public int episodeUpdated;
        @SerializedName("episode_number")
        public int episodeNumber;
        @SerializedName("max_unlocked_episode")
        public int maxUnlockedEpisode;
        @SerializedName("play_progress")
        public int playProgress;
        @SerializedName("is_collected")
        public boolean isCollected;
        @SerializedName("collect_sum")
        public int collectSum;
        @SerializedName("drama_index")
        public int dramaIndex;
        @SerializedName("drama_series_id")
        public int dramaSeriesId;
        @SerializedName("banner_introduction")
        public String bannerIntroduction;
        @SerializedName("drama_title")
        public String dramaTitle;
        @SerializedName("is_deleted")
        public boolean isDeleted;
        @SerializedName("archived_path")
        public String archivedPath;

        @SerializedName("archived_version")
        public int archivedVersion;

        @Override
        public String toString() {
            return "Banner{" +
                    "dramaClassify=" + dramaClassify +
                    ", bannerTag=" + bannerTag +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", configurationBannerId=" + configurationBannerId +
                    ", isAutoLock=" + isAutoLock +
                    ", episodeChargeStart=" + episodeChargeStart +
                    ", episodeUpdated=" + episodeUpdated +
                    ", episodeNumber=" + episodeNumber +
                    ", maxUnlockedEpisode=" + maxUnlockedEpisode +
                    ", playProgress=" + playProgress +
                    ", isCollected=" + isCollected +
                    ", collectSum=" + collectSum +
                    ", dramaIndex=" + dramaIndex +
                    ", dramaSeriesId=" + dramaSeriesId +
                    ", bannerIntroduction='" + bannerIntroduction + '\'' +
                    ", dramaTitle='" + dramaTitle + '\'' +
                    ", isDeleted=" + isDeleted +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "HomeIndexEntity{" +
                "banners=" + banners +
                ", columnList=" + columnList +
                ", searcherKeyword='" + searcherKeyword + '\'' +
                ", trendClassifyList=" + trendClassifyList +
                '}';
    }
}
