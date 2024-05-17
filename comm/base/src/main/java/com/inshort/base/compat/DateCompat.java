package com.inshort.base.compat;

import android.content.Context;

import androidx.annotation.NonNull;

import com.inshort.base.R;

import java.util.Calendar;

public final class DateCompat {
    private DateCompat() {
    }

    public static int[] timestamp2MonthDay(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return new int[]{month, day};
    }

    @NonNull
    public static String intMonth2English(Context context, int month) {
        return switch (month) {
            case 1 -> DataCompat.getResString(context, R.string.jan_content);
            case 2 -> DataCompat.getResString(context, R.string.feb_content);
            case 3 -> DataCompat.getResString(context, R.string.mar_content);
            case 4 -> DataCompat.getResString(context, R.string.apr_content);
            case 5 -> DataCompat.getResString(context, R.string.may_content);
            case 6 -> DataCompat.getResString(context, R.string.jun_content);
            case 7 -> DataCompat.getResString(context, R.string.jul_content);
            case 8 -> DataCompat.getResString(context, R.string.aug_content);
            case 9 -> DataCompat.getResString(context, R.string.sep_content);
            case 10 -> DataCompat.getResString(context, R.string.oct_content);
            case 11 -> DataCompat.getResString(context, R.string.nov_content);
            case 12 -> DataCompat.getResString(context, R.string.dec_content);
            default -> "";
        };
    }
}
