package com.example.lib_common.dialog;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/15
 */
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001dJ\u001a\u0010&\u001a\u00020\u00162\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/lib_common/dialog/DailyCheckDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkIv", "Landroid/widget/ImageView;", "checkTv", "Lcom/ruffian/library/widget/RTextView;", "closeIv", "dialog", "Lcom/example/lib_common/dialog/BonusPopupWindow;", "mAdapter", "Lcom/example/lib_common/dialog/DailyCheckAdapter;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isAgree", "", "signedTv", "Landroid/widget/TextView;", "isSignIn", "isSign", "notify", "days", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "data", "Lcom/example/lib_http/bean/data/ActivityDetailsData;", "setDay", "day", "setOnClick", "block", "lib_common_release"})
public final class DailyCheckDialog extends android.app.Dialog {
    private final android.content.Context context = null;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClick;
    private com.example.lib_common.dialog.BonusPopupWindow dialog;
    private com.example.lib_common.dialog.DailyCheckAdapter mAdapter;
    private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private android.widget.ImageView checkIv;
    private android.widget.ImageView closeIv;
    private android.widget.TextView signedTv;
    private com.ruffian.library.widget.RTextView checkTv;
    
    public DailyCheckDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.ActivityDetailsData data) {
    }
    
    public final void setDay(int day) {
    }
    
    public final void isSignIn(boolean isSign) {
    }
    
    public final void notify(int days) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
}