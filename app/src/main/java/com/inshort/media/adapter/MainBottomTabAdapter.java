package com.inshort.media.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.entity.main.MainBottomTabEntity;
import com.inshort.media.databinding.ItemMainTabViewBinding;

import java.util.List;


public class MainBottomTabAdapter extends RecyclerView.Adapter<MainBottomTabAdapter.ViewHolder> {
    @NonNull
    private Context mContext;
    private List<MainBottomTabEntity> mData;

    public MainBottomTabAdapter(@NonNull Context context, List<MainBottomTabEntity> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemMainTabViewBinding.inflate(LayoutInflater.from(mContext), parent, false),
                CollectionCompat.getListSize(mData));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MainBottomTabEntity entity = mData.get(position);
        UICompat.setText(holder.mViewBinding.atvContent, entity.content);
        if (entity.isSelector) {
            UICompat.setImageRes(holder.mViewBinding.aivContent, entity.selectorRes);
            UICompat.setTextColorRes(holder.mViewBinding.atvContent, com.inshort.base.R.color.color_FFFE2442);
        } else {
            UICompat.setImageRes(holder.mViewBinding.aivContent, entity.normalRes);
            UICompat.setTextColorRes(holder.mViewBinding.atvContent, com.inshort.base.R.color.color_FF999999);
        }
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("NotifyDataSetChanged")
        @Override
        public void onClick(View v) {
           boolean isSelector = entity.isSelector;
           if (!isSelector){
               for (MainBottomTabEntity item : mData){
                   item.isSelector = item ==entity;
               }
               notifyDataSetChanged();
           }
        }
    });

    }


    @Override
    public int getItemCount() {
        return CollectionCompat.getListSize(mData);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ItemMainTabViewBinding mViewBinding;

        public ViewHolder(@NonNull ItemMainTabViewBinding viewBinding, int count) {
            super(viewBinding.getRoot());
            this.mViewBinding = viewBinding;
            ViewsCompat.setViewSize(viewBinding.getRoot(),
                    PhoneCompat.screenWidth(viewBinding.getRoot().getContext()) / count,
                    ViewGroup.LayoutParams.MATCH_PARENT
            );
        }
    }
}
