package com.example.lib_common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0001\u001a&\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e\u001a&\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e\u001a\u0012\u0010\u0015\u001a\u00020\n*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\u0016\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0007\u001a\u0012\u0010\u001a\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002\"\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"isFastDoubleClick", "", "()Z", "lastClickTime", "", "getLastClickTime", "()J", "setLastClickTime", "(J)V", "subCoins", "", "context", "Landroid/content/Context;", "coins", "", "bonus", "color", "isWeek", "totalAwardCoins", "totalBonus", "totalCoins", "getText", "newSignIn", "restore", "", "Landroid/app/Activity;", "signIn", "lib_common_debug"})
public final class TypefaceKt {
    
    /**
     * 判断是否是快速点击
     */
    private static long lastClickTime = 0L;
    
    /**
     * @author: 张勇
     *
     * @date: 2023/8/7
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String signIn(int $this$signIn, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String newSignIn(int $this$newSignIn, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int coins, int bonus, int color, boolean isWeek) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String totalAwardCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int coins, int bonus, int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String totalCoins(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int coins, int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String totalBonus(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int bonus, int color, boolean isWeek) {
        return null;
    }
    
    /**
     * 恢复订阅
     */
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    public static final void restore(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$restore) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getText(boolean $this$getText, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public static final long getLastClickTime() {
        return 0L;
    }
    
    public static final void setLastClickTime(long p0) {
    }
    
    public static final boolean isFastDoubleClick() {
        return false;
    }
}