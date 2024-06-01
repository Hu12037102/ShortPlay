package com.inshort.base.compat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public final class InShortCompat {
    private InShortCompat() {
    }

    @NonNull
    public static String getDramaClassifiesText(@Nullable List<String> dramaClassifies) {
        StringBuilder content = new StringBuilder();
        if (DataCompat.notNull(dramaClassifies)) {
            for (int i = 0; i < CollectionCompat.getListSize(dramaClassifies); i++) {
                String text = dramaClassifies.get(i);
                if (CollectionCompat.isLaseIndex(dramaClassifies, i)) {
                    content.append(text);
                } else {
                    content.append(text).append("/");
                }

            }

        }
        return DataCompat.toString(content);

    }
}
