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
    fun createUserInfo():MMKVPreferences = MMKVPreferences(MMKV.mmkvWithID("user_info"))

    object Key {
        const val MAC_ID: String = "mmkv_mac_id"
        const val UUID: String = "mmkv_uuid"
        const val WATCHING_STATUS="mmkv_watching_status"
    }


}