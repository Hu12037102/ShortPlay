package com.inshort.play

import com.inshort.base.entity.MyListEntity
import com.inshort.base.entity.MyListRequestEntity
import com.inshort.base.entity.PlayRequestEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.VideoUrlEntity
import com.inshort.base.http.IApiService
import retrofit2.http.Body
import retrofit2.http.POST

interface PlayService {
    @POST(IApiService.Path.PLAY_DRAMA_SERIES)
    suspend fun requestPlayDramaSeries(@Body body: PlayRequestEntity):ResponseEntity<VideoUrlEntity.DramaSeries>


}