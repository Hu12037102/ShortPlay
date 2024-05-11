package com.example.lib_common.bean;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2024/1/31
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002?@B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0014H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u00b1\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019\u00a8\u0006A"}, d2 = {"Lcom/example/lib_common/bean/FeedbackBean;", "", "apiServerCode", "", "apiServerMsg", "", "apiServerTime", "apiServerNetworkCode", "googleCode", "googleMsg", "post_app_check_code", "post_app_check_msg", "post_alb_check_code", "post_alb_check_msg", "ping_app_fun_data", "ping_app_fun_value", "ping_ip_data", "ping_ip_value", "msgType", "content", "Lcom/example/lib_common/bean/FeedbackBean$Content;", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/example/lib_common/bean/FeedbackBean$Content;)V", "getApiServerCode", "()I", "getApiServerMsg", "()Ljava/lang/String;", "getApiServerNetworkCode", "getApiServerTime", "getContent", "()Lcom/example/lib_common/bean/FeedbackBean$Content;", "getGoogleCode", "getGoogleMsg", "getMsgType", "getPing_app_fun_data", "getPing_app_fun_value", "getPing_ip_data", "getPing_ip_value", "getPost_alb_check_code", "getPost_alb_check_msg", "getPost_app_check_code", "getPost_app_check_msg", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Content", "RoomData", "lib_common_release"})
public final class FeedbackBean {
    private final int apiServerCode = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apiServerMsg = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apiServerTime = null;
    private final int apiServerNetworkCode = 0;
    private final int googleCode = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String googleMsg = null;
    private final int post_app_check_code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String post_app_check_msg = null;
    private final int post_alb_check_code = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String post_alb_check_msg = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ping_app_fun_data = null;
    private final int ping_app_fun_value = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ping_ip_data = null;
    private final int ping_ip_value = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "msg_type")
    private final java.lang.String msgType = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "content")
    private final com.example.lib_common.bean.FeedbackBean.Content content = null;
    
    /**
     * @author: 张勇
     *
     * @date: 2024/1/31
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.bean.FeedbackBean copy(int apiServerCode, @org.jetbrains.annotations.Nullable()
    java.lang.String apiServerMsg, @org.jetbrains.annotations.Nullable()
    java.lang.String apiServerTime, int apiServerNetworkCode, int googleCode, @org.jetbrains.annotations.Nullable()
    java.lang.String googleMsg, int post_app_check_code, @org.jetbrains.annotations.NotNull()
    java.lang.String post_app_check_msg, int post_alb_check_code, @org.jetbrains.annotations.Nullable()
    java.lang.String post_alb_check_msg, @org.jetbrains.annotations.NotNull()
    java.lang.String ping_app_fun_data, int ping_app_fun_value, @org.jetbrains.annotations.NotNull()
    java.lang.String ping_ip_data, int ping_ip_value, @org.jetbrains.annotations.NotNull()
    java.lang.String msgType, @org.jetbrains.annotations.NotNull()
    com.example.lib_common.bean.FeedbackBean.Content content) {
        return null;
    }
    
    /**
     * @author: 张勇
     *
     * @date: 2024/1/31
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @author: 张勇
     *
     * @date: 2024/1/31
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author: 张勇
     *
     * @date: 2024/1/31
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FeedbackBean(int apiServerCode, @org.jetbrains.annotations.Nullable()
    java.lang.String apiServerMsg, @org.jetbrains.annotations.Nullable()
    java.lang.String apiServerTime, int apiServerNetworkCode, int googleCode, @org.jetbrains.annotations.Nullable()
    java.lang.String googleMsg, int post_app_check_code, @org.jetbrains.annotations.NotNull()
    java.lang.String post_app_check_msg, int post_alb_check_code, @org.jetbrains.annotations.Nullable()
    java.lang.String post_alb_check_msg, @org.jetbrains.annotations.NotNull()
    java.lang.String ping_app_fun_data, int ping_app_fun_value, @org.jetbrains.annotations.NotNull()
    java.lang.String ping_ip_data, int ping_ip_value, @org.jetbrains.annotations.NotNull()
    java.lang.String msgType, @org.jetbrains.annotations.NotNull()
    com.example.lib_common.bean.FeedbackBean.Content content) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getApiServerCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApiServerMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApiServerTime() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getApiServerNetworkCode() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getGoogleCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoogleMsg() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPost_app_check_code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPost_app_check_msg() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getPost_alb_check_code() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPost_alb_check_msg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPing_app_fun_data() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getPing_app_fun_value() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPing_ip_data() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getPing_ip_value() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsgType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.bean.FeedbackBean.Content component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lib_common.bean.FeedbackBean.Content getContent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u00a7\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017\u00a8\u0006:"}, d2 = {"Lcom/example/lib_common/bean/FeedbackBean$Content;", "", "apiServerCode", "", "apiServerMsg", "", "apiServerTime", "apiServerNetworkCode", "googleCode", "googleMsg", "post_app_check_code", "post_app_check_msg", "post_alb_check_code", "post_alb_check_msg", "ping_app_fun_data", "ping_app_fun_value", "ping_ip_data", "ping_ip_value", "text", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getApiServerCode", "()I", "getApiServerMsg", "()Ljava/lang/String;", "getApiServerNetworkCode", "getApiServerTime", "getGoogleCode", "getGoogleMsg", "getPing_app_fun_data", "getPing_app_fun_value", "getPing_ip_data", "getPing_ip_value", "getPost_alb_check_code", "getPost_alb_check_msg", "getPost_app_check_code", "getPost_app_check_msg", "getText", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "lib_common_release"})
    public static final class Content {
        private final int apiServerCode = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String apiServerMsg = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String apiServerTime = null;
        private final int apiServerNetworkCode = 0;
        private final int googleCode = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String googleMsg = null;
        private final int post_app_check_code = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String post_app_check_msg = null;
        private final int post_alb_check_code = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String post_alb_check_msg = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ping_app_fun_data = null;
        private final int ping_app_fun_value = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ping_ip_data = null;
        private final int ping_ip_value = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "text")
        private final java.lang.String text = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lib_common.bean.FeedbackBean.Content copy(int apiServerCode, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerMsg, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerTime, int apiServerNetworkCode, int googleCode, @org.jetbrains.annotations.Nullable()
        java.lang.String googleMsg, int post_app_check_code, @org.jetbrains.annotations.NotNull()
        java.lang.String post_app_check_msg, int post_alb_check_code, @org.jetbrains.annotations.Nullable()
        java.lang.String post_alb_check_msg, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_app_fun_data, int ping_app_fun_value, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_ip_data, int ping_ip_value, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Content(int apiServerCode, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerMsg, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerTime, int apiServerNetworkCode, int googleCode, @org.jetbrains.annotations.Nullable()
        java.lang.String googleMsg, int post_app_check_code, @org.jetbrains.annotations.NotNull()
        java.lang.String post_app_check_msg, int post_alb_check_code, @org.jetbrains.annotations.Nullable()
        java.lang.String post_alb_check_msg, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_app_fun_data, int ping_app_fun_value, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_ip_data, int ping_ip_value, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getApiServerCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApiServerMsg() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApiServerTime() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getApiServerNetworkCode() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getGoogleCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoogleMsg() {
            return null;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getPost_app_check_code() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPost_app_check_msg() {
            return null;
        }
        
        public final int component9() {
            return 0;
        }
        
        public final int getPost_alb_check_code() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPost_alb_check_msg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPing_app_fun_data() {
            return null;
        }
        
        public final int component12() {
            return 0;
        }
        
        public final int getPing_app_fun_value() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPing_ip_data() {
            return null;
        }
        
        public final int component14() {
            return 0;
        }
        
        public final int getPing_ip_value() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00f7\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0006H\u00c6\u0003J\t\u0010R\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0006H\u00c6\u0003J\u0095\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Y\u001a\u00020\u0006H\u00d6\u0001J\t\u0010Z\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010 \u00a8\u0006["}, d2 = {"Lcom/example/lib_common/bean/FeedbackBean$RoomData;", "", "api", "", "systemTime", "apiServerCode", "", "apiServerMsg", "apiServerTime", "apiServerNetworkCode", "googleCode", "googleMsg", "post_app_check_code", "post_app_check_msg", "post_alb_check_code", "post_alb_check_msg", "ping_app_fun_data", "ping_app_fun_value", "ping_ip_data", "ping_ip_value", "versionCode", "versionName", "phoneModel", "systemVersion", "channel", "lang", "uuid", "networkState", "userIP", "utcTime", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApi", "()Ljava/lang/String;", "getApiServerCode", "()I", "getApiServerMsg", "getApiServerNetworkCode", "getApiServerTime", "getChannel", "getGoogleCode", "getGoogleMsg", "getLang", "getNetworkState", "getPhoneModel", "getPing_app_fun_data", "getPing_app_fun_value", "getPing_ip_data", "getPing_ip_value", "getPost_alb_check_code", "getPost_alb_check_msg", "getPost_app_check_code", "getPost_app_check_msg", "getSystemTime", "getSystemVersion", "getUserIP", "getUtcTime", "getUuid", "getVersionCode", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "lib_common_release"})
    public static final class RoomData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String api = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String systemTime = null;
        private final int apiServerCode = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String apiServerMsg = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String apiServerTime = null;
        private final int apiServerNetworkCode = 0;
        private final int googleCode = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String googleMsg = null;
        private final int post_app_check_code = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String post_app_check_msg = null;
        private final int post_alb_check_code = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String post_alb_check_msg = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ping_app_fun_data = null;
        private final int ping_app_fun_value = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ping_ip_data = null;
        private final int ping_ip_value = 0;
        private final int versionCode = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String versionName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phoneModel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String systemVersion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String channel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lang = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String uuid = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String networkState = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userIP = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String utcTime = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lib_common.bean.FeedbackBean.RoomData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String api, @org.jetbrains.annotations.NotNull()
        java.lang.String systemTime, int apiServerCode, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerMsg, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerTime, int apiServerNetworkCode, int googleCode, @org.jetbrains.annotations.Nullable()
        java.lang.String googleMsg, int post_app_check_code, @org.jetbrains.annotations.NotNull()
        java.lang.String post_app_check_msg, int post_alb_check_code, @org.jetbrains.annotations.Nullable()
        java.lang.String post_alb_check_msg, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_app_fun_data, int ping_app_fun_value, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_ip_data, int ping_ip_value, int versionCode, @org.jetbrains.annotations.NotNull()
        java.lang.String versionName, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneModel, @org.jetbrains.annotations.NotNull()
        java.lang.String systemVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String channel, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String uuid, @org.jetbrains.annotations.NotNull()
        java.lang.String networkState, @org.jetbrains.annotations.NotNull()
        java.lang.String userIP, @org.jetbrains.annotations.NotNull()
        java.lang.String utcTime) {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public RoomData(@org.jetbrains.annotations.NotNull()
        java.lang.String api, @org.jetbrains.annotations.NotNull()
        java.lang.String systemTime, int apiServerCode, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerMsg, @org.jetbrains.annotations.Nullable()
        java.lang.String apiServerTime, int apiServerNetworkCode, int googleCode, @org.jetbrains.annotations.Nullable()
        java.lang.String googleMsg, int post_app_check_code, @org.jetbrains.annotations.NotNull()
        java.lang.String post_app_check_msg, int post_alb_check_code, @org.jetbrains.annotations.Nullable()
        java.lang.String post_alb_check_msg, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_app_fun_data, int ping_app_fun_value, @org.jetbrains.annotations.NotNull()
        java.lang.String ping_ip_data, int ping_ip_value, int versionCode, @org.jetbrains.annotations.NotNull()
        java.lang.String versionName, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneModel, @org.jetbrains.annotations.NotNull()
        java.lang.String systemVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String channel, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String uuid, @org.jetbrains.annotations.NotNull()
        java.lang.String networkState, @org.jetbrains.annotations.NotNull()
        java.lang.String userIP, @org.jetbrains.annotations.NotNull()
        java.lang.String utcTime) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApi() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSystemTime() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getApiServerCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApiServerMsg() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApiServerTime() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getApiServerNetworkCode() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getGoogleCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoogleMsg() {
            return null;
        }
        
        public final int component9() {
            return 0;
        }
        
        public final int getPost_app_check_code() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPost_app_check_msg() {
            return null;
        }
        
        public final int component11() {
            return 0;
        }
        
        public final int getPost_alb_check_code() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPost_alb_check_msg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPing_app_fun_data() {
            return null;
        }
        
        public final int component14() {
            return 0;
        }
        
        public final int getPing_app_fun_value() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPing_ip_data() {
            return null;
        }
        
        public final int component16() {
            return 0;
        }
        
        public final int getPing_ip_value() {
            return 0;
        }
        
        public final int component17() {
            return 0;
        }
        
        public final int getVersionCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component18() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVersionName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component19() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSystemVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component21() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChannel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component22() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLang() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component23() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUuid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component24() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNetworkState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserIP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component26() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUtcTime() {
            return null;
        }
    }
}