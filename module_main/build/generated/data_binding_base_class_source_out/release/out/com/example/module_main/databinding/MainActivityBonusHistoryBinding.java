// Generated by data binding compiler. Do not edit!
package com.example.module_main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.module_main.R;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainActivityBonusHistoryBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView aivLoading;

  @NonNull
  public final View includeEmpty;

  @NonNull
  public final View includeNotNet;

  @NonNull
  public final MainIncludeTitleBinding includeTitle;

  @NonNull
  public final SmartRefreshLayout refreshLayout;

  @NonNull
  public final RecyclerView rvData;

  protected MainActivityBonusHistoryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView aivLoading, View includeEmpty, View includeNotNet,
      MainIncludeTitleBinding includeTitle, SmartRefreshLayout refreshLayout, RecyclerView rvData) {
    super(_bindingComponent, _root, _localFieldCount);
    this.aivLoading = aivLoading;
    this.includeEmpty = includeEmpty;
    this.includeNotNet = includeNotNet;
    this.includeTitle = includeTitle;
    this.refreshLayout = refreshLayout;
    this.rvData = rvData;
  }

  @NonNull
  public static MainActivityBonusHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_bonus_history, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityBonusHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainActivityBonusHistoryBinding>inflateInternal(inflater, R.layout.main_activity_bonus_history, root, attachToRoot, component);
  }

  @NonNull
  public static MainActivityBonusHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_bonus_history, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityBonusHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainActivityBonusHistoryBinding>inflateInternal(inflater, R.layout.main_activity_bonus_history, null, false, component);
  }

  public static MainActivityBonusHistoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MainActivityBonusHistoryBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (MainActivityBonusHistoryBinding)bind(component, view, R.layout.main_activity_bonus_history);
  }
}
