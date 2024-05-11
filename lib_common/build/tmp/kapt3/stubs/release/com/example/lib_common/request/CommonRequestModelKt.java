package com.example.lib_common.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001aT\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2-\u0010\u000f\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010\u00a2\u0006\u0002\b\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u001a\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t\u001a\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\t\u001a8\u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070 \u001aF\u0010#\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\f0&2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00070 2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070 \u001a\u0014\u0010)\u001a\u00020\u0007*\u00020$2\u0006\u0010*\u001a\u00020+H\u0002\u001af\u0010,\u001a\u00020-\"\u0004\b\u0000\u0010\f*\u00020$2\"\u0010%\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00070 2\u0014\b\u0002\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070 \u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.\u001az\u0010/\u001a\u00020-\"\u0004\b\u0000\u0010\f*\u00020$2\"\u0010%\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00070 2\u0014\b\u0002\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070 2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000201\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103\u001at\u00104\u001a\u00020-\"\u0004\b\u0000\u0010\f*\u00020$2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00070 2\u0014\b\u0002\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070 2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000201\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103\u001a\u001c\u00105\u001a\u00020\u0007*\u00020$2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tH\u0002\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"getHttpClient", "Lokhttp3/OkHttpClient;", "getGetHttpClient", "()Lokhttp3/OkHttpClient;", "getHttpClient$delegate", "Lkotlin/Lazy;", "apiRequestFailReported", "", "jsonStr", "", "url", "executeResponse", "T", "response", "LBaseResponse;", "success", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(LBaseResponse;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNetworkNoParameterPostRequest", "Lokhttp3/Response;", "getNetworkPostRequest", "getNetworkRequest", "performPingRequest", "Lkotlin/Pair;", "", "host", "postNetworkRequest", "onResponse", "Lkotlin/Function1;", "onFailure", "Ljava/io/IOException;", "launch", "Lcom/example/lib_base/vm/BaseViewModel;", "block", "Lkotlin/Function0;", "error", "", "pingGoogleNetwork", "exception", "Lcom/example/lib_http/request/error/AppException;", "request", "Lkotlinx/coroutines/Job;", "(Lcom/example/lib_base/vm/BaseViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "requestApi", "isShowDialog", "", "isErrorActivity", "(Lcom/example/lib_base/vm/BaseViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)Lkotlinx/coroutines/Job;", "requestNoCheck", "uploadNetworkEvent", "requestData", "requestLarkData", "lib_common_release"})
public final class CommonRequestModelKt {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy getHttpClient$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient getGetHttpClient() {
        return null;
    }
    
    /**
     * 过滤服务器结果，失败抛异常/请求的ViewModel  success/error 处理回调结果
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.Job requestApi(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.vm.BaseViewModel $this$requestApi, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super BaseResponse<T>>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.request.error.AppException, kotlin.Unit> error, boolean isShowDialog, boolean isErrorActivity) {
        return null;
    }
    
    /**
     * 不过滤请求结果
     * @param block 请求体 必须要用suspend关键字修饰
     * @param success 成功回调
     * @param error 失败回调 可不给
     * @param isShowDialog 是否显示加载框
     * @param loadingMessage 加载框提示内容
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.Job requestNoCheck(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.vm.BaseViewModel $this$requestNoCheck, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.request.error.AppException, kotlin.Unit> error, boolean isShowDialog, boolean isErrorActivity) {
        return null;
    }
    
    /**
     * 请求结果过滤，判断请求服务器请求结果是否成功，不成功则会抛出异常
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object executeResponse(@org.jetbrains.annotations.NotNull()
    BaseResponse<T> response, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> success, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.Job request(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.vm.BaseViewModel $this$request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super BaseResponse<T>>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.lib_http.request.error.AppException, kotlin.Unit> error) {
        return null;
    }
    
    private static final void pingGoogleNetwork(com.example.lib_base.vm.BaseViewModel $this$pingGoogleNetwork, com.example.lib_http.request.error.AppException exception) {
    }
    
    private static final void uploadNetworkEvent(com.example.lib_base.vm.BaseViewModel $this$uploadNetworkEvent, java.lang.String requestData, java.lang.String requestLarkData) {
    }
    
    private static final void apiRequestFailReported(java.lang.String jsonStr, java.lang.String url) {
    }
    
    public static final void postNetworkRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super okhttp3.Response, kotlin.Unit> onResponse, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.io.IOException, kotlin.Unit> onFailure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Response getNetworkRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Response getNetworkPostRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String jsonStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Response getNetworkNoParameterPostRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> performPingRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String host) {
        return null;
    }
    
    /**
     * 调用携程,执行耗时操作
     */
    public static final <T extends java.lang.Object>void launch(@org.jetbrains.annotations.NotNull()
    com.example.lib_base.vm.BaseViewModel $this$launch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> block, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> error) {
    }
}