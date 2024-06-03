package com.inshort.mylist.fragment;

import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.inshort.base.compat.AdapterCompat;

import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.entity.TemporaryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.view.WrapContentLinearLayoutManager;
import com.inshort.mylist.R;
import com.inshort.mylist.adapter.PlayHisAdapter;
import com.inshort.mylist.callback.PlayHisClickCallBack;
import com.inshort.mylist.databinding.FragmentHisBinding;
import com.inshort.mylist.viewmodel.HisViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/16
 */
public class HisFragment extends BaseCompatFragment<FragmentHisBinding,HisViewModel> implements PlayHisClickCallBack {

    public static final String HIS_TYPE="his_type";
    public int mType = 0;  //0 == 历史  1 == 喜爱
    private PlayHisAdapter mAdapter;
    public static HisFragment getSingle(int type){
        HisFragment fragment = new HisFragment();
        Bundle args = new Bundle();
        args.putInt(HIS_TYPE,type);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected FragmentHisBinding getViewBinding() {
        return FragmentHisBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<HisViewModel> getViewModelClass() {
        return HisViewModel.class;
    }

    @Override
    protected void initView() {
        if(getArguments()!=null){mType = getArguments().getInt(HIS_TYPE,0);}
        mAdapter = new PlayHisAdapter(R.layout.adapter_play_his,mType==1,this);
        mViewBinding.hisRv.setLayoutManager(getLayoutManager());
        mViewBinding.hisRv.setAdapter(mAdapter);
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
        mViewModel.getBackLiveData().observe(this, collectData -> {
          //  mAdapter.setList(collectData);
            AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout,mAdapter,true,mAdapter.getData(),collectData,null);
        });
    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }


    @Override
    public void onResume() {
        super.onResume();
        LogUtils.d("MyListFragment","MyListFragment onResume >> ");
        if(mType == 1){
            mViewModel.requestHisData();
        }else {
            mViewModel.requestLoveData();
        }
    }

    private RecyclerView.LayoutManager getLayoutManager(){
        if(mType == 1){
            return new WrapContentLinearLayoutManager(getContext());
        }else {
            return new GridLayoutManager(getContext(),3);
        }
    }

    @Override
    public void deleteClick() {

    }

    @Override
    public void loveClick() {

    }
}
