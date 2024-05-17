package com.inshort.home.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.http.RetrofitManger
import com.inshort.home.HomeService

class TrendingViewModel : BaseCompatViewModel() {
    val trendingTypesLiveData = MutableLiveData<List<String>>()
    fun loadTrendingTypes() {
        httpRequest(trendingTypesLiveData, isShowLoading = true, isShowEmptyView = true, isJustRefresh = false) {
            RetrofitManger.getInstance().create(HomeService::class.java).loadAllTrendingTypes()
        }
    }
}