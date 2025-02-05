package com.inshort.base.compat;

import android.content.Context;
import android.content.pm.PackageInfo;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

public final class PackageInfoCompat {
    private PackageInfoCompat() {

    }

    public static int getVersionCode(@Nullable Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (DataCompat.isNull(packageInfo)) {
            return 0;
        } else {
            return packageInfo.versionCode;
        }
    }

    public static String getVersionName(@Nullable Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (DataCompat.isNull(packageInfo)) {
            return "";
        } else {
            return packageInfo.versionName;
        }
    }

    @Nullable
    private static PackageInfo getPackageInfo(@Nullable Context context) {
        PackageInfo packageInfo = null;
        try {
            if (DataCompat.isNull(context)) {
                return null;
            }
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packageInfo;
    }
    @NonNull
    public static String getAppName(@Nullable Context context) {
        if (context == null) {
            return "";
        }
        PackageInfo packageInfo = getPackageInfo(context);
        if (DataCompat.notNull(packageInfo) && DataCompat.notNull(packageInfo.applicationInfo)) {
            return DataCompat.toString(context.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
        } else {
            return "";
        }
    }
}
