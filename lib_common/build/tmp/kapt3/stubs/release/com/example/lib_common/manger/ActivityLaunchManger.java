package com.example.lib_common.manger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/lib_common/manger/ActivityLaunchManger;", "", "()V", "mActivityList", "Ljava/util/ArrayList;", "Landroid/app/Activity;", "containActivity", "", "name", "", "create", "", "activity", "destroyed", "finishActivity", "key", "getAll", "", "getSize", "", "getTopActivityName", "removeAllActivity", "Companion", "lib_common_release"})
public final class ActivityLaunchManger {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.manger.ActivityLaunchManger.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_MAIN_ACTIVITY = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PLAY_ACTIVITY = "PlayActivity2";
    private static final kotlin.Lazy mInstance$delegate = null;
    private final java.util.ArrayList<android.app.Activity> mActivityList = null;
    
    private ActivityLaunchManger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.lib_common.manger.ActivityLaunchManger get() {
        return null;
    }
    
    public final void create(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void destroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    private final void finishActivity(java.lang.String key) {
    }
    
    public final int getSize() {
        return 0;
    }
    
    private final void finishActivity(android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.app.Activity> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopActivityName() {
        return null;
    }
    
    public final boolean containActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final void removeAllActivity() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/lib_common/manger/ActivityLaunchManger$Companion;", "", "()V", "KEY_MAIN_ACTIVITY", "", "KEY_PLAY_ACTIVITY", "mInstance", "Lcom/example/lib_common/manger/ActivityLaunchManger;", "getMInstance", "()Lcom/example/lib_common/manger/ActivityLaunchManger;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "lib_common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.example.lib_common.manger.ActivityLaunchManger getMInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.lib_common.manger.ActivityLaunchManger get() {
            return null;
        }
    }
}