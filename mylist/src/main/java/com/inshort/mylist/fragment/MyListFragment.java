package com.inshort.mylist.fragment;

import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.entity.TemporaryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.view.WrapContentLinearLayoutManager;
import com.inshort.mylist.adapter.MyListAdapter;
import com.inshort.mylist.databinding.FragmentMyListBinding;
import com.inshort.mylist.viewmodel.MyListViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.MyList.FRAGMENT_MYLIST)
public class MyListFragment extends BaseCompatFragment<FragmentMyListBinding, MyListViewModel> {
    private MyListAdapter mAdapter;
    private int listType = 1;

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
        mViewBinding.myListRv.setLayoutManager(new WrapContentLinearLayoutManager(getActivity()));
        mAdapter = new MyListAdapter();
        mViewBinding.myListRv.setAdapter(mAdapter);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getMyListLiveData().observe(this, new Observer<MyListEntity>() {
            @Override
            public void onChanged(MyListEntity myListEntity) {
                LogUtils.d("");
                List<TemporaryEntity> data = new ArrayList<TemporaryEntity>();
                LogUtils.d("onChanged","myListEntity >> "+myListEntity.getPlaybackHistory());
                data.add(new TemporaryEntity(myListEntity,ARouterConfig.Key.LIST_HISTORY));
                data.add(new TemporaryEntity(myListEntity,ARouterConfig.Key.LIST_LOVE));
                mAdapter.setList(data);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtils.d("MyListFragment","MyListFragment onResume >> ");
        mViewModel.requestMyList(listType);
    }
}
