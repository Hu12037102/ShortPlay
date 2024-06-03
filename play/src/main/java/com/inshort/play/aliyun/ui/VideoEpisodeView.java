package com.inshort.play.aliyun.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.utils.SumDataUtilKt;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.play.R;
import com.inshort.play.activity.PlayActivity;
import com.inshort.play.databinding.PlayEpisodeViewBinding;
import com.inshort.play.databinding.PlayUiBinding;
import com.inshort.play.listener.EpisodeListener;
import com.inshort.play.viewmodel.PlayViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/30
 */
public class VideoEpisodeView extends RelativeLayout {
    public static final int PAGE_SIZE = 30;
    private Context mContext;
    private PlayEpisodeViewBinding mViewBinding;
    private List<String>countList = new ArrayList<>();
    private List<Fragment>fragments = new ArrayList<>();
    private EpisodeViewPager mViewPager;
    private EpisodeListener episodeListener;

    public void setEpisodeListener(EpisodeListener episodeListener) {
        this.episodeListener = episodeListener;
    }

    public VideoEpisodeView(Context context) {this(context,null);}
    public VideoEpisodeView(Context context, AttributeSet attrs) {this(context, attrs,0);}
    public VideoEpisodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context mContext){
        this.mContext = mContext;
        mViewBinding = PlayEpisodeViewBinding.inflate(LayoutInflater.from(mContext), this, true);
        mViewBinding.closeAiv.setOnClickListener(new DelayedClick(500) {
            @Override
            public void onDelayedClick(View view) {
                if(episodeListener!=null)episodeListener.closeView();
            }
        });
        mViewBinding.episodeCl.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if(episodeListener!=null)episodeListener.closeView();
            }
        });
        mViewBinding.episodeView.setOnClickListener(v -> {});
    }

    public void initViewPager(VideoUrlEntity.DramaSeries mData){
        int size = getCount(mData.getEpisodeUpdated());
        LogUtils.d("initViewPager >> "+size);
        if(size > 0){
            for (int i = 1; i <=size ; i++) {
                if(size-i == 0){
                    countList.add(1+(PAGE_SIZE*(i-1))+"-"+mData.getEpisodeUpdated());
                }else {
                    countList.add(1+(PAGE_SIZE*(i-1))+"-"+PAGE_SIZE * i);
                }
                mViewBinding.tabLayout.addTab(mViewBinding.tabLayout.newTab());
                fragments.add(EpisodeViewFragment.getInstance(i-1,size,mData.getEpisodeUpdated()));
            }


            mViewPager = new EpisodeViewPager((FragmentActivity) mContext,fragments);
            mViewBinding.episodeVp.setOffscreenPageLimit(countList.size());
            mViewBinding.episodeVp.setAdapter(mViewPager);
        }

        if(mData.isFinished()){
            mViewBinding.updatedTv.setText(mContext.getResources().getString(com.inshort.base.R.string.completed));
        }else {
            mViewBinding.updatedTv.setText(String.format(mContext.getResources().getString(com.inshort.base.R.string.episode_updated),String.valueOf(mData.getEpisodeUpdated())));
        }

        initTabLayout();
    }

    private void initTabLayout(){
        new TabLayoutMediator(mViewBinding.tabLayout, mViewBinding.episodeVp, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(countList.get(position));
            }
        }).attach();

        mViewBinding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(episodeListener!=null && mViewPager!=null){
                    episodeListener.onClickPosition(tab.getPosition());
                    mViewPager.getFragment(tab.getPosition()).setSelectPosition();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void setEpisodeData(){

    }


    public void setCurrentNumber(int currentNumber){
        int pager = SumDataUtilKt.getPager(currentNumber);
        if(countList.size() > pager -1){
            mViewBinding.tabLayout.post(() -> {
                TabLayout.Tab tab = mViewBinding.tabLayout.getTabAt(pager -1);
                if(tab!=null){tab.select();}
                EpisodeViewFragment fragment = mViewPager.getFragment(pager -1 );
                fragment.setCurrentNumber(currentNumber);
            });
        }
    }

    /**
     * 计算count数量
     * @param total
     * @return
     */
    private int getCount(int total){
        int size = total/PAGE_SIZE;
        int remainder = total%PAGE_SIZE;
        if(remainder == 0){
            return size;
        }else {
            return size+1;
        }
    }

    static class EpisodeViewPager extends FragmentStateAdapter {
        private List<Fragment>fragments;
        public EpisodeViewPager(@NonNull FragmentActivity fragmentActivity,List<Fragment>fragments) {
            super(fragmentActivity);
            this.fragments =fragments;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragments.get(position);
        }

        @Override
        public int getItemCount() {
            return fragments.size();
        }
        public EpisodeViewFragment getFragment(int position){
            return (EpisodeViewFragment) fragments.get(position);
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
