package com.example.module_main.views;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/16
 */
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/module_main/views/BnvVp2Mediator;", "", "tabImageViewList", "", "Landroid/widget/ImageView;", "tabTextViewList", "Landroid/widget/TextView;", "bottomTabView", "Landroid/widget/LinearLayout;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "(Ljava/util/List;Ljava/util/List;Landroid/widget/LinearLayout;Landroidx/viewpager2/widget/ViewPager2;)V", "attach", "", "onSelectorPagerCallback", "Lcom/example/module_main/views/BnvVp2Mediator$OnSelectorPagerCallback;", "isChangeHomeView", "pos", "", "setTabHome", "page", "switchTab", "OnSelectorPagerCallback", "module_main_release"})
public final class BnvVp2Mediator {
    private final java.util.List<android.widget.ImageView> tabImageViewList = null;
    private final java.util.List<android.widget.TextView> tabTextViewList = null;
    private final android.widget.LinearLayout bottomTabView = null;
    private final androidx.viewpager2.widget.ViewPager2 viewPager2 = null;
    
    public BnvVp2Mediator(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.widget.ImageView> tabImageViewList, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.widget.TextView> tabTextViewList, @org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout bottomTabView, @org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager2) {
        super();
    }
    
    public final void attach(@org.jetbrains.annotations.Nullable()
    com.example.module_main.views.BnvVp2Mediator.OnSelectorPagerCallback onSelectorPagerCallback) {
    }
    
    /**
     * 切换到HomeFragment
     */
    public final void setTabHome(int page) {
    }
    
    /**
     * 切换整个tab逻辑
     */
    private final void switchTab(int pos) {
    }
    
    /**
     * 切换Hometab逻辑
     */
    private final void isChangeHomeView(int pos) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/module_main/views/BnvVp2Mediator$OnSelectorPagerCallback;", "", "onSelectorPager", "", "index", "", "module_main_release"})
    public static abstract interface OnSelectorPagerCallback {
        
        public abstract void onSelectorPager(int index);
    }
}