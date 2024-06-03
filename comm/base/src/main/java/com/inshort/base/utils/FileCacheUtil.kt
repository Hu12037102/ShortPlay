package com.inshort.base.utils

import android.content.Context
import android.text.TextUtils
import com.google.gson.Gson
import com.inshort.base.compat.DataCompat
import com.inshort.base.entity.VideoUrlEntity
import java.io.File
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

/**

 * @author: 张勇

 * @date: 2024/5/24

 */

fun readPlayVideoData(archivedPath:String): VideoUrlEntity?{
    val md5Str = md5(archivedPath)
    val file = getFilePath(DataCompat.applicationContext(), "play", md5Str)
    if (!file.exists()){  //判断文件是否存在
        return  null   //不存在
    }
    val str = FileHelper.readFile(file.absolutePath)
    if(str.isNotEmpty()) {
        return Gson().fromJson(str, VideoUrlEntity::class.java)
    }
    return null
}


/**
 * 缓存播放数据
 */
fun writePlayVideoData(archivedPath:String,text:String){
    ThreadUtils.runOnSubThread {
        val md5Str = md5(archivedPath)
        val file = getFilePath(DataCompat.applicationContext(), "play", md5Str)
        FileHelper.writeFile(file.absolutePath,text)
    }
}


fun getFilePath(mContext: Context,path:String,pajtName:String):File{
    var cacheDir: File? = null
    if (cacheDir == null) {
        cacheDir = mContext.filesDir
    }
    if (cacheDir == null) {
        val cacheDirPath = "/data/data/" + mContext.packageName + "/files/"
        cacheDir = File(cacheDirPath)
    }
    return File(cacheDir, "$path/$pajtName")
}

/**
 * md5加密
 */
private fun md5(string: String): String {
    if (TextUtils.isEmpty(string)) {
        return ""
    }
    val md5: MessageDigest
    try {
        md5 = MessageDigest.getInstance("MD5")
        val bytes = md5.digest(string.toByteArray())
        val result = java.lang.StringBuilder()
        for (b in bytes) {
            var temp = Integer.toHexString(b.toInt() and 0xff)
            if (temp.length == 1) {
                temp = "0$temp"
            }
            result.append(temp)
        }
        return result.toString()
    } catch (e: NoSuchAlgorithmException) {
        e.printStackTrace()
    }
    return ""
}