package com.inshort.play.aliyun.preload;

import com.aliyun.loader.MediaLoader;
import com.aliyun.player.AliPlayerGlobalSettings;

import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.play.aliyun.adapter.PlayVideoViewHolder;
import com.inshort.play.aliyun.utils.GlobalSettings;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: 张勇
 * @date: 2024/5/23
 * 播放数据预加载缓存
 */
public class PlayPlayerPreload {
    private List<VideoUrlEntity.PlayData> mData;
    private VideoUrlEntity.DramaSeries mDramaData;
    private int mPosition;  //当前下载的
    private MediaLoader mediaLoader;
    private ExecutorService mService = Executors.newSingleThreadExecutor();
    private static volatile PlayPlayerPreload instance;
    private PlayPlayerPreload() {
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

    private void initMedia(){
        mediaLoader = MediaLoader.getInstance();
        mediaLoader.setOnLoadStatusListener(new MediaLoader.OnLoadStatusListener() {
            //下载错误
            @Override
            public void onError(String s, int i, String s1) {
                if(mediaLoader!=null)mediaLoader.cancel(s);
                LogUtils.d("setOnLoadStatusListener  >> onError >> "+s);
            }
            //下载完成
            @Override
            public void onCompleted(String s) {
                mPosition++;
                if(nextLoadData(mPosition)){
                    loadData(mPosition);
                }
                LogUtils.d("setOnLoadStatusListener  >> onCompleted >> "+s);
            }
            //下载取消
            @Override
            public void onCanceled(String s) {
                if(mediaLoader!=null)mediaLoader.cancel(s);
                LogUtils.d("setOnLoadStatusListener  >> onCanceled >> "+s);
            }
        });
    }


    /**
     * 下载数据
     */
    private void loadData(int position){
        if(mData!=null && mData.size() > position && mediaLoader!=null){
            String m3u8 = mData.get(position).getM3u8();
            if (m3u8.startsWith("http:") || m3u8.startsWith("https:")){
                mService.execute(() -> {
                    LogUtils.d("setOnLoadStatusListener  >> start >> "+m3u8);
                    mediaLoader.load( mData.get(position).getM3u8(),GlobalSettings.DURATION);
                });
            }
        }
    }

    /**
     * 取消下载
     */
    private void cancel(int position){
        if(mData!=null && mData.size() > position && mediaLoader!=null){
            mediaLoader.cancel(mData.get(position).getM3u8());
        }
    }


    /**
     * 开始下载
     */
    public void startLoadData(int position , List<VideoUrlEntity.PlayData> mData,VideoUrlEntity.DramaSeries mDramaData){
        this.mData = mData;
        this.mDramaData = mDramaData;
        cancel(position);
        this.mPosition = position+1;
        loadData(mPosition);
    }

    /**
     * 判断下条数据是否解锁
     * @param position
     * @return
     */
    private boolean nextLoadData(int position){
        if(mDramaData!=null && mDramaData.getDramaEpisodeList()!=null && mDramaData.getDramaEpisodeList().size() > position){
            return mDramaData.getDramaEpisodeList().get(position).isPurchased();
        }else if(mData!=null && mData.size() > position){
            return mData.get(position).isPurchased();
        }else {
            return false;
        }
    }

    /**
     * 销毁
     */
    public void onDestroy(){
        if(mediaLoader!=null){
            mediaLoader.cancel(null);
            mediaLoader.setOnLoadStatusListener(null);
        }
        if(mData!=null){
            mData.clear();
            mData = null;
        }
    }


}
