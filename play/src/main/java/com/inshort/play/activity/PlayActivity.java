package com.inshort.play.activity;

import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.inshort.base.core.activity.BaseCompatActivity;
import com.inshort.base.entity.VideoUrlEntity;
import com.inshort.base.other.arouter.ARouterConfig;
import com.inshort.play.databinding.ActivityPlayBinding;
import com.inshort.play.viewmodel.PlayViewModel;

import java.util.List;

/**
 * @author: 张勇
 * @date: 2024/5/21
 */
@Route(path = ARouterConfig.Path.Play.PLAY_ACTIVITY_PLAY)
public class PlayActivity extends BaseCompatActivity<ActivityPlayBinding, PlayViewModel> {
    @Override
    protected ActivityPlayBinding getViewBinding() {
        return ActivityPlayBinding.inflate(getLayoutInflater());
    }

    @Override
    protected Class<PlayViewModel> getViewModelClass() {
        return PlayViewModel.class;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initObserve() {
        super.initObserve();
        mViewModel.getDramaSeriesLiveData().observe(this, playData -> {
            mViewModel.mergeDramaSeries(playData);
        });
    }
}
