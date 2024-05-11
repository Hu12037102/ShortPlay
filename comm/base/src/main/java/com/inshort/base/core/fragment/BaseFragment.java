package com.inshort.base.core.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.inshort.base.entity.base.UserEntity;
import com.inshort.base.other.mmkv.UserInfoStore;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

public abstract class BaseFragment extends Fragment {
    protected void loadSmartData(@Nullable RefreshLayout refreshLayout, boolean isRefresh) {

    }

    protected boolean isLoadEmptyView() {
        return false;
    }
    protected void onUserUpdate(@Nullable UserEntity userEntity) {
        UserInfoStore.get().putData(userEntity);
    }
}
