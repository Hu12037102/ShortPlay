package com.example.lib_common.manger;

import java.lang.System;

/**
 * 用户协议协议管理器
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/example/lib_common/manger/UserAgreementManger;", "", "()V", "getStatus", "", "putStatus", "", "status", "Companion", "lib_common_debug"})
public final class UserAgreementManger {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.manger.UserAgreementManger.Companion Companion = null;
    private static final java.lang.String Key_USER_AGREEMENT = "key_user_agreement_status";
    private static final kotlin.Lazy mInstance$delegate = null;
    private static boolean isPop = false;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_LATER = 1;
    public static final int STATUS_AGREE = 2;
    
    private UserAgreementManger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.lib_common.manger.UserAgreementManger get() {
        return null;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void putStatus(@androidx.annotation.IntRange(from = 0L, to = 2L)
    int status) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/example/lib_common/manger/UserAgreementManger$Companion;", "", "()V", "Key_USER_AGREEMENT", "", "STATUS_AGREE", "", "STATUS_LATER", "STATUS_NORMAL", "isPop", "", "()Z", "setPop", "(Z)V", "mInstance", "Lcom/example/lib_common/manger/UserAgreementManger;", "getMInstance", "()Lcom/example/lib_common/manger/UserAgreementManger;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "lib_common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.example.lib_common.manger.UserAgreementManger getMInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.lib_common.manger.UserAgreementManger get() {
            return null;
        }
        
        public final boolean isPop() {
            return false;
        }
        
        public final void setPop(boolean p0) {
        }
    }
}