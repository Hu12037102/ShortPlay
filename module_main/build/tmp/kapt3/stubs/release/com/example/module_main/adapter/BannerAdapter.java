package com.example.module_main.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/18
 * 如果你需要通过getAdapterPosition()方法获取position，可参考如下代码
 * int adapterPosition = holder.getAdapterPosition();
 * int realPosition = BannerUtils.getRealPosition(isCanLoop, adapterPosition, mList.size());
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/module_main/adapter/BannerAdapter;", "Lcom/zhpan/bannerview/BaseBannerAdapter;", "Lcom/example/lib_http/bean/data/HomeData$Banner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindData", "", "holder", "Lcom/zhpan/bannerview/BaseViewHolder;", "data", "position", "", "pageSize", "getLayoutId", "viewType", "module_main_release"})
public final class BannerAdapter extends com.zhpan.bannerview.BaseBannerAdapter<com.example.lib_http.bean.data.HomeData.Banner> {
    private final android.content.Context context = null;
    
    public BannerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    protected void bindData(@org.jetbrains.annotations.Nullable()
    com.zhpan.bannerview.BaseViewHolder<com.example.lib_http.bean.data.HomeData.Banner> holder, @org.jetbrains.annotations.Nullable()
    com.example.lib_http.bean.data.HomeData.Banner data, int position, int pageSize) {
    }
    
    @java.lang.Override()
    public int getLayoutId(int viewType) {
        return 0;
    }
}