package com.inshort.base.core.viewmodel

import androidx.lifecycle.MutableLiveData
import com.inshort.base.entity.SearchHandEntity

class AppViewModel : BaseCompatViewModel() {
    val homeKeywordLiveData= MutableLiveData<SearchHandEntity>()
    val mainTabTypeSelectorLiveData = MutableLiveData<Int>()

}