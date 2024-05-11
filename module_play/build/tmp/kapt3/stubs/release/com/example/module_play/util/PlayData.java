package com.example.module_play.util;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/10/10
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\r"}, d2 = {"Lcom/example/module_play/util/PlayData;", "", "()V", "getPlayData", "", "Lcom/example/lib_http/bean/data/PlayBeanData;", "context", "Landroid/content/Context;", "isPlayActivity", "", "setPlayData", "", "mData", "module_play_release"})
public final class PlayData {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_play.util.PlayData INSTANCE = null;
    
    private PlayData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.lib_http.bean.data.PlayBeanData> getPlayData(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public final void setPlayData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lib_http.bean.data.PlayBeanData> mData) {
    }
    
    public final boolean isPlayActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}