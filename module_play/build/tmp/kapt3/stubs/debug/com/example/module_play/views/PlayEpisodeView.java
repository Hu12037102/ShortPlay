package com.example.module_play.views;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/22
 *  剧集选择
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0017\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002J\b\u0010.\u001a\u00020\u0011H\u0002J\'\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u00101\u001a\u000202\u00a2\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\u001a\u00105\u001a\u00020\u00112\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u000fJ\u0010\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\tH\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/example/module_play/views/PlayEpisodeView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "arraylist", "", "", "close", "Lkotlin/Function1;", "", "", "closeIv", "mHeight", "", "getMHeight", "()F", "setMHeight", "(F)V", "mPosition", "mSelectPosition", "mViewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "pager", "getPager", "()I", "setPager", "(I)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tvUpdated", "Landroid/widget/TextView;", "updateContent", "viewPagerAdapter", "Lcom/example/module_play/adapter/ViewPager2EpisodeAdapter;", "currentItem", "episodeNumber", "(Ljava/lang/Integer;)V", "getCount", "episodeTotal", "listenerView", "setData", "total", "data", "Lcom/example/lib_http/bean/data/PlayBeanData;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/lib_http/bean/data/PlayBeanData;)V", "setOnClose", "setSelectPosition", "index", "setVisibility", "visibility", "module_play_debug"})
public final class PlayEpisodeView extends android.widget.RelativeLayout {
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> close;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> mSelectPosition;
    private androidx.viewpager2.widget.ViewPager2 mViewPager2;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private android.widget.RelativeLayout closeIv;
    private android.widget.TextView tvUpdated;
    private android.widget.TextView updateContent;
    private com.example.module_play.adapter.ViewPager2EpisodeAdapter viewPagerAdapter;
    private int mPosition = -1;
    private final java.util.List<java.lang.String> arraylist = null;
    private int pager = 0;
    private float mHeight = -1.0F;
    
    public PlayEpisodeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PlayEpisodeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams", "MissingInflatedId"})
    public PlayEpisodeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyleAttr) {
        super(null);
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episodeNumber, @org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayBeanData data) {
    }
    
    public final int getPager() {
        return 0;
    }
    
    public final void setPager(int p0) {
    }
    
    private final void currentItem(java.lang.Integer episodeNumber) {
    }
    
    private final void listenerView() {
    }
    
    private final int getCount(int episodeTotal) {
        return 0;
    }
    
    public final void setOnClose(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> close) {
    }
    
    public final void setSelectPosition(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> index) {
    }
    
    public final float getMHeight() {
        return 0.0F;
    }
    
    public final void setMHeight(float p0) {
    }
    
    @java.lang.Override()
    public void setVisibility(int visibility) {
    }
}