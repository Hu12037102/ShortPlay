package com.inshort.mylist.adapter;

import android.view.View;
import android.view.ViewStub;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.Postcard;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.entity.TemporaryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.utils.ViewEmptyUtil;
import com.inshort.mylist.R;

/**
 * @author: 张勇
 * @date: 2024/5/14
 */
public class LoveProvider extends BaseItemProvider<TemporaryEntity> {
    private ProviderILoveItemAdapter mAdapter;

    @Override
    public int getItemViewType() {
        return ARouterConfig.Key.LIST_LOVE;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_my_list_love;
    }

    @Override
    public void convert(@NonNull BaseViewHolder baseViewHolder, TemporaryEntity temporaryEntity) {
        if(temporaryEntity.getData().getMyList()!=null && temporaryEntity.getData().getMyList().size() > 0){
            if(viewStub!=null)viewStub.setVisibility(View.GONE);
            mAdapter.setList(temporaryEntity.getData().getMyList());


            //播放页面
            mAdapter.setOnItemClickListener((adapter, view, position) -> {

            });


            //跳转至更多
            baseViewHolder.getView(R.id.more_my_list).setOnClickListener(v -> {
                Postcard postcard = ARouters.build(ARouterConfig.Path.MyList.ACTIVITY_BACK_HIS);
                if (postcard != null) {
                    postcard.withBoolean(ARouterConfig.Key.IS_HIS, false).navigation();
                }
            });
        }else {
            showLoveEmpty(baseViewHolder);
        }

    }

    @Override
    public void onViewHolderCreated(@NonNull BaseViewHolder viewHolder, int viewType) {
        super.onViewHolderCreated(viewHolder, viewType);
        RecyclerView mRecyclerView = viewHolder.getView(R.id.my_list_item_rv);
        mAdapter = new ProviderILoveItemAdapter(R.layout.fragment_my_list_item_love);
        mRecyclerView.setLayoutManager(new GridLayoutManager(context,3));
        mRecyclerView.setAdapter(mAdapter);
    }


    private ViewStub viewStub;
    private void showLoveEmpty(BaseViewHolder helper){
        helper.setVisible(R.id.more_my_list,false);
        helper.setVisible(R.id.my_list_item_rv,false) ;
        if(viewStub == null){
            viewStub = ViewEmptyUtil.showEmpty(helper,context.getResources().getString(com.inshort.base.R.string.no_data_love),R.id.view_stub);
        }else {
            viewStub.setVisibility(View.VISIBLE);
        }
    }
}
