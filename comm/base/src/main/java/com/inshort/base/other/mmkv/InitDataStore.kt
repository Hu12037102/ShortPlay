package com.inshort.base.other.mmkv

import com.inshort.base.entity.InitEntity
import com.inshort.base.utils.LogUtils
import com.tencent.mmkv.MMKV

class InitDataStore {
    companion object {
        private val mInstance: InitDataStore by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { InitDataStore() }

        @JvmStatic
        fun get(): InitDataStore = mInstance
    }

    private val mPreferences: MMKVPreferences by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        MMKVManger.get().createInit()
    }

    fun putData(entity: InitEntity?) {
        mPreferences.putObject(MMKVManger.Key.INIT_PARCELABLE, entity)
    LogUtils.d("getData---","${getData()}")
    }

    fun getData(): InitEntity? = mPreferences.getParcelable(MMKVManger.Key.INIT_PARCELABLE, InitEntity::class.java)


}