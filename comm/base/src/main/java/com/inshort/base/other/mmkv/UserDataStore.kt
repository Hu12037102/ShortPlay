package com.inshort.base.other.mmkv

import android.text.TextUtils
import com.inshort.base.compat.DataCompat
import com.inshort.base.entity.UserEntity

class UserDataStore private constructor() {

    companion object {
        private const val KEY_USER = "mmkv_user_store"
        private val mInstance: UserDataStore by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { UserDataStore() }

        @JvmStatic
        fun get(): UserDataStore = mInstance

    }

    private val mPreferences: MMKVPreferences by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        MMKVManger.get().createUserInfo()
    }

    fun getData(): UserEntity? = mPreferences.getParcelable(KEY_USER, UserEntity::class.java)
    fun putData(userEntity: UserEntity?) {
        mPreferences.putObject(KEY_USER, userEntity)
    }

    fun getInfo(): UserEntity.Info? = getData()?.info
    fun putInfo(info: UserEntity.Info?) {
        val entity = getData()
        if (DataCompat.notNull(entity)) {
            entity?.info = info
            putData(entity)
        }

    }

    fun getAccessToken() = DataCompat.checkString(getData()?.accessToken)
    fun isLogin(): Boolean = !TextUtils.isEmpty(getAccessToken())




}