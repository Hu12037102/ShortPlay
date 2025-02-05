package com.inshort.me.activity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DialogCompat;
import com.inshort.base.compat.FileCompat;
import com.inshort.base.compat.NumberCompat;
import com.inshort.base.compat.PackageInfoCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.dialog.comm.PrivacyAgreementDialog;
import com.inshort.base.core.dialog.comm.TitleDialog;
import com.inshort.base.entity.InitEntity;

import com.inshort.base.entity.UserEntity;
import com.inshort.base.http.IApiService;
import com.inshort.base.manger.ActivityStateManger;
import com.inshort.base.other.arouter.ARouterActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.mmkv.InitDataStore;
import com.inshort.base.other.mmkv.MMKVCompat;
import com.inshort.base.other.mmkv.SearchHistoryDataStore;
import com.inshort.base.other.mmkv.UserDataStore;
import com.inshort.base.utils.LogUtils;

import com.inshort.base.weight.click.DelayedClick;
import com.inshort.base.weight.imp.OnItemClickListener;
import com.inshort.me.databinding.ActivitySettingBinding;
import com.inshort.me.dialog.DeleteAccountDialog;
import com.inshort.me.viewmodel.SettingViewModel;

@Route(path = ARouterConfig.Path.Me.ACTIVITY_SETTING)
public class SettingActivity extends BaseCompatActivity<ActivitySettingBinding, SettingViewModel> {
    @Override
    protected ActivitySettingBinding getViewBinding() {
        return ActivitySettingBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<SettingViewModel> getViewModelClass() {
        return SettingViewModel.class;
    }

    @Override
    protected void initView() {
        ViewCompat.setBackground(mViewBinding.atvSignOut, getSignOutBackground());

    }

    @Override
    protected void initData() {
        UICompat.setText(mViewBinding.atvVersionRight, DataCompat.getResString(this, com.inshort.base.R.string.version_s, PackageInfoCompat.getVersionName(this)));
        UICompat.setText(mViewBinding.atvClearCacheRight, NumberCompat.getB2M(FileCompat.getCacheFileLength()));
        updateDisplayWitchingView();
        UserEntity.Info userInfo = UserDataStore.get().getInfo();
        if (DataCompat.notNull(userInfo)) {
            if (userInfo.platform == UserEntity.Info.PLATFORM_DEFAULT) {
                mViewBinding.atvSignOut.setVisibility(View.GONE);
            } else {
                mViewBinding.atvSignOut.setVisibility(View.VISIBLE);
            }
        }


    }

    private void updateDisplayWitchingView() {
        if (MMKVCompat.isOpenWatching()) {
            mViewBinding.atvDisplayHomeRight.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.inshort.base.R.mipmap.icon_item_open, 0);
        } else {
            mViewBinding.atvDisplayHomeRight.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.inshort.base.R.mipmap.icon_item_close, 0);
        }
    }

    @Override
    protected void initEvent() {
        mViewBinding.atvDisplayHomeRight.setOnClickListener(v -> {
            boolean isOpenWatching = MMKVCompat.isOpenWatching();
            MMKVCompat.setOpenWatching(!isOpenWatching);
            updateDisplayWitchingView();
        });
        mViewBinding.clItemTermsService.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                if (MMKVCompat.getPrivacyAgreementStatus() == MMKVCompat.PRIVACY_AGREEMENT_STATUS_AGREE) {
                    ARouterActivity.startToWebContentActivity(IApiService.Url.TERMS_SERVICE,
                            DataCompat.getResString(SettingActivity.this, com.inshort.base.R.string.terms_of_service_content));
                } else {
                    Fragment fragment = ARouters.getFragment(ARouterConfig.Path.Comm.DIALOG_PRIVACY_AGREEMENT);
                    DialogCompat.showDialogFragment(fragment, getSupportFragmentManager());
                    if (fragment instanceof PrivacyAgreementDialog privacyAgreementDialog) {
                        privacyAgreementDialog.setOnDialogInfoListener(new BaseCompatDialog.OnDialogInfoListener() {
                            @Override
                            public void onClickSure(View view, @Nullable Object object) {
                                privacyAgreementDialog.dismiss();
                                MMKVCompat.putPrivacyAgreementStatus(MMKVCompat.PRIVACY_AGREEMENT_STATUS_AGREE);
                                ARouterActivity.startToWebContentActivity(IApiService.Url.TERMS_SERVICE,
                                        DataCompat.getResString(SettingActivity.this, com.inshort.base.R.string.terms_of_service_content));
                            }

                            @Override
                            public void onClickCancel(View view, @Nullable Object obj) {
                                privacyAgreementDialog.dismiss();
                            }
                        });
                    }
                }

                ARouterActivity.startToWebContentActivity(IApiService.Url.TERMS_SERVICE,
                        DataCompat.getResString(SettingActivity.this, com.inshort.base.R.string.terms_of_service_content));
            }
        });
        mViewBinding.clItemPrivacyPolicy.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                ARouterActivity.startToWebContentActivity(IApiService.Url.PRIVACY_AGREEMENT,
                        DataCompat.getResString(SettingActivity.this, com.inshort.base.R.string.privacy_policy_content));
            }
        });
        mViewBinding.clItemDeleteAccount.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                Object dialog = ARouters.getFragment(ARouterConfig.Path.Me.DIALOG_DELETE_ACCOUNT);
                DialogCompat.showDialogFragment(dialog, getSupportFragmentManager());
                if (dialog instanceof DeleteAccountDialog deleteAccountDialog) {
                    deleteAccountDialog.setOnDeleteClickListener((view1, o) -> {
                        mViewModel.deleteAccount();
                    });
                }
            }
        });
        mViewBinding.atvSignOut.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                showSignOutDialog();
            }
        });
        mViewBinding.clItemClearCache.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                showClearCacheDialog();
            }
        });

        mViewBinding.clItemVersion.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                InitEntity initEntity = InitDataStore.get().getData();
                int currentVersionCode = PackageInfoCompat.getVersionCode(SettingActivity.this);
                if (initEntity != null && initEntity.updateInfo != null && initEntity.updateInfo.version > currentVersionCode) {
                    Object object = ARouters.build(ARouterConfig.Path.Comm.DIALOG_VERSION_UPDATING)
                            .withParcelable(ARouterConfig.Key.PARCELABLE, initEntity.updateInfo)
                            .navigation();
                    DialogCompat.showDialogFragment(object, getSupportFragmentManager());
                } else {
                    mViewModel.showToast(DataCompat.getResString(SettingActivity.this, com.inshort.base.R.string.you_are_already_the_latest_version_content));
                }
            }
        });

    }


    private void showClearCacheDialog(){
        Object obj = ARouters.getFragment(ARouterConfig.Path.Comm.DIALOG_TITLE);
        if (obj instanceof TitleDialog titleDialog) {
            Bundle bundle = new Bundle();
            bundle.putString(TitleDialog.KEY_TITLE, DataCompat.getResString(this, com.inshort.base.R.string.are_you_sure_you_want_to_clear_your_cache_content));
            bundle.putString(TitleDialog.KEY_LEFT, DataCompat.getResString(this, com.inshort.base.R.string.cancel_content));
            bundle.putString(TitleDialog.KEY_RIGHT, DataCompat.getResString(this, com.inshort.base.R.string.clear_content));
            titleDialog.setArguments(bundle);
            DialogCompat.showDialogFragment(titleDialog, getSupportFragmentManager());
            titleDialog.setOnDialogInfoClickListener(new TitleDialog.OnDialogInfoClickListener() {
                @Override
                public void onClickLeftView(View view) {
                    titleDialog.dismiss();
                }

                @Override
                public void onClickRightView(View view) {
                    mViewModel.clearCache();
                    FileCompat.clearCacheFile();
                    titleDialog.dismiss();
                }
            });
        }
    }

    private void showSignOutDialog() {
        Object obj = ARouters.getFragment(ARouterConfig.Path.Comm.DIALOG_TITLE);
        if (obj instanceof TitleDialog titleDialog) {
            Bundle bundle = new Bundle();
            bundle.putString(TitleDialog.KEY_TITLE, DataCompat.getResString(this, com.inshort.base.R.string.are_you_sure_you_want_to_sign_out_content));
            bundle.putString(TitleDialog.KEY_LEFT, DataCompat.getResString(this, com.inshort.base.R.string.cancel_content));
            bundle.putString(TitleDialog.KEY_RIGHT, DataCompat.getResString(this, com.inshort.base.R.string.sign_out_content));
            titleDialog.setArguments(bundle);
            DialogCompat.showDialogFragment(titleDialog, getSupportFragmentManager());
            titleDialog.setOnDialogInfoClickListener(new TitleDialog.OnDialogInfoClickListener() {
                @Override
                public void onClickLeftView(View view) {
                    titleDialog.dismiss();
                }

                @Override
                public void onClickRightView(View view) {
                    titleDialog.dismiss();
                }
            });
        }
    }

    @Override
    protected void onUserUpdate(@NonNull UserEntity userEntity) {
        super.onUserUpdate(userEntity);
        ActivityStateManger.getInstance().removeAllActivity();
        ARouters.startActivity(ARouterConfig.Path.Main.ACTIVITY_MAIN);
    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getNotResultLiveData().observe(this, new Observer<Object>() {
            @Override
            public void onChanged(Object o) {
                UserDataStore.get().clear();
                mViewModel.initUserLogin();
            }
        });
        mViewModel.getClearCacheLiveData().observe(this, new Observer<Long>() {
            @Override
            public void onChanged(Long size) {
                LogUtils.w("getClearCacheLiveData--",size+"----");
                UICompat.setText(mViewBinding.atvClearCacheRight, NumberCompat.getB2M(size));
                mViewModel.showToast(DataCompat.toString(com.inshort.base.R.string.claer_cache_succeed));
            }
        });
    }

    private Drawable getSignOutBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(DataCompat.getColor(this, com.inshort.base.R.color.color_FFF5F5F5));
        drawable.setCornerRadius(PhoneCompat.dp2px(this, 50));
        return drawable;
    }
}
