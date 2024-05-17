package com.inshort.mylist.fragment;

import android.annotation.SuppressLint;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.inshort.base.core.fragment.BaseCompatFragment;
import com.inshort.base.entity.MyListEntity;
import com.inshort.base.entity.MyListTypeEntity;
import com.inshort.base.entity.TemporaryEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.base.other.arouter.ARouters;
import com.inshort.base.utils.LogUtils;
import com.inshort.base.view.WrapContentLinearLayoutManager;
import com.inshort.mylist.R;
import com.inshort.mylist.adapter.MyListAdapter;
import com.inshort.mylist.adapter.MyListRVAdapter;
import com.inshort.mylist.databinding.FragmentMyListBinding;
import com.inshort.mylist.viewmodel.MyListViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = ARouterConfig.Path.MyList.FRAGMENT_MYLIST)
public class MyListFragment extends BaseCompatFragment<FragmentMyListBinding, MyListViewModel> {
    private MyListRVAdapter myListRVAdapter;
    private MyPagerAdapter myPagerAdapter;
    private int mPosition = 0;

    private final List<MyListTypeEntity> data = new ArrayList<>();

    @Override
    protected FragmentMyListBinding getViewBinding() {
        return FragmentMyListBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<MyListViewModel> getViewModelClass() {
        return MyListViewModel.class;
    }

    @Override
    protected void initView() {
        data.add(new MyListTypeEntity(getResources().getString(com.inshort.base.R.string.love),true));
        data.add(new MyListTypeEntity(getResources().getString(com.inshort.base.R.string.play_history),false));
        myListRVAdapter = new MyListRVAdapter(R.layout.fragment_rv_my_list);
        mViewBinding.rlv.setLayoutManager(new WrapContentLinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        mViewBinding.rlv.setAdapter(myListRVAdapter);
        myListRVAdapter.setList(data);
    }

    @Override
    protected void initData() {
        List<Fragment> fragmentList = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            fragmentList.add(HisFragment.getSingle(i));
        }

        myPagerAdapter = new MyPagerAdapter(getChildFragmentManager(),getLifecycle(),fragmentList);
        mViewBinding.viewPager.setAdapter(myPagerAdapter);
    }

    @Override
    protected void initEvent() {
        mViewBinding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mPosition = position;
                mViewBinding.rlv.smoothScrollToPosition(position);
                setCheckoutItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        myListRVAdapter.setOnItemClickListener((adapter, view, position) -> {
            mViewBinding.viewPager.setCurrentItem(position,true);
            setCheckoutItem(position);
        });

        mViewBinding.editTv.setOnClickListener(v -> {
            Postcard postcard = ARouters.build(ARouterConfig.Path.MyList.ACTIVITY_BACK_HIS);
            if (postcard != null) {
                postcard.withBoolean(ARouterConfig.Key.IS_HIS, mPosition == 1).navigation();
            }
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    private void setCheckoutItem(int position) {
        LogUtils.d("MyListFragment","setCheckoutItem>> "+position);
        for (MyListTypeEntity tbc:data){
            tbc.setSelect(false);
        }
        data.get(position).setSelect(true);
        myListRVAdapter.notifyDataSetChanged();
    }


    static class MyPagerAdapter extends FragmentStateAdapter {
        private List<Fragment> fragmentList;
        public MyPagerAdapter(@NonNull FragmentManager fragmentManager, Lifecycle lifecycle, List<Fragment> fragmentList) {
            super(fragmentManager, lifecycle);
            this.fragmentList = fragmentList;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getItemCount() {
            return fragmentList.size();
        }
    }


}
