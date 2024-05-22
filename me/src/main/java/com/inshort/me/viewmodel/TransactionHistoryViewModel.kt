package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.TransactionHistoryEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.me.MeService

class TransactionHistoryViewModel:BaseCompatViewModel() {
    val transactionHistoriesLiveData = MutableLiveData<List<TransactionHistoryEntity>>()
    fun loadData(){
        httpRequest(transactionHistoriesLiveData, isShowLoading = true, isShowEmptyView = true, isJustRefresh = false){
            RetrofitManger.getInstance().create(MeService::class.java).loadTransactionHistoryList()
        }
    }
}