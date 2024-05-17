package com.inshort.base.other.smart;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public final class SmartRefreshLayoutCompat {
    private SmartRefreshLayoutCompat() {

    }

    public static void initDefault(@Nullable SmartRefreshLayout refreshLayout) {
        if (refreshLayout != null) {
            refreshLayout.setEnableLoadMore(true);
            refreshLayout.setEnableRefresh(true);
            //  refreshLayout.setEnableOverScrollDrag(true);
            //  refreshLayout.setEnableOverScrollBounce(true);
        }
    }

    public static void wipeDamp(@Nullable SmartRefreshLayout refreshLayout) {
        if (refreshLayout != null) {
            refreshLayout.setEnableOverScrollDrag(false);
            refreshLayout.setEnableOverScrollBounce(false);

        }
    }

    public static void finishAll(@Nullable SmartRefreshLayout refreshLayout) {
        if (refreshLayout != null) {
           /* if (refreshLayout.isRefreshing()){
                refreshLayout.finishRefresh();
            }
            if (refreshLayout.isLoading()){
                refreshLayout.finishLoadMore();
            }*/
            refreshLayout.finishRefresh();
            refreshLayout.finishLoadMore();

        }
    }

    public static void setEnableMore(@Nullable SmartRefreshLayout refreshLayout, int dataSize, int defaultSize) {
        if (refreshLayout == null) {
            return;
        }
        refreshLayout.setEnableLoadMore(dataSize >= defaultSize);
    }
}
