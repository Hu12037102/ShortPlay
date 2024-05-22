package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.TransactionHistoryEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.me.MeService

class EpisodesUnlockedViewModel : BaseCompatViewModel() {
    val episodesUnlockLiveData = MutableLiveData<List<TransactionHistoryEntity>>()
    fun loadData() {
        httpRequest(episodesUnlockLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(MeService::class.java).loadEpisodeUnlockList()
        }
    }
}