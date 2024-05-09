package com.inshort.base.compat

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

object PhoneCompat {

    @JvmStatic
    fun screenWidth(context: Context) = context.resources.displayMetrics.widthPixels

    @JvmStatic
    fun screenHeight(context: Context) = context.resources.displayMetrics.heightPixels

    @JvmStatic
    fun density(context: Context): Float = context.resources.displayMetrics.density

    @JvmStatic
    fun dp2px(context: Context, dpValue: Float): Int {
        return (density(context) * dpValue + 0.5f).toInt()
    }

    @JvmStatic
    fun px2dp(context: Context, pxValue: Float): Int {
        return (pxValue / density(context) + 0.5f).toInt()
    }

    @JvmStatic
    fun copyText(text: CharSequence) {
        val service = DataCompat.applicationContext().getSystemService(Context.CLIPBOARD_SERVICE)
        if (service is ClipboardManager) {
            service.setPrimaryClip(ClipData.newPlainText(null, text))
        }
    }

    @JvmStatic
    fun getStatusBarHeight(activity: Activity?): Int = if (activity == null) {
        dp2px(DataCompat.applicationContext(), 0f)
    } else {
        val view = activity.findViewById<View>(android.R.id.content)
        ViewCompat.getRootWindowInsets(view)
            ?.getInsets(WindowInsetsCompat.Type.statusBars())?.top ?: dp2px(DataCompat.applicationContext(), 0f)
        /*    val rect = Rect()
            activity.window.decorView.getWindowVisibleDisplayFrame(rect)
            rect.top*/
    }
}