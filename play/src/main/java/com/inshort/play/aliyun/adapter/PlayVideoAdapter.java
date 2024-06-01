package com.inshort.play.aliyun.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.play.R;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.listener.OnAdapterClick;
import com.inshort.play.viewmodel.PlayViewModel;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoAdapter extends ListAdapter<VideoUrlEntity.PlayData,PlayVideoViewHolder> {
    private OnAdapterClick onAdapterClick;
    private PlayViewModel mViewModel;

    public PlayVideoAdapter(@NonNull DiffUtil.ItemCallback<VideoUrlEntity.PlayData> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public PlayVideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mViewModel = new ViewModelProvider((PlayActivity)parent.getContext()).get(PlayViewModel.class);
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.play_adapter_ui_view, parent, false);
        return new PlayVideoViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayVideoViewHolder holder, int position) {
        LogUtils.d("onBindViewHolder  >> "+onAdapterClick);
        holder.setUIMangerData(position,onAdapterClick);

    }

    @Override
    public void onViewAttachedToWindow(@NonNull PlayVideoViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        VideoUrlEntity.DramaSeries mDramaSeries = mViewModel.getDramaSeriesLiveData().getValue();
        if(mDramaSeries!=null && mDramaSeries.getDramaEpisodeList()!=null &&mDramaSeries.getDramaEpisodeList().size() > holder.getAdapterPosition() && onAdapterClick!=null){
            onAdapterClick.setPlayUrl(holder.getAdapterPosition(),mDramaSeries.getDramaEpisodeList().get(holder.getAdapterPosition()).isPurchased());
        }
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull PlayVideoViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        LogUtils.d("onViewDetachedFromWindow  >>> "+holder.getAdapterPosition());
        if(holder.getManger()!=null){
            holder.getManger().viewDetachedFromWindow();
        }
    }




    public void setOnAdapterClick(OnAdapterClick onAdapterClick){
        this.onAdapterClick = onAdapterClick;
    }


}
