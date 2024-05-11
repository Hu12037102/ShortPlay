package com.example.module_main.ui.search;

import java.lang.System;

/**
 * 搜索页面Activity
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/home/SearchActivity")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020 H\u0002J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0016J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u00020/H\u0002J\b\u0010;\u001a\u00020/H\u0002J\b\u0010<\u001a\u00020/H\u0002J\u0012\u0010=\u001a\u00020/2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020\bH\u0002J\u0012\u0010A\u001a\u00020/2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010B\u001a\u00020/2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010C\u001a\u00020/H\u0002J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020\bH\u0002J\b\u0010F\u001a\u00020/H\u0014J\u0010\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020/H\u0016J\u0010\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\u000fH\u0002J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\bH\u0002J\b\u0010N\u001a\u00020/H\u0002J\b\u0010O\u001a\u00020/H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"}, d2 = {"Lcom/example/module_main/ui/search/SearchActivity;", "Lcom/example/lib_base/activity/BaseActivity;", "Lcom/example/module_main/viewmodel/SearchViewModel;", "Lcom/example/module_main/databinding/MainActivitySearchBinding;", "()V", "defaultLayoutManger", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "isAutoSearch", "", "isFirstFocus", "isGoneNotFind", "mAdapter", "Lcom/example/module_main/adapter/SearchAdapter;", "mData", "Ljava/util/ArrayList;", "Lcom/example/lib_http/bean/data/SearchInfoData$Result;", "mHeadAivHistoryClear", "Landroidx/appcompat/widget/AppCompatImageView;", "mHeadAtvSearchType", "Landroidx/appcompat/widget/AppCompatTextView;", "mHeadCgHistory", "Lcom/google/android/material/chip/ChipGroup;", "mHeadClHistoryParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mHeadClNotFindParent", "mHeadView", "Landroid/view/View;", "getMHeadView", "()Landroid/view/View;", "mHeadView$delegate", "Lkotlin/Lazy;", "mIntentSearchText", "", "mPlayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "mRegisterTiktokWebActivity", "mSearchKeyWord", "mSearchTextMinLimit", "", "mSearchTextWatcher", "Landroid/text/TextWatcher;", "mTiktokVideoDictLayoutManger", "Landroidx/recyclerview/widget/LinearLayoutManager;", "specialLayoutManger", "clickSearch", "", "createHistoryTextView", "text", "createIntent", "postcard", "Lcom/alibaba/android/arouter/facade/Postcard;", "createObserver", "dismissLoading", "getSearchBackground", "Landroid/graphics/drawable/GradientDrawable;", "getSearchText", "initAdapter", "initHeadView", "initSearchHistoryView", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isEmptyData", "listener", "loadData", "loadLoading", "loadSmartSearch", "isRefresh", "onDestroy", "onWindowFocusChanged", "hasFocus", "showLoading", "startToPlay", "entity", "updateErrorView", "isError", "updateSearchHistoryView", "updateSearchView", "module_main_release"})
public final class SearchActivity extends com.example.lib_base.activity.BaseActivity<com.example.module_main.viewmodel.SearchViewModel, com.example.module_main.databinding.MainActivitySearchBinding> {
    private boolean isFirstFocus = true;
    private java.lang.String mIntentSearchText = "";
    private boolean isAutoSearch = false;
    private final java.util.ArrayList<com.example.lib_http.bean.data.SearchInfoData.Result> mData = null;
    private com.example.module_main.adapter.SearchAdapter mAdapter;
    private final kotlin.Lazy mHeadView$delegate = null;
    private boolean isGoneNotFind = false;
    private androidx.constraintlayout.widget.ConstraintLayout mHeadClHistoryParent;
    private com.google.android.material.chip.ChipGroup mHeadCgHistory;
    private androidx.appcompat.widget.AppCompatImageView mHeadAivHistoryClear;
    private androidx.constraintlayout.widget.ConstraintLayout mHeadClNotFindParent;
    private androidx.appcompat.widget.AppCompatTextView mHeadAtvSearchType;
    private final int mSearchTextMinLimit = 3;
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager defaultLayoutManger = null;
    private final androidx.recyclerview.widget.LinearLayoutManager specialLayoutManger = null;
    private final androidx.recyclerview.widget.LinearLayoutManager mTiktokVideoDictLayoutManger = null;
    private java.lang.String mSearchKeyWord;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> mRegisterTiktokWebActivity = null;
    private final android.text.TextWatcher mSearchTextWatcher = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> mPlayLauncher = null;
    
    public SearchActivity() {
        super();
    }
    
    private final android.view.View getMHeadView() {
        return null;
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initHeadView() {
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAdapter() {
    }
    
    private final void startToPlay(com.example.lib_http.bean.data.SearchInfoData.Result entity) {
    }
    
    private final void updateSearchHistoryView() {
    }
    
    private final void initSearchHistoryView() {
    }
    
    private final void loadSmartSearch(boolean isRefresh) {
    }
    
    private final void clickSearch() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateSearchView() {
    }
    
    private final java.lang.String getSearchText() {
        return null;
    }
    
    private final void updateErrorView(boolean isError) {
    }
    
    @java.lang.Override()
    public void createObserver() {
    }
    
    private final android.graphics.drawable.GradientDrawable getSearchBackground() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    private final androidx.appcompat.widget.AppCompatTextView createHistoryTextView(java.lang.String text) {
        return null;
    }
    
    private final android.content.Intent createIntent(com.alibaba.android.arouter.facade.Postcard postcard) {
        return null;
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    private final boolean isEmptyData() {
        return false;
    }
    
    private final void loadLoading() {
    }
}