package com.inshort.mylist.adapter;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.utils.ColorUtil;
import com.inshort.mylist.R;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class ProviderILoveItemAdapter extends BaseQuickAdapter<MyListEntity.CollectData, BaseViewHolder> {


    public ProviderILoveItemAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder holder, MyListEntity.CollectData item) {
        holder.setGone(R.id.rr_has_updated,!item.isNeedTips());
        holder.setText(R.id.updated_to_tv, String.format(getContext().getString(com.inshort.base.R.string.updated_to), String.valueOf(item.getEpisodeUpdated())));
        GlideCompat.loadImage(item.getCoverImageUrl(),holder.getView(R.id.love_riv));
        holder.setText(R.id.love_name,item.getDramaTitle());
        holder.setText(R.id.current_set, ColorUtil.getGatherColor(item.getEpisodeNumber(),item.getEpisodeUpdated()));
    }
}
