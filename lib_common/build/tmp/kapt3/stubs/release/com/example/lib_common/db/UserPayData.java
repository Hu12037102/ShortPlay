package com.example.lib_common.db;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/12/13
 */
@androidx.room.Entity(tableName = "UserPayData")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR \u0010!\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010$\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001e\u0010\'\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000e\u00a8\u0006*"}, d2 = {"Lcom/example/lib_common/db/UserPayData;", "", "()V", "creationTime", "", "getCreationTime", "()J", "setCreationTime", "(J)V", "dramaSeriesId", "", "getDramaSeriesId", "()I", "setDramaSeriesId", "(I)V", "episodeNumber", "getEpisodeNumber", "setEpisodeNumber", "eventType", "getEventType", "setEventType", "id", "getId", "setId", "orderId", "", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "productId", "getProductId", "setProductId", "purchaseOrder", "getPurchaseOrder", "setPurchaseOrder", "purchaseToken", "getPurchaseToken", "setPurchaseToken", "userId", "getUserId", "setUserId", "lib_common_release"})
public final class UserPayData {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "orderId")
    private java.lang.String orderId = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "purchaseToken")
    private java.lang.String purchaseToken = "";
    @androidx.room.ColumnInfo(name = "dramaSeriesId")
    private int dramaSeriesId = -1;
    @androidx.room.ColumnInfo(name = "episodeNumber")
    private int episodeNumber = -1;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "productId")
    private java.lang.String productId = "";
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "purchaseOrder")
    private java.lang.String purchaseOrder;
    @androidx.room.ColumnInfo(name = "eventType")
    private int eventType = 0;
    @androidx.room.ColumnInfo(name = "userId")
    private int userId = -1;
    @androidx.room.ColumnInfo(name = "creationTime")
    private long creationTime = -1L;
    
    public UserPayData() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchaseToken() {
        return null;
    }
    
    public final void setPurchaseToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getDramaSeriesId() {
        return 0;
    }
    
    public final void setDramaSeriesId(int p0) {
    }
    
    public final int getEpisodeNumber() {
        return 0;
    }
    
    public final void setEpisodeNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductId() {
        return null;
    }
    
    public final void setProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPurchaseOrder() {
        return null;
    }
    
    public final void setPurchaseOrder(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getEventType() {
        return 0;
    }
    
    public final void setEventType(int p0) {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    public final long getCreationTime() {
        return 0L;
    }
    
    public final void setCreationTime(long p0) {
    }
}