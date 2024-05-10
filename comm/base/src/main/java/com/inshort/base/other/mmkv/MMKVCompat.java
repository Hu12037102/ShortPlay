package com.inshort.base.other.mmkv;

import android.text.TextUtils;

import com.inshort.base.compat.DeviceCompat;

public final class MMKVCompat {
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
    public static String getUUID(){
        MMKVPreferences preferences = MMKVManger.getDefaultPreferences();
        String uuid = preferences.getString(MMKVManger.Key.UUID, "");
        if (TextUtils.isEmpty(uuid)) {
            uuid = DeviceCompat.getUUID();
            preferences.putObject(MMKVManger.Key.UUID, uuid);
        }
        return uuid;
    }
}
