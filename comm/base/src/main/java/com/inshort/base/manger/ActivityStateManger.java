package com.inshort.base.manger;

import android.app.Activity;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public final class ActivityStateManger {

    private static final ActivityStateManger mInstance = new ActivityStateManger();

    private ActivityStateManger() {

    }

    public static ActivityStateManger getInstance() {
        return mInstance;
    }

    private List<Activity> mActivityList = new ArrayList<>();

    public void create(@Nullable Activity activity) {
        if (activity != null) {
            mActivityList.add(activity);
        }
    }

    public int getSize() {
        return mActivityList.size();
    }




    public void destroyed(@Nullable Activity activity) {
        if (activity != null) {
            mActivityList.remove(activity);
        }
    }


}
