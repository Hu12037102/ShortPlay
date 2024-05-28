package com.inshort.me.viewmodel

import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.http.RetrofitManger
import com.inshort.me.MeService

class SettingViewModel : BaseCompatViewModel(){
    fun deleteAccount(){
        httpRequest(notResultLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = false){
            RetrofitManger.getInstance().create(MeService::class.java).deleteAccount()
        }
    }

}