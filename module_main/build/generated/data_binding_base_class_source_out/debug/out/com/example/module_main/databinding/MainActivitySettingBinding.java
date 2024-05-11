// Generated by data binding compiler. Do not edit!
package com.example.module_main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.module_main.R;
import com.ruffian.library.widget.RTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainActivitySettingBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout autoRl;

  @NonNull
  public final TextView autoTv;

  @NonNull
  public final RelativeLayout cacheRl;

  @NonNull
  public final TextView cacheTv;

  @NonNull
  public final RelativeLayout deleteAccountRl;

  @NonNull
  public final TextView deleteAccountTv;

  @NonNull
  public final RelativeLayout hostRl;

  @NonNull
  public final TextView hostTv;

  @NonNull
  public final RelativeLayout privacyRl;

  @NonNull
  public final TextView privacyTv;

  @NonNull
  public final MainIncludeTitleBinding settingInclude;

  @NonNull
  public final RTextView signOutTv;

  @NonNull
  public final ImageView switchIv;

  @NonNull
  public final RelativeLayout termsRl;

  @NonNull
  public final TextView termsTv;

  @NonNull
  public final RelativeLayout versionRl;

  @NonNull
  public final TextView versionTv;

  protected MainActivitySettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout autoRl, TextView autoTv, RelativeLayout cacheRl, TextView cacheTv,
      RelativeLayout deleteAccountRl, TextView deleteAccountTv, RelativeLayout hostRl,
      TextView hostTv, RelativeLayout privacyRl, TextView privacyTv,
      MainIncludeTitleBinding settingInclude, RTextView signOutTv, ImageView switchIv,
      RelativeLayout termsRl, TextView termsTv, RelativeLayout versionRl, TextView versionTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.autoRl = autoRl;
    this.autoTv = autoTv;
    this.cacheRl = cacheRl;
    this.cacheTv = cacheTv;
    this.deleteAccountRl = deleteAccountRl;
    this.deleteAccountTv = deleteAccountTv;
    this.hostRl = hostRl;
    this.hostTv = hostTv;
    this.privacyRl = privacyRl;
    this.privacyTv = privacyTv;
    this.settingInclude = settingInclude;
    this.signOutTv = signOutTv;
    this.switchIv = switchIv;
    this.termsRl = termsRl;
    this.termsTv = termsTv;
    this.versionRl = versionRl;
    this.versionTv = versionTv;
  }

  @NonNull
  public static MainActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainActivitySettingBinding>inflateInternal(inflater, R.layout.main_activity_setting, root, attachToRoot, component);
  }

  @NonNull
  public static MainActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainActivitySettingBinding>inflateInternal(inflater, R.layout.main_activity_setting, null, false, component);
  }

  public static MainActivitySettingBinding bind(@NonNull View view) {
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
  public static MainActivitySettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainActivitySettingBinding)bind(component, view, R.layout.main_activity_setting);
  }
}
