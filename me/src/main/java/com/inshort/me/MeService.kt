package com.inshort.me

import com.inshort.base.entity.BonusExpireEntity
import com.inshort.base.entity.PageEntity
import com.inshort.base.entity.RequestBonusExpireEntity
import com.inshort.base.entity.RequestPageEntity
import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.StoreEntity
import com.inshort.base.entity.TransactionHistoryEntity
import com.inshort.base.http.IApiService
import retrofit2.http.Body
import retrofit2.http.POST

interface MeService {
    @POST(IApiService.Path.DELETE_USER_ACCOUNT)
    suspend fun deleteAccount(): ResponseEntity<Any?>
    @POST(IApiService.Path.LOAD_TRANSACTION_HISTORY_LIST)
    suspend fun loadTransactionHistoryList():ResponseEntity<List<TransactionHistoryEntity>>
    @POST(IApiService.Path.LOAD_EPISODE_UNLOCK_LIST)
    suspend fun loadEpisodeUnlockList():ResponseEntity<List<TransactionHistoryEntity>>
    @POST(IApiService.Path.LOAD_BONUS_EXPIRE_LIST)
    suspend fun loadBonusExpireList(@Body body: RequestPageEntity):ResponseEntity<PageEntity<BonusExpireEntity>>
    @POST(IApiService.Path.LOAD_STORE_LIST)
    suspend fun loadStoreList():ResponseEntity<StoreEntity>
}