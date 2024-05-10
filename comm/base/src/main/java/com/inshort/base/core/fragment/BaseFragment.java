package com.inshort.base.core.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.scwang.smart.refresh.layout.api.RefreshLayout;

public abstract class BaseFragment extends Fragment {
    protected void loadSmartData(@Nullable RefreshLayout refreshLayout, boolean isRefresh) {

    }

    protected boolean isLoadEmptyView() {
        return false;
    }

}
