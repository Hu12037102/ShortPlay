package com.inshort.splash

import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.UserEntity
import com.inshort.base.entity.InitEntity
import com.inshort.base.http.IApiService
import retrofit2.http.POST

interface SplashService {
    @POST(IApiService.Path.SPLASH_INIT)
    suspend fun splashInit(): ResponseEntity<InitEntity>

    @POST(IApiService.Path.SPLASH_USER_LOGIN)
    suspend fun splashUserLogin(): ResponseEntity<UserEntity>
}