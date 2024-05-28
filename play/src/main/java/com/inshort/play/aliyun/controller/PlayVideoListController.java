package com.inshort.play.aliyun.controller;

import android.content.Context;
import android.view.Surface;

import com.aliyun.player.AliListPlayer;
import com.aliyun.player.AliPlayerFactory;
import com.aliyun.player.AliPlayerGlobalSettings;
import com.aliyun.player.IPlayer;
import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.aliyun.player.nativeclass.PlayerConfig;
import com.aliyun.player.source.UrlSource;
import com.inshort.play.aliyun.listener.PlayVideoListener;
import com.inshort.play.aliyun.preload.PlayPlayerPreload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 张勇
 * @date: 2024/5/23
 */
public class PlayVideoListController {
    private Context mContext;
    private AliListPlayer mAliListPlayer;
    private int mCurrentPlayerState = 0; //当前播放状态
    private PlayVideoListener mPlayVideoListener;


    public PlayVideoListController(Context mContext,PlayVideoListener mPlayVideoListener) {
        this.mContext = mContext;
        this.mPlayVideoListener = mPlayVideoListener;
        mAliListPlayer = AliPlayerFactory.createAliListPlayer(mContext);
        initHeaderPlayer();
        initListener();
    }

    private void initHeaderPlayer(){
        PlayerConfig config = mAliListPlayer.getConfig();
        String[] headers = new String[3];
        headers[0] =("X-ACCESS-TOKEN:");
        headers[1] =("channel:inShort");
        headers[2] =("version:");
        config.setCustomHeaders(headers);
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
            if(mPlayVideoListener!=null)mPlayVideoListener.onPlayStateChanged(IPlayer.paused);
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
    public void onPageSelected(int position){

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
            mAliListPlayer.stop();
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
    }


}
