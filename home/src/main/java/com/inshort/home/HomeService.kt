package com.inshort.home

import com.inshort.base.entity.HomeIndexEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.http.IApiService
import retrofit2.http.POST

interface HomeService {
    @POST(IApiService.Path.HOME_INDEX)
    suspend fun homeIndex():ResponseEntity<HomeIndexEntity>
    @POST(IApiService.Path.LOAD_ALL_TRENDING_TYPES)
    suspend fun loadAllTrendingTypes():ResponseEntity<List<String>>

}