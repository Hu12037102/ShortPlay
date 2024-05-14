package com.inshort.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.HomeIndexEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.home.databinding.ItemHomeBannerViewBinding;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

public class HomeBannerAdapter extends BannerAdapter<HomeIndexEntity.Banner, HomeBannerAdapter.ViewHolder> {
    private final Context mContext;

    public HomeBannerAdapter(Context context, List<HomeIndexEntity.Banner> data) {
        super(data);
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHomeBannerViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindView(ViewHolder holder, HomeIndexEntity.Banner entity, int position, int size) {
        GlideCompat.loadImage(entity.imageUrl, holder.viewBinding.aivContent);
        UICompat.setText(holder.viewBinding.atvContent, entity.bannerIntroduction);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ItemHomeBannerViewBinding viewBinding;

        public ViewHolder(@NonNull ItemHomeBannerViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
