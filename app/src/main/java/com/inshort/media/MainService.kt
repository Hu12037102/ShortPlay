package com.inshort.media

import com.inshort.base.entity.DramaSeriesPageEntity
import com.inshort.base.entity.RequestViewMoreEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.http.IApiService
import retrofit2.http.Body
import retrofit2.http.POST

/**

 * @author: 张勇

 * @date: 2024/6/3

 */
interface MainService {
    @POST(IApiService.Path.GOOGLE_PRODUCT_ID_LIST)
    suspend fun requestGoogleProductIdList(): ResponseEntity<List<String>>
}