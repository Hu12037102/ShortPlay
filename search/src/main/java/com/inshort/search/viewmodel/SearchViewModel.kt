package com.inshort.search.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.RequestSearchEntity
import com.inshort.base.entity.SearchPageEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.search.SearchService

class SearchViewModel :BaseCompatViewModel(){
    val searchLiveData= MutableLiveData<SearchPageEntity>()
    fun findListByKeyword(keyword:String){
        httpRequest(searchLiveData, isShowLoading = false, isShowEmptyView = true, isJustRefresh = true){
            RetrofitManger.getInstance().create(SearchService::class.java).searchListByKeyword(RequestSearchEntity().also {
                it.page = page
                it.searchKeyword = keyword
            })
        }

    }
}