package com.inshort.base.compat;

import androidx.annotation.Nullable;

import java.util.List;

public final class CollectionCompat {
    private CollectionCompat() {
    }

    public static <T> int getListSize(@Nullable List<T> list) {
        return DataCompat.isNull(list) ? 0 : list.size();
    }

    public static <T> boolean isEmptyList(@Nullable List<T> list) {
        return getListSize(list) == 0;
    }
}
