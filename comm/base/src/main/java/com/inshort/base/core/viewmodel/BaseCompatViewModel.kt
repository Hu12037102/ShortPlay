package com.inshort.base.core.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.entity.base.UserEntity


open class BaseCompatViewModel : BaseViewModel(){
    val userLiveData = MutableLiveData<UserEntity>()


}