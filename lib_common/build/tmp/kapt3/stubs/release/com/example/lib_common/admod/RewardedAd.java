package com.example.lib_common.admod;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/10/25
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020 H\u0016J\"\u0010!\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\"\u001a\u00020\u0007J\u0012\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/lib_common/admod/RewardedAd;", "Lcom/applovin/mediation/MaxRewardedAdListener;", "()V", "adUnitID", "", "close", "Lkotlin/Function0;", "", "complete", "customData", "retryAttempt", "", "rewardedAd", "Lcom/applovin/mediation/ads/MaxRewardedAd;", "createRewardedAd", "activity", "Landroid/app/Activity;", "initAd", "onAdClicked", "p0", "Lcom/applovin/mediation/MaxAd;", "onAdDisplayFailed", "p1", "Lcom/applovin/mediation/MaxError;", "onAdDisplayed", "onAdHidden", "onAdLoadFailed", "onAdLoaded", "onDestroy", "onRewardedVideoCompleted", "onRewardedVideoStarted", "onUserRewarded", "Lcom/applovin/mediation/MaxReward;", "playComplete", "setReviewAd", "setUnitId", "isReviewVersion", "", "startAd", "lib_common_release"})
public final class RewardedAd implements com.applovin.mediation.MaxRewardedAdListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.admod.RewardedAd INSTANCE = null;
    private static kotlin.jvm.functions.Function0<kotlin.Unit> complete;
    private static kotlin.jvm.functions.Function0<kotlin.Unit> close;
    private static com.applovin.mediation.ads.MaxRewardedAd rewardedAd;
    private static java.lang.String customData;
    private static double retryAttempt = 0.0;
    private static java.lang.String adUnitID = "";
    
    private RewardedAd() {
        super();
    }
    
    public final void initAd() {
    }
    
    public final void setReviewAd() {
    }
    
    private final void setUnitId(boolean isReviewVersion) {
    }
    
    public final void createRewardedAd(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void startAd(@org.jetbrains.annotations.NotNull()
    java.lang.String customData) {
    }
    
    @java.lang.Override()
    public void onAdLoaded(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0) {
    }
    
    @java.lang.Override()
    public void onAdDisplayed(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0) {
    }
    
    @java.lang.Override()
    public void onAdHidden(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0) {
    }
    
    @java.lang.Override()
    public void onAdClicked(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0) {
    }
    
    @java.lang.Override()
    public void onAdLoadFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxError p1) {
    }
    
    @java.lang.Override()
    public void onAdDisplayFailed(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0, @org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxError p1) {
    }
    
    @java.lang.Override()
    public void onUserRewarded(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0, @org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxReward p1) {
    }
    
    @java.lang.Override()
    public void onRewardedVideoStarted(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0) {
    }
    
    @java.lang.Override()
    public void onRewardedVideoCompleted(@org.jetbrains.annotations.NotNull()
    com.applovin.mediation.MaxAd p0) {
    }
    
    public final void playComplete(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> complete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> close) {
    }
    
    public final void onDestroy() {
    }
}