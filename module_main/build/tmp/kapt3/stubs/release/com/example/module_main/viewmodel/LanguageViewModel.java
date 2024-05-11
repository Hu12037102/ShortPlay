package com.example.module_main.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/module_main/viewmodel/LanguageViewModel;", "Lcom/example/lib_common/vm/CommonViewModel;", "()V", "mSwitchLanguageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getMSwitchLanguageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getLanguageList", "Ljava/util/ArrayList;", "Lcom/example/lib_http/bean/data/LanguageData;", "Lkotlin/collections/ArrayList;", "switchLanguage", "", "languageCode", "", "position", "module_main_release"})
public final class LanguageViewModel extends com.example.lib_common.vm.CommonViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mSwitchLanguageLiveData = null;
    
    public LanguageViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMSwitchLanguageLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.lib_http.bean.data.LanguageData> getLanguageList() {
        return null;
    }
    
    public final void switchLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, int position) {
    }
}