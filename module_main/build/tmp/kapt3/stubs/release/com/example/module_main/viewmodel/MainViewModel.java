package com.example.module_main.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0005J\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/example/module_main/viewmodel/MainViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "fragments", "", "", "[Ljava/lang/String;", "list", "", "Landroidx/fragment/app/Fragment;", "mFirstRecommendDramaLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lib_http/bean/data/RecommendEpisodeData;", "getMFirstRecommendDramaLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mLinkContinueWatchingLiveData", "Lcom/example/lib_http/bean/data/UserInfoData$ContinueWatching;", "getMLinkContinueWatchingLiveData", "mRecommendDramaLiveData", "getMRecommendDramaLiveData", "mUploadFCMTokenLiveData", "getMUploadFCMTokenLiveData", "findInviteTokenByData", "", "inviteToken", "getFragments", "getUrlTime", "onCleared", "requestFirstRecommendDrama", "requestRecommendDrama", "uploadFCMToken", "token", "uploadPushRecord", "pushId", "", "dramaSeriesId", "module_main_release"})
public final class MainViewModel extends com.example.lib_common.vm.CommonViewModel {
    private java.util.List<androidx.fragment.app.Fragment> list;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.RecommendEpisodeData> mRecommendDramaLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.RecommendEpisodeData> mFirstRecommendDramaLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData.ContinueWatching> mLinkContinueWatchingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mUploadFCMTokenLiveData = null;
    private java.lang.String[] fragments = {"/home/MainFragment", "/myList/MyListFragment", "/me/MeFragment"};
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.RecommendEpisodeData> getMRecommendDramaLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.RecommendEpisodeData> getMFirstRecommendDramaLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.lib_http.bean.data.UserInfoData.ContinueWatching> getMLinkContinueWatchingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMUploadFCMTokenLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<androidx.fragment.app.Fragment> getFragments() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void requestRecommendDrama() {
    }
    
    public final void requestFirstRecommendDrama() {
    }
    
    public final void findInviteTokenByData(@org.jetbrains.annotations.NotNull()
    java.lang.String inviteToken) {
    }
    
    public final void uploadFCMToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void uploadPushRecord(int pushId, int dramaSeriesId) {
    }
    
    /**
     * 测试域名网速进行排序
     */
    public final void getUrlTime() {
    }
}