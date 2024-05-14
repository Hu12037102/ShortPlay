package com.inshort.base.core.fragment;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.mmkv.UserDataStore;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

public abstract class BaseFragment extends Fragment {
    protected void loadSmartData(@Nullable RefreshLayout refreshLayout, boolean isRefresh) {

    }

    protected boolean isLoadEmptyView() {
        return false;
    }
    protected void onUserUpdate(@Nullable UserEntity userEntity) {
        UserDataStore.get().putData(userEntity);
    }
    protected void onClickEmptyView(@NonNull View view){

    }
}
