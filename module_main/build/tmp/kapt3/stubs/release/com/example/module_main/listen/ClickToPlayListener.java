package com.example.module_main.listen;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/10/11
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/module_main/listen/ClickToPlayListener;", "", "onClick", "", "data", "Lcom/example/lib_http/bean/data/PlayRequestData;", "module_main_release"})
public abstract interface ClickToPlayListener {
    
    public abstract void onClick(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayRequestData data);
}