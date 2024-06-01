package com.inshort.play.aliyun.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.aliyun.player.IPlayer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.utils.PlayUrlUtilsKt;
import com.inshort.base.utils.SumDataUtilKt;
import com.inshort.base.utils.TimeFormater;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.listener.OnAdapterClick;
import com.inshort.play.databinding.PlayUiBinding;
import com.inshort.play.viewmodel.PlayViewModel;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/28
 */
public class UIVideoManger extends FrameLayout {
    private final static int HANDLER_MSG = -10000;
    private final static int HANDLER_MSG_TIME = 6000;
    private Context mContext;
    private int mSelectPosition;
    private VideoUrlEntity.DramaSeries mData;
    private PlayUiBinding mViewBinding;
    private PlayViewModel mViewModel;
    public  boolean isShowView = true;

    private OnAdapterClick onAdapterClick;
    public UIVideoManger(@NonNull Context context) {this(context,null);}
    public UIVideoManger(@NonNull Context context, @Nullable AttributeSet attrs) {this(context, attrs,0);}
    public UIVideoManger(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context){
        this.mContext = context;
        mViewModel = new ViewModelProvider((PlayActivity)mContext).get(PlayViewModel.class);
        mViewBinding = PlayUiBinding.inflate(LayoutInflater.from(context), this, true);
        initEvent();
    }

