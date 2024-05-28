package com.inshort.play.aliyun.adapter.manager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author: 张勇
 * @date: 2024/5/22
 */
public class PlayVideoStandardListManager  extends PlayVideoLayoutManager implements View.OnTouchListener{
    public PlayVideoStandardListManager(Context context) {
        super(context);
    }

    public PlayVideoStandardListManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public PlayVideoStandardListManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
