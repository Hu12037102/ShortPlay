package com.inshort.base.compat;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;

public final class UICompat {
    private UICompat() {
    }

    public static void setImageRes(@Nullable ImageView imageView, @DrawableRes int res) {
        if (DataCompat.isNull(imageView)) {
            return;
        }
        imageView.setImageResource(res);
    }

    public static void setTextColor(@Nullable TextView textView, @ColorInt int colorInt) {
        if (DataCompat.isNull(textView)) {
            return;
        }
        textView.setTextColor(colorInt);
    }
    public static void setTextColorRes(@Nullable TextView textView, @ColorRes int colorRes) {
        if (DataCompat.isNull(textView)) {
            return;
        }
        textView.setTextColor(ContextCompat.getColor(textView.getContext(),colorRes));
    }
    public static void setText(@Nullable TextView textView, @Nullable CharSequence text) {
        if (DataCompat.isNull(textView)) {
            return;
        }
        textView.setText(DataCompat.isNull(text) ? "" : text);
    }

}
