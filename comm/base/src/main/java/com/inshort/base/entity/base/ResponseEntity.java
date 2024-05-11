package com.inshort.base.entity.base;

import androidx.annotation.Nullable;

public class ResponseEntity<T> {
    public int code;
    @Nullable
    public String message;
    @Nullable
    public T data;
}
