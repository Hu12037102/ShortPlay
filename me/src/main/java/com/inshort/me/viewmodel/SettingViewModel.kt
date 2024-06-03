package com.inshort.me.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.inshort.base.compat.FileCompat
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.http.RetrofitManger
import com.inshort.me.MeService
import kotlinx.coroutines.launch

class SettingViewModel : BaseCompatViewModel(){
    val clearCacheLiveData = MutableLiveData<Long>()
    fun deleteAccount(){
        httpRequest(notResultLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = false){
            RetrofitManger.getInstance().create(MeService::class.java).deleteAccount()
        }
    }

    fun clearCache(){
        viewModelScope.launch {
            FileCompat.clearCacheFile()
            clearCacheLiveData.value = FileCompat.getCacheFileLength()
          //  showToast()

        }
    }
}