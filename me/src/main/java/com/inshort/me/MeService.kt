package com.inshort.me

import com.inshort.base.entity.ResponseEntity
import com.inshort.base.http.IApiService
import retrofit2.http.POST

interface MeService {
    @POST(IApiService.Path.DELETE_USER_ACCOUNT)
    suspend fun deleteAccount(): ResponseEntity<Any?>
}