package com.inshort.play.activity;

import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import android.view.View;
import android.view.WindowManager;

import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.cicada.player.utils.Logger;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.VideoPurchaseEntity;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.utils.ThreadUtils;
import com.inshort.play.BuildConfig;
import com.inshort.play.databinding.ActivityPlayBinding;
import com.inshort.play.viewmodel.PlayViewModel;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/21
 */
@Route(path = ARouterConfig.Path.Play.PLAY_ACTIVITY_PLAY)
public class PlayActivity extends BaseCompatActivity<ActivityPlayBinding, PlayViewModel> {
    private int dramsId; //剧集ID
    private int number;  //剧集集数
    private int maxEpisode; //最大集数
    private String playPath; //路径
    private int searchID; //搜索ID
    private int archivedVersion; //版本
    private boolean isFirstPlay =false;  //是否首次
    private boolean isFirstDrama =false;  //是否首次
    @Override
    protected ActivityPlayBinding getViewBinding() {
        return ActivityPlayBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<PlayViewModel> getViewModelClass() {
        return PlayViewModel.class;
    }

    @Override
    protected void initView() {
        if (BuildConfig.DEBUG) {
            Logger.getInstance(this).enableConsoleLog(true);
            Logger.getInstance(this).setLogLevel(Logger.LogLevel.AF_LOG_LEVEL_TRACE);
        }
        ViewsCompat.hideStatusBar(getWindow());
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        dramsId = getIntent().getIntExtra(ARouterConfig.Key.DRAMS_ID,-1);
        number = getIntent().getIntExtra(ARouterConfig.Key.NUMBER_,-1);
        playPath = getIntent().getStringExtra(ARouterConfig.Key.PLAY_PATH);
        searchID = getIntent().getIntExtra(ARouterConfig.Key.SEARCH_ID,-1);
        maxEpisode = getIntent().getIntExtra(ARouterConfig.Key.MAX_EPISODE,-1);
        archivedVersion = getIntent().getIntExtra(ARouterConfig.Key.ARCHIVED_VERSION,-1);
    }

    @Override
    protected void initData() {
        mViewModel.requestVideoData(dramsId,number,searchID,playPath+"?v="+archivedVersion,maxEpisode);
    }

    @Override
    protected void initEvent() {
        mViewBinding.playTopReturnRl.setOnClickListener(v -> {
                finish();
        });

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        //剧集信息
        mViewModel.getDramaSeriesLiveData().observe(this, mData -> {
            if(!isFirstDrama){
                mViewBinding.videoList.setDramaSeriesData();
                mViewBinding.videoList.setEpisodeInitView(mData);
                isFirstDrama =true;
            }
        });

        //播放数据列表
        mViewModel.getPlayVideoLiveData().observe(this, new Observer<>() {
            @Override
            public void onChanged(List<VideoUrlEntity.PlayData> playData) {
                if(!isFirstPlay){
                    mViewBinding.videoList.setList(playData);
                    mViewBinding.playTopReturnRl.setVisibility(View.GONE);
                    isFirstPlay =true;
                }
            }
        });

        //切换剧集
        mViewModel.getSelectEpisodeLiveData().observe(this, dramaEpisodeList -> {
            mViewBinding.videoList.setSelectEpisode(dramaEpisodeList);
        });
        //成功解锁
        mViewModel.getPurchaseLiveData().observe(this, videoPurchaseEntity -> {
            LogUtils.d("videoPurchaseEntity >> +"+videoPurchaseEntity.isPreloading);
            if(videoPurchaseEntity.isPreloading){
                mViewBinding.videoList.scrollToPosition(videoPurchaseEntity.position,true);
            }
            VideoUrlEntity.DramaSeries dramaSeries = mViewModel.getDramaSeriesLiveData().getValue();

            LogUtils.d("videoPurchaseEntity isPurchased>> +"+dramaSeries.getDramaEpisodeList().get(videoPurchaseEntity.position).isPurchased());
        });

    }

    @Override
    protected void onWindowFirstFocusChanged() {
        super.onWindowFirstFocusChanged();
        ViewsCompat.setStatusTextColor(getWindow(),false);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mViewBinding.videoList.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mViewBinding.videoList.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewBinding.videoList.onDestroy();
        Glide.get(this).clearMemory();
        ThreadUtils.runOnSubThread(() -> {
            Glide.get(this).clearDiskCache();
        });
    }
}
