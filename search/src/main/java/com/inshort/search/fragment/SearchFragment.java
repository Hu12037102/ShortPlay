package com.inshort.search.fragment;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.UiContext;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DialogCompat;
import com.inshort.base.compat.KeySoftCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.dialog.comm.TitleDialog;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.DramaSeriesEntity;
import com.inshort.base.entity.ResponseErrorEntity;
import com.inshort.base.entity.SearchHandEntity;
import com.inshort.base.entity.SearchPageEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.mmkv.SearchHistoryDataStore;
import com.inshort.base.other.smart.SmartRefreshLayoutCompat;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.search.adapter.SearchAdapter;
import com.inshort.search.adapter.SearchTrendingAdapter;
import com.inshort.search.databinding.FragmentSearchBinding;
import com.inshort.search.databinding.ItemSearchHeadViewBinding;
import com.inshort.search.viewmodel.SearchViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Search.FRAGMENT_SEARCH)
public class SearchFragment extends BaseCompatFragment<FragmentSearchBinding, SearchViewModel> {
    @NonNull
    private String mKeyword = "";
    private ItemSearchHeadViewBinding mHeadViewBinding;
    private final ArrayList<SearchPageEntity.Info> mData = new ArrayList<>();
    private SearchAdapter mAdapter = null;
    private final List<DramaSeriesEntity> mTrendingData = new ArrayList<>();
    private SearchTrendingAdapter mTrendingAdapter = null;


