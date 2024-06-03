package com.inshort.play


import com.inshort.base.entity.LikeHistoryEntity

import com.inshort.base.entity.MyListEntity
import com.inshort.base.entity.MyListRequestEntity
import com.inshort.base.entity.PlayRequestEntity
import com.inshort.base.entity.ResponseEntity

import com.inshort.base.entity.StoreEntity
import com.inshort.base.entity.VideoPurchaseEntity
import com.inshort.base.entity.VideoUrlEntity
import com.inshort.base.http.IApiService
import retrofit2.http.Body
import retrofit2.http.POST

interface PlayService {
    @POST(IApiService.Path.PLAY_DRAMA_SERIES)
    suspend fun requestPlayDramaSeries(@Body body: PlayRequestEntity):ResponseEntity<VideoUrlEntity.DramaSeries>

    @POST(IApiService.Path.PLAY_LIKE_HISTORY)
    suspend fun requestLikeHistory(@Body body: PlayRequestEntity):ResponseEntity<LikeHistoryEntity>

    @POST(IApiService.Path.PLAY_COLLECT_HISTORY)
    suspend fun requestCollectHistory(@Body body: PlayRequestEntity):ResponseEntity<LikeHistoryEntity>

    @POST(IApiService.Path.PLAY_SHARE_DRAMA)
    suspend fun requestFriend(@Body body: PlayRequestEntity):ResponseEntity<String>

    @POST(IApiService.Path.PLAY_BUY_DRAMA_EPISODE)
    suspend fun requestPurchase(@Body body: PlayRequestEntity):ResponseEntity<VideoPurchaseEntity>

    @POST(IApiService.Path.PLAY_QUICK_BUY_DETAILS)
    suspend fun requestStore(@Body body: PlayRequestEntity):ResponseEntity<StoreEntity>
    @POST(IApiService.Path.PLAY_AUTO_LOCK_DRAMA)
    suspend fun requestAutoLock(@Body body: PlayRequestEntity):ResponseEntity<Any?>

}