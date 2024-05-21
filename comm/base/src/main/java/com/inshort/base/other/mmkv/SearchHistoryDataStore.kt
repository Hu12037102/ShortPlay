package com.inshort.base.other.mmkv

import android.text.TextUtils
import com.inshort.base.compat.CollectionCompat
import com.inshort.base.compat.DataCompat

class SearchHistoryDataStore private constructor() {
    companion object {
        private val mInstance: SearchHistoryDataStore by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { SearchHistoryDataStore() }

        @JvmStatic
        fun get(): SearchHistoryDataStore = mInstance
        private const val MAX_SAVE_COUNT = 10
        private const val KEY = MMKVManger.Key.SEARCH_HISTORY_LIST;
    }

    private val mPreferences: MMKVPreferences by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        MMKVManger.getDefaultPreferences()
    }

    fun putData(value: String?) {
        try {
            if (TextUtils.isEmpty(value)) {
                return
            }
            val data = getData()
            if (data.contains(value)) {
                data.remove(value)
            }
            if (CollectionCompat.getListSize(data) >= MAX_SAVE_COUNT) {
                data.removeLastOrNull()
            }
            data.add(0, DataCompat.toString(value))
            mPreferences.putObject(KEY, data)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getData(): ArrayList<String> = kotlin.runCatching {
       val data = mPreferences.getArrayList<String>(KEY)
        data
    }.getOrDefault(arrayListOf())

    fun clear(){
        mPreferences.remove(KEY)
    }
}