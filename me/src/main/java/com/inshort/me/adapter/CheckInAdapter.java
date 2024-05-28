package com.inshort.me.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.me.databinding.ItemCheckInViewBinding;

import java.util.List;

public class CheckInAdapter extends RecyclerView.Adapter<CheckInAdapter.ViewHolder> {
    private final Context mContext;
    private final List<Integer> mData;
    private int mCheckDay;
    private boolean isCheckIn;

    public CheckInAdapter(Context context, List<Integer> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemCheckInViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int count = mData.get(position);
        int dayNum = Math.max(position, 0);
        UICompat.setText(holder.viewBinding.atvDayCount, DataCompat.getResString(mContext, com.inshort.base.R.string.s_day_content, DataCompat.toString(dayNum+1)));
        UICompat.setText(holder.viewBinding.atvBonusCount, DataCompat.toString(count));
        setCheckIn(holder.viewBinding.aivBonusSelector, dayNum);

        if (position == mData.size() - 1) {
            ViewCompat.setBackground(holder.viewBinding.atvDayCount, null);
            UICompat.setTextColorRes(holder.viewBinding.atvBonusCount, com.inshort.base.R.color.color_White);
            ViewCompat.setBackground(holder.viewBinding.clContentParent, getLaseContentBackground());
            UICompat.setImageRes(holder.viewBinding.aivBonusIcon, com.inshort.base.R.mipmap.icon_check_last_bonus);
            ViewsCompat.setViewSize(holder.viewBinding.mcvParent, PhoneCompat.dp2px(mContext, 64), PhoneCompat.dp2px(mContext, 72));
            ViewsCompat.setViewSize(holder.viewBinding.getRoot(), PhoneCompat.dp2px(mContext, 68), PhoneCompat.dp2px(mContext, 76));
            UICompat.setTextColorRes(holder.viewBinding.atvDayCount, com.inshort.base.R.color.color_White);
        } else {
            ViewsCompat.setViewSize(holder.viewBinding.mcvParent, PhoneCompat.dp2px(mContext, 38), PhoneCompat.dp2px(mContext, 72));
            ViewsCompat.setViewSize(holder.viewBinding.getRoot(), PhoneCompat.dp2px(mContext, 42), PhoneCompat.dp2px(mContext, 76));
            UICompat.setImageRes(holder.viewBinding.aivBonusIcon, com.inshort.base.R.mipmap.icon_check_bonus);
            ViewCompat.setBackground(holder.viewBinding.clContentParent, null);
            if (mCheckDay > dayNum) {
                ViewCompat.setBackground(holder.viewBinding.atvDayCount, null);
                UICompat.setTextColorRes(holder.viewBinding.atvDayCount, com.inshort.base.R.color.color_FFB0B0B0);
                UICompat.setTextColorRes(holder.viewBinding.atvBonusCount, com.inshort.base.R.color.color_FFB0B0B0);
                holder.viewBinding.mcvParent.setStrokeColor(DataCompat.getColor(mContext, com.inshort.base.R.color.color_White));

            } else if (mCheckDay == dayNum) {
                ViewCompat.setBackground(holder.viewBinding.atvDayCount, ContextCompat.getDrawable(mContext, com.inshort.base.R.color.color_FFFE2442));
                UICompat.setTextColorRes(holder.viewBinding.atvDayCount, com.inshort.base.R.color.color_White);
                UICompat.setTextColorRes(holder.viewBinding.atvBonusCount, com.inshort.base.R.color.color_FFFE2442);
                holder.viewBinding.mcvParent.setStrokeColor(DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFFE2442));
            } else {
                ViewCompat.setBackground(holder.viewBinding.atvDayCount, null);
                UICompat.setTextColorRes(holder.viewBinding.atvDayCount, com.inshort.base.R.color.color_FFB0B0B0);
                UICompat.setTextColorRes(holder.viewBinding.atvBonusCount, com.inshort.base.R.color.color_FFFE2442);
                holder.viewBinding.mcvParent.setStrokeColor(DataCompat.getColor(mContext, com.inshort.base.R.color.color_White));
            }

        }
    }

    private void setCheckIn(View view, int dayNum) {
        if (mCheckDay > dayNum) {
            view.setVisibility(View.VISIBLE);
        } else if (mCheckDay == dayNum) {
            if (isCheckIn) {
                view.setVisibility(View.VISIBLE);
            } else {
                view.setVisibility(View.GONE);
            }
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public void notifyData(int checkDay, List<Integer> data, boolean isCheckIn) {
        this.mCheckDay = checkDay;
        this.isCheckIn = isCheckIn;
        mData.clear();
        if (DataCompat.notNull(data)) {
            mData.addAll(data);
        }
        notifyDataSetChanged();
    }

    private Drawable getLaseContentBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColors(new int[]{DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFFF9597),
                DataCompat.getColor(mContext, com.inshort.base.R.color.color_FFFE2442)});
        drawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return drawable;
    }

    @Override
    public int getItemCount() {
        return CollectionCompat.getListSize(mData);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemCheckInViewBinding viewBinding;

        public ViewHolder(@NonNull ItemCheckInViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
