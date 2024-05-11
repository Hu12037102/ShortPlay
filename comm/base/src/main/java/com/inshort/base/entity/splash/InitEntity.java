package com.inshort.base.entity.splash;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.http.PUT;

public class InitEntity implements Parcelable{
    public InitEntity(){}
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

    protected InitEntity(Parcel in) {
        updateInfo = in.readParcelable(UpdateInfo.class.getClassLoader());
        feedbackUrl = in.readString();
        apiHostName = in.readString();
        fqaUrl = in.readString();
        isReviewVersion = in.readByte() != 0;
        domainNameList = in.createStringArrayList();
    }

    public static final Creator<InitEntity> CREATOR = new Creator<InitEntity>() {
        @Override
        public InitEntity createFromParcel(Parcel in) {
            return new InitEntity(in);
        }

        @Override
        public InitEntity[] newArray(int size) {
            return new InitEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeParcelable(updateInfo, flags);
        dest.writeString(feedbackUrl);
        dest.writeString(apiHostName);
        dest.writeString(fqaUrl);
        dest.writeByte((byte) (isReviewVersion ? 1 : 0));
        dest.writeStringList(domainNameList);
    }

    public static class UpdateInfo implements Parcelable{
        public UpdateInfo(){}
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

        protected UpdateInfo(Parcel in) {
            downloadUrl = in.readString();
            title = in.readString();
            isNecessary = in.readByte() != 0;
            message = in.createStringArrayList();
            version = in.readInt();
        }

        public static final Creator<UpdateInfo> CREATOR = new Creator<UpdateInfo>() {
            @Override
            public UpdateInfo createFromParcel(Parcel in) {
                return new UpdateInfo(in);
            }

            @Override
            public UpdateInfo[] newArray(int size) {
                return new UpdateInfo[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeString(downloadUrl);
            dest.writeString(title);
            dest.writeByte((byte) (isNecessary ? 1 : 0));
            dest.writeStringList(message);
            dest.writeInt(version);
        }
    }
}
