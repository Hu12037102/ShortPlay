package com.inshort.search.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.search.databinding.FragmentSearchBinding;
import com.inshort.search.viewmodel.SearchViewModel;

@Route(path = ARouterConfig.Path.Search.FRAGMENT_SEARCH)
public class SearchFragment extends BaseCompatFragment<FragmentSearchBinding, SearchViewModel> {
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

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}
