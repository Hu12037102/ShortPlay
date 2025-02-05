package com.inshort.home

import com.inshort.base.entity.DramaSeriesPageEntity
import com.inshort.base.entity.HomeIndexEntity
import com.inshort.base.entity.RequestPageEntity
import com.inshort.base.entity.RequestViewMoreEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.http.IApiService
import retrofit2.http.Body
import retrofit2.http.POST

interface HomeService {
    @POST(IApiService.Path.HOME_INDEX)
    suspend fun homeIndex():ResponseEntity<HomeIndexEntity>
    @POST(IApiService.Path.LOAD_ALL_TRENDING_TYPES)
    suspend fun loadAllTrendingTypes():ResponseEntity<List<String>>
    @POST(IApiService.Path.LOAD_HOME_MORE_LIST)
    suspend fun loadHomeMoreList(@Body body:RequestPageEntity):ResponseEntity<DramaSeriesPageEntity>
    @POST(IApiService.Path.LOAD_HOME_VIEW_MORE_LIST)
    suspend fun loadViewMoreList(@Body body: RequestViewMoreEntity):ResponseEntity<DramaSeriesPageEntity>

}