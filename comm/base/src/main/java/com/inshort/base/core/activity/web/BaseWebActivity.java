package com.inshort.base.core.activity.web;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

import com.inshort.base.compat.WebViewCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;

public abstract class BaseWebActivity<VB extends ViewBinding, VM extends BaseCompatViewModel> extends BaseCompatActivity<VB, VM> {
    @Nullable
    private WebView mWebView = null;

    @Override
    protected void init() {
        mWebView = getWebView();
        super.init();
    }

    protected void loadUrl(@Nullable String url) {
        if (TextUtils.isEmpty(url) || mWebView == null) {
            return;
        }
        WebViewCompat.init(mWebView);
        mWebView.loadUrl(url);
    }

    protected abstract WebView getWebView();


    @Override
    protected void onResume() {
        super.onResume();
        if (mWebView != null) {
            mWebView.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mWebView != null) {
            mWebView.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        if (mWebView != null) {
            ViewParent viewParent = mWebView.getParent();
            if (viewParent instanceof ViewGroup viewGroup){
                viewGroup.removeView(mWebView);
                mWebView.destroy();
            }
        }
        super.onDestroy();
    }
}
