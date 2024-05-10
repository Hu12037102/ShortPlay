package com.inshort.base.compat

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat

class PermissionCompat {
    companion object {
        private const val PERMISSION_STATUS_REJECT = 0
        private const val PERMISSION_STATUS_FORBID = 1
        private const val PERMISSION_STATUS_OPEN = 2

        @JvmStatic
        fun getPermissionStatus(activity: Activity, permission: String): Int {
            return if (ActivityCompat.checkSelfPermission(
                    activity,
                    permission
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                PERMISSION_STATUS_OPEN
            } else {
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)) {
                    PERMISSION_STATUS_REJECT
                } else {
                    PERMISSION_STATUS_FORBID
                }
            }
        }

        @JvmStatic
        fun hasPermission(activity: Activity, permissions: Array<String>): Boolean {
            var allowPermissionCount = 0
            for (permission in permissions) {
                if (hasPermission(activity, permission)) {
                    allowPermissionCount++
                }
            }
            return allowPermissionCount == permissions.size && allowPermissionCount != 0
        }

        @JvmStatic
        fun hasPermission(activity: Activity, permission: String): Boolean {
            return getPermissionStatus(activity, permission) == PERMISSION_STATUS_OPEN
        }

    }
}