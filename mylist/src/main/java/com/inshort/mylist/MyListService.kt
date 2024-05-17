package com.inshort.mylist

import com.inshort.base.entity.MyListEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.http.IApiService
import retrofit2.http.POST

interface MyListService {
    @POST(IApiService.Path.MY_LIST_INDEX)
    suspend fun requestMyList():ResponseEntity<MyListEntity>

    @POST(IApiService.Path.PLAYBACK_HISTORY_LIST)
    suspend fun requestHisData():ResponseEntity<MutableList<MyListEntity.CollectData>>

    @POST(IApiService.Path.PLAYBACK_LOVE_LIST)
    suspend fun requestLoveData():ResponseEntity<MutableList<MyListEntity.CollectData>>

}