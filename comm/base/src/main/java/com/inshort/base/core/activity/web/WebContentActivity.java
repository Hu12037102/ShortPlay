package com.inshort.base.core.activity.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.viewmodel.BaseCompatViewModel;
import com.inshort.base.databinding.ActivityWebContentBinding;
import com.inshort.base.other.arouter.ARouterConfig;
@Route(path = ARouterConfig.Path.Comm.ACTIVITY_WEB_CONTENT)
public class WebContentActivity extends BaseWebActivity<ActivityWebContentBinding, BaseCompatViewModel> {
    @Nullable
    private String mWebTitle = null;
    @Nullable
    private String mWebUrl = null;

    @Override
    protected ActivityWebContentBinding getViewBinding() {
        return ActivityWebContentBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<BaseCompatViewModel> getViewModelClass() {
        return BaseCompatViewModel.class;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            mWebTitle = intent.getStringExtra(ARouterConfig.Key.WEB_TITLE);
            UICompat.setText(mViewBinding.pvTitle.getCenterView(), mWebTitle);
            mWebUrl = intent.getStringExtra(ARouterConfig.Key.WEB_URL);
        }

        loadUrl(mWebUrl);

    }

    @Override
    protected void initEvent() {
        mViewBinding.webView.setWebViewClient(mWebViewClient);
        mViewBinding.webView.setWebChromeClient(mWebChromeClient);
    }

    private final WebViewClient mWebViewClient = new WebViewClient() {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Uri uri = request.getUrl();
            try {
                if (uri != null) {
                    String scheme = uri.getScheme();
                    if (!TextUtils.isEmpty(scheme) && scheme.toLowerCase().startsWith("http")) {
                        loadUrl(uri.toString());
                    } else {
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(view, request);
        }
    };
    private final WebChromeClient mWebChromeClient = new WebChromeClient() {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                mViewBinding.pbSchedule.setProgress(newProgress, true);
            } else {
                mViewBinding.pbSchedule.setProgress(newProgress);
            }
            if (newProgress >= mViewBinding.pbSchedule.getMax()) {
                mViewBinding.pbSchedule.setVisibility(View.GONE);
            } else {
                mViewBinding.pbSchedule.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            if (!TextUtils.isEmpty(title) && TextUtils.isEmpty(mWebTitle)) {
                UICompat.setText(mViewBinding.pvTitle.getCenterView(), title);
            }

        }
    };

    @Override
    protected WebView getWebView() {
        return mViewBinding.webView;
    }
}
