package com.inshort.play.aliyun.controller;

import android.content.Context;
import android.view.Surface;

import com.aliyun.player.AliListPlayer;
import com.aliyun.player.AliPlayerFactory;
import com.aliyun.player.AliPlayerGlobalSettings;
import com.aliyun.player.IPlayer;

import com.aliyun.player.nativeclass.PlayerConfig;
import com.aliyun.player.source.UrlSource;
import com.inshort.base.compat.PackageInfoCompat;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.other.mmkv.UserDataStore;
import com.inshort.base.utils.LogUtils;
import com.inshort.play.listener.PlayVideoListener;
import com.inshort.play.aliyun.preload.PlayPlayerPreload;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/23
 */
public class PlayVideoListController {
    private Context mContext;
    private AliListPlayer mAliListPlayer;
    public int mCurrentPlayerState = 0; //当前播放状态
    private PlayVideoListener mPlayVideoListener;


    public PlayVideoListController(Context mContext,PlayVideoListener mPlayVideoListener) {
        this.mContext = mContext;
        this.mPlayVideoListener = mPlayVideoListener;
        mAliListPlayer = AliPlayerFactory.createAliListPlayer(mContext);
        initHeaderPlayer();
        initListener();
    }

    private void initHeaderPlayer(){
        String token = UserDataStore.get().getAccessToken();
        PlayerConfig config = mAliListPlayer.getConfig();
        String[] headers = new String[3];
        headers[0] =("X-ACCESS-TOKEN:"+token);
        headers[1] =("channel:inShort_Android");
        headers[2] =("version:"+PackageInfoCompat.getVersionName(mContext));
        config.setCustomHeaders(headers);
        mAliListPlayer.setConfig(config);
    }


    private void initListener(){
        mAliListPlayer.setOnPreparedListener(() -> {
            if(mPlayVideoListener!=null)mPlayVideoListener.onPrepared();
        });
        mAliListPlayer.setOnRenderingStartListener(() -> {
            if(mPlayVideoListener!=null)mPlayVideoListener.onRenderingStart(mAliListPlayer.getDuration());
        });

        mAliListPlayer.setOnInfoListener(infoBean -> {
            if(mPlayVideoListener!=null)mPlayVideoListener.onInfo(infoBean);
        });

        mAliListPlayer.setOnCompletionListener(() -> {
            if(mPlayVideoListener!=null)mPlayVideoListener.onCompletion();
        });

        mAliListPlayer.setOnStateChangedListener(i -> {
            this.mCurrentPlayerState = i;
            if(mPlayVideoListener!=null)mPlayVideoListener.onPlayStateChanged(i);
        });

        mAliListPlayer.setOnErrorListener(errorInfo -> {
            if(mPlayVideoListener!=null)mPlayVideoListener.onError(errorInfo);
        });

        mAliListPlayer.setOnLoadingStatusListener(new IPlayer.OnLoadingStatusListener() {
            @Override
            public void onLoadingBegin() {}
            @Override
            public void onLoadingProgress(int i, float v) {}
            @Override
            public void onLoadingEnd() {
                if(mPlayVideoListener!=null)mPlayVideoListener.onLoadingEnd();
            }
        });

        AliPlayerGlobalSettings.setCacheUrlHashCallback(s -> {
            return null;
        });
    }

    /**
     * 是否开启轮循播放
     * @param isOpen
     */
    public void isOpenLoop(boolean isOpen){
        if(mAliListPlayer!=null)mAliListPlayer.setLoop(isOpen);
    }

    /**
     * 暂停
     */
    public void pause(){
        if(mAliListPlayer!=null)mAliListPlayer.pause();
    }

    /**
     * 开始
     */
    public void start(){
        if(mAliListPlayer!=null)mAliListPlayer.start();
    }

    /**
     * 重试
     */
    public void reload(){
        if(mAliListPlayer!=null)mAliListPlayer.reload();
    }

    /**
     * 获取总时长
     */
    public long getDuration(){
        return mAliListPlayer.getDuration();
    }

    /**
     * 设置当前播放页面数据
     */

    public void onPageSelected(int position, List<VideoUrlEntity.PlayData> mData,VideoUrlEntity.DramaSeries mDramaData){
        if(mData!=null && mData.size() > position){
            startPlay(mData.get(position).getM3u8());
            PlayPlayerPreload.getInstance().startLoadData(position,mData,mDramaData);
        }
    }

    /**
     * 设置播放数据，开始播放
     */
    public void startPlay(String playUrl){
        if(mAliListPlayer!=null){
            UrlSource source = new UrlSource();
            source.setUri(playUrl);
            mAliListPlayer.setDataSource(source);
            mAliListPlayer.stop();
            mAliListPlayer.prepare();
            mAliListPlayer.start();
        }
    }

    /**
     *设置surface
     */
    public void setSurfaceView(Surface surface){
        if(mAliListPlayer!=null){
            mAliListPlayer.setSurface(surface);
        }
    }

    /**
     * surface发生了改变
     */
    public void surfaceChanged(){
        if(mAliListPlayer!=null){
            mAliListPlayer.surfaceChanged();
        }
    }

    /**
     * 当前播放改变
     */
    public void onPlayStateChange(){
        if(mCurrentPlayerState == IPlayer.started){
            //播放状态下切换暂停
            mAliListPlayer.pause();
        }else {
            //暂停状态下切换播放
            mAliListPlayer.start();

        }
    }

    /**
     * seek进度
     */
    public void setSeek(long seekPos){
        if(mAliListPlayer!=null){
            mAliListPlayer.seekTo(seekPos);
        }
    }

    /**
     * 释放资源
     */
    public void onDestroy(){
        if(mAliListPlayer!=null){
            mAliListPlayer.stop();
            mAliListPlayer.clear();
            mAliListPlayer.release();
            mPlayVideoListener = null;
            AliPlayerGlobalSettings.setCacheUrlHashCallback(null);
        }
        PlayPlayerPreload.getInstance().onDestroy();
    }


}
