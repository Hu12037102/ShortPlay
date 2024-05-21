package com.inshort.search.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.search.databinding.ItemSearchHeadTrendViewBinding;

import java.util.List;


public class SearchTrendingAdapter extends RecyclerView.Adapter<SearchTrendingAdapter.ViewHolder> {
    private final Context mContext;
    private final List<DramaSeriesEntity> mData;

    public SearchTrendingAdapter(Context context, List<DramaSeriesEntity> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemSearchHeadTrendViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        DramaSeriesEntity entity = mData.get(position);
        UICompat.setText(holder.viewBinding.atvContent, entity.dramaTitle);
    }

    @SuppressLint("NotifyDataSetChanged")
    public void notifyData(@Nullable List<DramaSeriesEntity>data){
        mData.clear();
        if (DataCompat.notNull(data)){
            mData.addAll(data);
        }
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return CollectionCompat.getListSize(mData);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemSearchHeadTrendViewBinding viewBinding;

        public ViewHolder(@NonNull ItemSearchHeadTrendViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
