package com.example.lib_common.db;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/12/13
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/lib_common/db/UserPayDao;", "Lcom/example/lib_common/db/BaseDao;", "Lcom/example/lib_common/db/UserPayData;", "deletePayData", "", "productId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "userID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayData", "lib_common_debug"})
public abstract interface UserPayDao extends com.example.lib_common.db.BaseDao<com.example.lib_common.db.UserPayData> {
    
    /**
     * 获取所有
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from UserPayData where userId = :userID")
    public abstract java.lang.Object getAll(int userID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lib_common.db.UserPayData>> continuation);
    
    /**
     * 根据orderId获取指定的实体
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from UserPayData where productId = :productId")
    public abstract java.lang.Object getPayData(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lib_common.db.UserPayData> continuation);
    
    /**
     * 根据字段删除记录
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from UserPayData where productId = :productId")
    public abstract java.lang.Object deletePayData(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}