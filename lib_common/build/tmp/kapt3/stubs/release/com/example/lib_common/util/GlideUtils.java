package com.example.lib_common.util;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/18
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/lib_common/util/GlideUtils;", "", "()V", "Companion", "lib_common_release"})
public final class GlideUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.util.GlideUtils.Companion Companion = null;
    
    public GlideUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ.\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fJ6\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ6\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/example/lib_common/util/GlideUtils$Companion;", "", "()V", "loadCircleImage", "", "context", "Landroid/content/Context;", "url", "", "imageView", "Landroid/widget/ImageView;", "loadCustomRoundImage", "type", "Ljp/wasabeef/glide/transformations/RoundedCornersTransformation$CornerType;", "raduis", "", "loadImage", "bitmap", "Landroid/graphics/Bitmap;", "uri", "Landroid/net/Uri;", "res", "width", "height", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/graphics/drawable/Drawable;", "loadImageAvatar", "loadRoundImage", "radius", "lib_common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 加载图片(String地址)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, android.graphics.drawable.Drawable> loadImage(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        android.widget.ImageView imageView) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, android.graphics.drawable.Drawable> loadImageAvatar(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        android.widget.ImageView imageView) {
            return null;
        }
        
        /**
         * 加载图片(int资源地址)
         */
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int res, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
        }
        
        /**
         * 加载图片(uri)
         */
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
        }
        
        /**
         * 加载图片(bitmap)
         */
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
        }
        
        /**
         * 加载图片(String地址)---指定宽高
         */
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, int width, int height) {
        }
        
        /**
         * 加载圆形图片
         */
        public final void loadCircleImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
        }
        
        /**
         * 加载圆形图片
         */
        public final void loadRoundImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
        }
        
        /**
         * 加载圆形图片---指定圆角半径
         */
        public final void loadRoundImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, int radius) {
        }
        
        /**
         * 加载圆角图片-指定任意部分圆角（图片上、下、左、右四个角度任意定义）和半径
         */
        public final void loadCustomRoundImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
        jp.wasabeef.glide.transformations.RoundedCornersTransformation.CornerType type, int raduis) {
        }
    }
}