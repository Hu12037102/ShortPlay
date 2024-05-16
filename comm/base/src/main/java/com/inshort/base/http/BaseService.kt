package com.inshort.base.http

import com.inshort.base.entity.RequestTrendsByTypeEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.DramaSeriesPageEntity
import retrofit2.http.Body
import retrofit2.http.POST

interface BaseService {
    @POST(IApiService.Path.FIND_TRENDING_LIST_BY_TYPE)
    suspend fun findTrendsByType(@Body request:RequestTrendsByTypeEntity):ResponseEntity<DramaSeriesPageEntity>
}