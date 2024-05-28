package com.inshort.base.manger;

import android.app.Activity;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ActivityStateManger {

    private static final ActivityStateManger mInstance = new ActivityStateManger();

    private ActivityStateManger() {

    }

    public static ActivityStateManger getInstance() {
        return mInstance;
    }

    private final List<Activity> mActivityList = new ArrayList<>();

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

    public void removeAllActivity() {
        Iterator<Activity> iterator = mActivityList.iterator();
        while (iterator.hasNext()) {
            Activity activity = iterator.next();
            if (!activity.isFinishing()) {
                activity.finish();
            }
            iterator.remove();
        }
    }


}
