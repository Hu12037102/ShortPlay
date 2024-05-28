package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.BonusExpireEntity
import com.inshort.base.entity.PageEntity
import com.inshort.base.entity.RequestPageEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.me.MeService

class BonusExpireViewModel : BaseCompatViewModel() {
    val bonusExpireLiveData = MutableLiveData<PageEntity<BonusExpireEntity>>()

    fun loadData() {
        httpRequest(bonusExpireLiveData, isShowLoading = true, isShowEmptyView = true, isJustRefresh = true) {
            RetrofitManger.getInstance().create(MeService::class.java).loadBonusExpireList(RequestPageEntity().also {
                it.page = page
            })
        }

    }
}