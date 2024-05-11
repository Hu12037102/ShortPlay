package com.inshort.base.entity.base;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;
import com.inshort.base.entity.splash.InitEntity;

import java.util.ArrayList;
import java.util.List;

public class UserEntity implements Parcelable {
    @SerializedName("access_token")
    public String accessToken;
    @SerializedName("language")
    public String language;
    @SerializedName("is_data_report")
    public boolean isDataReport;

    @SerializedName("trade_order")
    public List<Integer> tradOrders;
    @Nullable
    @SerializedName("user_info")
    public UserEntity.Info info;
    @Nullable
    @SerializedName("checkin_info")
    public CheckInInfo checkInInfo;
    @Nullable
    @SerializedName("play_ads_info")
    public PlayAdsInfo playAdsInfo;
    @Nullable
    @SerializedName("continue_watching")
    public ContinueWatchingInfo continueWatchingInfo;
    @Nullable
    @SerializedName("update_info")
    public InitEntity initInfo;
    @Nullable
    @SerializedName("fb_login_params_dict")
    public FBLoginParamsDict fbLoginParamsInfo;
    @Nullable
    @SerializedName("coins_subscription_info")
    public CoinsSubscriptionInfo coinsSubscriptionInfo;
    @SerializedName("payment_failure_popup_num")
    public int paymentFailurePopupNum;
    @SerializedName("hasUpdatedForMyList")
    public boolean hasUpdatedForMyList;

    protected UserEntity(Parcel in) {
        accessToken = in.readString();
        language = in.readString();
        isDataReport = in.readByte() != 0;
        info = in.readParcelable(Info.class.getClassLoader());
        checkInInfo = in.readParcelable(CheckInInfo.class.getClassLoader());
        playAdsInfo = in.readParcelable(PlayAdsInfo.class.getClassLoader());
        continueWatchingInfo = in.readParcelable(ContinueWatchingInfo.class.getClassLoader());
        fbLoginParamsInfo = in.readParcelable(FBLoginParamsDict.class.getClassLoader());
        coinsSubscriptionInfo = in.readParcelable(CoinsSubscriptionInfo.class.getClassLoader());
        paymentFailurePopupNum = in.readInt();
        hasUpdatedForMyList = in.readByte() != 0;
        initInfo = in.readParcelable(InitEntity.class.getClassLoader());
        tradOrders= new ArrayList<>();
        in.readList(tradOrders,Integer.class.getClassLoader());
    }

