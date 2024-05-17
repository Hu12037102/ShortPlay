package com.inshort.mylist.adapter;

import android.util.TypedValue;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.MyListTypeEntity;
import com.inshort.base.entity.TemporaryEntity;
import com.inshort.mylist.R;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class MyListRVAdapter extends BaseQuickAdapter<MyListTypeEntity,BaseViewHolder> {


    public MyListRVAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, MyListTypeEntity s) {
        baseViewHolder.setText(R.id.title_tv,s.getType());
        if(s.isSelect()){
            baseViewHolder.setTextColor(R.id.title_tv,getContext().getResources().getColor(com.inshort.base.R.color.color_Black));
            TextView textView = baseViewHolder.getView(R.id.title_tv);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,22);
        }else {
            baseViewHolder.setTextColor(R.id.title_tv,getContext().getResources().getColor(com.inshort.base.R.color.color_999999));
            TextView textView = baseViewHolder.getView(R.id.title_tv);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
        }
    }
}