    private void initEvent(){
        //black
        mViewBinding.includeTop.topReturnRl.setOnClickListener(v -> {
            ((Activity)mContext).finish();
        });
        //分享
        mViewBinding.includeRight.sharRl.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                LogUtils.d("onDelayedClick ?????");
                if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size()> mSelectPosition){
                    mViewModel.requestFriend(mData.getDramaSeriesId(),mData.getDramaEpisodeList().get(mSelectPosition).getEpisodeNumber());
                }
            }
        });
        //bonus
        mViewBinding.includeRight.bonusRl.setOnClickListener(v -> {

        });
        //暂停/开始
        mViewBinding.startIv.setOnClickListener(v -> {
            onItemClick();
        });
        //点赞
        mViewBinding.includeRight.playLoveRl.setOnClickListener(new DelayedClick(200) {
            @Override
            public void onDelayedClick(View view) {
                int position = mViewModel.getPositionLiveData().getValue();
                if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size()> position){
                    boolean isLiked =  mData.getDramaEpisodeList().get(position).isLiked();
                    mData.getDramaEpisodeList().get(position).setLiked(!isLiked);
                    isSelectedLike(!isLiked);
                    mViewModel.requestLiked(mData.getDramaSeriesId(),mData.getDramaEpisodeList().get(position).getEpisodeNumber(),!isLiked);
                }
            }
        });
        //收藏
        mViewBinding.includeRight.helpRl.setOnClickListener(new DelayedClick(200) {
            @Override
            public void onDelayedClick(View view) {
                int position = mViewModel.getPositionLiveData().getValue();
                if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size()> position){
                    boolean isCollected =  mData.isCollected();
                    mData.setCollected(!isCollected);
                    isSelectedCollect(!isCollected);
                    mViewModel.requestCollection(mData.getDramaSeriesId(),mData.getDramaEpisodeList().get(position).getEpisodeNumber(),!isCollected);
                }
            }
        });

        //点赞，收藏回调
        mViewModel.getLikeHistoryLiveData().observe(((PlayActivity)mContext), likeHistoryEntity -> {
            int position = mViewModel.getPositionLiveData().getValue();
            if (mData != null && mData.getDramaEpisodeList() != null && mData.getDramaEpisodeList().size() > position) {
                mData.setCollectSum(likeHistoryEntity.collectSum);
                mData.setCollected(likeHistoryEntity.isCollected);
                mData.getDramaEpisodeList().get(position).setLikeSum(likeHistoryEntity.likeSum);
                mData.getDramaEpisodeList().get(position).setLiked(likeHistoryEntity.isLiked);
                mViewBinding.includeRight.helpTv.setText(SumDataUtilKt.sum(mData.getCollectSum()));
                mViewBinding.includeRight.loveTv.setText(SumDataUtilKt.sum(mData.getDramaEpisodeList().get(position).getLikeSum()));
                mViewModel.getDramaSeriesLiveData().setValue(mData);
            }
        });

        //邀请
        mViewModel.getFriendLiveData().observe(((PlayActivity) mContext), s -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,s);
            ((PlayActivity) mContext).startActivity(Intent.createChooser(intent, "share"));
        });

        //底部
        mViewBinding.buttonEpisodeRl.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                LogUtils.d("buttonEpisodeRl >> "+new Gson().toJson(mData));
                int position = mViewModel.getPositionLiveData().getValue();
                if (mData != null && mData.getDramaEpisodeList() != null && mData.getDramaEpisodeList().size() > position) {
                    if(onAdapterClick!=null)onAdapterClick.setCurrentNumber(mData.getDramaEpisodeList().get(position).getEpisodeNumber());
                }
            }
        });
        //seek
        mViewBinding.seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mViewBinding.currentTime.setText(TimeFormater.formatMs(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                mViewBinding.currentTime.setVisibility(View.VISIBLE);
                mViewBinding.tvLine.setVisibility(View.VISIBLE);
                mViewBinding.totalTime.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(onAdapterClick!=null)onAdapterClick.onSeek(mSelectPosition, (long) seekBar.getProgress());
                mViewBinding.currentTime.setVisibility(View.GONE);
                mViewBinding.tvLine.setVisibility(View.GONE);
                mViewBinding.totalTime.setVisibility(View.GONE);
            }
        });
    }
    public void setOnAdapterClick(OnAdapterClick onAdapterClick){
        this.onAdapterClick = onAdapterClick;
    }

    public void setData(int position){
        this.mSelectPosition = position;
        this.mData = mViewModel.getDramaSeriesLiveData().getValue();
        loadData();
        //设置背景图
        setLoadThumbnails(position);
    }

    private void loadData(){
        if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size() > mSelectPosition){
            mViewBinding.includeTop.topTitle.setText(mContext.getResources().getString(com.inshort.base.R.string.episode, String.valueOf(mData.getDramaEpisodeList().get(mSelectPosition).getEpisodeNumber())));

            mViewBinding.includeRight.helpTv.setText(SumDataUtilKt.sum(mData.getCollectSum()));
            mViewBinding.includeRight.loveTv.setText(SumDataUtilKt.sum(mData.getDramaEpisodeList().get(mSelectPosition).getLikeSum()));

            isSelectedLike(mData.getDramaEpisodeList().get(mSelectPosition).isLiked());
            isSelectedCollect(mData.isCollected());
            mViewBinding.episodeTitle.setText(mData.getDramaTitle());
            mViewBinding.updatedTv.setText(String.format(mContext.getResources().getString(com.inshort.base.R.string.episode_),String.valueOf(mData.getEpisodeUpdated())));
        }
    }

    private void isSelectedLike(boolean isLiked){
        if(isLiked){
            mViewBinding.includeRight.loveIv.setImageResource(com.inshort.base.R.mipmap.love_logo);
        }else{
            mViewBinding.includeRight.loveIv.setImageResource(com.inshort.base.R.mipmap.love_default_logo);
        }
    }

    private void isSelectedCollect(boolean isCollected){
        if(isCollected){
            mViewBinding.includeRight.helpIv.setImageResource(com.inshort.base.R.mipmap.collect_logo);
        }else{
            mViewBinding.includeRight.helpIv.setImageResource(com.inshort.base.R.mipmap.collect_default_logo);
        }
    }

    public void showView(boolean isShow){
        this.isShowView = isShow;
        mViewBinding.includeRight.includeRl.setVisibility(isShow?View.VISIBLE:View.GONE);
        mViewBinding.includeTop.topRl.setVisibility(isShow?View.VISIBLE:View.GONE);
        mViewBinding.startIv.setVisibility(isShow?View.VISIBLE:View.GONE);
    }

    public void pauseState(){
        mViewBinding.startIv.setVisibility(View.VISIBLE);
        mViewBinding.startIv.setImageResource(com.inshort.base.R.mipmap.play_puase_logo);
        mViewBinding.includeRight.includeRl.setVisibility(View.VISIBLE);
        mViewBinding.includeTop.topRl.setVisibility(View.VISIBLE);
    }

    public void startState(){
        mViewBinding.startIv.setImageResource(com.inshort.base.R.mipmap.play_stop_logo);
        mViewBinding.includeRight.includeRl.setVisibility(View.VISIBLE);
        mViewBinding.includeTop.topRl.setVisibility(View.VISIBLE);
    }

    public void onItemClick(){
        if(onAdapterClick!=null)onAdapterClick.onItemClick(mSelectPosition);
    }

    public void setExtraValue(int progress){
        LogUtils.d("setExtraValue >> "+progress);
        mViewBinding.seekbar.setProgress(progress);
    }

    public void setMax(int duration){
        mViewBinding.seekbar.setMax(duration);
        mViewBinding.seekbar.setVisibility(View.VISIBLE);
    }

    public void setTotal(String format){
        mViewBinding.totalTime.setText(format);
    }

    /**
     * 移除屏幕后，隐藏关闭UI
     */
    public void viewDetachedFromWindow(){
        startState();
        isShowView = false;
        mViewBinding.seekbar.setProgress(0);
        mViewBinding.startIv.setVisibility(View.GONE);
        mViewBinding.seekbar.setVisibility(View.GONE);
        removeMessages();
    }


    public void onBlankClick(){
        int state = mViewModel.getPlayStateLiveData().getValue();
        if(state == IPlayer.started){
            showView(!isShowView);
            if(!isShowView)reckonTime();
        }else {
            showView(true);
            removeMessages();
            onItemClick();
        }
    }

    public void isHeideThumbnails(boolean isHeide){
        mViewBinding.thumbAiv.setVisibility(isHeide?View.VISIBLE:View.GONE);
    }


    private void setLoadThumbnails(int position){
        List<VideoUrlEntity.PlayData> mData = mViewModel.getPlayVideoLiveData().getValue();
        if(mData!=null && mData.size() > position && !TextUtils.isEmpty(mData.get(position).getThumbnailsImageUrl())){
            int width = mContext.getResources().getDisplayMetrics().widthPixels;
            int height = (int) (width * 16.0/9);
            Glide.with(getContext())
                    .setDefaultRequestOptions(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE).centerCrop())
                    .load(PlayUrlUtilsKt.getPlayUrl(mData.get(position).getThumbnailsImageUrl()))
                    .override(width,height)
                    .into(mViewBinding.thumbAiv);

        }
    }

    public void reckonTime(){
        mHandler.removeMessages(HANDLER_MSG);
        mHandler.sendEmptyMessageDelayed(HANDLER_MSG, HANDLER_MSG_TIME);
    }

    public void removeMessages(){
        mHandler.removeMessages(HANDLER_MSG);
    }


    private final android.os.Handler mHandler =new android.os.Handler(Looper.myLooper(), new android.os.Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            if(msg.what == HANDLER_MSG){
                showView(false);
            }
            return false;
        }
    });

    public void onDetached(){
        mHandler.removeCallbacksAndMessages(null);
    }
}