    @Override
    protected FragmentSearchBinding getViewBinding() {
        return FragmentSearchBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<SearchViewModel> getViewModelClass() {
        return SearchViewModel.class;
    }

    @Override
    protected void initView() {
        // mViewBinding.rvContent.setLayoutManager(new GridLayoutManager(requireContext(),2));
        mViewBinding.rvContent.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mViewBinding.rvContent.setItemAnimator(null);
        ViewCompat.setBackground(mViewBinding.viewTop, getTopBackground());
        ViewCompat.setBackground(mViewBinding.clSearchContentParent, getSearchBackground());
        ViewsCompat.setStatusBarMargin(mViewBinding.clSearchRoot, getActivity(), PhoneCompat.dp2px(requireContext(), 10));
        initHeadView();
    }

    private void initHeadView() {
        mHeadViewBinding = ItemSearchHeadViewBinding.inflate(getLayoutInflater(), mViewBinding.rvContent, false);
        updateSearchHistoryView();
        mHeadViewBinding.rvSearchTrendingContent.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        mTrendingAdapter = new SearchTrendingAdapter(requireContext(), mTrendingData);
        mHeadViewBinding.rvSearchTrendingContent.setAdapter(mTrendingAdapter);
    }

    @Override
    protected void initData() {
        mAdapter = new SearchAdapter(requireContext(), mData);
        mAdapter.addHeadView(mHeadViewBinding.getRoot());

        mViewBinding.rvContent.setAdapter(mAdapter);
        loadSmartData();
    }

    @Override
    protected void loadSmartData() {
        super.loadSmartData();
        mViewModel.findListByKeyword(mKeyword);
    }

    @Override
    protected void initEvent() {
        mViewBinding.aetContent.addTextChangedListener(mTextWatcher);
        mViewBinding.aivClear.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                UICompat.setText(mViewBinding.aetContent, null);
            }
        });
        mViewBinding.aetContent.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    clickSearch();
                    return true;
                }
                return false;
            }
        });
        if (mHeadViewBinding != null) {
            mHeadViewBinding.aivSearchHistoryClear.setOnClickListener(new DelayedClick() {
                @Override
                public void onDelayedClick(View view) {
                    showClearHistoryDialog();

                }
            });
        }
        mViewBinding.rvContent.addOnScrollListener(mOnScrollListener);
    }

    private final RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            LogUtils.w("onScrollStateChanged", newState + "--");
            if (newState == 1) {
                KeySoftCompat.updateKeySoft(requireActivity().getWindow(), mViewBinding.aetContent, false);
            }
        }

        @Override
        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
        }
    };

    private void showClearHistoryDialog() {
        Object obj = ARouters.getFragment(ARouterConfig.Path.Comm.DIALOG_TITLE);
        if (obj instanceof TitleDialog titleDialog) {
            Bundle bundle = new Bundle();
            bundle.putString(TitleDialog.KEY_TITLE, DataCompat.getResString(requireContext(), com.inshort.base.R.string.are_you_sure_you_want_to_delete_content));
            bundle.putString(TitleDialog.KEY_LEFT, DataCompat.getResString(requireContext(), com.inshort.base.R.string.cancel_content));
            bundle.putString(TitleDialog.KEY_RIGHT, DataCompat.getResString(requireContext(), com.inshort.base.R.string.confirm_content));
            titleDialog.setArguments(bundle);
            DialogCompat.showDialogFragment(titleDialog, getChildFragmentManager());
            titleDialog.setOnDialogInfoClickListener(new TitleDialog.OnDialogInfoClickListener() {
                @Override
                public void onClickLeftView(View view) {
                    titleDialog.dismiss();
                }

                @Override
                public void onClickRightView(View view) {
                    SearchHistoryDataStore.get().clear();
                    updateSearchHistoryView();
                    titleDialog.dismiss();
                }
            });
        }
    }

    private void clickSearch() {
        if (!TextUtils.isEmpty(mKeyword) && TextUtils.getTrimmedLength(mKeyword) <= 3) {
            mViewModel.showToast(DataCompat.getResString(requireContext(), com.inshort.base.R.string.search_please_enter_at_least_letters_content));
            return;
        }
        SearchHistoryDataStore.get().putData(mKeyword);
        updateSearchHistoryView();
        KeySoftCompat.updateKeySoft(requireActivity().getWindow(), mViewBinding.aetContent, false);
        mViewModel.pagerReset();
        loadSmartData();
    }

    @Override
    protected boolean isLoadAppViewModel() {
        return true;
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        if (mAppViewModel != null) {
            mAppViewModel.getHomeKeywordLiveData().observe(this, new Observer<SearchHandEntity>() {
                @Override
                public void onChanged(SearchHandEntity searchHandEntity) {
                    if (searchHandEntity.isAutoSearch) {
                        UICompat.setText(mViewBinding.aetContent, searchHandEntity.keyword);
                        mKeyword = searchHandEntity.keyword;
                        clickSearch();
                    } else {
                        mViewBinding.aetContent.setHint(searchHandEntity.keyword);
                    }

                }
            });
        }
        mViewModel.getSearchLiveData().observe(this, new Observer<SearchPageEntity>() {
            @Override
            public void onChanged(SearchPageEntity searchPageEntity) {
                LogUtils.w("getSearchLiveData", searchPageEntity + "");
                if (searchPageEntity != null) {
                    List<DramaSeriesEntity> trends = searchPageEntity.searchTrends;
                    mTrendingAdapter.notifyData(trends);
                    if (CollectionCompat.notEmptyList(trends)) {
                        mHeadViewBinding.clSearchTrendingParent.setVisibility(View.VISIBLE);
                    } else {
                        mHeadViewBinding.clSearchTrendingParent.setVisibility(View.GONE);
                    }

                    List<SearchPageEntity.Info> searchResults = searchPageEntity.searchResults;
                    List<SearchPageEntity.Info> searchHots = searchPageEntity.searchHots;
                    if (CollectionCompat.notEmptyList(searchResults)) {
                        mHeadViewBinding.clSearchEmptyParent.setVisibility(View.GONE);
                        AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(), mData, searchResults, null);
                        SmartRefreshLayoutCompat.setEnableMore(mRefreshLayout, CollectionCompat.getListSize(searchResults), mViewModel.getPageSize());
                        UICompat.setText(mHeadViewBinding.atvResultTitle, DataCompat.getResString(getContext(), com.inshort.base.R.string.result_content));
                        mHeadViewBinding.atvResultTitle.setVisibility(View.VISIBLE);
                        //  mHeadViewBinding.clSearchHistoryParent.setVisibility(View.GONE);
                    } else if (CollectionCompat.notEmptyList(searchHots)) {
                        mHeadViewBinding.clSearchEmptyParent.setVisibility(View.GONE);
                        AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout, mAdapter, mViewModel.isRefresh(), mData, searchHots, null);
                        SmartRefreshLayoutCompat.setEnableMore(mRefreshLayout, CollectionCompat.getListSize(searchHots), mViewModel.getPageSize());
                        UICompat.setText(mHeadViewBinding.atvResultTitle, DataCompat.getResString(getContext(), com.inshort.base.R.string.hot_search_content));
                        mHeadViewBinding.atvResultTitle.setVisibility(View.VISIBLE);
                        //  mHeadViewBinding.clSearchHistoryParent.setVisibility(View.GONE);
                    } else {
                        mHeadViewBinding.clSearchEmptyParent.setVisibility(View.VISIBLE);
                        AdapterCompat.notifyAdapterUpdateDateChanged(mEmptyLayout, mAdapter, mData);
                        SmartRefreshLayoutCompat.setEnableMore(mRefreshLayout, 0, mViewModel.getPageSize());
                        mHeadViewBinding.clSearchHistoryParent.setVisibility(View.VISIBLE);
                        //   mHeadViewBinding.atvResultTitle.setVisibility(View.GONE);
                    }


                }


            }
        });
        mViewModel.getHttpErrorLiveData().observe(this, new Observer<ResponseErrorEntity>() {
            @Override
            public void onChanged(ResponseErrorEntity responseErrorEntity) {
                if (responseErrorEntity.liveData == mViewModel.getSearchLiveData()) {


                }


            }
        });

    }

    private final TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (DataCompat.isTextViewTextEmpty(mViewBinding.aetContent)) {
                mViewBinding.aivClear.setVisibility(View.GONE);
            } else {
                mViewBinding.aivClear.setVisibility(View.VISIBLE);
            }
            mKeyword = DataCompat.toString(DataCompat.getText(mViewBinding.aetContent));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewBinding.aetContent.removeTextChangedListener(mTextWatcher);
        mViewBinding.rvContent.removeOnScrollListener(mOnScrollListener);
    }

    private Drawable getTopBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setSize(PhoneCompat.screenWidth(requireContext()), PhoneCompat.dp2px(requireContext(), 176));
        drawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFFE0EA), DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFF7F7F7)});
        return drawable;
    }

    private Drawable getSearchBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(Color.WHITE);
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        return drawable;
    }


    private TextView createHistoryTextView(@NonNull String text) {
        AppCompatTextView textView = new AppCompatTextView(requireContext());
        textView.setId(ViewCompat.generateViewId());
        textView.setMinWidth(PhoneCompat.dp2px(requireContext(), 50));
        textView.setMinHeight(PhoneCompat.dp2px(requireContext(), 30));
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setTextColor(DataCompat.getColor(getContext(), com.inshort.base.R.color.color_CC000000));
        textView.setGravity(Gravity.CENTER);
        UICompat.setTextSize(textView, 13);
        UICompat.setText(textView, text);
        UICompat.setTextFont(textView, com.inshort.base.R.font.sofia_pro_medium);
        textView.setPadding(PhoneCompat.dp2px(requireContext(), 10), 0, PhoneCompat.dp2px(requireContext(), 10), 0);
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        drawable.setColor(DataCompat.getColor(requireContext(), com.inshort.base.R.color.color_FFEEEEEE));
        ViewCompat.setBackground(textView, drawable);
        textView.setTag(text);
        textView.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                UICompat.setText(mViewBinding.aetContent, text);
                mViewBinding.aetContent.setSelection(text.length());
                // SearchHistoryDataStore.get().putData(text);
                clickSearch();
            }
        });
        return textView;
    }

    private void updateSearchHistoryView() {
        List<String> data = SearchHistoryDataStore.get().getData();
        LogUtils.w("updateSearchHistoryView", data + "");
        if (mHeadViewBinding != null) {
            mHeadViewBinding.cgHistoryParent.removeAllViews();
            for (String text : data) {
                mHeadViewBinding.cgHistoryParent.addView(createHistoryTextView(text));
            }
            if (CollectionCompat.getListSize(data) > 0) {
                mHeadViewBinding.clSearchHistoryParent.setVisibility(View.VISIBLE);
            } else {
                mHeadViewBinding.clSearchHistoryParent.setVisibility(View.GONE);
            }
        }


    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }

    @Override
    protected void onClickEmptyView(@NonNull View view) {
        loadSmartData();
    }
}
