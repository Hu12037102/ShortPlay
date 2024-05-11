package com.example.lib_common.app;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/lib_common/app/CommonApplication;", "Lcom/example/lib_base/app/BaseApplication;", "()V", "appDataManagementViewModel", "Lcom/example/lib_common/vm/AppDataManagementViewModel;", "getAppDataManagementViewModel", "()Lcom/example/lib_common/vm/AppDataManagementViewModel;", "appDataManagementViewModel$delegate", "Lkotlin/Lazy;", "appViewModel", "Lcom/example/lib_common/vm/AppViewModel;", "getAppViewModel", "()Lcom/example/lib_common/vm/AppViewModel;", "appViewModel$delegate", "attachBaseContext", "", "base", "Landroid/content/Context;", "initActivityLaunch", "initDefaultLanguage", "initView", "onCreate", "onDestroy", "onInitAhead", "Companion", "lib_common_release"})
public class CommonApplication extends com.example.lib_base.app.BaseApplication {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appDataManagementViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.app.CommonApplication.Companion Companion = null;
    public static java.lang.String channel_parameter;
    public static java.lang.String url;
    public static com.example.lib_common.app.CommonApplication instances;
    public static com.example.lib_common.vm.AppViewModel appViewModelInstance;
    public static com.example.lib_common.vm.AppDataManagementViewModel appDataManagement;
    
    public CommonApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.vm.AppViewModel getAppViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.vm.AppDataManagementViewModel getAppDataManagementViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    private final void initDefaultLanguage() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initActivityLaunch() {
    }
    
    /**
     * 初始化全局
     */
    private final void initView() {
    }
    
    /**
     * 初始化第三库
     */
    private final void onInitAhead() {
    }
    
    public final void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/lib_common/app/CommonApplication$Companion;", "", "()V", "appDataManagement", "Lcom/example/lib_common/vm/AppDataManagementViewModel;", "getAppDataManagement", "()Lcom/example/lib_common/vm/AppDataManagementViewModel;", "setAppDataManagement", "(Lcom/example/lib_common/vm/AppDataManagementViewModel;)V", "appViewModelInstance", "Lcom/example/lib_common/vm/AppViewModel;", "getAppViewModelInstance", "()Lcom/example/lib_common/vm/AppViewModel;", "setAppViewModelInstance", "(Lcom/example/lib_common/vm/AppViewModel;)V", "channel_parameter", "", "getChannel_parameter", "()Ljava/lang/String;", "setChannel_parameter", "(Ljava/lang/String;)V", "instances", "Lcom/example/lib_common/app/CommonApplication;", "getInstances", "()Lcom/example/lib_common/app/CommonApplication;", "setInstances", "(Lcom/example/lib_common/app/CommonApplication;)V", "url", "getUrl", "setUrl", "lib_common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChannel_parameter() {
            return null;
        }
        
        public final void setChannel_parameter(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lib_common.app.CommonApplication getInstances() {
            return null;
        }
        
        public final void setInstances(@org.jetbrains.annotations.NotNull()
        com.example.lib_common.app.CommonApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lib_common.vm.AppViewModel getAppViewModelInstance() {
            return null;
        }
        
        public final void setAppViewModelInstance(@org.jetbrains.annotations.NotNull()
        com.example.lib_common.vm.AppViewModel p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lib_common.vm.AppDataManagementViewModel getAppDataManagement() {
            return null;
        }
        
        public final void setAppDataManagement(@org.jetbrains.annotations.NotNull()
        com.example.lib_common.vm.AppDataManagementViewModel p0) {
        }
    }
}