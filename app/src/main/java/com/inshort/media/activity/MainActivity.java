package com.inshort.media.activity;

import android.view.View;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.DialogCompat;
import com.inshort.base.compat.NetworkCompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.core.dialog.BaseCompatDialog;
import com.inshort.base.core.dialog.comm.PrivacyAgreementDialog;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.MainBottomTabEntity;
import com.inshort.base.http.IApiService;
import com.inshort.base.other.arouter.ARouterActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.other.mmkv.MMKVCompat;
import com.inshort.base.other.mmkv.MMKVManger;
import com.inshort.base.utils.LogUtils;
import com.inshort.home.fragment.HomeFragment;
import com.inshort.me.activity.SettingActivity;
import com.inshort.me.fragment.MeFragment;
import com.inshort.media.adapter.MainBottomTabAdapter;
import com.inshort.media.databinding.ActivityMainBinding;
import com.inshort.media.viewmodel.MainViewModel;
import com.inshort.mylist.fragment.MyListFragment;
import com.inshort.search.fragment.SearchFragment;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Main.ACTIVITY_MAIN)
public class MainActivity extends BaseCompatActivity<ActivityMainBinding, MainViewModel> {
    @Nullable
    private MainBottomTabAdapter mBottomTabAdapter = null;
    private final List<MainBottomTabEntity> mBottomTabData = new ArrayList<>();
    private final List<BaseCompatFragment<?, ?>> mFragments = new ArrayList<>();
    private long mExitTimeMillis = 0;


    @Override
    protected void initView() {
        ViewsCompat.hideStatusBar(getWindow());
        mViewBinding.rvBottom.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    @Override
    protected void initData() {
        initPrivacyAgreementDialog();
        initBottomTabAdapter();
        initPageAdapter();
        LogUtils.w("initData--", NetworkCompat.getMobileNetType(DataCompat.applicationContext()));
    }

    private void initPrivacyAgreementDialog() {
      int status =  MMKVCompat.getPrivacyAgreementStatus();
      if (status == MMKVCompat.PRIVACY_AGREEMENT_STATUS_UNKNOWN){
          Fragment fragment = ARouters.getFragment(ARouterConfig.Path.Comm.DIALOG_PRIVACY_AGREEMENT);
          DialogCompat.showDialogFragment(fragment, getSupportFragmentManager());
          if (fragment instanceof PrivacyAgreementDialog privacyAgreementDialog){
              privacyAgreementDialog.setOnDialogInfoListener(new BaseCompatDialog.OnDialogInfoListener() {
                  @Override
                  public void onClickSure(View view, @Nullable Object object) {
                      privacyAgreementDialog.dismiss();
                      MMKVCompat.putPrivacyAgreementStatus(MMKVCompat.PRIVACY_AGREEMENT_STATUS_AGREE);
                  }

                  @Override
                  public void onClickCancel(View view, @Nullable Object obj) {
                    privacyAgreementDialog.dismiss();
                  }
              });
          }

      }

    }

    private void initPageAdapter() {
        mFragments.clear();
        for (MainBottomTabEntity tabEntity : mBottomTabData) {
            String fragmentPath = tabEntity.fragmentPath;
            Object obj = ARouters.getBaseCompatFragment(fragmentPath);
            if (obj instanceof HomeFragment homeFragment) {
              /*  homeFragment.setOnItemClickListener(new OnItemClickListener<String>() {
                    @Override
                    public void onItemClick(@Nullable View view, @Nullable String s) {
                        mViewBinding.vpContent.setCurrentItem(1);
                    }
                });*/
                mFragments.add(homeFragment);
            } else if (obj instanceof SearchFragment searchFragment) {
                mFragments.add(searchFragment);
            } else if (obj instanceof MyListFragment mylistFragment) {
                mFragments.add(mylistFragment);
            } else if (obj instanceof MeFragment meFragment) {
                mFragments.add(meFragment);
            }
        }
        mViewBinding.vpContent.setAdapter(mPagerAdapter);
        mViewBinding.vpContent.setOffscreenPageLimit(CollectionCompat.getListSize(mFragments));
        mViewBinding.vpContent.setUserInputEnabled(false);
    }

    private final FragmentStateAdapter mPagerAdapter = new FragmentStateAdapter(this) {
        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getItemCount() {
            return CollectionCompat.getListSize(mFragments);
        }
    };

    private void initBottomTabAdapter() {
        List<MainBottomTabEntity> data = mViewModel.getBottomTabData(this);
        mBottomTabData.clear();
        mBottomTabData.addAll(data);
        mBottomTabAdapter = new MainBottomTabAdapter(this, mBottomTabData);
        mViewBinding.rvBottom.setAdapter(mBottomTabAdapter);
    }

    @Override
    protected boolean isLoadAppViewModel() {
        return true;
    }

    @Override
    protected void initEvent() {
        mViewBinding.vpContent.registerOnPageChangeCallback(mOnPageChangeCallback);
        if (mBottomTabAdapter != null) {
            mBottomTabAdapter.setOnItemClickListener((view, position) -> {
                if (position != null) {
                    mViewBinding.vpContent.setCurrentItem(position, false);
                }
            });
        }
        getOnBackPressedDispatcher().addCallback(mOnBackPressedCallback);
        if (mAppViewModel != null) {
            mAppViewModel.getMainTabTypeSelectorLiveData().observe(this, new Observer<Integer>() {
                @Override
                public void onChanged(Integer tabType) {
                    for (int i = 0; i < CollectionCompat.getListSize(mBottomTabData); i++) {
                        MainBottomTabEntity entity = mBottomTabData.get(i);
                        if (entity.type == tabType) {
                            mViewBinding.vpContent.setCurrentItem(i);
                            LogUtils.w("MainTabTypeSelectorLiveData", "我选中了：" + i);
                            break;
                        }
                    }
                }
            });
        }
    }

    private final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(true) {
        @Override
        public void handleOnBackPressed() {
            LogUtils.d("handleOnBackPressed", "我点击了返回");
            long backTimeMillis = System.currentTimeMillis();
            if (backTimeMillis - mExitTimeMillis < 2000) {
                finish();
            } else {
                mViewModel.showToast(DataCompat.getResString(MainActivity.this, com.inshort.base.R.string.top_again_to_quit_app));
                mExitTimeMillis = backTimeMillis;
            }
        }
    };

    private final ViewPager2.OnPageChangeCallback mOnPageChangeCallback = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }

        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (mBottomTabAdapter != null) {
                mBottomTabAdapter.selectorItem(position);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {
            super.onPageScrollStateChanged(state);
        }
    };

    @Override
    protected ActivityMainBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected boolean isLoadEmptyView() {
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewBinding.vpContent.unregisterOnPageChangeCallback(mOnPageChangeCallback);
    }


}