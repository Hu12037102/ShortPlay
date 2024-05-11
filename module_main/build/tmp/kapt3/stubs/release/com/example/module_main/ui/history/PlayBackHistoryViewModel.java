package com.example.module_main.ui.history;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/24
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0010\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0010R(\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/example/module_main/ui/history/PlayBackHistoryViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "collectLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/lib_http/bean/data/MyListData$CollectData;", "getCollectLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setCollectLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "historyLiveData", "Lcom/example/lib_http/bean/data/MyListData$HistoryData;", "getHistoryLiveData", "setHistoryLiveData", "collectUpdate", "", "is_cancel", "", "dramaSeriesId", "", "episode_number", "deleteCollect", "deleteHis", "requestCollect", "listType", "requestHis", "module_main_release"})
public final class PlayBackHistoryViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.MyListData.HistoryData>> historyLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.MyListData.CollectData>> collectLiveData;
    
    public PlayBackHistoryViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.MyListData.HistoryData>> getHistoryLiveData() {
        return null;
    }
    
    public final void setHistoryLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.MyListData.HistoryData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.MyListData.CollectData>> getCollectLiveData() {
        return null;
    }
    
    public final void setCollectLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.lib_http.bean.data.MyListData.CollectData>> p0) {
    }
    
    /**
     * 历史数据请求
     */
    public final void requestHis() {
    }
    
    /**
     * 获取喜爱数据
     */
    public final void requestCollect(int listType) {
    }
    
    /**
     * 删除历史
     */
    public final void deleteHis() {
    }
    
    /**
     * 删除喜爱的
     */
    public final void deleteCollect() {
    }
    
    /**
     * 收藏
     */
    public final void collectUpdate(boolean is_cancel, int dramaSeriesId, int episode_number) {
    }
}