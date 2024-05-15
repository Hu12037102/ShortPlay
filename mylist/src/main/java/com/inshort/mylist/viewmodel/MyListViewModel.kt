package com.inshort.mylist.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.MyListEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.mylist.MyListService

class MyListViewModel :BaseCompatViewModel(){

    val myListLiveData = MutableLiveData<MyListEntity>()
    fun requestMyList(listType:Int = 1) {
//        val map= mutableMapOf<String,Any>()
//        map["list_type"] = listType
        httpRequest(myListLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(MyListService::class.java).requestMyList()
        }

    }

}