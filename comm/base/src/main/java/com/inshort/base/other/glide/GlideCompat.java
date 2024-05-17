package com.inshort.base.other.glide;

import android.widget.ImageView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

import com.bumptech.glide.module.AppGlideModule;

public final class GlideCompat {
    private GlideCompat(){}
    public static void loadImage(@Nullable Object obj, @Nullable ImageView imageView){
        if (obj == null || imageView == null){
            return;
        }
        GlideInShort.with(imageView).load(obj).into(imageView);
    }
    public static void loadImage(@Nullable Object obj, @Nullable ImageView imageView, @DrawableRes int placeholder){
        if (obj == null || imageView == null){
            return;
        }
        GlideInShort.with(imageView).load(obj).placeholder(placeholder).into(imageView);
    }
}
