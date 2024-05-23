package com.inshort.me.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.StoreEntity;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.me.databinding.ItemStoreViewBinding;

import java.util.List;

public class StoreAdapter extends BaseRecyclerAdapter<StoreEntity.Info> {
    public StoreAdapter(@NonNull Context mContext, @NonNull List<? extends StoreEntity.Info> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        StoreEntity.Info entity = getMData().get(i);
        if (viewHolder instanceof ViewHolder holder) {
            UICompat.setText(holder.viewBinding.atvCoinsCount, DataCompat.toString(entity.coins));
            if (TextUtils.isEmpty(entity.complimentary)) {
                holder.viewBinding.atvAwardBonus.setVisibility(View.GONE);
            } else {
                holder.viewBinding.atvAwardBonus.setVisibility(View.VISIBLE);
                UICompat.setText(holder.viewBinding.atvAwardBonus, entity.complimentary);

            }
            UICompat.setText(holder.viewBinding.atvPrice, entity.price);
            if (entity.proportionDiscount > 0) {
                UICompat.setText(holder.viewBinding.atvDiscount, DataCompat.getResString(getMContext(), com.inshort.base.R.string.add_proportion_discount_s, DataCompat.toString(entity.proportionDiscount)));
                holder.viewBinding.atvDiscount.setVisibility(View.VISIBLE);
                UICompat.setTextColorRes(holder.viewBinding.atvDiscount, com.inshort.base.R.color.color_FFFE2442);
            } else {
                holder.viewBinding.atvDiscount.setVisibility(View.GONE);
            }

            if (entity.isSelector) {
                holder.viewBinding.mcvParent.setStrokeColor(DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FFFE2442));
                UICompat.setTextColorRes(holder.viewBinding.atvPrice, com.inshort.base.R.color.color_FFFE2442);
                holder.viewBinding.viewRight.setBackgroundResource(com.inshort.base.R.color.color_1AFE2442);
                UICompat.setTextColorRes(holder.viewBinding.atvAwardBonus, com.inshort.base.R.color.color_White);
                ViewCompat.setBackground(holder.viewBinding.atvAwardBonus, getSelectorAwardBackground());
            } else {
                holder.viewBinding.mcvParent.setStrokeColor(DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FFE9EAEB));
                UICompat.setTextColorRes(holder.viewBinding.atvPrice, com.inshort.base.R.color.color_Black);
                holder.viewBinding.viewRight.setBackgroundResource(com.inshort.base.R.color.color_FFF7F7F7);
                UICompat.setTextColorRes(holder.viewBinding.atvAwardBonus, com.inshort.base.R.color.color_FFFE2442);
                ViewCompat.setBackground(holder.viewBinding.atvAwardBonus, getNormalAwardBackground());
            }
            holder.viewBinding.mcvParent.setOnClickListener(new DelayedClick() {
                @SuppressLint("NotifyDataSetChanged")
                @Override
                public void onDelayedClick(View view) {
                    if (!entity.isSelector) {
                        for (StoreEntity.Info info : getMData()) {
                            info.isSelector = info == entity;
                        }
                        notifyDataSetChanged();
                    }
                }
            });

        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(ItemStoreViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
    }

    private Drawable getSelectorAwardBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColors(new int[]{DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FFFF798B),
                DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_FFFE2442)});
        drawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        drawable.setCornerRadius(PhoneCompat.dp2px(getMContext(), 50));
        return drawable;
    }
    private Drawable getNormalAwardBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor( DataCompat.getColor(getMContext(), com.inshort.base.R.color.color_1AFE2442));
        drawable.setCornerRadius(PhoneCompat.dp2px(getMContext(), 50));
        return drawable;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemStoreViewBinding viewBinding;

        public ViewHolder(@NonNull ItemStoreViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
