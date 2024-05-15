package com.inshort.base.other.glide;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.module.AppGlideModule;
import com.inshort.base.utils.LogUtils;

public final class GlideCompat {
    private GlideCompat(){}
    public static void loadImage(@Nullable Object obj, @Nullable ImageView imageView){
        if (obj == null || imageView == null){
            return;
        }
        LogUtils.d("loadImage","Object >>>"+obj+">>> imageView >>"+imageView);
        GlideInShort.with(imageView).load(obj).into(imageView);
    }
}
