package com.inshort.base.core.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.entity.UserEntity
import com.inshort.base.weight.view.Toasts


open class BaseCompatViewModel : BaseViewModel() {
    val userLiveData = MutableLiveData<UserEntity>()

    fun showToast(text: String?) {
        Toasts.get().showToast(text)
    }

}