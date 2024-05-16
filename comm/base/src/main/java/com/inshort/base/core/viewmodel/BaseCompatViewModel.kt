package com.inshort.base.core.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.entity.RequestTrendsByTypeEntity
import com.inshort.base.entity.DramaSeriesPageEntity
import com.inshort.base.entity.UserEntity
import com.inshort.base.http.BaseService
import com.inshort.base.http.RetrofitManger
import com.inshort.base.weight.view.Toasts


open class BaseCompatViewModel : BaseViewModel() {
    val userLiveData = MutableLiveData<UserEntity>()
    val trendsPageLiveData = MutableLiveData<DramaSeriesPageEntity>()

    fun showToast(text: String?) {
        Toasts.get().showToast(text)
    }

    fun  findTrendsByType(requestEntity:RequestTrendsByTypeEntity,
                          isShowLoading: Boolean = false,
                          isShowEmptyView: Boolean = false,
                          isJustRefresh:Boolean = false){

        httpRequest(trendsPageLiveData,isShowLoading,isShowEmptyView,isJustRefresh){
            RetrofitManger.getInstance().create(BaseService::class.java).findTrendsByType(requestEntity)
        }

    }

}