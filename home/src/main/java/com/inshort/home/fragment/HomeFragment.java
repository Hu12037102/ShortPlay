package com.inshort.home.fragment;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DialogCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.core.viewmodel.AppViewModel;
import com.inshort.base.entity.ColumnEntity;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.DramaSeriesPageEntity;
import com.inshort.base.entity.HomeIndexEntity;
import com.inshort.base.entity.MainBottomTabEntity;
import com.inshort.base.entity.RequestPageEntity;
import com.inshort.base.entity.RequestTrendsByTypeEntity;
import com.inshort.base.entity.ResponseErrorEntity;
import com.inshort.base.entity.SearchHandEntity;
import com.inshort.base.entity.TrendingTypeEntity;
import com.inshort.base.manger.AppViewModelManger;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.home.adapter.HomeAdapter;
import com.inshort.home.adapter.HomeBannerAdapter;
import com.inshort.home.databinding.FragmentHomeBinding;
import com.inshort.home.databinding.ItemHeadHomeViewBinding;
import com.inshort.home.databinding.ItemHomeNotMoreFooterViewBinding;
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
    @Nullable
    private ObjectAnimator mPlayShowHistoryAnimator = null;
    private ObjectAnimator mPlayHideHistoryAnimator = null;
    private float mScrollY = 0;
  /*  private OnItemClickListener<String> mOnSelectorSearchListener;

    public void setOnItemClickListener(OnItemClickListener<String> onSelectorSearchListener) {
        this.mOnSelectorSearchListener = onSelectorSearchListener;
    }*/

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
        mViewBinding.getRoot().setVisibility(View.INVISIBLE);
        ViewCompat.setBackground(mViewBinding.clSearchParent, getSearchBackground());
        // ViewsCompat.setStatusBarMargin(mViewBinding.clSearchParent, getActivity(), PhoneCompat.dp2px(requireContext(), 6));
        mViewBinding.rvContent.setLayoutManager(new LinearLayoutManager(getContext()));
        mViewBinding.refreshLayout.setEnableLoadMore(true);
        initHeadView();
    }

    private void initHeadView() {
        mHeadViewBinding = ItemHeadHomeViewBinding.inflate(getLayoutInflater(), mViewBinding.rvContent, false);
    }


    @Override
    protected void initData() {

        initBannerAdapter();
        initAdapter();
        loadSmartData();
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        if (mViewModel.isRefresh()) {
            mViewModel.loadIndex();
        } else {
            mViewModel.loadMore();
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
    protected boolean isLoadEmptyView() {
        return true;
    }

    @Override
    protected void initEvent() {
        if (mAdapter != null) {
            mAdapter.setOnHomeItemClickListener(new HomeAdapter.OnHomeItemClickListener() {
                @Override
                public void onClickTrendingType(View view, TrendingTypeEntity entity) {
                    RequestTrendsByTypeEntity requestEntity = new RequestTrendsByTypeEntity();
                    requestEntity.isHomeIndex = true;
                    requestEntity.type = entity.content;
                    mViewModel.findTrendsByType(requestEntity, false, false, false);
                }

                @Override
                public void onClickTrendingMore(View view, @Nullable String selectorTrendingType) {
                    Postcard postcard = ARouters.build(ARouterConfig.Path.Home.ACTIVITY_TRENDING);
                    if (postcard != null) {
                        postcard = postcard.withString(ARouterConfig.Key.CONTENT, selectorTrendingType);
                        Intent intent = ARouters.getIntent(getContext(), postcard);
                        mTrendingActivityResultLauncher.launch(intent);
                    }
                }

                @Override
                public void onClickViewMore(View view, ColumnEntity entity) {
                    Postcard postcard = ARouters.build(ARouterConfig.Path.Home.ACTIVITY_VIEW_MORE);
                    if (postcard != null) {
                        postcard.withString(ARouterConfig.Key.CONTENT, entity.columnName)
                                .withInt(ARouterConfig.Key.ID, entity.configurationColumnId)
                                .navigation();
                    }
                }

                @Override
                public void onClickNewEpisode(View view, DramaSeriesEntity entity) {
                    showNewEpisodeDialog(entity);
                }

                @Override
                public void onClickItem(View view, DramaSeriesEntity entity) {

                }
            });
        }
        mViewBinding.rvContent.addOnScrollListener(mOnScrollListener);

    }

    private final RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {
        /**
         * SCROLL_STATE_IDLE (0)：表示 RecyclerView 当前不是滚动状态。这意味着 RecyclerView 已经停止滚动。
         * SCROLL_STATE_DRAGGING (1)：表示 RecyclerView 当前被用户拖动。用户正在用手指拖动 RecyclerView，这时 RecyclerView 处于拖动状态。
         * SCROLL_STATE_SETTLING (2)：表示 RecyclerView 当前正在惯性滚动（flinging）。当用户放开手指时，RecyclerView 继续滚动直到停止，这种状态称为 Settling。
         */
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            LogUtils.w("mOnScrollListener", newState + "-----" + mViewBinding.includedPlayHistory.getRoot().getVisibility());

            if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                hideHistoryAnimator();
            } else if (newState == RecyclerView.SCROLL_STATE_DRAGGING) {
                showHistoryAnimator();
            } /*else if (newState == RecyclerView.SCROLL_STATE_SETTLING) {
                hideHistoryAnimator();
            }*/
        }

        @Override
        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            mScrollY += dy;
            if (mHeadViewBinding != null) {
                int height = mHeadViewBinding.banner.getMeasuredHeight();
                if (height == 0) {
                    height = 1;
                }
                /*if (mScrollY <= height) {
                    mViewBinding.viewSearchAlpha.setAlpha(1 - mScrollY / height);
                    mViewBinding.viewSearchScroll.setAlpha(mScrollY / height);
                }*/
                mViewBinding.viewSearchAlpha.setAlpha(1 - mScrollY / height);
                mViewBinding.viewSearchScroll.setAlpha(mScrollY / height);
            }
            LogUtils.w("onScrolled--", dx + "----" + dy);

        }
    };

    private void showHistoryAnimator() {
        if (mViewBinding.includedPlayHistory.getRoot().getVisibility() == View.GONE) {
            return;
        }
        if (DataCompat.notNull(mPlayHideHistoryAnimator) && mPlayHideHistoryAnimator.isRunning()) {
            return;
        }
        if (mPlayShowHistoryAnimator == null) {
            mPlayShowHistoryAnimator = ObjectAnimator.ofFloat(mViewBinding.includedPlayHistory.getRoot(), "translationY", 0, mViewBinding.includedPlayHistory.getRoot().getMeasuredHeight());
            mPlayShowHistoryAnimator.setDuration(300);
            mPlayShowHistoryAnimator.setInterpolator(new LinearInterpolator());
            mPlayShowHistoryAnimator.setRepeatCount(0);
        }
        if (!mPlayShowHistoryAnimator.isRunning()) {
            mPlayShowHistoryAnimator.start();
        }
        mPlayShowHistoryAnimator.start();
    }

    private void hideHistoryAnimator() {
        if (mViewBinding.includedPlayHistory.getRoot().getVisibility() == View.GONE) {
            return;
        }
        if (DataCompat.notNull(mPlayShowHistoryAnimator) && mPlayShowHistoryAnimator.isRunning()) {
            return;
        }
        if (mPlayHideHistoryAnimator == null) {
            mPlayHideHistoryAnimator = ObjectAnimator.ofFloat(mViewBinding.includedPlayHistory.getRoot(), "translationY", mViewBinding.includedPlayHistory.getRoot().getMeasuredHeight(), 0);
            mPlayHideHistoryAnimator.setDuration(300);
            mPlayHideHistoryAnimator.setInterpolator(new LinearInterpolator());
            mPlayHideHistoryAnimator.setRepeatCount(0);
        }
        if (!mPlayHideHistoryAnimator.isRunning()) {
            mPlayHideHistoryAnimator.start();
        }
        // mPlayHideHistoryAnimator.start();
    }

    private void showNewEpisodeDialog(DramaSeriesEntity entity) {
        Object obj = ARouters.build(ARouterConfig.Path.Home.DIALOG_NEW_EPISODE).withSerializable(ARouterConfig.Key.SERIALIZABLE, entity).navigation();
        DialogCompat.showDialogFragment(obj, getChildFragmentManager());
    }

    private final ActivityResultLauncher<Intent> mTrendingActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), o -> {
        if (o != null && o.getResultCode() == Activity.RESULT_OK) {

        }
    });

    @Override
    protected boolean isLoadAppViewModel() {
        return true;
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getIndexLiveData().observe(this, new Observer<HomeIndexEntity>() {
            @Override
            public void onChanged(HomeIndexEntity homeIndexEntity) {
                if (homeIndexEntity == null) {
                    return;
                }
                mViewBinding.getRoot().setVisibility(View.VISIBLE);
               /* if (mAppViewModel != null) {
                    mAppViewModel.getHomeKeywordLiveData().setValue(new SearchHandEntity(DataCompat.toString(homeIndexEntity.searcherKeyword), false));
                }*/
              /*  mViewBinding.clSearchParent.setOnClickListener(new DelayedClick() {
                    @Override
                    public void onDelayedClick(View view) {
                        if (mOnSelectorSearchListener != null) {
                            mOnSelectorSearchListener.onItemClick(view, homeIndexEntity.searcherKeyword);
                        }
                    }
                });*/

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
                if (mAdapter != null) {
                    mAdapter.removeFootView();
                }
                SmartRefreshLayoutCompat.initDefault(mViewBinding.refreshLayout);
                AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(),
                        mData, columnEntities, null);
                initSearchEvent(homeIndexEntity);

            }
        });
        mViewModel.getTrendsPageLiveData().observe(this, trendsPageEntity -> {
            if (DataCompat.notNull(trendsPageEntity) && DataCompat.notNull(trendsPageEntity.data)) {
                for (ColumnEntity entity : mData) {
                    if (entity.viewType == HomeAdapter.VIEW_TYPE_TRENDING) {
                        entity.dramaSeriesList = trendsPageEntity.data;
                    }
                }
            }
            AdapterCompat.notifyAdapterUpdateDateChanged(mEmptyLayout, mAdapter, mData);
        });
        mViewModel.getDramaSeriesPageLiveData().observe(this, new Observer<DramaSeriesPageEntity>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onChanged(DramaSeriesPageEntity dramaSeriesPageEntity) {
                if (DataCompat.notNull(dramaSeriesPageEntity)) {
                    List<DramaSeriesEntity> data = dramaSeriesPageEntity.data;
                    boolean hasMore = dramaSeriesPageEntity.page < dramaSeriesPageEntity.pageCount;
                    if (mAdapter != null) {
                        mAdapter.removeFootView();
                        if (!hasMore) {
                            mAdapter.addFootView(ItemHomeNotMoreFooterViewBinding.inflate(getLayoutInflater(), mViewBinding.rvContent, false).getRoot());
                        }
                        for (ColumnEntity entity : mData) {
                            if (entity.viewType == 3) {
                                if (DataCompat.notNull(entity.dramaSeriesList)) {
                                    entity.dramaSeriesList.addAll(data);
                                }

                            }
                        }
                        mAdapter.notifyDataSetChanged();
                    }
                    mViewBinding.refreshLayout.setEnableLoadMore(hasMore);

                }
            }
        });
        mViewModel.getHttpErrorLiveData().observe(this, new Observer<ResponseErrorEntity>() {
            @Override
            public void onChanged(ResponseErrorEntity responseErrorEntity) {
                if (responseErrorEntity.liveData == mViewModel.getIndexLiveData()) {
                    if (CollectionCompat.notEmptyList(mData)) {
                        mViewBinding.getRoot().setVisibility(View.VISIBLE);
                    } else {
                        mViewBinding.getRoot().setVisibility(View.INVISIBLE);
                    }
                }
            }
        });
    }

    private void initSearchEvent(HomeIndexEntity homeIndexEntity) {
        mViewBinding.aivSearch.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (mAppViewModel != null) {
                    mAppViewModel.getHomeKeywordLiveData().setValue(new SearchHandEntity(DataCompat.toString(homeIndexEntity.searcherKeyword), true));
                    mAppViewModel.getMainTabTypeSelectorLiveData().setValue(MainBottomTabEntity.TYPE_SEARCH);
                }
            }
        });
        mViewBinding.clSearchParent.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (mAppViewModel != null) {
                    mAppViewModel.getHomeKeywordLiveData().setValue(new SearchHandEntity(DataCompat.toString(homeIndexEntity.searcherKeyword), false));
                    mAppViewModel.getMainTabTypeSelectorLiveData().setValue(MainBottomTabEntity.TYPE_SEARCH);
                }
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewBinding.rvContent.removeOnScrollListener(mOnScrollListener);
    }

    @Override
    protected void onClickEmptyView(@NonNull View view) {
        //super.onClickEmptyView(view);
        loadSmartData();
    }
}
