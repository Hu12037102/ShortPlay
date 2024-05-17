package com.inshort.mylist.adapter;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.inshort.base.entity.TemporaryEntity;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class MyListAdapter extends BaseProviderMultiAdapter<TemporaryEntity> {



    public MyListAdapter() {
        addItemProvider(new HistoryProvider());
        addItemProvider(new LoveProvider());
    }

    @Override
    protected int getItemType(@NonNull List<? extends TemporaryEntity> list, int i) {
        return list.get(i).getType();
    }
}
