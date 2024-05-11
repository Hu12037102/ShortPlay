package com.example.lib_common.flyer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010\u000f\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/lib_common/flyer/AppFlyerEvent;", "Lcom/appsflyer/AppsFlyerConversionListener;", "Lcom/appsflyer/deeplink/DeepLinkListener;", "()V", "isDeepLinking", "", "mFirstTime", "", "onAppOpenAttribution", "", "p0", "", "", "onAttributionFailure", "onConversionDataFail", "onConversionDataSuccess", "", "onDeepLinking", "Lcom/appsflyer/deeplink/DeepLinkResult;", "lib_common_debug"})
public final class AppFlyerEvent implements com.appsflyer.AppsFlyerConversionListener, com.appsflyer.deeplink.DeepLinkListener {
    private final long mFirstTime = 0L;
    private boolean isDeepLinking = false;
    
    public AppFlyerEvent() {
        super();
    }
    
    @java.lang.Override()
    public void onConversionDataSuccess(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    public void onConversionDataFail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onAppOpenAttribution(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void onAttributionFailure(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onDeepLinking(@org.jetbrains.annotations.NotNull()
    com.appsflyer.deeplink.DeepLinkResult p0) {
    }
}