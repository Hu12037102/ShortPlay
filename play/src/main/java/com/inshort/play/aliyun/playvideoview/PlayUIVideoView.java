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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.inshort.play.R;
import com.inshort.play.aliyun.adapter.PlayListDiffCallback;
import com.inshort.play.aliyun.adapter.PlayVideoAdapter;
import com.inshort.play.aliyun.adapter.PlayVideoViewHolder;
import com.inshort.play.aliyun.adapter.manager.PlayVideoLayoutManager;
import com.inshort.play.aliyun.adapter.manager.PlayVideoStandardListManager;
import com.inshort.play.aliyun.listener.OnViewPagerListener;
import com.inshort.play.aliyun.listener.PlayVideoListener;
import com.inshort.play.aliyun.listener.onSeekListener;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayUIVideoView extends FrameLayout implements LifecycleOwner, PlayVideoListener, onSeekListener, OnViewPagerListener {

    private Context mContext;
    private View mView;

    protected RecyclerView mRecyclerView;
    private PlayVideoAdapter mAdapter;
    private PlayVideoLayoutManager manager;
    private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    public PlayUIVideoView(@NonNull Context context) {
        super(context);
    }

    public PlayUIVideoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PlayUIVideoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    private void init(Context context){
        this.mContext = context;
        mView = LayoutInflater.from(mContext).inflate(R.layout.play_ui_video_view,this,true);
        mRecyclerView = mView.findViewById(R.id.video_rv);
        initRView();
    }

    private void initRView(){
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(null);
        mRecyclerView.setDrawingCacheEnabled(true);
        mRecyclerView.setDrawingCacheQuality(DRAWING_CACHE_QUALITY_HIGH);
        mAdapter = new PlayVideoAdapter(new PlayListDiffCallback());
        manager = new PlayVideoStandardListManager(mContext, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);
    }

    /**
     * 获取指定的viewHolder
     * @param position
     * @return
     */
    protected PlayVideoViewHolder getViewHolderByPosition(int position){
        return (PlayVideoViewHolder) mRecyclerView.findViewHolderForAdapterPosition(position);
    }


    /**
     * 设置数据
     * @param videoBeanList
     */
    public void setList(List<String> videoBeanList){
//        mAdapter.setList(videoBeanList);
    }

    /**
     * 添加数据
     * @param addVideoBeanList
     */
    public void addData(List<String> addVideoBeanList){
//        mAdapter.addData(addVideoBeanList);
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
}
