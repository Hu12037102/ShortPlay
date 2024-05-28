package com.example.lib_common.bean;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lcom/example/lib_common/bean/BonusSignBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Ljava/io/Serializable;", "itemType", "", "(I)V", "isCheckIn", "", "()Z", "setCheckIn", "(Z)V", "isToday", "setToday", "getItemType", "()I", "money", "getMoney", "setMoney", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "lib_common_debug"})
public final class BonusSignBean implements com.chad.library.adapter.base.entity.MultiItemEntity, java.io.Serializable {
    private final int itemType = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.bean.BonusSignBean.Companion Companion = null;
    public static final int BIG_SIGN_ITEM = 1;
    public static final int SMALL_SIGN_ITEM = 2;
    private int money = 0;
    private boolean isCheckIn = false;
    private boolean isToday = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.bean.BonusSignBean copy(int itemType) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public BonusSignBean(int itemType) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemType() {
        return 0;
    }
    
    public final int getMoney() {
        return 0;
    }
    
    public final void setMoney(int p0) {
    }
    
    public final boolean isCheckIn() {
        return false;
    }
    
    public final void setCheckIn(boolean p0) {
    }
    
    public final boolean isToday() {
        return false;
    }
    
    public final void setToday(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/bean/BonusSignBean$Companion;", "", "()V", "BIG_SIGN_ITEM", "", "SMALL_SIGN_ITEM", "lib_common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}