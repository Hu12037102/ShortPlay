package com.example.lib_common.datastore;

import java.lang.System;

/**
 * 搜索记录管理
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/lib_common/datastore/SearchHistoryStore;", "", "()V", "clear", "", "getData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "putData", "value", "Companion", "lib_common_debug"})
public final class SearchHistoryStore {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.datastore.SearchHistoryStore.Companion Companion = null;
    private static final kotlin.Lazy mInstance$delegate = null;
    private static final java.lang.String KEY = "search_history_store_key";
    private static final int MAX_SEARCH_COUNT = 10;
    
    private SearchHistoryStore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.lib_common.datastore.SearchHistoryStore get() {
        return null;
    }
    
    public final void putData(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getData() {
        return null;
    }
    
    public final void clear() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/example/lib_common/datastore/SearchHistoryStore$Companion;", "", "()V", "KEY", "", "MAX_SEARCH_COUNT", "", "mInstance", "Lcom/example/lib_common/datastore/SearchHistoryStore;", "getMInstance", "()Lcom/example/lib_common/datastore/SearchHistoryStore;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "lib_common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.example.lib_common.datastore.SearchHistoryStore getMInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.lib_common.datastore.SearchHistoryStore get() {
            return null;
        }
    }
}