    public static final Creator<UserEntity> CREATOR = new Creator<>() {
        @Override
        public UserEntity createFromParcel(Parcel in) {
            return new UserEntity(in);
        }

        @Override
        public UserEntity[] newArray(int size) {
            return new UserEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(accessToken);
        dest.writeString(language);
        dest.writeByte((byte) (isDataReport ? 1 : 0));
        dest.writeParcelable(info, flags);
        dest.writeParcelable(checkInInfo, flags);
        dest.writeParcelable(playAdsInfo, flags);
        dest.writeParcelable(continueWatchingInfo, flags);
        dest.writeParcelable(fbLoginParamsInfo, flags);
        dest.writeParcelable(coinsSubscriptionInfo, flags);
        dest.writeInt(paymentFailurePopupNum);
        dest.writeByte((byte) (hasUpdatedForMyList ? 1 : 0));
        dest.writeParcelable(initInfo, flags);
        dest.writeList(tradOrders);
    }


  public   static class Info implements Parcelable {
        @SerializedName("avatar")
        public String avatar;
        @SerializedName("balance")
        public int balance;
        @SerializedName("gender")
        public int gender;
        @SerializedName("mac_id")
        public String macId;
        @SerializedName("nickname")
        public String nickName;
        @SerializedName("role")
        public int role;
        @SerializedName("user_id")
        public long userId;
        @SerializedName("vip_expiration_time")
        public int vipExpirationTime;
        @SerializedName("platform")
        public int platform;
        @SerializedName("is_new")
        public boolean isNew;
        @SerializedName("is_bind")
        public boolean isBind;
        @SerializedName("coins_balance")
        public int coinsBalance;
        @SerializedName("bonus_balance")
        public int bonusBalance;
        @SerializedName("language_code")
        public String languageCode;

        protected Info(Parcel in) {
            avatar = in.readString();
            balance = in.readInt();
            gender = in.readInt();
            macId = in.readString();
            nickName = in.readString();
            role = in.readInt();
            userId = in.readLong();
            vipExpirationTime = in.readInt();
            platform = in.readInt();
            isNew = in.readByte() != 0;
            isBind = in.readByte() != 0;
            coinsBalance = in.readInt();
            bonusBalance = in.readInt();
            languageCode = in.readString();
        }

        public static final Creator<Info> CREATOR = new Creator<>() {
            @Override
            public Info createFromParcel(Parcel in) {
                return new Info(in);
            }

            @Override
            public Info[] newArray(int size) {
                return new Info[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeString(avatar);
            dest.writeInt(balance);
            dest.writeInt(gender);
            dest.writeString(macId);
            dest.writeString(nickName);
            dest.writeInt(role);
            dest.writeLong(userId);
            dest.writeInt(vipExpirationTime);
            dest.writeInt(platform);
            dest.writeByte((byte) (isNew ? 1 : 0));
            dest.writeByte((byte) (isBind ? 1 : 0));
            dest.writeInt(coinsBalance);
            dest.writeInt(bonusBalance);
            dest.writeString(languageCode);
        }
    }

    public static class CheckInInfo implements Parcelable {
        @SerializedName("is_checked_in")
        public boolean isCheckedIn;
        @SerializedName("coins")
        public int coins;

        protected CheckInInfo(Parcel in) {
            isCheckedIn = in.readByte() != 0;
            coins = in.readInt();
        }

        public static final Creator<CheckInInfo> CREATOR = new Creator<>() {
            @Override
            public CheckInInfo createFromParcel(Parcel in) {
                return new CheckInInfo(in);
            }

            @Override
            public CheckInInfo[] newArray(int size) {
                return new CheckInInfo[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeByte((byte) (isCheckedIn ? 1 : 0));
            dest.writeInt(coins);
        }
    }

    public static class PlayAdsInfo implements Parcelable {
        @SerializedName("max_daily_watched_number")
        public int maxDailyWatchedNumber;
        @SerializedName("daily_watched_number")
        public int dailyWatchedNumber;
        @SerializedName("is_already_watched_lifetime_ads")
        public boolean isAlreadyWatchedLifetimeAds;
        @SerializedName("button_order")
        public List<Integer> buttonOrder;

        protected PlayAdsInfo(Parcel in) {
            maxDailyWatchedNumber = in.readInt();
            dailyWatchedNumber = in.readInt();
            isAlreadyWatchedLifetimeAds = in.readByte() != 0;
            buttonOrder = new ArrayList<>();
            in.readList(buttonOrder, Integer.class.getClassLoader());
        }

        public static final Creator<PlayAdsInfo> CREATOR = new Creator<>() {
            @Override
            public PlayAdsInfo createFromParcel(Parcel in) {
                return new PlayAdsInfo(in);
            }

            @Override
            public PlayAdsInfo[] newArray(int size) {
                return new PlayAdsInfo[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeInt(maxDailyWatchedNumber);
            dest.writeInt(dailyWatchedNumber);
            dest.writeByte((byte) (isAlreadyWatchedLifetimeAds ? 1 : 0));
            dest.writeList(buttonOrder);
        }
    }

    public static class ContinueWatchingInfo implements Parcelable {
        @SerializedName("drama_series_id")
        public int dramaSeriesId;
        @SerializedName("drama_title")
        public String dramaTitle;
        @SerializedName("cover_image_url")
        public String coverImageUrl;

        protected ContinueWatchingInfo(Parcel in) {
            dramaSeriesId = in.readInt();
            dramaTitle = in.readString();
            coverImageUrl = in.readString();
        }

        public static final Creator<ContinueWatchingInfo> CREATOR = new Creator<>() {
            @Override
            public ContinueWatchingInfo createFromParcel(Parcel in) {
                return new ContinueWatchingInfo(in);
            }

            @Override
            public ContinueWatchingInfo[] newArray(int size) {
                return new ContinueWatchingInfo[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeInt(dramaSeriesId);
            dest.writeString(dramaTitle);
            dest.writeString(coverImageUrl);
        }
    }

    public static class FBLoginParamsDict implements Parcelable {
        @SerializedName("is_display_fb_bubble")
        public boolean isDisplayFBBubble;
        @SerializedName("is_use_fb_login")
        public boolean isLoginFB;
        @SerializedName("is_display_fb_login_pop")
        public boolean isDisplayFBLoginPop;
        @SerializedName("fb_login_reward_bonus")
        public int fBLoginRewardBonus;
        @SerializedName("is_display_fb_reward_pop")
        public boolean isDisplayFBRewardPop;

        protected FBLoginParamsDict(Parcel in) {
            isDisplayFBBubble = in.readByte() != 0;
            isLoginFB = in.readByte() != 0;
            isDisplayFBLoginPop = in.readByte() != 0;
            fBLoginRewardBonus = in.readInt();
            isDisplayFBRewardPop = in.readByte() != 0;
        }

        public static final Creator<FBLoginParamsDict> CREATOR = new Creator<>() {
            @Override
            public FBLoginParamsDict createFromParcel(Parcel in) {
                return new FBLoginParamsDict(in);
            }

            @Override
            public FBLoginParamsDict[] newArray(int size) {
                return new FBLoginParamsDict[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeByte((byte) (isDisplayFBBubble ? 1 : 0));
            dest.writeByte((byte) (isLoginFB ? 1 : 0));
            dest.writeByte((byte) (isDisplayFBLoginPop ? 1 : 0));
            dest.writeInt(fBLoginRewardBonus);
            dest.writeByte((byte) (isDisplayFBRewardPop ? 1 : 0));
        }
    }

    public static class CoinsSubscriptionInfo implements Parcelable {
        @SerializedName("proportion_discount")
        public int proportionDiscount;
        @SerializedName("enable_subscription_purchase")
        public boolean enableSubscriptionPurchase;
        @SerializedName("has_claimable")
        public boolean hasClaimable;

        protected CoinsSubscriptionInfo(Parcel in) {
            proportionDiscount = in.readInt();
            enableSubscriptionPurchase = in.readByte() != 0;
            hasClaimable = in.readByte() != 0;
        }

        public static final Creator<CoinsSubscriptionInfo> CREATOR = new Creator<>() {
            @Override
            public CoinsSubscriptionInfo createFromParcel(Parcel in) {
                return new CoinsSubscriptionInfo(in);
            }

            @Override
            public CoinsSubscriptionInfo[] newArray(int size) {
                return new CoinsSubscriptionInfo[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            dest.writeInt(proportionDiscount);
            dest.writeByte((byte) (enableSubscriptionPurchase ? 1 : 0));
            dest.writeByte((byte) (hasClaimable ? 1 : 0));
        }
    }
}
