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
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.BaseRootFrameViewBinding;
import com.inshort.base.databinding.BaseRootLoadingViewBinding;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.inshort.base.tools.ViewTools;
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


        });


    }

    protected void buildParentLayout(@NonNull FrameLayout frameLayout) {
        ViewTools viewTools = new ViewTools();
        SmartRefreshLayout refreshLayout = viewTools.findSmartRefreshLayout(frameLayout);
        initRefreshLayout(refreshLayout);

        if (isLoadEmptyView()) {
            mEmptyLayout = new EmptyLayout(this);
            frameLayout.addView(mEmptyLayout, 0, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
            mEmptyLayout.hide();
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

    private void initRefreshLayout(@Nullable SmartRefreshLayout refreshLayout) {
        if (DataCompat.isNull(refreshLayout)) {
            return;
        }
        this.mRefreshLayout = refreshLayout;
        SmartRefreshLayoutCompat.initDefault(refreshLayout);
        refreshLayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mViewModel.pagerReset();
                loadSmartData(refreshLayout, true);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mViewModel.setRefresh(false);
                loadSmartData(refreshLayout, false);
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
}
