package com.inshort.base.compat;

import androidx.annotation.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class CollectionCompat {
    private CollectionCompat() {
    }

    public static <T> int getListSize(@Nullable List<T> list) {
        return DataCompat.isNull(list) ? 0 : list.size();
    }

    public static <T> boolean isEmptyList(@Nullable List<T> list) {
        return getListSize(list) == 0;
    }
    public static <T> boolean notEmptyList(@Nullable List<T> list){return !isEmptyList(list);}

    public static <K, V> boolean isEmptyMap(@Nullable Map<K, V> map) {
        return map == null || map.isEmpty();
    }
}
