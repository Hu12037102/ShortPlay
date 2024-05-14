package com.inshort.base.core.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inshort.base.Contracts
import com.inshort.base.entity.base.ResponseEntity
import com.inshort.base.entity.base.ResponseErrorEntity
import com.inshort.base.http.IApiService
import com.inshort.base.utils.LogUtils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Response

open class BaseViewModel : ViewModel() {
    val httpErrorLiveData = MutableLiveData<ResponseErrorEntity>()
    val loadingLiveData = MutableLiveData<Boolean>()

    val emptyViewLiveData = MutableLiveData<Boolean>()
    var isRefresh = true
    val pageSize = Contracts.DEFAULT_PAGE_SIZE
    var page = Contracts.DEFAULT_PAGE

    fun pagerReset() {
        isRefresh = true
        page = Contracts.DEFAULT_PAGE
    }


    protected fun <T> httpRequest(
        liveData: MutableLiveData<T>,
        isShowLoading: Boolean = false,
        isShowEmptyView: Boolean = true,
        black: suspend () -> ResponseEntity<T>
    ) {
        viewModelScope.launch {
            if (isShowLoading) {
                loadingLiveData.value = true
                delay(300)
            }
            val response = kotlin.runCatching {
                black.invoke()
            }.getOrDefault(null)
            disposeRetrofit(liveData, response, isShowEmptyView)
            if (isShowLoading) {
                loadingLiveData.value = false
            }

        }
    }

    private fun <T> disposeRetrofit(
        liveData: MutableLiveData<T>, response: ResponseEntity<T>?,
        isShowEmptyView: Boolean
    ) {
        try {
            if (response != null && response.code == IApiService.HttpCode.SUCCEED) {
                if (isShowEmptyView) {
                    emptyViewLiveData.value = false
                }
                val data = response.data
                liveData.value = data

            } else {
                if (isShowEmptyView) {
                    emptyViewLiveData.value = true
                }
                val errorEntity = ResponseErrorEntity().also {
                    it.code = response?.code ?: IApiService.HttpCode.UNAVAILABLE
                    it.liveData = liveData
                }
                httpErrorLiveData.value = errorEntity
            }


            /* if (response == null) {
                 if (isShowEmptyView) {
                     emptyViewLiveData.value = true
                 }
             } else {
                 when (response.code) {
                     IApiService.HttpCode.SUCCEED -> {
                         if (isShowEmptyView) {
                             emptyViewLiveData.value = false
                         }
                         val data = response.data
                         liveData.value = data

                     }


                     else -> {
                         if (isShowEmptyView) {
                             emptyViewLiveData.value = true
                         }
                     }
                 }
             }*/
            LogUtils.d("disposeRetrofit--", "$response")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}