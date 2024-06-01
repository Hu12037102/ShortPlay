package com.inshort.login.activity;

import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.weight.text.SpanTextHelper;
import com.inshort.login.databinding.ActivityLoginBinding;
import com.inshort.login.viewmodel.LoginViewModel;

/**
 * @author: 张勇
 * @date: 2024/5/21
 */
@Route(path = ARouterConfig.Path.Login.LOGIN_ACTIVITY_LOGIN)
public class LoginActivity extends BaseCompatActivity<ActivityLoginBinding, LoginViewModel> {
    private static final int SIGN_GOOGLE_LOGIN = 1000;

    private GoogleSignInClient client;
    @Override
    protected ActivityLoginBinding getViewBinding() {
        return ActivityLoginBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<LoginViewModel> getViewModelClass() {
        return LoginViewModel.class;
    }

    @Override
    protected void initView() {
        initGoogleLogin();
        ViewsCompat.hideStatusBar(getWindow());
        GlideCompat.loadImage(com.inshort.base.R.mipmap.icon_splash_background, mViewBinding.loginAivBg);
    }

    @Override
    protected void initData() {
        SpanTextHelper.with().append(getString(com.inshort.base.R.string.login_agreemen_1))
                .append(getString(com.inshort.base.R.string.login_agreemen_2))
                .setClick(ContextCompat.getColor(this,com.inshort.base.R.color.color_000000_60), view -> {
                    //terms of service
                    LogUtils.d("initData","terms of service");

                })
                .append(getString(com.inshort.base.R.string.login_agreemen_3))
                .append(getString(com.inshort.base.R.string.login_agreemen_4))
                .setClick(ContextCompat.getColor(this,com.inshort.base.R.color.color_000000_60), view -> {
                    //privacy policy
                    LogUtils.d("initData","privacy policy");

                }).crete(mViewBinding.agreemenAtv);
    }

    @Override
    protected void initEvent() {
        mViewBinding.blackAiv.setOnClickListener(v -> {
            ViewsCompat.finishSetResult(LoginActivity.this);
        });

        mViewBinding.signLogin.setOnClickListener(v -> {
            signLoginGoogle();
        });

    }


    private void initGoogleLogin(){
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestId()
                .requestProfile()
                .requestIdToken("fdfasdfsfsfsf")
                .requestEmail()
                .build();
        client = GoogleSignIn.getClient(this,googleSignInOptions);
        client.silentSignIn();
    }


    private void signLoginGoogle(){
        if(client!=null){
            startActivityForResult(client.getSignInIntent(),SIGN_GOOGLE_LOGIN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SIGN_GOOGLE_LOGIN && resultCode !=0){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            responseGoogleData(task);
        }
    }

    private void responseGoogleData(Task<GoogleSignInAccount> task){
        try {
            GoogleSignInAccount signInAccount = task.getResult(ApiException.class);
            if(signInAccount!=null && !TextUtils.isEmpty(signInAccount.getIdToken())){
                //登录
            }
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
