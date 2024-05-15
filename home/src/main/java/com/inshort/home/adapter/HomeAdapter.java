package com.inshort.home.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
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
    @Nullable
    private OnHomeItemClickListener mOnHomeItemClickListener;

    public void setOnHomeItemClickListener(@Nullable OnHomeItemClickListener onTrendingItemClickListener) {
        this.mOnHomeItemClickListener = onTrendingItemClickListener;
    }

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
            trendingViewHolder.viewBinding.atvViewMore.setOnClickListener(new DelayedClick() {
                @Override
                public void onDelayedClick(View view) {
                    if (mOnHomeItemClickListener!=null){
                        mOnHomeItemClickListener.onClickTrendingMore(view,getSelectorTrendingTypeContent());
                    }
                }
            });
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initTrendingContentHolder(TrendingViewHolder trendingViewHolder, ColumnEntity entity, int i) {
        RecyclerView rvContent = trendingViewHolder.viewBinding.rvContent;
        List<DramaSeriesEntity> dramaSeriesEntities = entity.dramaSeriesList;
        RecyclerView.Adapter<?> adapter = rvContent.getAdapter();
        HomeTrendingAdapter trendingAdapter;
        if (adapter instanceof HomeTrendingAdapter) {
            trendingAdapter = (HomeTrendingAdapter) adapter;
            trendingAdapter.notifyRefreshData(dramaSeriesEntities);
        } else {
            rvContent.setLayoutManager(new GridLayoutManager(getMContext(), 3, GridLayoutManager.HORIZONTAL, false));
            List<DramaSeriesEntity> data = new ArrayList<>();
            if (DataCompat.notNull(dramaSeriesEntities)) {
                data.addAll(dramaSeriesEntities);
            }
            trendingAdapter = new HomeTrendingAdapter(getMContext(), data);
            rvContent.setAdapter(trendingAdapter);
        }
        trendingAdapter.setOnItemClickListener(new OnItemClickListener<DramaSeriesEntity>() {
            @Override
            public void onItemClick(@Nullable View view, @Nullable DramaSeriesEntity entity) {
                if (mOnHomeItemClickListener != null) {
                    mOnHomeItemClickListener.onClickTrendingItem(view, entity);
                }
            }
        });
    }

    @Nullable
    private String getSelectorTrendingTypeContent() {
        String content = null;
        for (ColumnEntity entity : getMData()) {
            if (DataCompat.notNull(entity.trendingTypes)) {
                for (TrendingTypeEntity typeEntity : entity.trendingTypes) {
                    if (typeEntity.isCheck) {
                        content = typeEntity.content;
                    }
                }
            }
        }
        return content;
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initTrendingTypeHolder(TrendingViewHolder trendingViewHolder, ColumnEntity entity, int i) {
        RecyclerView rvType = trendingViewHolder.viewBinding.rvType;
        List<TrendingTypeEntity> trendingTypes = entity.trendingTypes;
        RecyclerView.Adapter<?> adapter = rvType.getAdapter();
        HomeTrendingTypeAdapter typeAdapter;
        if (DataCompat.isNull(adapter)) {
            rvType.setLayoutManager(new LinearLayoutManager(getMContext(), LinearLayoutManager.HORIZONTAL, false));
            List<TrendingTypeEntity> data = new ArrayList<>();
            if (DataCompat.notNull(trendingTypes)) {
                data.addAll(trendingTypes);
            }
            typeAdapter = new HomeTrendingTypeAdapter(getMContext(), data);
            rvType.setAdapter(typeAdapter);
        } else {
            typeAdapter = (HomeTrendingTypeAdapter) adapter;
            typeAdapter.notifyRefreshData(trendingTypes);
        }
        typeAdapter.setOnItemClickListener(new OnItemClickListener<TrendingTypeEntity>() {
            @Override
            public void onItemClick(@Nullable View view, @Nullable TrendingTypeEntity entity) {
                if (mOnHomeItemClickListener != null) {
                    mOnHomeItemClickListener.onClickTrendingType(view, entity);
                }
            }
        });
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

    public interface OnHomeItemClickListener {
        void onClickTrendingItem(View view, DramaSeriesEntity entity);

        void onClickTrendingType(View view, TrendingTypeEntity entity);

        void onClickTrendingMore(View view, @Nullable String selectorTrendingType);
    }
}
