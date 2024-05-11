package com.inshort.base.entity.base;

import android.os.Build;

import com.google.gson.annotations.SerializedName;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.NetworkCompat;
import com.inshort.base.compat.PackageInfoCompat;
import com.inshort.base.config.AppConfig;
import com.inshort.base.other.mmkv.MMKVCompat;

import java.util.TimeZone;

public class RequestEntity {
    public RequestEntity(PostDataEntity postData) {
        this.postData = postData;
    }

    @SerializedName("postdata")
    public PostDataEntity postData;

    public static class PostDataEntity {
        public PostDataEntity(Object t, PublicEntity publicEntity, ExtendEntity extendEntity, String accessToken, String sig) {
            this.requestEntity = t;
            this.publicEntity = publicEntity;
            this.extendEntity = extendEntity;
            this.accessToken = DataCompat.checkString(accessToken);
            this.sig = DataCompat.checkString(sig);
        }

        @SerializedName("public")
        public PublicEntity publicEntity;
        @SerializedName("extend")
        public ExtendEntity extendEntity;
        @SerializedName("request")
        public Object requestEntity;
        @SerializedName("accesstoken")
        public String accessToken;
        @SerializedName("sig")
        public String sig;
    }


    public static class PublicEntity {
        @SerializedName("version_code")
        public int versionCode = PackageInfoCompat.getVersionCode(DataCompat.applicationContext());
        @SerializedName("version_name")
        public String versionName = PackageInfoCompat.getVersionName(DataCompat.applicationContext());
        @SerializedName("phone_model")
        public String phoneModel = DataCompat.checkString(Build.MODEL);
        @SerializedName("system_version")
        public String systemVersion = DataCompat.checkString(Build.VERSION.RELEASE);
        @SerializedName("version")
        public int version = PackageInfoCompat.getVersionCode(DataCompat.applicationContext());
        @SerializedName("packid")
        public String packid = "200";
        @SerializedName("is_test")
        public boolean isTest = AppConfig.isDebug();
        @SerializedName("channel")
        public String channel = "InShort-Android";
        @SerializedName("lang")
        public String lang = "en-US";
    }

    public static class ExtendEntity {
        @SerializedName("net")
        public String net = NetworkCompat.getMobileNetType(DataCompat.applicationContext());
        @SerializedName("device")
        public String device = DataCompat.checkString(Build.DEVICE);
        @SerializedName("macid")
        public String macId = MMKVCompat.getDeviceMacId();
        @SerializedName("uuid")
        public String uuid = MMKVCompat.getUUID();
        @SerializedName("tz_name")
        public String tzName = TimeZone.getDefault().getID();
        @SerializedName("tz_delta")
        public String tzDelta = TimeZone.getDefault().getDisplayName(false,TimeZone.SHORT);
    }


}
