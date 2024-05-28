package com.inshort.base.compat;

import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public final class KeySoftCompat {

    private KeySoftCompat(){}
    public static void updateKeySoft(@Nullable Window window,@Nullable View view,boolean isShow){
        if (window ==null || view ==null){
            return;
        }
        if (isShow){
            WindowCompat.getInsetsController(window, view).show(WindowInsetsCompat.Type.ime());
        }else {
            WindowCompat.getInsetsController(window, view).hide(WindowInsetsCompat.Type.ime());
        }

    }
}
