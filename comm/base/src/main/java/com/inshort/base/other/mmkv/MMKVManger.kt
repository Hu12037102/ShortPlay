package com.inshort.base.other.mmkv

import com.tencent.mmkv.MMKV
import java.util.UUID

class MMKVManger private constructor() {

    companion object {

        private val mInstance: MMKVManger by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { MMKVManger() }

        @JvmStatic
        fun get(): MMKVManger = mInstance

        @JvmStatic
        fun getDefaultPreferences() = mInstance.createDefault()
    }

    private fun createDefault(): MMKVPreferences = MMKVPreferences(MMKV.defaultMMKV())
    fun createUserInfo(): MMKVPreferences = MMKVPreferences(MMKV.mmkvWithID(WithId.USER_INFO))
    fun createInit(): MMKVPreferences = MMKVPreferences(MMKV.mmkvWithID(WithId.INIT))


    object WithId {
        const val USER_INFO = "mmkv_with_id_user_info"
        const val INIT = "mmkv_with_id_init"
    }

    object Key {
        const val MAC_ID: String = "mmkv_mac_id"
        const val UUID: String = "mmkv_uuid"
        const val WATCHING_STATUS = "mmkv_watching_status"
        const val SEARCH_HISTORY_LIST = "mmkv_search_history_list"
        const val INIT_PARCELABLE:String="mmkv_init_parcelable"
        const val PRIVACY_AGREEMENT_STATUS="mmkv_privacy_agreement_status"
        const val VERSION_UPDATE_TIMESTAMP="mmkv_version_update_timestamp"
    }


}