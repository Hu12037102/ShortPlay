package com.inshort.home.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.entity.HomeIndexEntity;
import com.inshort.base.entity.TagEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.utils.LogUtils;
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
        try {
            GlideCompat.loadImage(entity.imageUrl, holder.viewBinding.aivContent, com.inshort.base.R.mipmap.icon_banner_placeholder);
            // Glide.with(mContext).load(entity.imageUrl).into(holder.viewBinding.aivContent);
            UICompat.setText(holder.viewBinding.atvContent, entity.bannerIntroduction);
            TagEntity tagEntity = entity.bannerTag;
            if (tagEntity != null && !TextUtils.isEmpty(tagEntity.stringColor) && !TextUtils.isEmpty(tagEntity.label)) {
                holder.viewBinding.atvFlag.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvFlag, tagEntity.label);
                GradientDrawable drawable = new GradientDrawable();
                drawable.setCornerRadius(PhoneCompat.dp2px(mContext, 2));
                drawable.setColor(Color.parseColor(tagEntity.stringColor));
                ViewCompat.setBackground(holder.viewBinding.atvFlag, drawable);
            } else {
                holder.viewBinding.atvFlag.setVisibility(View.GONE);
            }
            LogUtils.d("HomeBannerAdapter", "数据展示:" + entity.imageUrl + "---" + entity.bannerIntroduction);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ItemHomeBannerViewBinding viewBinding;

        public ViewHolder(@NonNull ItemHomeBannerViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
