package com.inshort.base.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.inshort.base.R;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;

/**
 * @author: 张勇
 * @date: 2024/5/15
 */
public class ViewEmptyUtil {

    public static ViewStub showEmpty(BaseViewHolder helper,String title,int id){
        ViewStub viewStub = helper.getView(id);
        View view = viewStub.inflate();
        TextView titleTv = view.findViewById(R.id.title_tv);
        TextView moreTv = view.findViewById(R.id.more_history_riv);
        titleTv.setText(title);
        moreTv.setVisibility(View.VISIBLE);
        moreTv.setOnClickListener(v -> {
            ARouters.startActivity(ARouterConfig.Path.MyList.ACTIVITY_BACK_HIS);
        });
        return viewStub;
    }
}
