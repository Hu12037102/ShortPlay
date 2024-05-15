package com.inshort.base.utils;

import android.text.Html;
import android.text.Spanned;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class ColorUtil {

    public static Spanned getGatherColor(int current,int total){
        String  str= "<font color='#FF1860'>EP. "+current+"</font> " +
                "<font color='#808080'> / EP."+total+"</font>";
        return Html.fromHtml(str)  ;
    }

}
