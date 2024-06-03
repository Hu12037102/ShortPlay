package com.inshort.base.utils

import com.inshort.base.other.mmkv.InitDataStore


/**

 * @author: 张勇

 * @date: 2024/5/24

 */

fun String.getPlayUrl():String{
            val initDataStore = InitDataStore.get().getData()
            return initDataStore?.let {
                if(this.startsWith("http:") || this.startsWith("https:")){
                        this
                }else if(it.playHostNames.size > 0){
                        initDataStore.playHostNames[0]+this
                } else{
                        this
                }
            }?:this
}

/**
 * 切换路径
 */
fun String.switchPlayPath(path:String):String{
        val initDataStore = InitDataStore.get().getData()
        initDataStore?.let {
                if(it.playHostNames.size > 0){
                        for (item in it.playHostNames.indices){
                                if(!this.contains(it.playHostNames[item])){
                                        return it.playHostNames[item]+path
                                }
                        }
                }
        }

        return this
}
