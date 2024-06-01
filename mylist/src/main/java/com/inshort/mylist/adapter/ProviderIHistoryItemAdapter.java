package com.inshort.mylist.adapter;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.other.glide.GlideInShort;
import com.inshort.base.utils.ColorUtil;
import com.inshort.base.utils.LogUtils;
import com.inshort.mylist.R;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class ProviderIHistoryItemAdapter extends BaseQuickAdapter<MyListEntity.HistoryData, BaseViewHolder> {


    public ProviderIHistoryItemAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder holder, MyListEntity.HistoryData item) {
        holder.setGone(R.id.rr_has_updated,!item.getHasUpdated());

        GlideCompat.loadImage(item.getCoverImageUrl(),holder.getView(R.id.history_riv));

        holder.setText(R.id.history_name,item.getDramaTitle());
        holder.setText(R.id.history_ranking,item.getProgressPercentage()+"%");
//        val tvCurrent = holder.getViewOrNull<TextView>(R.id.current_set);
//        boolean isChinese = DefaultLanguageManger.isChinese();
//        if (isChinese){
//            SpanTextHelper.with()
//                    .append(if (item.episodeNumber>=10) "${item.episodeNumber}" else "0${item.episodeNumber }")
//                .setColor(ContextCompat.getColor(context,com.example.lib_common.R.color.red_860))
//                    .append(context.getString(com.example.lib_common.R.string.diagonal_sign))
//                    .setColor(ContextCompat.getColor(context,com.example.lib_common.R.color.black_8080))
//                    .append(if (item.episodeUpdated>=10) "${item.episodeUpdated}" else "0${item.episodeUpdated}")
//                .setColor(ContextCompat.getColor(context,com.example.lib_common.R.color.black_8080))
//                    .crete(tvCurrent)
//        }else{
            holder.setText(R.id.current_set, ColorUtil.getGatherColor(item.getEpisodeNumber(),item.getEpisodeUpdated()));
//        }
    }
}
