package com.inshort.base.compat;

import android.os.Build;

import com.inshort.base.digest.MD5Compat;

public final class DeviceCompat {
    private DeviceCompat() {
    }

    public static String getDevice() {
        String id = Build.BOARD + Build.BRAND + Build.DEVICE + Build.DISPLAY
                + Build.HOST + Build.ID + Build.MANUFACTURER + Build.MODEL
                + Build.PRODUCT + Build.TAGS + Build.TYPE + Build.USER + "";
        return MD5Compat.stringToString(id);
    }

    public static String getUUID() {
        return MD5Compat.stringToString(DataCompat.getOnlyId());
    }
}
