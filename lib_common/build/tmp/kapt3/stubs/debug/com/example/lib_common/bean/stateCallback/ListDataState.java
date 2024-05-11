package com.example.lib_common.bean.stateCallback;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/6
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\rH\u00c6\u0003Je\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\rH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0012R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/example/lib_common/bean/stateCallback/ListDataState;", "T", "", "isSuccess", "", "errMessage", "", "isRefresh", "isEmpty", "hasMore", "isFirstEmpty", "listData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(ZLjava/lang/String;ZZZZLjava/util/ArrayList;)V", "getErrMessage", "()Ljava/lang/String;", "getHasMore", "()Z", "getListData", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib_common_debug"})
public final class ListDataState<T extends java.lang.Object> {
    private final boolean isSuccess = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errMessage = null;
    private final boolean isRefresh = false;
    private final boolean isEmpty = false;
    private final boolean hasMore = false;
    private final boolean isFirstEmpty = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<T> listData = null;
    
    /**
     * @author: 张勇
     *
     * @date: 2023/6/6
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.bean.stateCallback.ListDataState<T> copy(boolean isSuccess, @org.jetbrains.annotations.NotNull()
    java.lang.String errMessage, boolean isRefresh, boolean isEmpty, boolean hasMore, boolean isFirstEmpty, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> listData) {
        return null;
    }
    
    /**
     * @author: 张勇
     *
     * @date: 2023/6/6
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @author: 张勇
     *
     * @date: 2023/6/6
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author: 张勇
     *
     * @date: 2023/6/6
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ListDataState(boolean isSuccess, @org.jetbrains.annotations.NotNull()
    java.lang.String errMessage, boolean isRefresh, boolean isEmpty, boolean hasMore, boolean isFirstEmpty, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> listData) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrMessage() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getHasMore() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isFirstEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getListData() {
        return null;
    }
}