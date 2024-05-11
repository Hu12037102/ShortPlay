package com.example.lib_common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/lib_common/util/NotificationUtils;", "", "()V", "CHANNEL_PUSH_ID", "", "CHANNEL_PUSH_NAME", "mPushNotifyId", "", "createChannel", "Landroid/app/NotificationChannel;", "channelId", "channelName", "importance", "isOpenNotification", "", "context", "Landroid/content/Context;", "notificationIntent", "Landroid/content/Intent;", "showPushNotificationMessage", "", "title", "content", "dramaSeriesId", "episodeNumber", "test", "lib_common_release"})
public final class NotificationUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.util.NotificationUtils INSTANCE = null;
    private static int mPushNotifyId = 0;
    private static final java.lang.String CHANNEL_PUSH_ID = "push_channel";
    private static final java.lang.String CHANNEL_PUSH_NAME = "push_notification";
    
    private NotificationUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isOpenNotification(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent notificationIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final android.app.NotificationChannel createChannel(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    java.lang.String channelName, int importance) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showPushNotificationMessage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int dramaSeriesId, int episodeNumber) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void test(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int dramaSeriesId, int episodeNumber) {
    }
}