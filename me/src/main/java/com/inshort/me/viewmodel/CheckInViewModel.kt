package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.compat.DataCompat
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.AwardDetailsEntity
import com.inshort.base.entity.DailyCheckInEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.base.other.mmkv.UserDataStore
import com.inshort.me.MeService

class CheckInViewModel : BaseCompatViewModel() {
    val awardDetailsLiveData = MutableLiveData<AwardDetailsEntity>()
    val dailyCheckInLiveData = MutableLiveData<DailyCheckInEntity>()
    fun loadData() {
        httpRequest(awardDetailsLiveData, isShowLoading = true, isShowEmptyView = true, isJustRefresh = false) {
            RetrofitManger.getInstance().create(MeService::class.java).loadAwardDetails().also {
                updateBalance(it.data?.balance, it.data?.coinsBalance, it.data?.bonusBalance)
            }
        }
    }

    fun dailyCheckIn() {
        httpRequest(dailyCheckInLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(MeService::class.java).dailyCheckIn().also {
                updateCheckIn(it.data)
            }
        }
    }

    private fun updateCheckIn(entity: DailyCheckInEntity?) {
        if (entity == null) {
            return
        }
        val userDataStore = UserDataStore.get().getData()
        if (DataCompat.notNull(entity)) {
            userDataStore?.info?.balance = entity.balance
            userDataStore?.info?.coinsBalance = entity.coinsBalance
            userDataStore?.info?.bonusBalance = entity.bonusBalance
            userDataStore?.checkInInfo?.isCheckedIn = true
            userLiveData.value = userDataStore
        }
    }
}