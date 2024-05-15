package com.inshort.mylist.activity;

import android.view.View;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.view.WrapContentLinearLayoutManager;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.mylist.R;
import com.inshort.mylist.adapter.PlayHisAdapter;
import com.inshort.mylist.databinding.ActivityPlayHisBinding;
import com.inshort.mylist.viewmodel.PlayHisViewModel;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/15
 */
@Route(path = ARouterConfig.Path.MyList.ACTIVITY_BACK_HIS)
public class PlayHisActivity  extends BaseCompatActivity<ActivityPlayHisBinding,PlayHisViewModel> {

    private PlayHisAdapter mAdapter;
    private boolean isHis = false;

    @Override
    protected ActivityPlayHisBinding getViewBinding() {
        return ActivityPlayHisBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<PlayHisViewModel> getViewModelClass() {
        return PlayHisViewModel.class;
    }

    @Override
    protected void initView() {
        isHis = getIntent().getBooleanExtra(ARouterConfig.Key.IS_HIS,false);
        mViewBinding.pvTitle.getCenterView().setText(getBackTitle());
        mAdapter = new PlayHisAdapter(R.layout.adapter_play_his,isHis);
        mViewBinding.hisRv.setLayoutManager(getLayoutManager());
        mViewBinding.hisRv.setAdapter(mAdapter);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {
        mViewBinding.pvTitle.getLeftView().setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                ViewsCompat.finishSetResult(PlayHisActivity.this);
            }
        });
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getBackLiveData().observe(this, collectData -> {
            mAdapter.setList(collectData);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(isHis){
            mViewModel.requestHisData();
        }else {
            mViewModel.requestLoveData();
        }
    }

    private RecyclerView.LayoutManager getLayoutManager(){
        if(isHis){
            return new WrapContentLinearLayoutManager(this);
        }else {
            return new GridLayoutManager(this,3);
        }
    }

    private String getBackTitle(){
        if(isHis){
           return getResources().getString(com.inshort.base.R.string.history);
        }else {
            return getResources().getString(com.inshort.base.R.string.love);
        }
    }
}
