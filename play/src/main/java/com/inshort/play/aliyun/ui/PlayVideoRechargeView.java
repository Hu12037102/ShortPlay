package com.inshort.play.aliyun.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.gson.Gson;
import com.huxiaobai.imp.OnRecyclerViewItemClickListener;
import com.inshort.base.adapter.StoreAdapter;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.entity.StoreEntity;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.play.R;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.databinding.PlayRechargeViewBinding;
import com.inshort.play.viewmodel.PlayViewModel;

import java.util.ArrayList;

/**
 * @author: 张勇
 * @date: 2024/6/1
 */
public class PlayVideoRechargeView extends RelativeLayout {
    private Context mContext;
    private PlayRechargeViewBinding mViewBinding;
    private final ArrayList<StoreEntity.Info> mData = new ArrayList<>();

    private PlayViewModel mViewModel;
    private StoreAdapter mAdapter = null;

    private int dramsID;
    public PlayVideoRechargeView(Context context) {this(context,null);}
    public PlayVideoRechargeView(Context context, AttributeSet attrs) {this(context, attrs,0);}
    public PlayVideoRechargeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context mContext){
        this.mContext = mContext;
        mViewModel = new ViewModelProvider((PlayActivity)mContext).get(PlayViewModel.class);
        mViewBinding = PlayRechargeViewBinding.inflate(LayoutInflater.from(mContext),this,true);
        mViewBinding.rechargeRv.setLayoutManager(new LinearLayoutManager(mContext));
        mAdapter = new StoreAdapter(mContext,mData);
        mViewBinding.rechargeRv.setAdapter(mAdapter);
        initEvent();
    }

    public void initData(int selectNumber,int dramsID){
        this.dramsID = dramsID;
        mViewModel.requestStore(dramsID,selectNumber);
        isAutoLock();
    }

    private void initEvent(){
        mViewModel.getStoreLiveData().observe(((PlayActivity) mContext), storeEntity -> {
            if(storeEntity.dramaSeriesProductInfo!=null){
                mViewBinding.priceCoins.setText(String.valueOf(storeEntity.dramaSeriesProductInfo.episodeInfoCoins));
            }
            mViewBinding.balanceCoins.setText(String.valueOf(storeEntity.coinsBalance));
            mViewBinding.bonusCoins.setText(String.valueOf(storeEntity.bonusBalance));
            AdapterCompat.notifyAdapterAddDateChanged(null, mAdapter, true, mData, storeEntity.productList,null);
        });

        mViewBinding.rlCheck.setOnClickListener(v -> {
            boolean isAutoUn = Boolean.TRUE.equals(mViewModel.isAutoUnlockLiveData().getValue());
            mViewModel.isAutoUnlockLiveData().setValue(!isAutoUn);
            mViewModel.requestIsAutoUnlock(!isAutoUn,dramsID);
            isAutoLock();
        });

        mAdapter.setOnRecyclerViewItemClickListener(new OnRecyclerViewItemClickListener() {
            @Override
            public void clickItem(@NonNull View view, int i) {

            }

            @Override
            public void longClickItem(@NonNull View view, int i) {

            }

            @Override
            public void clickEmptyView(@NonNull View view) {

            }
        });

        mViewBinding.rechargeFl.setOnClickListener(v -> setVisibility(View.GONE));
    }

    private void isAutoLock(){
        boolean isAutoUn = Boolean.TRUE.equals(mViewModel.isAutoUnlockLiveData().getValue());
        if(isAutoUn){
            mViewBinding.checkIsBox.setImageResource(com.inshort.base.R.mipmap.icon_auido);
        }else {
            mViewBinding.checkIsBox.setImageResource(com.inshort.base.R.mipmap.no_icon_audio);
        }
    }



    private float height = -1f;
    @Override
    public void setVisibility(int visibility) {
        if(visibility == View.VISIBLE){
            height = (this.getHeight());
            ObjectAnimator.ofFloat(this,"translationY",height,0f).setDuration(300).start();
            super.setVisibility(visibility);
        }else if(visibility == GONE){
            ObjectAnimator.ofFloat(this,"translationY",0f,height).setDuration(300).start();
            postDelayed(() -> {
                super.setVisibility(visibility);
            },300);
        }
    }
}
