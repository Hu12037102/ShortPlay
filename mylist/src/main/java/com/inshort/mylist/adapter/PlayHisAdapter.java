package com.inshort.mylist.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.utils.ColorUtil;
import com.inshort.base.utils.LogUtils;
import com.inshort.mylist.R;

/**
 * @author: 张勇
 * @date: 2024/5/15
 */
public class PlayHisAdapter extends BaseQuickAdapter<MyListEntity.CollectData,BaseViewHolder>{

    private boolean isHis = false;
    public PlayHisAdapter(int layoutResId,boolean isHis) {
        super(layoutResId);
        this.isHis = isHis;
    }

    @Override
    protected void convert(@NonNull BaseViewHolder holder, MyListEntity.CollectData item) {
        LogUtils.d("PlayHisAdapter","PlayHisAdapter >>> ");
        showLoveView(holder,isHis);
        showLove(holder,item.isCollected());
        GlideCompat.loadImage(item.getCoverImageUrl(),holder.getView(R.id.coverImageUrl_iv));
        holder.setText(R.id.love_title,item.getDramaTitle())
                .setText(R.id.love_current_set, ColorUtil.getGatherColor(item.getEpisodeNumber(),item.getEpisodeUpdated()))
                .setText(R.id.his_title_tv,item.getDramaTitle())
                .setText(R.id.vertical_tv_flag,String.format(getContext().getResources().getString(com.inshort.base.R.string.played_to_episode),String.valueOf(item.getEpisodeNumber())))
                .setText(R.id.introduce_tv,getTime(item.getLastTime()*1000L));



    }


    /**
     * 是否点赞
     */
    private void showLove(BaseViewHolder baseViewHolder,boolean isLove){
        if(isLove){
            baseViewHolder.setImageResource(R.id.his_select_iv, com.inshort.base.R.mipmap.love_select);
        }else {
            baseViewHolder.setImageResource(R.id.his_select_iv, com.inshort.base.R.mipmap.no_love_select_logo);
        }
    }

    private void showDelete(BaseViewHolder baseViewHolder,boolean isDelete){
        if(isDelete){
            baseViewHolder.setImageResource(R.id.his_select_iv, com.inshort.base.R.mipmap.select_all);
        }else {
            baseViewHolder.setImageResource(R.id.his_select_iv, com.inshort.base.R.mipmap.select_all_logo);
        }
    }



    /**
     * 布局隐藏
     * @param baseViewHolder
     * @param isHis ture 历史， false 点赞
     */
    private void showLoveView(BaseViewHolder baseViewHolder,boolean isHis){
        if(isHis){
            baseViewHolder.getView(R.id.love_title).setVisibility(View.GONE);
            baseViewHolder.getView(R.id.love_current_set).setVisibility(View.GONE);
        }else {
            baseViewHolder.getView(R.id.his_title_tv).setVisibility(View.GONE);
            baseViewHolder.getView(R.id.vertical_tv_flag).setVisibility(View.GONE);
            baseViewHolder.getView(R.id.his_select_iv).setVisibility(View.GONE);
            baseViewHolder.getView(R.id.introduce_tv).setVisibility(View.GONE);
        }
    }


    /**
     * 时间
     * @return
     */
    private String getTime(long lastTime){
        long timeDifference=System.currentTimeMillis()-(lastTime);

        if(timeDifference < (1000 * 60)){  //小于1分钟
            return getContext().getResources().getString(com.inshort.base.R.string.time_just_now);
        }

        if(timeDifference < (1000 * 60 * 60)){ //60分钟之前
            return String.format(getContext().getString(com.inshort.base.R.string.time_minutes),String.valueOf(showTimeInterval(timeDifference,3)));
        }

        if(timeDifference < (1000 * 60 * 60 * 24)){ //24小时之前
            return String.format(getContext().getString(com.inshort.base.R.string.time_hours),String.valueOf(showTimeInterval(timeDifference,2)));
        }
        return String.format(getContext().getString(com.inshort.base.R.string.time_days),String.valueOf(showTimeInterval(timeDifference,1)));
    }

    private  long showTimeInterval(long mLong,int type) {
        long day = mLong / (24 * 60 * 60 * 1000);
        long hour = mLong / (60 * 60 * 1000) - day * 24;
        long min = mLong / (60 * 1000) - day * 24 * 60 - hour * 60;
        long sec = mLong / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60;
        System.out.println("date1 与 date2 相差 " + day + "天" + hour + "小时" + min + "分" + sec + "秒");
        return switch (type) {
            case 1 -> day;
            case 2 -> hour;
            case 3 -> min;
            default -> sec;
        };
    }

}
