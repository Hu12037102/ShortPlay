package com.inshort.base.other.smart;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public final class SmartRefreshLayoutCompat {
    private SmartRefreshLayoutCompat(){

    }
    public static void  initDefault(@Nullable SmartRefreshLayout refreshLayout){
        if (refreshLayout!=null){
            refreshLayout.setEnableLoadMore(false);
            refreshLayout.setEnableAutoLoadMore(true);
            refreshLayout.setEnableOverScrollDrag(true);
            refreshLayout.setEnableOverScrollBounce(true);
        }
    }
    public static void wipeDamp(@Nullable SmartRefreshLayout refreshLayout){
        if (refreshLayout!=null){
            refreshLayout.setEnableOverScrollDrag(false);
            refreshLayout.setEnableOverScrollBounce(false);

        }
    }

}
