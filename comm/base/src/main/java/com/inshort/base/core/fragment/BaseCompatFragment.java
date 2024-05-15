package com.inshort.base.core.fragment;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
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
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.BaseRootFrameViewBinding;
import com.inshort.base.databinding.BaseRootLoadingViewBinding;
import com.inshort.base.entity.UserEntity;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.inshort.base.tools.ViewTools;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.view.EmptyLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;

public abstract class BaseCompatFragment<VB extends ViewBinding, VM extends BaseCompatViewModel> extends BaseFragment {

    protected VB mViewBinding = null;

    protected VM mViewModel = null;


    protected abstract VB getViewBinding();

    protected abstract Class<VM> getViewModelClass();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initEvent();

    private boolean isFirstCreate = true;
    @Nullable
    private FrameLayout mRootParent = null;
    @Nullable
    protected SmartRefreshLayout mRefreshLayout = null;
    @Nullable
    protected EmptyLayout mEmptyLayout = null;
    @Nullable
    protected AnimationDrawable mLoadingAnimationDrawable = null;
    @Nullable
    protected BaseRootLoadingViewBinding mLoadingViewBinding = null;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onAttach----1");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = getViewBinding();
        mViewModel = new ViewModelProvider(this).get(getViewModelClass());
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onCreate----2");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onCreateView----3");
        mRootParent = BaseRootFrameViewBinding.inflate(getLayoutInflater(), container, false).getRoot();
        ViewsCompat.setViewSize(mRootParent, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mRootParent.addView(mViewBinding.getRoot(),
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return mRootParent;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onViewCreated----4");
    }

    @Override
    public void onStart() {
        super.onStart();
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onStart----5");
    }

    @Override
    public void onResume() {
        super.onResume();
        if (isFirstCreate) {
            buildParentLayout();
            init();
            isFirstCreate = false;
            LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onResume----6");
        }

    }

    protected void buildParentLayout() {
        if (DataCompat.isNull(mRootParent)) {
            return;
        }
        ViewTools viewTools = new ViewTools();
        mRefreshLayout = viewTools.findSmartRefreshLayout(mRootParent);
        initRefreshLayout();

        if (isLoadEmptyView()) {
            mEmptyLayout = new EmptyLayout(mRootParent.getContext());
            mRootParent.addView(mEmptyLayout, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
            mEmptyLayout.setPadding(PhoneCompat.dp2px(requireContext(), 10), PhoneCompat.dp2px(requireContext(), 10),
                    PhoneCompat.dp2px(requireContext(), 10), PhoneCompat.dp2px(requireContext(), 10));
            mEmptyLayout.setOnClickListener(new DelayedClick() {
                @Override
                public void onDelayedClick(View view) {
                    onClickEmptyView(mEmptyLayout);
                }
            });
            mEmptyLayout.hide();
        }
        mLoadingViewBinding = BaseRootLoadingViewBinding.inflate(getLayoutInflater());
        AppCompatImageView aivLoading = mLoadingViewBinding.aivLoading;
        Drawable drawable = aivLoading.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            mLoadingAnimationDrawable = (AnimationDrawable) drawable;
            mLoadingAnimationDrawable.start();
        }
        mRootParent.addView(mLoadingViewBinding.getRoot(), new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        dismissLoadingView();
    }

    private void init() {
        initView();
        initData();
        initEvent();
        initObserve();
    }

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
                SmartRefreshLayoutCompat.finishAll(mRefreshLayout);
            }
        });
        mViewModel.getRefreshLiveData().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isRefresh) {
                LogUtils.d("getRefreshLiveData--", isRefresh + "---" + mRefreshLayout);
                  SmartRefreshLayoutCompat.finishAll(mRefreshLayout);

            }
        });
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
                loadSmartData( false);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mViewModel.pagerReset();
                loadSmartData( true);
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onPause----7");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onStop----8");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onDestroyView----9");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        isFirstCreate = false;
        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onDestroy----10");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        LogUtils.w("FragmentCompatFragment--", getClass().getSimpleName() + ":onDetach----11");
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
    protected void loadSmartData( boolean isRefresh) {

    }
}
