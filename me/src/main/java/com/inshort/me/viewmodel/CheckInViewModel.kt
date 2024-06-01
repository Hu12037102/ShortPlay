package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.AwardDetailsEntity
import com.inshort.base.entity.DailyCheckInEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.me.MeService

class CheckInViewModel : BaseCompatViewModel() {
    val awardDetailsLiveData = MutableLiveData<AwardDetailsEntity>()
    val dailyCheckInLiveData = MutableLiveData<DailyCheckInEntity>()
    fun loadData() {
        httpRequest(awardDetailsLiveData, isShowLoading = true, isShowEmptyView = true, isJustRefresh = false) {
            RetrofitManger.getInstance().create(MeService::class.java).loadAwardDetails().also {
                updateBalance(it.data?.balance,it.data?.coinsBalance,it.data?.bonusBalance)
            }
        }
    }
    fun dailyCheckIn(){
        httpRequest(dailyCheckInLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true){
            RetrofitManger.getInstance().create(MeService::class.java).dailyCheckIn().also {
               updateBalance(it.data?.balance,it.data?.coinsBalance,it.data?.bonusBalance)
            }
        }
    }
}