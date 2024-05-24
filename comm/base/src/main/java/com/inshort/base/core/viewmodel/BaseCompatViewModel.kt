package com.inshort.base.core.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.compat.DataCompat
import com.inshort.base.entity.RequestTrendsByTypeEntity
import com.inshort.base.entity.DramaSeriesPageEntity
import com.inshort.base.entity.InitEntity
import com.inshort.base.entity.UserEntity
import com.inshort.base.http.BaseService
import com.inshort.base.http.RetrofitManger
import com.inshort.base.other.mmkv.UserDataStore
import com.inshort.base.weight.view.Toasts


open class BaseCompatViewModel : BaseViewModel() {
    val userLiveData = MutableLiveData<UserEntity>()
    val trendsPageLiveData = MutableLiveData<DramaSeriesPageEntity>()
    val notResultLiveData = MutableLiveData<Any?>()


    fun findTrendsByType(
        requestEntity: RequestTrendsByTypeEntity,
        isShowLoading: Boolean = false,
        isShowEmptyView: Boolean = false,
        isJustRefresh: Boolean = false
    ) {

        httpRequest(trendsPageLiveData, isShowLoading, isShowEmptyView, isJustRefresh) {
            RetrofitManger.getInstance().create(BaseService::class.java).findTrendsByType(requestEntity)
        }

    }

    fun initUserLogin() {
        httpRequest(userLiveData, true) {
            RetrofitManger.getInstance().create(BaseService::class.java).splashUserLogin()
        }
    }

    fun updateBalance(balance: Int?, coinsBalance: Int?, bonusBalance: Int?) {
        val entity = UserDataStore.get().getData()
        if (DataCompat.notNull(entity)) {
            entity?.info?.balance = balance?:0
            entity?.info?.coinsBalance = coinsBalance?:0
            entity?.info?.bonusBalance = bonusBalance?:0
            userLiveData.value = entity
        }
    }
}