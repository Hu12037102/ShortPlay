package com.inshort.search

import com.inshort.base.entity.RequestSearchEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.SearchPageEntity
import com.inshort.base.http.IApiService
import retrofit2.http.Body
import retrofit2.http.POST

interface SearchService {
    @POST(IApiService.Path.SEARCH_LIST_BY_KEYWORD)
    suspend fun searchListByKeyword(@Body body:RequestSearchEntity):ResponseEntity<SearchPageEntity>
}