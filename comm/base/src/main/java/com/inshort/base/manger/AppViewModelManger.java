package com.inshort.base.manger;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

import com.inshort.base.core.application.BaseApplication;

public final class AppViewModelManger implements ViewModelStoreOwner {

    private final ViewModelStore mViewModelStore;
    private final ViewModelProvider.AndroidViewModelFactory mFactory;

    private AppViewModelManger(Application application) {
        mFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application);
        mViewModelStore = new ViewModelStore();
    }

    private static AppViewModelManger mInstance = null;

    public static AppViewModelManger getInstance(Application application) {
        synchronized (AppViewModelManger.class) {
            if (mInstance == null) {
                synchronized (AppViewModelManger.class) {
                    mInstance = new AppViewModelManger(application);
                }
            }
        }
        return mInstance;
    }


    @NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        return mViewModelStore;
    }

    public <T extends ViewModel> T getViewModel(Class<T> clazz) {
        return new ViewModelProvider(this, mFactory).get(clazz);
    }
}
