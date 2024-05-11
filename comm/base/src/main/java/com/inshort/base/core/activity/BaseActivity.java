package com.inshort.base.core.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.inshort.base.R;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.databinding.BaseRootFrameViewBinding;
import com.inshort.base.entity.base.UserEntity;
import com.inshort.base.other.mmkv.UserInfoStore;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;

public abstract class BaseActivity extends AppCompatActivity {
    private boolean isFirstWindowFocus = true;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (isOpenActivityAnim()) {
            overridePendingTransition(getInActivityAnimRes(), R.anim.anim_normal);
        }
        super.onCreate(savedInstanceState);


    }


    protected boolean isOpenActivityAnim() {
        return true;
    }

    protected @AnimRes int getInActivityAnimRes() {
        return R.anim.anim_right_to_center;
    }

    protected @AnimRes int getOutActivityAnimRes() {
        return R.anim.anim_center_to_right;
    }

    @Override
    public void finish() {
        super.finish();
        if (isOpenActivityAnim()) {
            overridePendingTransition(R.anim.anim_normal, getOutActivityAnimRes());
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (isFirstWindowFocus && hasFocus) {
            ViewsCompat.setStatusTextColor(getWindow(), isDarkStatusTextColor());
            onWindowFirstFocusChanged();
            isFirstWindowFocus = false;
        }

    }

    protected void onWindowFirstFocusChanged() {

    }

    protected void loadSmartData(@Nullable RefreshLayout refreshLayout, boolean isRefresh) {

    }

    protected boolean isLoadEmptyView() {
        return false;
    }

    protected boolean isDarkStatusTextColor() {
        return true;
    }

    protected void onUserUpdate(@NonNull UserEntity userEntity) {
        UserInfoStore.get().putData(userEntity);
    }
}
