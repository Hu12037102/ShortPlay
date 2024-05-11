package com.inshort.splash

import com.inshort.base.entity.splash.InitEntity
import com.inshort.base.http.IApiService
import retrofit2.Response
import retrofit2.http.POST

interface SplashService {
    @POST(IApiService.Path.SPLASH_INIT)
    suspend fun splashInit(): Response<InitEntity>
}