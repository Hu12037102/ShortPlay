package com.example.lib_common.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a*\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\u001a)\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\b\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"paresException", "", "T", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_common/state/ResultState;", "e", "", "paresResult", "result", "LBaseResponse;", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "lib_common_debug"})
public final class ResultStateKt {
    
    /**
     * 处理返回值
     * @param result 请求结果
     */
    public static final <T extends java.lang.Object>void paresResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_common.state.ResultState<T>> $this$paresResult, @org.jetbrains.annotations.NotNull()
    BaseResponse<T> result) {
    }
    
    /**
     * 不处理返回值 直接返回请求结果
     * @param result 请求结果
     */
    public static final <T extends java.lang.Object>void paresResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_common.state.ResultState<T>> $this$paresResult, T result) {
    }
    
    /**
     * 异常转换异常处理
     */
    public static final <T extends java.lang.Object>void paresException(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.lib_common.state.ResultState<T>> $this$paresException, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
}