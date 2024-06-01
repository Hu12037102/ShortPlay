package com.inshort.home.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.DramaSeriesPageEntity
import com.inshort.base.entity.RequestViewMoreEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.home.HomeService

class ViewMoreViewModel : BaseCompatViewModel() {
    val viewMoreListLiveData = MutableLiveData<DramaSeriesPageEntity>()
    fun loadData(id: Int) {
        httpRequest(viewMoreListLiveData, isShowLoading = true, isShowEmptyView = true, isJustRefresh = true) {
            RetrofitManger.getInstance().create(HomeService::class.java).loadViewMoreList(
                RequestViewMoreEntity().also {
                    it.columnId = id
                    it.page = page
                }
            )
        }
    }
}