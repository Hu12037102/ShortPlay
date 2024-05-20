package com.inshort.base.compat;

import android.text.TextUtils;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public final class DialogCompat {
    private static final String TAG = "DialogFragment";

    public static void showDialogFragment(@Nullable Object object, @Nullable FragmentManager fragmentManager, @Nullable String tag) {
        if (object instanceof DialogFragment dialogFragment && DataCompat.notNull(fragmentManager)) {
            if (TextUtils.isEmpty(tag)) {
                tag = TAG;
            }
            dialogFragment.show(fragmentManager, tag);
        }

    }

    public static void showDialogFragment(@Nullable Object object, @Nullable FragmentManager fragmentManager) {
        showDialogFragment(object, fragmentManager, null);
    }
}