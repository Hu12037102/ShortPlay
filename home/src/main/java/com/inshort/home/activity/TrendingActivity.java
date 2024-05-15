package com.inshort.home.activity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.CollectionCompat;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.home.databinding.ActivityTrendingBinding;
import com.inshort.home.viewmodel.TrendingViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.Home.ACTIVITY_TRENDING)
public class TrendingActivity extends BaseCompatActivity<ActivityTrendingBinding, TrendingViewModel> {
    private final List<String> mData = new ArrayList<>();
    private final List<Fragment> mFragments = new ArrayList<>();
    @Nullable
    private String mIntentType = null;

    @Override
    protected ActivityTrendingBinding getViewBinding() {
        return ActivityTrendingBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<TrendingViewModel> getViewModelClass() {
        return TrendingViewModel.class;
    }

    @Override
    protected void initView() {
        ViewsCompat.hideStatusBar(getWindow());
        UICompat.setTextSize(mViewBinding.pvTitle.getCenterView(), 22);
        UICompat.setTextFont(mViewBinding.pvTitle.getCenterView(), com.inshort.base.R.font.sofia_pro_bold);
        mViewBinding.pvTitle.getCenterView().setCompoundDrawablesWithIntrinsicBounds(
                ContextCompat.getDrawable(this, com.inshort.base.R.mipmap.icon_home_trending_left), null,
                ContextCompat.getDrawable(this, com.inshort.base.R.mipmap.icon_home_trending_right), null
        );
        TextViewCompat.setCompoundDrawableTintList(mViewBinding.pvTitle.getCenterView(), DataCompat.getColorStateList(this, com.inshort.base.R.color.color_FFFF5C4F));
        mViewBinding.pvTitle.getCenterView().setCompoundDrawablePadding(PhoneCompat.dp2px(this, 6));
    }

    @Override
    protected void initData() {
        mIntentType = getIntent().getStringExtra(ARouterConfig.Key.CONTENT);
        loadSmartData(true);
    }

    @Override
    protected void loadSmartData(boolean isRefresh) {
        super.loadSmartData(isRefresh);
        mViewModel.loadTrendingTypes();
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getTrendingTypesLiveData().observe(this, data -> {
            mData.clear();
            mFragments.clear();
            if (DataCompat.notNull(data)) {
                mData.addAll(data);
            }
            mViewBinding.cgType.removeAllViews();
            int initIndex = 0;
            for (int i = 0; i < mData.size(); i++) {
                String content = mData.get(i);
                boolean isSelector;
                if (TextUtils.equals(mIntentType, content)) {
                    initIndex = i;
                    isSelector = true;
                } else {
                    isSelector = false;
                }
                TextView childView = createChildTextView(isSelector, content);
                mViewBinding.cgType.addView(childView);
                childView.setOnClickListener(new DelayedClick() {
                    @Override
                    public void onDelayedClick(View view) {
                        updateChildTextView(childView);
                        int index = mData.indexOf(content);
                        mViewBinding.vpContent.setCurrentItem(Math.max(index, 0), false);
                    }
                });
                Postcard postcard = ARouters.build(ARouterConfig.Path.Home.FRAGMENT_TRENDING_CONTENT);
                if (postcard != null) {
                    Object obj = postcard.withString(ARouterConfig.Key.CONTENT, content).navigation();
                    if (obj instanceof Fragment fragment) {
                        mFragments.add(fragment);
                    }

                }

                mViewBinding.vpContent.setOffscreenPageLimit(CollectionCompat.getListSize(mFragments));
                mViewBinding.vpContent.setAdapter(mFragmentAdapter);
                mViewBinding.vpContent.setCurrentItem(initIndex, false);

            }

        });
    }

    private final FragmentStateAdapter mFragmentAdapter = new FragmentStateAdapter(this) {
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

    @Override
    protected void onWindowFirstFocusChanged() {
        super.onWindowFirstFocusChanged();
        ViewsCompat.setStatusBarMargin(mViewBinding.pvTitle, this, 0);
    }

    private TextView createChildTextView(boolean isSector, String text) {
        AppCompatTextView textView = new AppCompatTextView(this);
        textView.setId(ViewCompat.generateViewId());
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, PhoneCompat.dp2px(this, 30)));
        UICompat.setTextFont(textView, com.inshort.base.R.font.sofia_pro_medium);
        textView.setSingleLine(true);
        textView.setPadding(PhoneCompat.dp2px(this, 12), 0, PhoneCompat.dp2px(this, 12), 0);
        UICompat.setTextSize(textView, 13);
        textView.setTag(isSector);
        if (isSector) {
            UICompat.setTextColorRes(textView, com.inshort.base.R.color.color_White);
        } else {
            UICompat.setTextColorRes(textView, com.inshort.base.R.color.color_FF2E2E2E);
        }
        textView.setMinWidth(PhoneCompat.dp2px(this, 60));
        ViewCompat.setBackground(textView, getTypeBackground(isSector));
        textView.setText(text);
        textView.setGravity(Gravity.CENTER);
        return textView;

    }

    private void updateChildTextView(View updateView) {
        if (updateView.getTag() instanceof Boolean isSelector && isSelector) {
            return;
        }
        for (int i = 0; i < mViewBinding.cgType.getChildCount(); i++) {
            View childView = mViewBinding.cgType.getChildAt(i);
            childView.setTag(childView == updateView);
            boolean isCheck = (boolean) childView.getTag();
            ViewCompat.setBackground(childView, getTypeBackground(isCheck));
            if (childView instanceof TextView textView) {
                if (isCheck) {
                    UICompat.setTextColorRes(textView, com.inshort.base.R.color.color_White);
                } else {
                    UICompat.setTextColorRes(textView, com.inshort.base.R.color.color_FF2E2E2E);
                }
            }

        }
    }

    private Drawable getTypeBackground(boolean isSelector) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(PhoneCompat.dp2px(this, 6));
        if (isSelector) {
            drawable.setColor(DataCompat.getColor(this, com.inshort.base.R.color.color_FFFE2442));
        } else {
            drawable.setColor(DataCompat.getColor(this, com.inshort.base.R.color.color_1A000000));
        }
        return drawable;
    }
}
