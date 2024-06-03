package com.inshort.play.aliyun.playvideoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.aliyun.player.AliPlayerGlobalSettings;
import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.FileCacheUtilKt;
import com.inshort.play.R;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.aliyun.adapter.PlayListDiffCallback;
import com.inshort.play.aliyun.adapter.PlayVideoAdapter;
import com.inshort.play.aliyun.adapter.PlayVideoViewHolder;
import com.inshort.play.aliyun.adapter.manager.PlayVideoLayoutManager;
import com.inshort.play.aliyun.adapter.manager.PlayVideoStandardListManager;

import com.inshort.play.databinding.PlayEpisodeViewBinding;
import com.inshort.play.databinding.PlayUiVideoViewBinding;
import com.inshort.play.listener.EpisodeListener;
import com.inshort.play.listener.OnAdapterClick;
import com.inshort.play.listener.OnViewPagerListener;
import com.inshort.play.listener.PlayVideoListener;
import com.inshort.play.listener.onSeekListener;
import com.inshort.play.aliyun.utils.GlobalSettings;
import com.inshort.play.viewmodel.PlayViewModel;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayUIVideoView extends FrameLayout implements LifecycleOwner, PlayVideoListener, onSeekListener, OnViewPagerListener, OnAdapterClick, EpisodeListener {
    protected PlayUiVideoViewBinding mViewBinding;
    private Context mContext;
    protected PlayVideoLayoutManager manager;
    protected PlayVideoAdapter mAdapter;
    protected PlayViewModel mViewModel;
    protected int selectedPosition; //当前选中的
    protected boolean isPurchased;//当前是否解锁

    protected int startEpisodes = 0; //开始集数
    private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    public PlayUIVideoView(@NonNull Context context) {
        this(context,null);
    }

    public PlayUIVideoView(@NonNull Context context, @Nullable AttributeSet attrs) {this(context, attrs,0);}

    public PlayUIVideoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    private void init(Context context){
        this.mContext = context;
        mViewModel = new ViewModelProvider((PlayActivity)context).get(PlayViewModel.class);
        mViewBinding = PlayUiVideoViewBinding.inflate(LayoutInflater.from(mContext),this,true);
        initRView();
        initSettings();
    }

    private void initRView(){
        mViewBinding.episodeView.setEpisodeListener(this);
        mViewBinding.videoRv.setHasFixedSize(true);
        mViewBinding.videoRv.setItemAnimator(null);
        mViewBinding.videoRv.setDrawingCacheEnabled(true);
        mViewBinding.videoRv.setDrawingCacheQuality(DRAWING_CACHE_QUALITY_HIGH);
        mAdapter = new PlayVideoAdapter(new PlayListDiffCallback());
        mAdapter.setOnAdapterClick(this);
        manager = new PlayVideoStandardListManager(mContext, LinearLayoutManager.VERTICAL,false);
        manager.setOnViewPagerListener(this);
        mViewBinding.videoRv.setLayoutManager(manager);
        mViewBinding.videoRv.setAdapter(mAdapter);
        new PagerSnapHelper().attachToRecyclerView(mViewBinding.videoRv);
    }

    private void initSettings(){
        GlobalSettings.CACHE_DIR = FileCacheUtilKt.getFilePath(mContext,"Aliyun","cache").getAbsolutePath();
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

    /**
     * 获取指定的viewHolder
     * @param position
     * @return
     */
    protected PlayVideoViewHolder getViewHolderByPosition(int position){
        return (PlayVideoViewHolder) mViewBinding.videoRv.findViewHolderForAdapterPosition(position);
    }


    /**
     * 设置数据
     * @param videoBeanList
     */
    public void setList(List<VideoUrlEntity.PlayData> videoBeanList){
        mAdapter.submitList(videoBeanList);
    }

    /**
     * 添加数据
     * @param addVideoBeanList
     */
    public void addData(List<VideoUrlEntity.PlayData> addVideoBeanList){
//        mAdapter.submitList(addVideoBeanList);
    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return mLifecycleRegistry;
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == VISIBLE) {
            mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        } else if (visibility == GONE || visibility == INVISIBLE) {
            mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mLifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
    }

    public void onDetached(){
        mLifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
    }
    @Override
    public void onInitComplete() { }
    @Override
    public void onPageShow(int position) {}
    @Override
    public void onPageSelected(int position, boolean isManager) { }
    @Override
    public void onPageRelease(int position) {}
    @Override
    public void onPrepared() {}
    @Override
    public void onInfo(InfoBean infoBean) {}
    @Override
    public void onPlayStateChanged(int position) {}
    @Override
    public void onRenderingStart(long duration) {}
    @Override
    public void onCompletion() {}
    @Override
    public void onError(ErrorInfo errorInfo) {}
    @Override
    public void onLoadingEnd() {}
    @Override
    public void onSeek(long seekPosition) {}

    @Override
    public void setPlayUrl(int position, boolean isPurchase) {}
    @Override
    public void onItemClick(int position) {}
    @Override
    public void onSeek(int position, long seekPosition) {}
    @Override
    public void setCurrentNumber(int currentNumber) {}
    @Override
    public void onClickPosition(int position) {}
    @Override
    public void closeView() {}
}
