package com.inshort.base.entity;

import androidx.annotation.Nullable;

import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

public class TrendingTypeEntity {
    public String content;
    public boolean isCheck;

    public static List<TrendingTypeEntity> stringList2EntityList(@Nullable List<String> data) {
        List<TrendingTypeEntity> list = new ArrayList<>();
        if (DataCompat.notNull(data)) {
            for (String text : data) {
                TrendingTypeEntity entity = new TrendingTypeEntity();
                entity.content = text;
                entity.isCheck = data.indexOf(text) == 0;
                list.add(entity);
            }
        }
        LogUtils.w("TrendingTypeEntity", list + "--");
        return list;
    }

    @Override
    public String toString() {
        return "TrendingTypeEntity{" +
                "content='" + content + '\'' +
                ", isCheck=" + isCheck +
                '}';
    }
}
