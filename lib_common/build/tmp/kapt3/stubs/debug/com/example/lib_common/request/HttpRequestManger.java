package com.example.lib_common.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/lib_common/request/HttpRequestManger;", "", "()V", "requestPlayData", "LApiResponse;", "Lcom/example/lib_http/bean/data/PlayBeanInfo;", "dramaSeriesId", "", "pager", "searchDramId", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestProductList", "Lcom/example/lib_http/bean/data/ProductListData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_common_debug"})
public final class HttpRequestManger {
    
    public HttpRequestManger() {
        super();
    }
    
    /**
     * 获取首条子剧集数据
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestPlayData(int dramaSeriesId, int pager, int searchDramId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ApiResponse<com.example.lib_http.bean.data.PlayBeanInfo>> continuation) {
        return null;
    }
    
    /**
     * 商品ID
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestProductList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lib_http.bean.data.ProductListData> continuation) {
        return null;
    }
}