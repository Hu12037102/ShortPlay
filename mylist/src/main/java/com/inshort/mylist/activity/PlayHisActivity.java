package com.inshort.mylist.activity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.AdapterCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.view.WrapContentLinearLayoutManager;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.mylist.R;
import com.inshort.mylist.adapter.PlayHisAdapter;
import com.inshort.mylist.callback.PlayHisClickCallBack;
import com.inshort.mylist.databinding.ActivityPlayHisBinding;
import com.inshort.mylist.viewmodel.PlayHisViewModel;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/15
 */
@Route(path = ARouterConfig.Path.MyList.ACTIVITY_BACK_HIS)
public class PlayHisActivity  extends BaseCompatActivity<ActivityPlayHisBinding,PlayHisViewModel> implements PlayHisClickCallBack {

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
        mViewBinding.titleAtv.setText(getBackTitle());
        mAdapter = new PlayHisAdapter(R.layout.adapter_play_his,isHis,this);
        mViewBinding.hisRv.setLayoutManager(getLayoutManager());
        mViewBinding.hisRv.setAdapter(mAdapter);
    }

    @Override
    protected void initData() {

    }
    @Override
    protected void initEvent() {
        mViewBinding.blackAiv.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                ViewsCompat.finishSetResult(PlayHisActivity.this);
            }
        });

        mViewBinding.editTv.setOnClickListener(v -> {
                isShowDelete();
        });

        //select
        mViewBinding.selectAiv.setOnClickListener(v -> {
            isSelectAll();
        });

        //delete
        mViewBinding.deleteAtv.setOnClickListener(v -> {

        });


    }


    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getBackLiveData().observe(this, collectData -> {
            AdapterCompat.notifyAdapterAddDateChanged(mEmptyLayout,mAdapter,true,mAdapter.getData(),collectData,null);
           // mAdapter.setList(collectData);
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

    private void isShowDelete(){
        if(mViewBinding.editTv.getText().toString().equals(getResources().getString(com.inshort.base.R.string.edit))){
            mViewBinding.editTv.setText(getResources().getString(com.inshort.base.R.string.cancel));
            mViewBinding.deleteCl.setVisibility(View.VISIBLE);
            mViewBinding.blackAiv.setVisibility(View.GONE);
            showDeleteLogo(true,false);
        }else {
            mViewBinding.editTv.setText(getResources().getString(com.inshort.base.R.string.edit));
            mViewBinding.deleteCl.setVisibility(View.GONE);
            mViewBinding.blackAiv.setVisibility(View.VISIBLE);
            showDeleteLogo(false,false);
        }
    }

    private void isSelectAll(){
        if(mViewBinding.selectAiv.getText().toString().equals(getResources().getString(com.inshort.base.R.string.select_all))){
            mViewBinding.selectAiv.setText(getResources().getString(com.inshort.base.R.string.deselect_all));
            mViewBinding.selectAiv.setTextColor(Color.BLACK);
            mViewBinding.deleteAtv.setTextColor(getResources().getColor(com.inshort.base.R.color.color_FE2442));
            showDeleteLogo(true,true);
        }else {
            mViewBinding.selectAiv.setText(getResources().getString(com.inshort.base.R.string.select_all));
            mViewBinding.selectAiv.setTextColor(getResources().getColor(com.inshort.base.R.color.color_999999));
            mViewBinding.deleteAtv.setTextColor(Color.BLACK);
            showDeleteLogo(true,false);
        }


    }

    @SuppressLint("NotifyDataSetChanged")
    private void showDeleteLogo(boolean isState, boolean isDelete){
        List<MyListEntity.CollectData> data = mAdapter.getData();
        if(data!=null && data.size() > 0){
            for (int i = 0; i < data.size() ; i++) {
                data.get(i).setState(isState);
                data.get(i).setDelete(isDelete);
            }
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void deleteClick() {
        List<MyListEntity.CollectData> data = mAdapter.getData();
        if(data!=null && data.size() > 0){
            int num = data.size();
            int selectNum = 0;
            for (int i = 0; i <num ; i++) {
                if(data.get(i).isDelete()){
                    selectNum++;
                }else {
                    selectNum--;
                }
            }
            deleteItemClickShowView(num,selectNum);
        }
    }

    @Override
    public void loveClick() {

    }

    private void deleteItemClickShowView(int num,int selectNum){
        LogUtils.d("deleteItemClickShowView","num >> "+num+"========selectNum >> "+selectNum);
        if(num+selectNum > 0){
            mViewBinding.deleteAtv.setTextColor(getResources().getColor(com.inshort.base.R.color.color_FE2442));
        }else {
            mViewBinding.deleteAtv.setTextColor(Color.BLACK);
        }
        if(num == selectNum){
            mViewBinding.selectAiv.setText(getResources().getString(com.inshort.base.R.string.deselect_all));
            mViewBinding.selectAiv.setTextColor(Color.BLACK);
        }else {
            mViewBinding.selectAiv.setText(getResources().getString(com.inshort.base.R.string.select_all));
            mViewBinding.selectAiv.setTextColor(getResources().getColor(com.inshort.base.R.color.color_999999));
        }
    }

    @Override
    protected boolean isLoadEmptyView() {
        return true;
    }
}
