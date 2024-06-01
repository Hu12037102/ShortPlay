package com.inshort.play.aliyun.playvideoview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.aliyun.player.IPlayer;
import com.aliyun.player.bean.ErrorCode;
import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.aliyun.player.bean.InfoCode;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.other.mmkv.UserDataStore;
import com.inshort.base.utils.FileCacheUtilKt;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.utils.PlayUrlUtilsKt;
import com.inshort.base.utils.TimeFormater;
import com.inshort.base.weight.view.Toasts;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.aliyun.adapter.PlayVideoViewHolder;
import com.inshort.play.aliyun.controller.PlayVideoListController;
import com.inshort.play.aliyun.utils.GlobalSettings;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Objects;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoListView extends PlayUIVideoView{
    private Context mContext;
    private TextureView mTextureView;
    private PlayVideoListController mController;
    public PlayVideoListView(@NonNull Context context) {
        this(context,null);
    }

    public PlayVideoListView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PlayVideoListView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        this.mContext = context;
        mController = new PlayVideoListController(mContext,this);
        initTextureView();
    }

    private void initTextureView(){
        mTextureView = new TextureView(mContext);
        mTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            private Surface surface;
            @Override
            public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int width, int height) {
                surface = new Surface(surfaceTexture);
                if(mController!=null)mController.setSurfaceView(surface);
            }

            @Override
            public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surface, int width, int height) {
                if(mController!=null)mController.surfaceChanged();
            }

            @Override
            public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surface) {
                if(mController!=null)mController.setSurfaceView(null);
                surface.release();
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surface) {}
        });
    }

    /**
     * 设置当前页面的view给TextureView
     * @param position
     */
    private void addTextureView(int position){
        mViewBinding.videoRv.post(() -> {
            PlayVideoViewHolder viewHolder = getViewHolderByPosition(position);
            if(viewHolder!=null){
                ViewGroup rootView = viewHolder.getRootView();
                ViewParent parent = mTextureView.getParent();
                if(parent!=null){
                    ( (ViewGroup)parent).removeView(mTextureView);
                }
                rootView.addView(mTextureView);
            }
        });
    }

    /**
     * 设置seek
     * @param seekPosition
     */
    @Override
    public void onSeek(long seekPosition) {
        super.onSeek(seekPosition);
        if(mController!=null)mController.setSeek(seekPosition);
    }

    /**
     * 设置剧集信息
     */
    public void setDramaSeriesData(){
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(viewHolder!=null){
            viewHolder.getManger().setData(selectedPosition);
        }
        VideoUrlEntity.DramaSeries dramaSeries = mViewModel.getDramaSeriesLiveData().getValue();
        List<VideoUrlEntity.PlayData> mData = mViewModel.getPlayVideoLiveData().getValue();

        if(dramaSeries!=null && dramaSeries.getDramaEpisodeList()!=null && dramaSeries.getDramaEpisodeList().size() > selectedPosition ){
            this.isPurchased = dramaSeries.getDramaEpisodeList().get(selectedPosition).isPurchased();
        }else if(mData!=null && mData.size() > selectedPosition){
            this.isPurchased = mData.get(selectedPosition).isPurchased();
        }
    }

    /**
     * 初始化剧集
     */
    public void setEpisodeInitView(VideoUrlEntity.DramaSeries mData){
      mViewBinding.episodeView.initViewPager(mData);
    }

    /**
     * 设置播放数据
     */
    @Override
    public void setList(List<VideoUrlEntity.PlayData> videoBeanList) {
        super.setList(videoBeanList);
    }


    /**
     * 添加数据
     * @param addVideoBeanList
     */
    @Override
    public void addData(List<VideoUrlEntity.PlayData> addVideoBeanList) {
        super.addData(addVideoBeanList);
    }

    /**
     * 设置播放数据
     * @param position
     * @param isPurchase
     */
    @Override
    public void setPlayUrl(int position, boolean isPurchase) {
        super.setPlayUrl(position, isPurchase);
        if(!isPurchase){
            if(position - selectedPosition >2){
                scrollToPosition(position -1,false);
            } else if(this.isPurchased){
                rechargeLogic(position);
            }
        }
    }

    @Override
    public void onPageShow(int position) {
        super.onPageShow(position);
        if(position!=selectedPosition){
            showCoverView(position);
        }

    }

    /**
     * 当数据只有一条或者首次
     */
    @Override
    public void onInitComplete() {
        super.onInitComplete();
        if(mViewBinding.videoRv!=null && startEpisodes >=0){
            mViewBinding.videoRv.post(() -> {
                scrollToPosition(startEpisodes,false);
                startEpisodes = -1;
            });
        }
    }

    /**
     * 当前选中
     * @param position
     * @param isManager
     */
    @Override
    public void onPageSelected(int position, boolean isManager) {
        super.onPageSelected(position, isManager);
        this.selectedPosition = position;
        manager.mCurrentPosition = position;
        //记录当前的位置
        mViewModel.getPositionLiveData().setValue(position);
        LogUtils.d("onPageSelected slideIndex>>> "+selectedPosition);
        addTextureView(position);
        setDramaSeriesData();
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(viewHolder!=null){viewHolder.getManger().reckonTime();}
        if(isPurchased){
            mViewBinding.videoRv.setScrollingUp(true);
            mController.onPageSelected(position,mViewModel.getPlayVideoLiveData().getValue(),mViewModel.getDramaSeriesLiveData().getValue());
        }else {
            mController.pause();
            mViewBinding.videoRv.setScrollingUp(false);
            if(viewHolder!=null){viewHolder.getManger().pauseState();}
            //充值逻辑判断
            rechargeLogic(position);
        }
    }

    /**
     * 移除屏幕外
     * @param position
     */
    @Override
    public void onPageRelease(int position) {
        super.onPageRelease(position);

    }
    /**
     * 滑动到指定位置
     */
    @SuppressLint("NotifyDataSetChanged")
    public void scrollToPosition(int position, boolean isNotify) {
        mViewBinding.videoRv.scrollToPosition(position);
        onPageSelected(position,false);
        if(isNotify)mAdapter.notifyDataSetChanged();
    }

    /**
     * 点击
     * @param position
     */
    @Override
    public void onItemClick(int position) {
        super.onItemClick(position);
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(isPurchased){
            onPlayStateChange();
        }else {
            if(viewHolder!=null)viewHolder.getManger().pauseState();
            rechargeLogic(position);
        }
    }

    /**
     * 播放状态改变
     */
    public void onPlayStateChange(){
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(mController.mCurrentPlayerState == IPlayer.started){
            mController.pause();
            if(viewHolder!=null)viewHolder.getManger().pauseState();
            if(viewHolder!=null)viewHolder.getManger().removeMessages();
        }else {
            mController.start();
            if(viewHolder!=null)viewHolder.getManger().startState();
            if(viewHolder!=null)viewHolder.getManger().reckonTime();
        }
    }

    /**
     * 隐藏背景
     */
    public void heiCoverView(){
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(viewHolder!=null){
            viewHolder.getManger().isHeideThumbnails(false);
        }
    }

    /**
     * 显示背景
     * @param position
     */
    public void showCoverView(int position){
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(position);
        if(viewHolder!=null){
            viewHolder.getManger().isHeideThumbnails(true);
        }
    }


    /**
     * seek
     * @param position
     * @param seekPosition
     */
    @Override
    public void onSeek(int position, long seekPosition) {
        super.onSeek(position, seekPosition);
        mController.setSeek(seekPosition);
    }

    /**
     * 显示剧集列表
     * @param currentNumber
     */
    @Override
    public void setCurrentNumber(int currentNumber) {
        super.setCurrentNumber(currentNumber);
        mViewBinding.episodeView.setCurrentNumber(currentNumber);
        mViewBinding.episodeView.setVisibility(View.VISIBLE);
    }

    /**
     * 隐藏剧集列表
     */
    @Override
    public void closeView() {
        super.closeView();
        mViewBinding.episodeView.setVisibility(View.GONE);
    }


    /**
     * 选中剧集
     */
    public void setSelectEpisode(VideoUrlEntity.DramaSeries.DramaEpisodeList mData){
        mViewBinding.episodeView.setVisibility(View.GONE);
        if(mData.getCurrentlyUnlockedEpisodes()){
            rechargeLogic(mData.getEpisodeNumber()-1);
        }else {
            scrollToPosition(mData.getEpisodeNumber()-1,mData.isPurchased());
        }
    }

    /**
     * 未解锁逻辑判断
     */
    private void rechargeLogic(int position){
        VideoUrlEntity.DramaSeries mData = mViewModel.getDramaSeriesLiveData().getValue();
        UserEntity.Info info = UserDataStore.get().getInfo();
        if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size()>position && info!=null){
            int selectNumber = mData.getDramaEpisodeList().get(position).getEpisodeNumber();
            int dramsID = mData.getDramaSeriesId();
            int selectCoin = mData.getDramaEpisodeList().get(position).getEpisodeCoins();
            int balance = info.balance;
            LogUtils.d("rechargeLogic  >>> "+selectNumber);
            LogUtils.d("rechargeLogic  position>>> "+position);
            if(balance - selectCoin >=0){
                //金币足够
                preloadingNextEpisode(position,selectNumber,dramsID);
            }else {
                //金币不足
                popUpRecharge(position,selectNumber,dramsID);
            }


        }
    }

    /**
     * 金币足够,解锁下一集
     */
    private void preloadingNextEpisode(int position,int selectNumber,int dramsID){
        VideoUrlEntity.DramaSeries mData = mViewModel.getDramaSeriesLiveData().getValue();
        if(!isCrossLevel(position,mData))return; //判断是否跨级解锁
        if(position == selectedPosition){
            //当前页面，直接解锁
            mViewModel.purchaseEpisode(dramsID,selectNumber,position,true);
        }else if(mData!=null && mData.isAutoLock()){
            //预加载
            mViewModel.purchaseEpisode(dramsID,selectNumber,position,false);
        }
    }

    /**
     * 金币不足，弹窗
     */
    private void  popUpRecharge(int position,int selectNumber,int dramsID){
        VideoUrlEntity.DramaSeries mData = mViewModel.getDramaSeriesLiveData().getValue();
        if(!isCrossLevel(position,mData))return; //判断是否跨级解锁
        if(position == selectedPosition){
            //弹窗
            LogUtils.d("popUpRecharge >>>"+position);
            mViewBinding.rechargeView.setVisibility(View.VISIBLE);
            mViewBinding.rechargeView.initData(selectNumber,dramsID);
        }
    }

    /**
     * 判断是否跨级解锁
     * @param position
     * @param mData
     * @return
     */
    private boolean isCrossLevel(int position,VideoUrlEntity.DramaSeries mData){
        if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size() > position && position > 0){
            return mData.getDramaEpisodeList().get(position - 1).isPurchased();
        }
        return false;
    }





    /**
     * Activity可见
     */
    public void onResume(){
        if(isPurchased){
            mController.start();
            PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
            if(viewHolder!=null)viewHolder.getManger().startState();
        }
    }

    /**
     * Activity不可见
     */
    public void onPause(){
        mController.pause();
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(viewHolder!=null)viewHolder.getManger().pauseState();
    }

    /**
     * Activity销毁
     */
    public void onDestroy(){
        mController.onDestroy();
        if(!((PlayActivity)mContext).isFinishing())onDetached();
    }

    //--------------------------------------------------------------------------播放器监听--------------------------

    /**
     * 第一帧画面
     * @param duration
     */
    @Override
    public void onRenderingStart(long duration) {
        super.onRenderingStart(duration);
        PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
        if(viewHolder!=null){
            viewHolder.getManger().setMax((int) duration);
            viewHolder.getManger().setTotal(TimeFormater.formatMs(duration));
            viewHolder.getManger().startState();
            heiCoverView();
        }
    }

    /**
     * 播放信息
     * @param infoBean
     */
    @Override
    public void onInfo(InfoBean infoBean) {
        super.onInfo(infoBean);
        if(infoBean.getCode() == InfoCode.CurrentPosition){
            PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
            if(viewHolder!=null){
                viewHolder.getManger().setExtraValue((int) infoBean.getExtraValue());
                int currentPosition = (int) (infoBean.getExtraValue() * 100 / mController.getDuration());
                mViewModel.setCurrentPosition(currentPosition);
                mViewModel.setExtraValue(infoBean.getExtraValue());
            }
        }
    }

    /**
     * 播放结束
     */
    @Override
    public void onCompletion() {
        super.onCompletion();
        if(mAdapter.getItemCount() > selectedPosition){
            PlayVideoViewHolder viewHolder = getViewHolderByPosition(selectedPosition);
            if(viewHolder!=null)viewHolder.getManger().setExtraValue(0);
            mViewBinding.episodeView.setVisibility(View.GONE);
            if(mAdapter.getItemCount() > selectedPosition +1){
                scrollToPosition(selectedPosition +1,false);
            }else {
                scrollToPosition(0,false);
            }
        }

    }

    /**
     * 播放错误
     * @param errorInfo
     */
    @Override
    public void onError(ErrorInfo errorInfo) {
        super.onError(errorInfo);
        if(errorInfo.getCode() == ErrorCode.ERROR_LOADING_TIMEOUT){
            //无网络
            Toasts.get().showToast(mContext.getResources().getString(com.inshort.base.R.string.no_network));
        }else if(isPurchased){
            //线路切换
            List<VideoUrlEntity.PlayData> mData =mViewModel.getPlayVideoLiveData().getValue();
            if(mData!=null && mData.size() > selectedPosition){
                String  m3u8Url = PlayUrlUtilsKt.switchPlayPath(mData.get(selectedPosition).getM3u8(),mData.get(selectedPosition).getPlayUrl());
                mData.get(selectedPosition).setM3u8(m3u8Url);
            }
            mController.onPageSelected(selectedPosition,mData,mViewModel.getDramaSeriesLiveData().getValue());
        }
    }

    /**
     * 视频加载结束
     */
    @Override
    public void onLoadingEnd() {}

    /**
     * 播放状态
     * @param position
     */
    @Override
    public void onPlayStateChanged(int position) {
        super.onPlayStateChanged(position);
        mViewModel.getPlayStateLiveData().setValue(position);
    }
}
