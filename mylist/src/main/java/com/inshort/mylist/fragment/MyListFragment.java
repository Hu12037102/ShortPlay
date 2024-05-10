package com.inshort.mylist.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.mylist.databinding.FragmentMyListBinding;
import com.inshort.mylist.viewmodel.MyListViewModel;
@Route(path = ARouterConfig.Path.MyList.FRAGMENT_MYLIST)
public class MyListFragment extends BaseCompatFragment<FragmentMyListBinding, MyListViewModel> {
    @Override
    protected FragmentMyListBinding getViewBinding() {
        return FragmentMyListBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MyListViewModel> getViewModelClass() {
        return MyListViewModel.class;
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
