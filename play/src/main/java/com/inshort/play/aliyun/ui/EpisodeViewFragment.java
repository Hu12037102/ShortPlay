package com.inshort.play.aliyun.ui;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.view.Toasts;
import com.inshort.play.R;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.databinding.FragmentEpisodeViewBinding;
import com.inshort.play.viewmodel.PlayViewModel;
import com.ruffian.library.widget.RRelativeLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: 张勇
 * @date: 2024/5/31
 */
public class EpisodeViewFragment extends BaseCompatFragment<FragmentEpisodeViewBinding,BaseCompatViewModel> {
    private static final String  EPISODE_POSITION_VIEW = "position";
    private static final String EPISODE_TOTAL_VIEW = "total";
    private static final String EPISODE_SIZE_VIEW = "size";
    private static final String EPISODE_NUMBER_VIEW = "number";
    private List<Integer>numberData = new ArrayList<>();
    private PlayViewModel mViewModel;
    private EpisodeViewAdapter mAdapter;
    private int position;
    private int size;
    private int total;
    private int currentNumber = 1;
    public static EpisodeViewFragment getInstance(int position,int size,int total){
        EpisodeViewFragment fragment = new EpisodeViewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(EPISODE_POSITION_VIEW, position);
        bundle.putInt(EPISODE_TOTAL_VIEW, total);
        bundle.putInt(EPISODE_SIZE_VIEW, size);
//        bundle.putInt(EPISODE_NUMBER_VIEW, number);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected FragmentEpisodeViewBinding getViewBinding() {
        return FragmentEpisodeViewBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    protected void initView() {
        mViewModel = new ViewModelProvider((PlayActivity) requireContext()).get(PlayViewModel.class);
        if(getArguments()!=null){
            position = getArguments().getInt(EPISODE_POSITION_VIEW,-1);
            size = getArguments().getInt(EPISODE_SIZE_VIEW,-1);
            total = getArguments().getInt(EPISODE_TOTAL_VIEW,-1);
        }
        mAdapter = new EpisodeViewAdapter(R.layout.adapter_eiosode_view);
        mAdapter.setCurrentNumber(currentNumber,mViewModel);
        mViewBinding.episodeRv.setLayoutManager(new GridLayoutManager(getContext(),5, RecyclerView.VERTICAL,false));
        mViewBinding.episodeRv.setAdapter(mAdapter);
        LogUtils.d("EpisodeViewFragment >>> "+position);
    }

    @Override
    protected void initData() {
        position++;
        int mSize = size == position?total:VideoEpisodeView.PAGE_SIZE * position;
        for (int i = 1 + (VideoEpisodeView.PAGE_SIZE * (position - 1)); i <=mSize ; i++) {
            numberData.add(i);
        }
        mAdapter.setList(numberData);
    }

    @Override
    protected void initEvent() {

    }

    @SuppressLint("NotifyDataSetChanged")
    public void setCurrentNumber(int currentNumber){
        this.currentNumber = currentNumber;
        mAdapter.setCurrentNumber(currentNumber,mViewModel);
        mAdapter.notifyDataSetChanged();
    }


    public void setSelectPosition(){

    }

    static class EpisodeViewAdapter extends BaseQuickAdapter<Integer, BaseViewHolder>{
        private VideoUrlEntity.DramaSeries mData;
        private PlayViewModel mViewModel;
        private int currentNumber;

        public EpisodeViewAdapter(int layoutResId) {
            super(layoutResId);
        }

        public void setCurrentNumber(int currentNumber,PlayViewModel mViewModel){
            this.mViewModel = mViewModel;
            this.currentNumber = currentNumber;
            this.mData = mViewModel.getDramaSeriesLiveData().getValue();
        }

        @Override
        protected void convert(@NonNull BaseViewHolder baseViewHolder, Integer integer) {
            RRelativeLayout rRelativeLayout = baseViewHolder.getView(R.id.episode_rr_layout);
            baseViewHolder.setText(R.id.episode_num, integer.toString());
            if(mData!=null && mData.getDramaEpisodeList()!=null && mData.getDramaEpisodeList().size() > integer -1){
                VideoUrlEntity.DramaSeries.DramaEpisodeList itemData = mData.getDramaEpisodeList().get(integer -1);
                //选中状态
                if(currentNumber == integer){
                    rRelativeLayout.getHelper().setBorderWidthNormal((int) getContext().getResources().getDimension(com.inshort.base.R.dimen.size_1dp));
                    rRelativeLayout.getHelper().setBorderColorNormal(ContextCompat.getColor(getContext(), com.inshort.base.R.color.color_FE2442));
                    baseViewHolder.setVisible(R.id.episode_num, false);
                    baseViewHolder.setVisible(R.id.play_iv,true);
                    baseViewHolder.setVisible(R.id.rr_episode, false);
                }else {
                    rRelativeLayout.getHelper().setBorderColorNormal(ContextCompat.getColor(getContext(), com.inshort.base.R.color.color_33D8D8D8));
                    baseViewHolder.setVisible(R.id.episode_num, true);
                    baseViewHolder.setVisible(R.id.play_iv,false);
                }
               //是否解锁
                baseViewHolder.setVisible(R.id.rr_episode, !itemData.isPurchased());

                rRelativeLayout.setOnClickListener(v -> {
                    if(integer -2 >=0){
                        if(!mData.getDramaEpisodeList().get(integer - 2).isPurchased()){
                            Toasts.get().showToast(getContext().getResources().getString(com.inshort.base.R.string.no_purchases));
                            return;
                        }
                    }
                    if(currentNumber == integer && itemData.isPurchased()){
                        return;
                    }else {
                        itemData.setCurrentlyUnlockedEpisodes(currentNumber == integer);
                    }
                    mViewModel.getSelectEpisodeLiveData().setValue(itemData);
                });

            }
        }


        @Override
        public void onViewAttachedToWindow(@NonNull BaseViewHolder holder) {
            super.onViewAttachedToWindow(holder);
            ImageView playIv = holder.getView(R.id.play_iv);
            if(playIv.getVisibility() == View.VISIBLE){
                AnimationDrawable animationDrawable = (AnimationDrawable) playIv.getBackground();
                if(!animationDrawable.isRunning()){animationDrawable.start();}
            }
        }

        @Override
        public void onViewDetachedFromWindow(@NonNull BaseViewHolder holder) {
            super.onViewDetachedFromWindow(holder);
            ImageView playIv = holder.getView(R.id.play_iv);
            if(playIv.getVisibility() == View.VISIBLE){
                AnimationDrawable animationDrawable = (AnimationDrawable) playIv.getBackground();
                if(!animationDrawable.isRunning()){animationDrawable.stop();}
            }
        }
    }
}
