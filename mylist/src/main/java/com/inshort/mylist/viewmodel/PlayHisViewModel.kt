package com.inshort.mylist.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.MyListEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.mylist.MyListService

/**

 * @author: 张勇

 * @date: 2024/5/15

 */
class PlayHisViewModel : BaseCompatViewModel() {
    var backLiveData : MutableLiveData<MutableList<MyListEntity.CollectData>> = MutableLiveData()

    /**
     * 获取历史数据
     */
    fun requestHisData(){
        httpRequest(backLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(MyListService::class.java).requestHisData()
        }
    }

    /**
     * 获取喜爱数据
     */
    fun requestLoveData(){
        httpRequest(backLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(MyListService::class.java).requestLoveData()
        }
    }


    /**
     * 收藏
     */
    fun collectUpdate(isCancel:Boolean,dramaSeriesId:Int,episodeNumber:Int){
        val map = mutableMapOf<String,Any>()
        map["drama_series_id"] = dramaSeriesId
        map["is_cancel"] = !isCancel
        map["episode_number"] = episodeNumber
        httpRequest(backLiveData, isShowLoading = true, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(MyListService::class.java).requestHisData()
        }
    }

}