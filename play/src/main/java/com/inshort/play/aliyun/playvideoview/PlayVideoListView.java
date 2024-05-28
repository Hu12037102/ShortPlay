package com.inshort.play.aliyun.playvideoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.play.aliyun.adapter.PlayVideoViewHolder;
import com.inshort.play.aliyun.controller.PlayVideoListController;

import org.w3c.dom.Text;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoListView extends PlayUIVideoView{
    private Context mContext;
    private TextureView mTextureView;

    private PlayVideoListController mController;
    public PlayVideoListView(@NonNull Context context) {
        super(context,null);
    }

    public PlayVideoListView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs,0);
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
        mRecyclerView.post(() -> {
            PlayVideoViewHolder viewHolder = getViewHolderByPosition(position);
            if(viewHolder!=null){

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
     * 当数据只有一条或者首次
     */
    @Override
    public void onInitComplete() {
        super.onInitComplete();
    }

    /**
     * 设置播放数据
     */
    @Override
    public void setList(List<String> videoBeanList) {
        super.setList(videoBeanList);
    }

    /**
     * 添加数据
     * @param addVideoBeanList
     */
    @Override
    public void addData(List<String> addVideoBeanList) {
        super.addData(addVideoBeanList);
    }

    /**
     * 当前选中
     * @param position
     * @param isManager
     */
    @Override
    public void onPageSelected(int position, boolean isManager) {
        super.onPageSelected(position, isManager);
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
     * Activity可见
     */
    public void onResume(){

    }

    /**
     * Activity不可见
     */
    public void onPause(){

    }

    //--------------------------------------------------------------------------播放器监听--------------------------

    /**
     * 第一帧画面
     * @param duration
     */
    @Override
    public void onRenderingStart(long duration) {
        super.onRenderingStart(duration);
    }

    /**
     * 播放信息
     * @param infoBean
     */
    @Override
    public void onInfo(InfoBean infoBean) {
        super.onInfo(infoBean);
    }

    /**
     * 播放结束
     */
    @Override
    public void onCompletion() {
        super.onCompletion();
    }

    /**
     * 播放错误
     * @param errorInfo
     */
    @Override
    public void onError(ErrorInfo errorInfo) {
        super.onError(errorInfo);
    }

    /**
     * 视频加载结束
     */
    @Override
    public void onLoadingEnd() {

    }




}
