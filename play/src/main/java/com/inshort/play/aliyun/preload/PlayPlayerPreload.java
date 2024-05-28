package com.inshort.play.aliyun.preload;

import com.aliyun.loader.MediaLoader;
import com.aliyun.player.AliPlayerGlobalSettings;
import com.inshort.play.aliyun.utils.GlobalSettings;

/**
 * @author: 张勇
 * @date: 2024/5/23
 * 播放数据预加载缓存
 */
public class PlayPlayerPreload {

    private MediaLoader mediaLoader;
    private static volatile PlayPlayerPreload instance;
    private PlayPlayerPreload() {
        initSettings();
        initMedia();
    }

    public static PlayPlayerPreload getInstance(){
        if(instance == null){
            synchronized (PlayPlayerPreload.class){
                if(instance == null){
                    instance = new PlayPlayerPreload();
                }
            }
        }
        return instance;
    }

    private void initSettings(){
        AliPlayerGlobalSettings.enableLocalCache(
                GlobalSettings.CACHE_IS_ENABLE,
                GlobalSettings.CACHE_MEMORY_SIZE * 1024,
                GlobalSettings.CACHE_DIR
        );
        AliPlayerGlobalSettings.setCacheFileClearConfig(
                GlobalSettings.CACHE_EXPIRED_TIME,
                GlobalSettings.CACHE_SIZE,
                GlobalSettings.CACHE_FREE_STORAGE_SIZE
        );
    }
    private void initMedia(){
        mediaLoader = MediaLoader.getInstance();
        mediaLoader.setOnLoadStatusListener(new MediaLoader.OnLoadStatusListener() {
            //下载错误
            @Override
            public void onError(String s, int i, String s1) {

            }
            //下载完成
            @Override
            public void onCompleted(String s) {

            }
            //下载取消
            @Override
            public void onCanceled(String s) {

            }
        });
    }


    /**
     * 下载数据
     */
    private void loadData(String m3u8Url){
        if(mediaLoader!=null)mediaLoader.load(m3u8Url,GlobalSettings.DURATION);
    }

    /**
     * 取消下载
     */
    private void cancel(String  m3u8Url){
        if(mediaLoader!=null)mediaLoader.cancel(m3u8Url);
    }

    /**
     * 开始下载
     */
    public void startLoadData(){

    }


}
