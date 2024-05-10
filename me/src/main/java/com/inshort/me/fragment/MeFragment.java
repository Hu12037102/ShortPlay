package com.inshort.me.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.me.databinding.FragmentMeBinding;
import com.inshort.me.viewmodel.MeViewModel;

@Route(path = ARouterConfig.Path.Me.FRAGMENT_ME)
public class MeFragment extends BaseCompatFragment<FragmentMeBinding, MeViewModel> {
    @Override
    protected FragmentMeBinding getViewBinding() {
        return FragmentMeBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MeViewModel> getViewModelClass() {
        return MeViewModel.class;
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
