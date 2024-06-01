package com.inshort.base.weight.view

import android.app.Activity
import android.app.Application
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.view.ViewCompat
import com.inshort.base.compat.DataCompat
import com.inshort.base.compat.PhoneCompat
import com.inshort.base.databinding.ToastViewBinding

class Toasts private constructor() : Application.ActivityLifecycleCallbacks {

    companion object {
        private val mInstance: Toasts by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Toasts()
        }

        @JvmStatic
        fun get(): Toasts {
            return mInstance;
        }

    }

    init {
        val applicationContext = DataCompat.applicationContext()
        if (applicationContext is Application) {
            applicationContext.registerActivityLifecycleCallbacks(this)
        }
    }


    private var mToast: Toast? = null


    fun showToast(text: String?) {
        if (TextUtils.isEmpty(text)) {
            return
        }
        cancel()
        mToast = Toast.makeText(DataCompat.applicationContext(), text, Toast.LENGTH_SHORT)
        mToast?.let {
            it.setGravity(Gravity.CENTER, 0, 0)
            val toastViewBinding = ToastViewBinding.inflate(LayoutInflater.from(DataCompat.applicationContext()))
            val atvToast = toastViewBinding.atvToast
            ViewCompat.setBackground(atvToast, getToastBackground())
            it.view = toastViewBinding.root
            atvToast.text = text
            it.show()
        }

    }

    private fun cancel() {
        mToast?.cancel()
        mToast = null
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStopped(activity: Activity) {
        cancel()
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    }

    override fun onActivityDestroyed(activity: Activity) {
    }

    private fun getToastBackground(): Drawable = GradientDrawable().apply {
        this.cornerRadius = PhoneCompat.dp2px(DataCompat.applicationContext(), 6f).toFloat()
        this.setColor(Color.BLACK)
    }
}