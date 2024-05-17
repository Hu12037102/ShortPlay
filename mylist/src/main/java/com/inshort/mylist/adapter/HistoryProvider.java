package com.inshort.mylist.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.Postcard;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.TemporaryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.utils.ViewEmptyUtil;
import com.inshort.base.view.WrapContentLinearLayoutManager;
import com.inshort.mylist.R;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class HistoryProvider extends BaseItemProvider<TemporaryEntity> {

    private ProviderIHistoryItemAdapter mAdapter;

    @Override
    public int getItemViewType() {
        return ARouterConfig.Key.LIST_HISTORY;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_my_list_history;
    }

    @Override
    public void convert(@NonNull BaseViewHolder baseViewHolder, TemporaryEntity temporaryEntity) {
        if(temporaryEntity.getData().getPlaybackHistory()!=null && temporaryEntity.getData().getPlaybackHistory().size() > 0){
            LogUtils.d("HistoryProvider >> ","HistoryProvider"+temporaryEntity.getData().getPlaybackHistory().size());
            if(viewStub!=null)viewStub.setVisibility(View.GONE);
            mAdapter.setList(temporaryEntity.getData().getPlaybackHistory());


            //播放页面
            mAdapter.setOnItemClickListener((adapter, view, position) -> {

            });


            //跳转至更多
            baseViewHolder.getView(R.id.more_history).setOnClickListener(v -> {
                Postcard postcard = ARouters.build(ARouterConfig.Path.MyList.ACTIVITY_BACK_HIS);
                if (postcard != null) {
                    postcard.withBoolean(ARouterConfig.Key.IS_HIS, true).navigation();
                }
            });
        }else {
            showHisEmpty(baseViewHolder);
        }
    }

    @Override
    public void onViewHolderCreated(@NonNull BaseViewHolder viewHolder, int viewType) {
        super.onViewHolderCreated(viewHolder, viewType);
        RecyclerView mRecyclerView = viewHolder.getView(R.id.history_rv);
        mAdapter = new ProviderIHistoryItemAdapter(R.layout.fragment_my_list_item_history);
        mRecyclerView.setLayoutManager(new WrapContentLinearLayoutManager(context, RecyclerView.HORIZONTAL,false));
        mRecyclerView.setAdapter(mAdapter);
    }

    private ViewStub viewStub;
    private void showHisEmpty(BaseViewHolder helper){
        helper.setVisible(R.id.more_history,false);
        helper.setVisible(R.id.history_rv,false) ;
        if(viewStub == null){
           viewStub = ViewEmptyUtil.showEmpty(helper,context.getResources().getString(com.inshort.base.R.string.no_data_hitory),R.id.view_stub);
        }else {
            viewStub.setVisibility(View.VISIBLE);
        }
    }
}
