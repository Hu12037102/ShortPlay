package com.inshort.base.weight.imp;

import android.view.View;

import androidx.annotation.Nullable;

public interface OnItemClickListener<T> {
     void  onItemClick(@Nullable View view, @Nullable T t);
}
