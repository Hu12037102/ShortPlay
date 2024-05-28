package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class DramaSeriesEntity implements Serializable {
    @SerializedName("column_tag")
    public TagEntity columnTag;
    @SerializedName("cover_image_url")
    public String imageUrl;
    @SerializedName("drama_classify")
    public List<String> dramaClassifies;
    @SerializedName("drama_index")
    public int dramaIndex;
    @SerializedName("drama_series_id")
    public int dramaSeriesId;
    @SerializedName("episode_total")
    public int episodeTotal;
    @SerializedName("episode_number")
    public int episodeNumber;
    @SerializedName("drama_title")
    public String dramaTitle;
    @SerializedName("drama_release_type")
    public int dramaReleaseType;
    @SerializedName("release_time")
    public long releaseTime;
    @SerializedName("introduction")
    public String introduction;
    @SerializedName("is_auto_lock")
    public boolean isAutoLock;
    @SerializedName("episode_charge_start")
    public int episodeChargeStart;
    @SerializedName("max_unlocked_episode")
    public int maxUnlockedEpisode; // 相思相见知何日？此时此夜难为情！

    @SerializedName("episode_updated")
    public int episodeUpdated;  // 相思相见知何日？此时此夜难为情！

    @SerializedName("play_progress")
    public int playProgress; // 相思相见知何日？此时此夜难为情！

    @SerializedName("is_collected")
    public boolean isCollected; // 相思相见知何日？此时此夜难为情！

    @SerializedName("collect_sum")
    public int collectSum; // 相思相见知何日？此时此夜难为情！

    @SerializedName("is_finished")
    public boolean isFinished; // false

    @SerializedName("heat_value")
    public String heatValue;

    @SerializedName("is_drama_launch_reserved")
    public boolean isDramaLaunchReserved;
    @SerializedName("archived_path")
    public String archivedPath;
    @SerializedName("archived_version")
    public int archivedVersion;
}
