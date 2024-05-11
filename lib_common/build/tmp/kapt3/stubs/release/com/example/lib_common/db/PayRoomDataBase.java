package com.example.lib_common.db;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/12/13
 */
@androidx.room.Database(entities = {com.example.lib_common.db.UserPayData.class}, version = 2)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/db/PayRoomDataBase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/example/lib_common/db/UserPayDao;", "Companion", "lib_common_release"})
public abstract class PayRoomDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.db.PayRoomDataBase.Companion Companion = null;
    private static final java.lang.String DATABASE_NAME = "user_pay.db";
    @kotlin.jvm.Volatile()
    private static volatile com.example.lib_common.db.PayRoomDataBase databaseInstance;
    
    public PayRoomDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.lib_common.db.UserPayDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized com.example.lib_common.db.PayRoomDataBase get() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/lib_common/db/PayRoomDataBase$Companion;", "", "()V", "DATABASE_NAME", "", "databaseInstance", "Lcom/example/lib_common/db/PayRoomDataBase;", "get", "lib_common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        @kotlin.jvm.JvmStatic()
        public final synchronized com.example.lib_common.db.PayRoomDataBase get() {
            return null;
        }
    }
}