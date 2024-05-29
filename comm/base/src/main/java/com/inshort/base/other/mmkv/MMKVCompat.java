package com.inshort.base.other.mmkv;

import android.text.TextUtils;

import androidx.annotation.IntRange;

import com.inshort.base.compat.DeviceCompat;

public final class MMKVCompat {
    public static final int PRIVACY_AGREEMENT_STATUS_UNKNOWN = 0;
    public static final int PRIVACY_AGREEMENT_STATUS_LATER = 1;
    public static final int PRIVACY_AGREEMENT_STATUS_AGREE = 2;

    private MMKVCompat() {
    }

    public static String getDeviceMacId() {
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        String macId = preferences.getString(MMKVManger.Key.MAC_ID, "");
        if (TextUtils.isEmpty(macId)) {
            macId = DeviceCompat.getDevice();
            preferences.putObject(MMKVManger.Key.MAC_ID, macId);
        }
        return macId;
    }

    public static String getUUID() {
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        String uuid = preferences.getString(MMKVManger.Key.UUID, "");
        if (TextUtils.isEmpty(uuid)) {
            uuid = DeviceCompat.getUUID();
            preferences.putObject(MMKVManger.Key.UUID, uuid);
        }
        return uuid;
    }

    public static boolean isOpenWatching() {
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        return preferences.getBoolean(MMKVManger.Key.WATCHING_STATUS, true);
    }

    public static void setOpenWatching(boolean status) {
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        preferences.putObject(MMKVManger.Key.WATCHING_STATUS, status);
    }

    public static int getPrivacyAgreementStatus() {
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        return preferences.getInt(MMKVManger.Key.PRIVACY_AGREEMENT_STATUS, PRIVACY_AGREEMENT_STATUS_UNKNOWN);
    }

    public static void putPrivacyAgreementStatus(@IntRange(from = 0, to = 2) int status) {
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        preferences.putObject(MMKVManger.Key.PRIVACY_AGREEMENT_STATUS, status);
    }


}
