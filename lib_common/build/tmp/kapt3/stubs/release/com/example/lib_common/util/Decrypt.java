package com.example.lib_common.util;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/7/21
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/lib_common/util/Decrypt;", "", "()V", "decryptor", "Lcom/google/crypto/tink/HybridDecrypt;", "getDecryptor", "()Lcom/google/crypto/tink/HybridDecrypt;", "setDecryptor", "(Lcom/google/crypto/tink/HybridDecrypt;)V", "handle", "Lcom/google/crypto/tink/KeysetHandle;", "getHandle", "()Lcom/google/crypto/tink/KeysetHandle;", "setHandle", "(Lcom/google/crypto/tink/KeysetHandle;)V", "decrypt", "", "file_sha256", "", "contextInfo", "lib_common_release"})
public final class Decrypt {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.util.Decrypt INSTANCE = null;
    @org.jetbrains.annotations.Nullable()
    private static com.google.crypto.tink.KeysetHandle handle;
    @org.jetbrains.annotations.Nullable()
    private static com.google.crypto.tink.HybridDecrypt decryptor;
    
    private Decrypt() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.crypto.tink.KeysetHandle getHandle() {
        return null;
    }
    
    public final void setHandle(@org.jetbrains.annotations.Nullable()
    com.google.crypto.tink.KeysetHandle p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.crypto.tink.HybridDecrypt getDecryptor() {
        return null;
    }
    
    public final void setDecryptor(@org.jetbrains.annotations.Nullable()
    com.google.crypto.tink.HybridDecrypt p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String file_sha256, @org.jetbrains.annotations.NotNull()
    java.lang.String contextInfo) {
        return null;
    }
}