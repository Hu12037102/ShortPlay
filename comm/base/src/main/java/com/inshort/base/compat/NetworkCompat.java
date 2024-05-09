package com.inshort.base.compat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class NetworkCompat {
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
}
