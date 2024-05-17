package com.inshort.search.fragment;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import androidx.core.view.ViewCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.compat.ViewsCompat;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.weight.click.DelayedClick;
import com.inshort.search.databinding.FragmentSearchBinding;
import com.inshort.search.viewmodel.SearchViewModel;

@Route(path = ARouterConfig.Path.Search.FRAGMENT_SEARCH)
public class SearchFragment extends BaseCompatFragment<FragmentSearchBinding, SearchViewModel> {
    @Override
    protected FragmentSearchBinding getViewBinding() {
        return FragmentSearchBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<SearchViewModel> getViewModelClass() {
        return SearchViewModel.class;
    }

    @Override
    protected void initView() {

        ViewCompat.setBackground(mViewBinding.viewTop, getTopBackground());
        ViewCompat.setBackground(mViewBinding.clSearchContentParent, getSearchBackground());
        ViewsCompat.setStatusBarMargin(mViewBinding.clSearchRoot, getActivity(), PhoneCompat.dp2px(requireContext(), 10));
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {
        mViewBinding.aetContent.addTextChangedListener(mTextWatcher);
        mViewBinding.aivClear.setOnClickListener(new DelayedClick() {
            @Override
            public void onDelayedClick(View view) {
                UICompat.setText(mViewBinding.aetContent, null);
            }
        });
    }

    private final TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (DataCompat.isTextViewTextEmpty(mViewBinding.aetContent)) {
                mViewBinding.aivClear.setVisibility(View.GONE);
            } else {
                mViewBinding.aivClear.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewBinding.aetContent.removeTextChangedListener(mTextWatcher);
    }

    private Drawable getTopBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setSize(PhoneCompat.screenWidth(requireContext()), PhoneCompat.dp2px(requireContext(), 176));
        drawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        drawable.setColors(new int[]{DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFFFE0EA), DataCompat.getColor(getContext(), com.inshort.base.R.color.color_FFF7F7F7)});
        return drawable;
    }

    private Drawable getSearchBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(Color.WHITE);
        drawable.setCornerRadius(PhoneCompat.dp2px(requireContext(), 50));
        return drawable;
    }
}
