package com.example.lib_common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n\u001a\u0016\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n\u00a8\u0006\u0014"}, d2 = {"clearFile", "", "context", "Landroid/content/Context;", "getCacheDirectory", "Ljava/io/File;", "preferExternal", "", "getKeyDirPath", "key", "", "keyName", "getRootDirPath", "md5", "string", "playData", "Lcom/example/lib_http/bean/data/PlayUrlData;", "archivedPath", "storagePlayData", "text", "lib_common_debug"})
public final class PlayFileCacheUtilKt {
    
    /**
     * 播放缓存路劲
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File getRootDirPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File getKeyDirPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String keyName) {
        return null;
    }
    
    public static final void clearFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * 读取播放数据缓存
     */
    @org.jetbrains.annotations.Nullable()
    public static final com.example.lib_http.bean.data.PlayUrlData playData(@org.jetbrains.annotations.NotNull()
    java.lang.String archivedPath) {
        return null;
    }
    
    /**
     * 缓存播放数据
     */
    public static final void storagePlayData(@org.jetbrains.annotations.NotNull()
    java.lang.String archivedPath, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    private static final java.io.File getCacheDirectory(android.content.Context context, boolean preferExternal) {
        return null;
    }
    
    /**
     * md5加密
     */
    private static final java.lang.String md5(java.lang.String string) {
        return null;
    }
}