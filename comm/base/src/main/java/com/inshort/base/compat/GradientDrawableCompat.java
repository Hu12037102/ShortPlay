package com.inshort.base.compat;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

import androidx.annotation.Nullable;

import com.inshort.base.R;

public final class GradientDrawableCompat {
    private GradientDrawableCompat() {
    }

    public static GradientDrawable getUpdateEpisodeBackground(@Nullable Context context) {
        context = DataCompat.checkContext(context);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(context, com.inshort.base.R.color.color_80FFFFFF));
        drawable.setCornerRadii(new float[]{
                PhoneCompat.dp2px(context, 6),
                PhoneCompat.dp2px(context, 6),
                0, 0,
                PhoneCompat.dp2px(context, 6),
                PhoneCompat.dp2px(context, 6),
                0, 0
        });
        return drawable;
    }

    public static GradientDrawable getLabelEpisodeBackground(@Nullable Context context, @Nullable String parseColor) {
        context = DataCompat.checkContext(context);
        GradientDrawable drawable = new GradientDrawable();
        try {
            drawable.setColor(Color.parseColor(parseColor));
            drawable.setCornerRadii(new float[]{
                    PhoneCompat.dp2px(context, 6),
                    PhoneCompat.dp2px(context, 6),
                    0, 0,
                    PhoneCompat.dp2px(context, 6),
                    PhoneCompat.dp2px(context, 6),
                    0, 0
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return drawable;
    }

    public static GradientDrawable getNewEpisodeBackground(@Nullable Context context) {
        context = DataCompat.checkContext(context);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(context, R.color.color_FF00C063));
        drawable.setCornerRadii(new float[]{
                PhoneCompat.dp2px(context, 6),
                PhoneCompat.dp2px(context, 6),
                0, 0,
                PhoneCompat.dp2px(context, 6),
                PhoneCompat.dp2px(context, 6),
                0, 0
        });
        return drawable;
    }
}
