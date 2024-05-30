package com.inshort.base.core.activity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.viewmodel.AppViewModel;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.BaseRootFrameViewBinding;
import com.inshort.base.databinding.BaseRootLoadingViewBinding;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.manger.AppViewModelManger;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.inshort.base.tools.ViewTools;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.view.EmptyLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;


public abstract class BaseCompatActivity<VB extends ViewBinding, VM extends BaseCompatViewModel> extends BaseActivity {
    protected VM mViewModel;
    protected VB mViewBinding;
    @Nullable
    protected SmartRefreshLayout mRefreshLayout = null;
    @Nullable
    protected EmptyLayout mEmptyLayout = null;
    @Nullable
    protected AnimationDrawable mLoadingAnimationDrawable = null;
    @Nullable
    protected BaseRootLoadingViewBinding mLoadingViewBinding = null;
    @Nullable
    protected AppViewModel mAppViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = getViewBinding();
        FrameLayout rootView = BaseRootFrameViewBinding.inflate(getLayoutInflater()).getRoot();
        ViewsCompat.setViewSize(rootView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rootView.addView(mViewBinding.getRoot());
        buildParentLayout(rootView);
        setContentView(rootView);
        init();
    }

    protected void init() {
        mViewModel = new ViewModelProvider(this).get(getViewModelClass());
        if (isLoadAppViewModel()){
            mAppViewModel = AppViewModelManger.getInstance(getApplication()).getViewModel(AppViewModel.class);
        }
        initView();
        initData();
        initEvent();
        initObserve();
    }

    protected abstract VB getViewBinding();

    protected abstract Class<VM> getViewModelClass();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initEvent();


    protected void initObserve() {
        mViewModel.getLoadingLiveData().observe(this, isLoading -> {
            if (isLoading) {
                showLoadingView();
            } else {
                dismissLoadingView();
            }

        });
        mViewModel.getUserLiveData().observe(this, new Observer<UserEntity>() {
            @Override
            public void onChanged(UserEntity userEntity) {
                if (!DataCompat.isNull(userEntity)) {
                    onUserUpdate(userEntity);
                    LogUtils.w("getUserLiveData", userEntity.toString());
                }
            }
        });
        mViewModel.getEmptyViewLiveData().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isShow) {
                if (isShow) {
                    showEmptyView();
                } else {
                    hideEmptyView();
                }
            }
        });
        mViewModel.getRefreshLiveData().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isRefresh) {
                mViewModel.pagerAdd();
                LogUtils.d("getRefreshLiveData--", isRefresh + "---" + mViewModel.getPage());
                SmartRefreshLayoutCompat.finishAll(mRefreshLayout);
            }
        });

    }

    protected void buildParentLayout(@NonNull FrameLayout frameLayout) {
        ViewTools viewTools = new ViewTools();
        mRefreshLayout = viewTools.findSmartRefreshLayout(frameLayout);
        initRefreshLayout();

        if (isLoadEmptyView()) {
            mEmptyLayout = new EmptyLayout(this);
            frameLayout.addView(mEmptyLayout, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
            mEmptyLayout.hide();
            mEmptyLayout.setPadding(PhoneCompat.dp2px(this, 10), PhoneCompat.dp2px(this, 10),
                    PhoneCompat.dp2px(this, 10), PhoneCompat.dp2px(this, 10));
            mEmptyLayout.setOnClickListener(new DelayedClick() {
                @Override
                public void onDelayedClick(View view) {
                    onClickEmptyView(mEmptyLayout);
                }
            });
        }
        mLoadingViewBinding = BaseRootLoadingViewBinding.inflate(getLayoutInflater());
        AppCompatImageView aivLoading = mLoadingViewBinding.aivLoading;
        Drawable drawable = aivLoading.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            mLoadingAnimationDrawable = (AnimationDrawable) drawable;
            mLoadingAnimationDrawable.start();
        }
        frameLayout.addView(mLoadingViewBinding.getRoot(), new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        dismissLoadingView();
    }

    private void initRefreshLayout() {
        if (DataCompat.isNull(mRefreshLayout)) {
            return;
        }
        SmartRefreshLayoutCompat.initDefault(mRefreshLayout);
        mRefreshLayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mViewModel.setRefresh(false);
                mViewModel.setManualRefresh(false);
                loadSmartData();
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mViewModel.pagerReset();
                mViewModel.setManualRefresh(true);
                loadSmartData();
            }
        });
    }

    protected void showLoadingView() {
        if (mLoadingAnimationDrawable != null) {
            mLoadingAnimationDrawable.start();
        }
        if (mLoadingViewBinding != null) {
            mLoadingViewBinding.getRoot().setVisibility(View.VISIBLE);
        }

    }

    protected void dismissLoadingView() {
        if (mLoadingAnimationDrawable != null) {
            mLoadingAnimationDrawable.stop();
        }
        if (mLoadingViewBinding != null) {
            mLoadingViewBinding.getRoot().setVisibility(View.GONE);
        }
    }


    protected void showEmptyView() {
        if (mEmptyLayout != null) {
            mEmptyLayout.show();
        }
    }

    protected void hideEmptyView() {
        if (mEmptyLayout != null) {
            mEmptyLayout.hide();
        }
    }
    protected void loadSmartData( ) {

    }
}
