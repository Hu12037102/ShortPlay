package com.inshort.home.fragment;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.ColumnEntity;
import com.inshort.base.entity.HomeIndexEntity;
import com.inshort.base.entity.TrendingTypeEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.home.adapter.HomeAdapter;
import com.inshort.home.adapter.HomeBannerAdapter;
import com.inshort.home.databinding.FragmentHomeBinding;
import com.inshort.home.databinding.ItemHeadHomeViewBinding;
import com.inshort.home.viewmodel.HomeViewModel;
import com.youth.banner.indicator.RectangleIndicator;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Home.FRAGMENT_HOME)
public class HomeFragment extends BaseCompatFragment<FragmentHomeBinding, HomeViewModel> {
    @Nullable
    private HomeAdapter mAdapter;
    @Nullable
    private ItemHeadHomeViewBinding mHeadViewBinding;
    private final ArrayList<ColumnEntity> mData = new ArrayList<>();
    private final List<HomeIndexEntity.Banner> mBannerData = new ArrayList<>();
    @Nullable
    private HomeBannerAdapter mBannerAdapter;

    @Override
    protected FragmentHomeBinding getViewBinding() {
        return FragmentHomeBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<HomeViewModel> getViewModelClass() {
        return HomeViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.clSearchParent, getSearchBackground());
        ViewsCompat.setStatusBarMargin(mViewBinding.clSearchParent, getActivity(), PhoneCompat.dp2px(requireContext(), 6));
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(getContext()));
        initHeadView();
    }

    private void initHeadView() {
        mHeadViewBinding = ItemHeadHomeViewBinding.inflate(getLayoutInflater(), mViewBinding.rvContent, false);
    }


    @Override
    protected void initData() {
        initBannerAdapter();
        initAdapter();
        loadSmartData(mViewModel.isRefresh());
    }

    @Override
    protected void loadSmartData(boolean isRefresh) {
        super.loadSmartData(isRefresh);
        if (isRefresh) {
            mViewModel.loadIndex();
        }
    }

    private void initBannerAdapter() {
        mBannerAdapter = new HomeBannerAdapter(requireContext(), mBannerData);
        if (mHeadViewBinding != null) {
            //Banner<HomeIndexEntity.Banner,HomeBannerAdapter> banner =   mHeadViewBinding.banner;
            mHeadViewBinding.banner
                    .addBannerLifecycleObserver(this)
                    .setIndicator(new RectangleIndicator(requireContext()), true)
                    .setAdapter(mBannerAdapter)
                    .setOnBannerListener((data, position) -> {
                    })
                    .start();
        }

    }

    private void initAdapter() {
        mAdapter = new HomeAdapter(requireContext(), mData);
        if (mHeadViewBinding != null) {
            mAdapter.addHeadView(mHeadViewBinding.getRoot());
        }
        mViewBinding.rvContent.setAdapter(mAdapter);
    }

    @Override
    protected void initEvent() {


    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getIndexLiveData().observe(this, new Observer<HomeIndexEntity>() {
            @Override
            public void onChanged(HomeIndexEntity homeIndexEntity) {
                UICompat.setText(mViewBinding.atvKeysearch, homeIndexEntity.searcherKeyword);
                mBannerData.clear();
                if (CollectionCompat.notEmptyList(homeIndexEntity.banners)) {
                    mBannerData.addAll(homeIndexEntity.banners);
                }
                if (mBannerAdapter != null) {
                    mBannerAdapter.setDatas(mBannerData);
                }

                LogUtils.d("getIndexLiveData--", mBannerData.size() + "--" + homeIndexEntity);
                List<ColumnEntity> columnEntities = homeIndexEntity.columnList;
                if (CollectionCompat.notEmptyList(columnEntities)) {
                    for (ColumnEntity entity : columnEntities) {
                        if (entity.viewType == HomeAdapter.VIEW_TYPE_TRENDING) {
                            entity.trendingTypes = TrendingTypeEntity.stringList2EntityList(homeIndexEntity.trendClassifyList);
                        }
                    }
                }
                AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(),
                        mData, columnEntities, null);
            }
        });
    }

    @NonNull
    private Drawable getSearchBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(getContext(), com.inshort.base.R.color.color_CCFFFFFF));
        // drawable.setColor(ContextCompat.getColor(requireContext(), com.inshort.base.R.color.color_33FFFFFF));
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50f));
        return drawable;
    }
}
