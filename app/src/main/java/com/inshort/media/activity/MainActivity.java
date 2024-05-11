package com.inshort.media.activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.NetworkCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.main.MainBottomTabEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.utils.LogUtils;
import com.inshort.home.activity.HomeFragment;
import com.inshort.me.fragment.MeFragment;
import com.inshort.media.BuildConfig;
import com.inshort.media.adapter.MainBottomTabAdapter;
import com.inshort.media.databinding.ActivityMainBinding;
import com.inshort.media.viewmodel.MainViewModel;
import com.inshort.mylist.fragment.MyListFragment;
import com.inshort.search.fragment.SearchFragment;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Main.ACTIVITY_MAIN)
public class MainActivity extends BaseCompatActivity<ActivityMainBinding, MainViewModel> {
    @Nullable
    private MainBottomTabAdapter mBottomTabAdapter = null;
    private final List<MainBottomTabEntity> mBottomTabData = new ArrayList<>();
    private final List<BaseCompatFragment<?, ?>> mFragments = new ArrayList<>();

    @Override
    protected void initView() {
        mViewBinding.rvBottom.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }


    @Override
    protected void initData() {
        initBottomTabAdapter();
        initPageAdapter();
        LogUtils.w("initData--", NetworkCompat.getMobileNetType(DataCompat.applicationContext()));
        LogUtils.w("initData--", NetworkCompat.getMobileNetType(DataCompat.applicationContext()));
    }

    private void initPageAdapter() {
        mFragments.clear();
        for (MainBottomTabEntity tabEntity : mBottomTabData) {
            String fragmentPath = tabEntity.fragmentPath;
            Object obj = ARouters.getBaseCompatFragment(fragmentPath);
            if (obj instanceof HomeFragment homeFragment) {
                mFragments.add(homeFragment);
            } else if (obj instanceof SearchFragment searchFragment) {
                mFragments.add(searchFragment);
            } else if (obj instanceof MyListFragment mylistFragment) {
                mFragments.add(mylistFragment);
            } else if (obj instanceof MeFragment meFragment) {
                mFragments.add(meFragment);
            }
        }
        mViewBinding.vpContent.setAdapter(mPagerAdapter);
        mViewBinding.vpContent.setOffscreenPageLimit(CollectionCompat.getListSize(mFragments));
        mViewBinding.vpContent.setUserInputEnabled(false);
    }

    private final FragmentStateAdapter mPagerAdapter = new FragmentStateAdapter(this) {
        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getItemCount() {
            return CollectionCompat.getListSize(mFragments);
        }
    };

    private void initBottomTabAdapter() {
        List<MainBottomTabEntity> data = mViewModel.getBottomTabData(this);
        mBottomTabData.clear();
        mBottomTabData.addAll(data);
        mBottomTabAdapter = new MainBottomTabAdapter(this, mBottomTabData);
        mViewBinding.rvBottom.setAdapter(mBottomTabAdapter);
    }

    @Override
    protected void initEvent() {
        mViewBinding.vpContent.registerOnPageChangeCallback(mOnPageChangeCallback);
        if (mBottomTabAdapter!=null){
            mBottomTabAdapter.setOnItemClickListener((view, position) -> {
                if (position!=null){
                    mViewBinding.vpContent.setCurrentItem(position,false);
                }
            });
        }

    }

    private final ViewPager2.OnPageChangeCallback mOnPageChangeCallback = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }

        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (mBottomTabAdapter!=null){
                mBottomTabAdapter.selectorItem(position);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {
            super.onPageScrollStateChanged(state);
        }
    };

    @Override
    protected ActivityMainBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected boolean isLoadEmptyView() {
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewBinding.vpContent.unregisterOnPageChangeCallback(mOnPageChangeCallback);
    }
}