package com.example.lib_common.db;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/12/13
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\'J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lib_common/db/BaseDao;", "T", "", "delete", "", "bean", "(Ljava/lang/Object;)V", "insert", "insertAll", "", "update", "lib_common_release"})
public abstract interface BaseDao<T extends java.lang.Object> {
    
    @androidx.room.Insert()
    public abstract void insert(T bean);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> bean);
    
    @androidx.room.Delete()
    public abstract void delete(T bean);
    
    @androidx.room.Update()
    public abstract void update(T bean);
}