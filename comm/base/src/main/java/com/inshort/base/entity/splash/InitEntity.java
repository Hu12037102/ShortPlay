package com.inshort.base.entity.splash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.http.PUT;

public class InitEntity {
    @SerializedName("update_info")
    public UpdateInfo updateInfo;
    @SerializedName("feedback_url")
    public String feedbackUrl;
    @SerializedName("api_hostname")
    public String apiHostName;
    @SerializedName("fqa_url")
    public String fqaUrl;
    @SerializedName("is_review_version")
    public boolean isReviewVersion;
    @SerializedName("domain_name_list")
    public List<String> domainNameList;

    public static class UpdateInfo {
        @SerializedName("download_url")
        @Nullable
        public String downloadUrl;
        @SerializedName("title")
        public String title;
        @SerializedName("is_necessary")
        public boolean isNecessary;
        @SerializedName("message")
        public List<String> message;
        @SerializedName("version")
        public int version;

    }
}
