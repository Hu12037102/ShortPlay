package com.example.module_main.update;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/11/7
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\"\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/module_main/update/UpdateGradation;", "", "()V", "appUpDataDialog", "Lcom/example/module_main/dialog/AppUpDataDialog;", "toGooglePlay", "", "uriString", "", "context", "Landroid/content/Context;", "updateVersion", "updateInfo", "Lcom/example/lib_http/bean/data/UpdateInfo$UpdateInfo;", "isShowToast", "", "module_main_debug"})
public final class UpdateGradation {
    private com.example.module_main.dialog.AppUpDataDialog appUpDataDialog;
    
    public UpdateGradation() {
        super();
    }
    
    public final void updateVersion(@org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.UpdateInfo.UpdateInfo updateInfo, @org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isShowToast) {
    }
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final void toGooglePlay(java.lang.String uriString, android.content.Context context) {
    }
}