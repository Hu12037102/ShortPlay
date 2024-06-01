package com.inshort.base.core.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.inshort.base.R;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.mmkv.UserDataStore;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

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



    protected boolean isLoadEmptyView() {
        return false;
    }

    protected boolean isDarkStatusTextColor() {
        return true;
    }

    protected void onUserUpdate(@NonNull UserEntity userEntity) {
        UserDataStore.get().putData(userEntity);
    }

    protected void onClickEmptyView(@NonNull View view){

    }
    protected boolean isLoadAppViewModel() {
        return false;
    }
}
