package com.inshort.base.core.viewmodel

import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inshort.base.Contracts
import com.inshort.base.entity.LikeHistoryEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.ResponseErrorEntity
import com.inshort.base.http.IApiService
import com.inshort.base.utils.LogUtils
import com.inshort.base.weight.view.Toasts
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel() {
    val httpErrorLiveData = MutableLiveData<ResponseErrorEntity>()
    val loadingLiveData = MutableLiveData<Boolean>()
    val emptyViewLiveData = MutableLiveData<Boolean>()
    val refreshLiveData = MutableLiveData<Boolean>()

    protected open fun getInitPage(): Int = Contracts.DEFAULT_PAGE

    var isRefresh = true
    val pageSize = Contracts.DEFAULT_PAGE_SIZE
    var page: Int = Contracts.DEFAULT_PAGE

    fun pagerReset() {
        isRefresh = true
        page = getInitPage()
    }

    fun showToast(text: String?) {
        Toasts.get().showToast(text)
    }

    init {
        pagerReset()
    }

    fun pagerAdd() {
        page++
    }


    protected fun <T> httpRequest(
        liveData: MutableLiveData<T>,
        isShowLoading: Boolean = false,
        isShowEmptyView: Boolean = true,
        isJustRefresh: Boolean = false,
        black: suspend () -> ResponseEntity<T>
    ) {
        viewModelScope.launch {
            if (isShowLoading) {
                loadingLiveData.value = true
                delay(300)
            }
            val response = kotlin.runCatching {
                black.invoke()
            }.getOrElse {
                it.printStackTrace()
                null
            }
            disposeRetrofit(liveData, response, isShowEmptyView, isJustRefresh)
            if (isShowLoading) {
                loadingLiveData.value = false
            }

        }
    }


    private fun <T> disposeRetrofit(
        liveData: MutableLiveData<T>,
        response: ResponseEntity<T>?,
        isShowEmptyView: Boolean,
        isJustRefresh: Boolean = false
    ) {
        try {
            if (isJustRefresh) {
                refreshLiveData.value = isRefresh
            }
            if (response != null && response.code == IApiService.HttpCode.SUCCEED) {
                if (isShowEmptyView) {
                    emptyViewLiveData.value = false
                }
                LogUtils.d("disposeRetrofit >> ")
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
                val message = response?.message
                if (!TextUtils.isEmpty(message)) {
                    showToast(response?.message)
                }
            }
            LogUtils.d("disposeRetrofit--", "$response--")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}