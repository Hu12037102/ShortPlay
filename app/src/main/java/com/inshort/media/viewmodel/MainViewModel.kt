package com.inshort.media.viewmodel

import android.content.Context

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.inshort.base.compat.DataCompat
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.HomeIndexEntity
import com.inshort.base.entity.MainBottomTabEntity
import com.inshort.base.entity.RequestPageEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.base.other.arouter.ARouterConfig
import com.inshort.base.pay.GooglePayManager
import com.inshort.home.HomeService
import com.inshort.media.MainService
import kotlinx.coroutines.launch

class MainViewModel : BaseCompatViewModel() {
    val productIdAllLiveData = MutableLiveData<List<String>>()

    fun getBottomTabData(context: Context): List<MainBottomTabEntity> = arrayListOf(
        MainBottomTabEntity().also {
            it.content = DataCompat.getResString(context, com.inshort.base.R.string.home_content)
            it.isSelector = true
            it.normalRes = com.inshort.base.R.mipmap.icon_main_home_tab_normal
            it.selectorRes = com.inshort.base.R.mipmap.icon_main_home_tab_selector
            it.type = MainBottomTabEntity.TYPE_HOME
            it.fragmentPath = ARouterConfig.Path.Home.FRAGMENT_HOME
        }, MainBottomTabEntity().also {
            it.content = DataCompat.getResString(context, com.inshort.base.R.string.search_content)
            it.isSelector = false
            it.normalRes = com.inshort.base.R.mipmap.icon_main_search_tab_normal
            it.selectorRes = com.inshort.base.R.mipmap.icon_main_search_tab_selector
            it.type = MainBottomTabEntity.TYPE_SEARCH
            it.fragmentPath = ARouterConfig.Path.Search.FRAGMENT_SEARCH
        }, MainBottomTabEntity().also {
            it.content = DataCompat.getResString(context, com.inshort.base.R.string.mylist_content)
            it.isSelector = false
            it.normalRes = com.inshort.base.R.mipmap.icon_main_mylist_tab_normal
            it.selectorRes = com.inshort.base.R.mipmap.icon_main_mylist_tab_selector
            it.type = MainBottomTabEntity.TYPE_MY_LIST
            it.fragmentPath = ARouterConfig.Path.MyList.FRAGMENT_MYLIST
        }, MainBottomTabEntity().also {
            it.content = DataCompat.getResString(context, com.inshort.base.R.string.me_content)
            it.isSelector = false
            it.normalRes = com.inshort.base.R.mipmap.icon_main_me_tab_normal
            it.selectorRes = com.inshort.base.R.mipmap.icon_main_me_tab_selector
            it.type = MainBottomTabEntity.TYPE_ME
            it.fragmentPath = ARouterConfig.Path.Me.FRAGMENT_ME
        }
    )


    /**
     * 获取Google 商品ID
     */
    fun productIdAllList() {
        httpRequest(productIdAllLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(MainService::class.java).requestGoogleProductIdList().apply {
                GooglePayManager.getInstance().queryPurchases(data)
            }
        }
    }
}