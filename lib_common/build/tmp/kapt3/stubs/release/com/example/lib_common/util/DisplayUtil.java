package com.example.lib_common.util;

import java.lang.System;

/**
 * 屏幕相关的一些工具方法
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/lib_common/util/DisplayUtil;", "", "()V", "density", "", "context", "Landroid/content/Context;", "dp2px", "", "dpValue", "getStatusBarHeight", "activity", "Landroid/app/Activity;", "px2dp", "pxValue", "screenHeight", "screenWidth", "lib_common_release"})
public final class DisplayUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.util.DisplayUtil INSTANCE = null;
    
    private DisplayUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int screenWidth(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int screenHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final float density(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int dp2px(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float dpValue) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int px2dp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float pxValue) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"DiscouragedApi", "InternalInsetResource"})
    @kotlin.jvm.JvmStatic()
    public static final int getStatusBarHeight(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
        return 0;
    }
}