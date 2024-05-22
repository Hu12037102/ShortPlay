package com.inshort.me

import com.inshort.base.entity.ResponseEntity
import com.inshort.base.entity.TransactionHistoryEntity
import com.inshort.base.http.IApiService
import retrofit2.http.POST

interface MeService {
    @POST(IApiService.Path.DELETE_USER_ACCOUNT)
    suspend fun deleteAccount(): ResponseEntity<Any?>
    @POST(IApiService.Path.LOAD_TRANSACTION_HISTORY_LIST)
    suspend fun loadTransactionHistoryList():ResponseEntity<List<TransactionHistoryEntity>>
    @POST(IApiService.Path.LOAD_EPISODE_UNLOCK_LIST)
    suspend fun loadEpisodeUnlockList():ResponseEntity<List<TransactionHistoryEntity>>
}