package com.inshort.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.entity.ColumnEntity;
import com.inshort.home.databinding.ItemHomeHorizontalViewBinding;
import com.inshort.home.databinding.ItemHomeTrendingViewBinding;

import java.util.List;

public class HomeAdapter extends BaseRecyclerAdapter<ColumnEntity> {
    public static final int VIEW_TYPE_VERTICAL = 1;
    public static final int VIEW_TYPE_HORIZONTAL = 2;
    public static final int VIEW_TYPE_WATERFALL = 3;
    public static final int VIEW_TYPE_TRENDING = 5;


    public HomeAdapter(@NonNull Context mContext, @NonNull List<? extends ColumnEntity> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof HorizontalViewHolder) {

        } else if (viewHolder instanceof TrendingViewHolder) {

        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int type) {
        return switch (type) {
            case VIEW_TYPE_VERTICAL ->
                    new HorizontalViewHolder(ItemHomeHorizontalViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
            case VIEW_TYPE_WATERFALL ->
                    new HorizontalViewHolder(ItemHomeHorizontalViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
            case VIEW_TYPE_TRENDING ->
                    new TrendingViewHolder(ItemHomeTrendingViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
            default -> new HorizontalViewHolder(ItemHomeHorizontalViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
        };


    }

    @Override
    protected int getChildItemViewType(int position) {
        if (getMHasHeadView()) {
            position -= 1;
        }
        return getMData().get(position).viewType;
    }

    static class HorizontalViewHolder extends RecyclerView.ViewHolder {
        final ItemHomeHorizontalViewBinding viewBinding;

        public HorizontalViewHolder(@NonNull ItemHomeHorizontalViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }

    static class TrendingViewHolder extends RecyclerView.ViewHolder {
        final ItemHomeTrendingViewBinding viewBinding;

        public TrendingViewHolder(@NonNull ItemHomeTrendingViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
