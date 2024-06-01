package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.StoreEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.base.other.mmkv.UserDataStore
import com.inshort.me.MeService
import kotlinx.coroutines.delay

class StoreViewModel : BaseCompatViewModel() {
    val storeLiveData = MutableLiveData<StoreEntity>()
    fun loadData() {
        httpRequest(storeLiveData, isShowEmptyView = false, isShowLoading = true, isJustRefresh = false) {
            RetrofitManger.getInstance().create(MeService::class.java).loadStoreList().also {
                updateBalance(it.data?.balance , it.data?.coinsBalance , it.data?.bonusBalance )
            }
        }
    }
}