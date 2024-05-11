package com.example.lib_common.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u001aU\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001aH\u0010\u0011\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f\u001a!\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"deleteData", "", "productId", "", "getInsertPayData", "Lcom/example/lib_common/db/UserPayData;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayData", "orderId", "purchaseToken", "purchaseOrder", "eventType", "", "dramaSeriesId", "episodeNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrder", "insertPayData", "drama_series_id", "episode_number", "updateOrder", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_common_release"})
public final class DatabaseDataKt {
    
    /**
     * 获取数据并更新
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getPayData(@org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String purchaseToken, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseOrder, int eventType, int dramaSeriesId, int episodeNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lib_common.db.UserPayData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object updateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public static final void insertOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    /**
     * 获取数据
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getInsertPayData(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lib_common.db.UserPayData> continuation) {
        return null;
    }
    
    /**
     * 插入数据
     */
    public static final void insertPayData(@org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String purchaseToken, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseOrder, int eventType, int drama_series_id, int episode_number) {
    }
    
    /**
     * 删除数据
     */
    public static final void deleteData(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
}