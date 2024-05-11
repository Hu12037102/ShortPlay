package com.inshort.base.other.mmkv

import android.text.TextUtils
import com.inshort.base.compat.DataCompat
import com.inshort.base.entity.base.UserEntity

class UserInfoStore private constructor() {

    companion object {
       private const val KEY_USER = "mmkv_user_store"
        private val mInstance: UserInfoStore by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { UserInfoStore() }

        @JvmStatic
        fun get(): UserInfoStore = mInstance

    }

    private val mPreferences: MMKVPreferences by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        MMKVManger.get().createUserInfo()
    }

    fun getData(): UserEntity? = mPreferences.getParcelable(KEY_USER, UserEntity::class.java)
    fun putData(userEntity: UserEntity?) {
        mPreferences.putObject(KEY_USER, userEntity)
    }

    fun getInfo(): UserEntity.Info? = getData()?.info

    fun getAccessToken() = DataCompat.checkString(getData()?.accessToken)
    fun isLogin(): Boolean = TextUtils.isEmpty(getAccessToken())

}