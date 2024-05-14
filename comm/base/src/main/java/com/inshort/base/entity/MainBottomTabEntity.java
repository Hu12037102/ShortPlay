package com.inshort.base.entity;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MainBottomTabEntity {
    public static final int TYPE_HOME = 1;
    public static final int TYPE_SEARCH = 2;
    public static final int TYPE_MY_LIST = 3;
    public static final int TYPE_ME = 4;
    @DrawableRes
    public int normalRes;
    @DrawableRes
    public int selectorRes;
    @Nullable
    public String content;
    @IntRange(from = 1, to = 4)
    public int type;
    public boolean isSelector;
    @NonNull
    public String fragmentPath="";

}
