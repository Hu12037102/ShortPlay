package com.inshort.home.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.home.databinding.FragmentHomeBinding;
import com.inshort.home.viewmodel.HomeViewModel;

@Route(path = ARouterConfig.Path.Home.FRAGMENT_HOME)
public class HomeFragment extends BaseCompatFragment<FragmentHomeBinding, HomeViewModel> {
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

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}
