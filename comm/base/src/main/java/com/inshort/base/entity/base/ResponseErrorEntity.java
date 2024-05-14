package com.inshort.base.entity.base;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

public class ResponseErrorEntity {
    public int code;
    @Nullable
    public LiveData<?> liveData;

}
