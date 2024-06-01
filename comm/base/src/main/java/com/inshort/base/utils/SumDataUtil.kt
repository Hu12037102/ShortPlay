package com.inshort.base.utils

import java.util.Locale

/**

 * @author: 张勇

 * @date: 2023/5/31

 */


fun sum(sum:Int):String{
    try {
        if(sum < 1000)return sum.toString()
        if(sum < 10000) return "${String.format(Locale.US,"%.1f", sum.div(1000f))}K"
        if(sum < 100000) return "${String.format(Locale.US,"%.1f", sum.div(10000f))}W"
        if(sum < 1000000) return "${String.format(Locale.US,"%.2f", sum.div(100000f))}W"
        if(sum < 10000000) return "${String.format(Locale.US,"%.3f", sum.div(1000000f))}W"
        if(sum < 100000000) return "${String.format(Locale.US,"%.4f", sum.div(10000000f))}W"
        return sum.toString()
    }catch (e :Exception){
        return  "9.0K"
    }
}
fun sumFlash(sum:Int):String{
    try {
        if(sum < 10000)return sum.toString()
        if(sum < 100000) return "${String.format(Locale.US,"%.1f", sum.div(1000f))}K"
        if(sum < 1000000) return "${String.format(Locale.US,"%.1f", sum.div(100000f))}M"
        return "${String.format(Locale.US,"%.1f", sum.div(1000000f))}B"
    }catch (e :Exception){
        return  sum.toString()
    }
}

fun getPager(position : Int):Int{
    when (position){
        in 0..30 ->{
            return 1
        }
        in 31..60 ->{
            return 2
        }
        in 61..90 ->{
            return 3
        }
        in 91..120 ->{
            return 4
        }
        in 121..150->{
            return 5
        }
        else ->{
            return 6
        }

    }
}


