package com.inshort.base.compat;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;

import kotlin.text.Charsets;

public  final class WebViewCompat {
    private WebViewCompat(){}
    @SuppressLint("SetJavaScriptEnabled")
    public static void init(@Nullable WebView webView){
        if (webView== null){
            return;
        }
       WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(true);
        if (NetworkCompat.isNetWorkAvailable()){
            webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        }else {
            webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }
        webSettings.setAllowFileAccess(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setDefaultTextEncodingName(Charsets.UTF_8.name());
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setMediaPlaybackRequiresUserGesture(true);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
    }

}
