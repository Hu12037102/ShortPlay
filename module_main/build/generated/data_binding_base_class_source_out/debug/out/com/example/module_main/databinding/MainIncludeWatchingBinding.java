// Generated by data binding compiler. Do not edit!
package com.example.module_main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.module_main.R;
import com.ruffian.library.widget.RImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainIncludeWatchingBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout rlCloseWatch;

  @NonNull
  public final RelativeLayout rlWatching;

  @NonNull
  public final TextView watchingEpisodeTv;

  @NonNull
  public final RImageView watchingIv;

  @NonNull
  public final TextView watchingTitleTv;

  protected MainIncludeWatchingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout rlCloseWatch, RelativeLayout rlWatching, TextView watchingEpisodeTv,
      RImageView watchingIv, TextView watchingTitleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rlCloseWatch = rlCloseWatch;
    this.rlWatching = rlWatching;
    this.watchingEpisodeTv = watchingEpisodeTv;
    this.watchingIv = watchingIv;
    this.watchingTitleTv = watchingTitleTv;
  }

  @NonNull
  public static MainIncludeWatchingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_include_watching, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainIncludeWatchingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainIncludeWatchingBinding>inflateInternal(inflater, R.layout.main_include_watching, root, attachToRoot, component);
  }

  @NonNull
  public static MainIncludeWatchingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_include_watching, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainIncludeWatchingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainIncludeWatchingBinding>inflateInternal(inflater, R.layout.main_include_watching, null, false, component);
  }

  public static MainIncludeWatchingBinding bind(@NonNull View view) {
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
  public static MainIncludeWatchingBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainIncludeWatchingBinding)bind(component, view, R.layout.main_include_watching);
  }
}
