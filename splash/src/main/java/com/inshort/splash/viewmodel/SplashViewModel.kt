package com.inshort.splash.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.InitEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.base.other.mmkv.InitDataStore
import com.inshort.base.other.mmkv.MMKVManger
import com.inshort.splash.SplashService

class SplashViewModel : BaseCompatViewModel() {

    val initializeLiveData = MutableLiveData<InitEntity>()
    fun initialize() {
        httpRequest(initializeLiveData, true) {
            RetrofitManger.getInstance().create(SplashService::class.java).splashInit()
                .also {
                    InitDataStore.get().putData(it.data)
                }

        }
    }


}