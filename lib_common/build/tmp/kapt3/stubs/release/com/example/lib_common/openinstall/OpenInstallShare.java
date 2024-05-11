package com.example.lib_common.openinstall;

import java.lang.System;

/**
 * OpenInstall分享监听
 * 疑似应用处于后台不可见状态下调用init，并且接着调用其它api，数据大概率丢失，请检查代码
 * 如果在测试中发现这个tips 可以查看确保已经在前台初始化了 可忽略(已咨询客服)
 * 逻辑:第一次安装App 不管什么链接 只会走onInstallFinish方法 后续无论什么链接都只会走onWakeUpFinish
 * 除非用户手动清空应用数据 会导致给人刷邀请的现象
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/lib_common/openinstall/OpenInstallShare;", "Lcom/fm/openinstall/listener/AppWakeUpListener;", "Lcom/fm/openinstall/listener/AppInstallListener;", "()V", "mFirstTime", "", "callInstallFun", "", "callWakeUpFun", "intent", "Landroid/content/Intent;", "initOpenInstall", "context", "Landroid/content/Context;", "onInstallFinish", "appData", "Lcom/fm/openinstall/model/AppData;", "error", "Lcom/fm/openinstall/model/Error;", "onWakeUpFinish", "parseBindData", "bindData", "", "lib_common_release"})
public final class OpenInstallShare implements com.fm.openinstall.listener.AppWakeUpListener, com.fm.openinstall.listener.AppInstallListener {
    private final long mFirstTime = 0L;
    
    public OpenInstallShare() {
        super();
    }
    
    public final void initOpenInstall(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public final void callWakeUpFun(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public final void callInstallFun() {
    }
    
    /**
     * 一键拉起剧集
     */
    @java.lang.Override()
    public void onWakeUpFinish(@org.jetbrains.annotations.Nullable()
    com.fm.openinstall.model.AppData appData, @org.jetbrains.annotations.Nullable()
    com.fm.openinstall.model.Error error) {
    }
    
    /**
     * 安装带参
     */
    @java.lang.Override()
    public void onInstallFinish(@org.jetbrains.annotations.Nullable()
    com.fm.openinstall.model.AppData appData, @org.jetbrains.annotations.Nullable()
    com.fm.openinstall.model.Error error) {
    }
    
    /**
     * 解析自定义参数
     */
    private final void parseBindData(java.lang.String bindData) {
    }
}