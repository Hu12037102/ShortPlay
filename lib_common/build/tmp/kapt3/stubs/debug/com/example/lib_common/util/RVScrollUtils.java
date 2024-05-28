package com.example.lib_common.util;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/8/21
 *   指定滑动到某个位置
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\r"}, d2 = {"Lcom/example/lib_common/util/RVScrollUtils;", "", "()V", "rvScrollToPosition", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "position", "", "rvSmoothScrollToPosition", "recyclerView", "lib_common_debug"})
public final class RVScrollUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lib_common.util.RVScrollUtils INSTANCE = null;
    
    private RVScrollUtils() {
        super();
    }
    
    /**
     * 缓慢滚动
     */
    public final void rvSmoothScrollToPosition(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager layoutManager, int position) {
    }
    
    /**
     * 直接跳转刷新Layout
     */
    public final void rvScrollToPosition(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager layoutManager, int position) {
    }
}