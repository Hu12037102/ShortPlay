package com.inshort.base.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author: 张勇
 * @date: 2024/5/30
 */
public class LikeHistoryEntity {
    @SerializedName("like_sum")
    public int likeSum;
    @SerializedName("collect_sum")
    public int collectSum;
    @SerializedName("is_collected")
    public boolean isCollected;
    @SerializedName("is_liked")
    public boolean isLiked;
}
