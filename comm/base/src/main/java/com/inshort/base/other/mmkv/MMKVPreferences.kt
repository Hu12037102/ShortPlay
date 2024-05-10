package com.inshort.base.other.mmkv

import android.os.Parcelable
import android.text.TextUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.inshort.base.compat.CollectionCompat
import com.inshort.base.compat.DataCompat
import com.tencent.mmkv.MMKV
import io.reactivex.annotations.Nullable

class MMKVPreferences(private val mmkv: MMKV) {
    fun putObject(key: String?, value: Any?) {
        try {
            if (TextUtils.isEmpty(key) || DataCompat.isNull(value)) {
                return
            }
            when (value) {
                is Boolean -> {
                    mmkv.encode(key, value)
                }

                is Int -> {
                    mmkv.encode(key, value)
                }

                is Float -> {
                    mmkv.encode(key, value)
                }

                is Double -> {
                    mmkv.encode(key, value)
                }

                is Set<*> -> {
                    val set = HashSet<String>()
                    value.forEach { data ->
                        if (data is String) {
                            set.add(data)

                        }
                    }
                    mmkv.encode(key, set)
                }

                is Parcelable -> {
                    mmkv.encode(key, value)
                }

                is ArrayList<*> -> {
                    mmkv.encode(key, Gson().toJson(value))
                }

                else -> {
                    mmkv.encode(key, "$value")
                }

            }
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }

    fun getString(key: String, defaultString: String = ""): String = kotlin.runCatching { mmkv.decodeString(key, defaultString) ?: "" }
        .getOrDefault(defaultString)

    fun getInt(key: String, defaultInt: Int = 0): Int = kotlin.runCatching { mmkv.decodeInt(key, defaultInt) }.getOrDefault(defaultInt)

    fun getFloat(key: String, defaultFloat: Float = 0F): Float = kotlin.runCatching { mmkv.decodeFloat(key, defaultFloat) }.getOrDefault(defaultFloat)
    fun <T : Parcelable> getParcelable(key: String, clazz: Class<T>): Parcelable? =
        kotlin.runCatching { mmkv.decodeParcelable(key, clazz) }.getOrDefault(null)

    fun getBoolean(key: String, defaultBoolean: Boolean = false): Boolean =
        kotlin.runCatching { mmkv.decodeBool(key, defaultBoolean) }.getOrDefault(defaultBoolean)

    fun <T> getArrayList(key: String): ArrayList<T> {
        val list = ArrayList<T>()
        try {
            val value = getString(key)
            val json = if (TextUtils.isEmpty(value)) "[]" else value
            val type = object : TypeToken<ArrayList<T>>() {}.type
            val gson = Gson()
            val data = gson.fromJson<List<T>>(json, type)
            if (!CollectionCompat.isEmptyList(data)) {
                list.addAll(data)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return list
    }

    fun getDouble(key: String, defaultDouble: Double = 0.0): Double =
        kotlin.runCatching { mmkv.decodeDouble(key, defaultDouble) }.getOrDefault(defaultDouble)

    fun clear() {
        mmkv.clearAll()
    }

    fun remove(key: String) {
        mmkv.removeValueForKey(key)
    }


}