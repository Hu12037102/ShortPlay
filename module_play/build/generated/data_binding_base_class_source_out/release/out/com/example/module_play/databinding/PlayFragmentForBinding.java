// Generated by data binding compiler. Do not edit!
package com.example.module_play.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.viewpager2.widget.ViewPager2;
import com.example.module_play.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PlayFragmentForBinding extends ViewDataBinding {
  @NonNull
  public final ImageView mainLoadingIv;

  @NonNull
  public final ViewStubProxy noNetworkViewStub;

  @NonNull
  public final ViewPager2 playVp;

  protected PlayFragmentForBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView mainLoadingIv, ViewStubProxy noNetworkViewStub, ViewPager2 playVp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mainLoadingIv = mainLoadingIv;
    this.noNetworkViewStub = noNetworkViewStub;
    this.playVp = playVp;
  }

  @NonNull
  public static PlayFragmentForBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.play_fragment_for, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PlayFragmentForBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PlayFragmentForBinding>inflateInternal(inflater, R.layout.play_fragment_for, root, attachToRoot, component);
  }

  @NonNull
  public static PlayFragmentForBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.play_fragment_for, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PlayFragmentForBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PlayFragmentForBinding>inflateInternal(inflater, R.layout.play_fragment_for, null, false, component);
  }

  public static PlayFragmentForBinding bind(@NonNull View view) {
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
  public static PlayFragmentForBinding bind(@NonNull View view, @Nullable Object component) {
    return (PlayFragmentForBinding)bind(component, view, R.layout.play_fragment_for);
  }
}
