package com.inshort.base.core.dialog;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.inshort.base.R;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.mmkv.UserDataStore;

public class BaseDialog extends AppCompatDialogFragment {

    @Override
    public int getTheme() {
        return R.style.Theme_BaseCompat_Dialog;
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
