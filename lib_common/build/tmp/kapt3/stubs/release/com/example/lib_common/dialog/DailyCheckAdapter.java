package com.example.lib_common.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/6/17
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/lib_common/dialog/DailyCheckAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "isCheckedIn", "", "positionDay", "convert", "", "holder", "item", "setDayPosition", "lib_common_release"})
public final class DailyCheckAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<java.lang.Integer, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private int positionDay = 0;
    private boolean isCheckedIn = false;
    
    public DailyCheckAdapter() {
        super(0, null);
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseViewHolder holder, int item) {
    }
    
    public final void setDayPosition(int positionDay, boolean isCheckedIn) {
    }
}