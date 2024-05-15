package com.inshort.home.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.HomeIndexEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.home.HomeService

class HomeViewModel : BaseCompatViewModel() {
    val indexLiveData = MutableLiveData<HomeIndexEntity>()
    fun loadIndex() {
        httpRequest(indexLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(HomeService::class.java).homeIndex()
        }
    }

}