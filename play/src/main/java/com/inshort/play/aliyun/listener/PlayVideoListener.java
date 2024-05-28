package com.inshort.play.aliyun.listener;

import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public interface PlayVideoListener {
    /**
     * 播放已准备好
     *
     */
    void onPrepared();

    /**
     * 播放信息
     * @param position
     * @param infoBean
     */
    void onInfo(InfoBean infoBean);

    /**
     * 监听播放状态
     * @param position
     * @param isPaused
     */
    void onPlayStateChanged(int position);

    /**
     *  首帧显示事件
     * @param duration
     */
    void onRenderingStart(long duration);

    /**
     * 播放完成事件
     * @param position
     */
    void onCompletion();

    /**
     *播放错误事件
     * @param errorInfo
     */
    void onError(ErrorInfo errorInfo);

    /**
     * 视频加载结束
     */
    void onLoadingEnd();

}
