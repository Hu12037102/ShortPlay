package com.inshort.base.weight.click;

import android.view.View;

public abstract class DelayedClick implements View.OnClickListener {
    public DelayedClick(){

    }
    public DelayedClick(int timeLength){
        this.mTimeLength = timeLength;
    }
    private  int mTimeLength =1000;
    private long mLastTimeMills =0L;

    @Override
    public void onClick(View v) {
        long newTimeMills = System.currentTimeMillis();
        if (newTimeMills - mLastTimeMills>mTimeLength){
            onDelayedClick(v);
        }
        mLastTimeMills = newTimeMills;

    }
    public abstract void onDelayedClick(View view);
}
