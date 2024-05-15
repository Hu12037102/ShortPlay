package com.inshort.home.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.entity.ColumnEntity;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.TrendingTypeEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.home.databinding.ItemHomeHorizontalViewBinding;
import com.inshort.home.databinding.ItemHomeTrendingViewBinding;
import com.inshort.home.databinding.ItemHomeVerticalViewBinding;
import com.inshort.home.databinding.ItemHomeWaterfallViewBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends BaseRecyclerAdapter<ColumnEntity> {
    public static final int VIEW_TYPE_VERTICAL = 1;
    public static final int VIEW_TYPE_HORIZONTAL = 2;
    public static final int VIEW_TYPE_WATERFALL = 3;
    public static final int VIEW_TYPE_TRENDING = 5;
    private final ArrayMap<Integer, List<TrendingTypeEntity>> mTrendingTypeMap = new ArrayMap<>();
    private final ArrayMap<Integer, List<DramaSeriesEntity>> mTrendingDramaSeriesMap = new ArrayMap<>();

    public HomeAdapter(@NonNull Context mContext, @NonNull List<ColumnEntity> data) {
        super(mContext, data);
    }


    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ColumnEntity entity = getMData().get(i);
        if (viewHolder instanceof HorizontalViewHolder) {

        } else if (viewHolder instanceof VerticalViewHolder) {

        } else if (viewHolder instanceof WaterfallViewHolder) {

        } else if (viewHolder instanceof TrendingViewHolder trendingViewHolder) {
            initTrendingTypeHolder(trendingViewHolder, entity, i);
            initTrendingContentHolder(trendingViewHolder, entity, i);
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initTrendingContentHolder(TrendingViewHolder trendingViewHolder, ColumnEntity entity, int i) {
        RecyclerView rvContent = trendingViewHolder.viewBinding.rvContent;
        List<DramaSeriesEntity> dramaSeriesEntities = entity.dramaSeriesList;
        RecyclerView.Adapter<?> adapter = rvContent.getAdapter();
        List<DramaSeriesEntity> data = mTrendingDramaSeriesMap.get(i);
        if (DataCompat.isNull(data)) {
            data = new ArrayList<>();
            mTrendingDramaSeriesMap.put(i, data);
        }
        data.clear();
        if (DataCompat.notNull(dramaSeriesEntities)) {
            data.addAll(dramaSeriesEntities);
        }
        if (DataCompat.isNull(adapter)) {
            rvContent.setLayoutManager(new GridLayoutManager(getMContext(), 3, GridLayoutManager.HORIZONTAL, false));
            adapter = new HomeTrendingAdapter(getMContext(), data);
            rvContent.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initTrendingTypeHolder(TrendingViewHolder trendingViewHolder, ColumnEntity entity, int i) {
        RecyclerView rvType = trendingViewHolder.viewBinding.rvType;
        List<TrendingTypeEntity> trendingTypes = entity.trendingTypes;
        RecyclerView.Adapter<?> adapter = rvType.getAdapter();
        List<TrendingTypeEntity> typeData = mTrendingTypeMap.get(i);
        if (DataCompat.isNull(typeData)) {
            typeData = new ArrayList<>();
            mTrendingTypeMap.put(i, typeData);
        }
        typeData.clear();
        if (DataCompat.notNull(trendingTypes)) {
            typeData.addAll(trendingTypes);
        }
        if (DataCompat.isNull(adapter)) {
            rvType.setLayoutManager(new LinearLayoutManager(getMContext(), LinearLayoutManager.HORIZONTAL, false));
            adapter = new HomeTrendingTypeAdapter(getMContext(), typeData);
            rvType.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }

        LogUtils.w("HomeAdapter", "我是TrendingViewHolder--" + entity.trendingTypes + "---\n" + trendingTypes);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int type) {
        return switch (type) {
            case VIEW_TYPE_VERTICAL ->
                    new VerticalViewHolder(ItemHomeVerticalViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
            case VIEW_TYPE_WATERFALL ->
                    new WaterfallViewHolder(ItemHomeWaterfallViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
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

    static class VerticalViewHolder extends RecyclerView.ViewHolder {
        ItemHomeVerticalViewBinding viewBinding;

        public VerticalViewHolder(@NonNull ItemHomeVerticalViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }

    static class WaterfallViewHolder extends RecyclerView.ViewHolder {
        ItemHomeWaterfallViewBinding viewBinding;

        public WaterfallViewHolder(@NonNull ItemHomeWaterfallViewBinding viewBinding) {
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
