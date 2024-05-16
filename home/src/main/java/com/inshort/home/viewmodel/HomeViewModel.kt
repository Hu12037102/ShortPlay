package com.inshort.home.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.DramaSeriesPageEntity
import com.inshort.base.entity.HomeIndexEntity
import com.inshort.base.entity.RequestPageEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.base.utils.LogUtils
import com.inshort.home.HomeService

class HomeViewModel : BaseCompatViewModel() {
    val indexLiveData = MutableLiveData<HomeIndexEntity>()
    val dramaSeriesPageLiveData = MutableLiveData<DramaSeriesPageEntity>()
    override fun getInitPage(): Int = 2
    fun loadIndex() {
        httpRequest(indexLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(HomeService::class.java).homeIndex()
        }
    }

    fun loadMore() {
        LogUtils.d("loadMore", "$page-------")
        httpRequest(dramaSeriesPageLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(HomeService::class.java).loadHomeMoreList(RequestPageEntity().also {
                it.page = page
            })
        }
    }

}