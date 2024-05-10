package com.inshort.base.compat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

public final class NetworkCompat {
    public static final String UNKNOWN = "UNKNOWN";
    private NetworkCompat() {
    }

    public static boolean isNetWorkAvailable() {
        Context context = DataCompat.applicationContext();
        Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (systemService instanceof ConnectivityManager manger) {
            NetworkInfo networkInfo = manger.getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isAvailable();
        }
        return false;
    }

   /* public static String getNetWorkType(@Nullable Activity context) {
        String netType = UNKNOWN;
        if (DataCompat.isNull(context)) {
            return netType;
        }
        boolean isCheckPermission = PermissionCompat.hasPermission(context, Manifest.permission.READ_PHONE_STATE);
        if (isNetWorkAvailable()) {
            Object obj = context.getSystemService(Context.TELEPHONY_SERVICE);
            if (obj instanceof TelephonyManager telephonyManager && isCheckPermission) {
                @SuppressLint("MissingPermission")
                int networkType = telephonyManager.getNetworkType();
                if (networkType == TelephonyManager.NETWORK_TYPE_GPRS || networkType == TelephonyManager.NETWORK_TYPE_EDGE) {
                    netType = TWO_G;
                } else if (networkType == TelephonyManager.NETWORK_TYPE_UMTS || networkType == TelephonyManager.NETWORK_TYPE_HSDPA
                        || networkType == TelephonyManager.NETWORK_TYPE_HSPA || networkType == TelephonyManager.NETWORK_TYPE_HSPAP
                        || networkType == TelephonyManager.NETWORK_TYPE_HSUPA || networkType == TelephonyManager.NETWORK_TYPE_EVDO_0
                        || networkType == TelephonyManager.NETWORK_TYPE_EVDO_A || networkType == TelephonyManager.NETWORK_TYPE_EVDO_B) {
                    netType = THREE_G;
                } else if (networkType == TelephonyManager.NETWORK_TYPE_LTE) {
                    netType = FORE_G;
                } else if (networkType == TelephonyManager.NETWORK_TYPE_NR) {
                    netType = FIVE_G;
                } else {
                    netType = UNKNOWN;
                }
            }
        }
        return netType;
    }*/

    public static String getMobileNetType(@Nullable Context context) {
        String netType = UNKNOWN;
        if (DataCompat.isNull(context)) {
            return netType;
        }
        Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (systemService instanceof ConnectivityManager manger) {
            NetworkInfo networkInfo = manger.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable()) {
                netType = networkInfo.getTypeName();
            }
        }
        return netType;
    }
}
