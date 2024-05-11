// Generated by data binding compiler. Do not edit!
package com.example.module_main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.example.module_main.R;
import com.ruffian.library.widget.RRelativeLayout;
import com.ruffian.library.widget.RTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainActivityStoreBinding extends ViewDataBinding {
  @NonNull
  public final RTextView discountedPriceShow;

  @NonNull
  public final ImageView episodeIv;

  @NonNull
  public final RRelativeLayout episodeRr;

  @NonNull
  public final RecyclerView episodeTypeRv;

  @NonNull
  public final RecyclerView homeBanner;

  @NonNull
  public final MainIncludeBonusBinding includeStoreBonus;

  @NonNull
  public final MainIncludeCoinsBinding includeStoreCoins;

  @NonNull
  public final ImageView mainLoadingIv;

  @NonNull
  public final RTextView rechargeDiscountFlag;

  @NonNull
  public final TextView rechargeEpisodeCoins;

  @NonNull
  public final TextView rechargeEpisodeNum;

  @NonNull
  public final TextView rechargeEpisodeOriginal;

  @NonNull
  public final RelativeLayout rlSub;

  @NonNull
  public final MainIncludeTitleBinding topIncludeWallet;

  @NonNull
  public final ViewStubProxy tryAgainView;

  @NonNull
  public final TextView tvRestore;

  @NonNull
  public final TextView tvRules;

  @NonNull
  public final TextView tvSub;

  @NonNull
  public final LinearLayout walletViewLl;

  protected MainActivityStoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RTextView discountedPriceShow, ImageView episodeIv, RRelativeLayout episodeRr,
      RecyclerView episodeTypeRv, RecyclerView homeBanner,
      MainIncludeBonusBinding includeStoreBonus, MainIncludeCoinsBinding includeStoreCoins,
      ImageView mainLoadingIv, RTextView rechargeDiscountFlag, TextView rechargeEpisodeCoins,
      TextView rechargeEpisodeNum, TextView rechargeEpisodeOriginal, RelativeLayout rlSub,
      MainIncludeTitleBinding topIncludeWallet, ViewStubProxy tryAgainView, TextView tvRestore,
      TextView tvRules, TextView tvSub, LinearLayout walletViewLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.discountedPriceShow = discountedPriceShow;
    this.episodeIv = episodeIv;
    this.episodeRr = episodeRr;
    this.episodeTypeRv = episodeTypeRv;
    this.homeBanner = homeBanner;
    this.includeStoreBonus = includeStoreBonus;
    this.includeStoreCoins = includeStoreCoins;
    this.mainLoadingIv = mainLoadingIv;
    this.rechargeDiscountFlag = rechargeDiscountFlag;
    this.rechargeEpisodeCoins = rechargeEpisodeCoins;
    this.rechargeEpisodeNum = rechargeEpisodeNum;
    this.rechargeEpisodeOriginal = rechargeEpisodeOriginal;
    this.rlSub = rlSub;
    this.topIncludeWallet = topIncludeWallet;
    this.tryAgainView = tryAgainView;
    this.tvRestore = tvRestore;
    this.tvRules = tvRules;
    this.tvSub = tvSub;
    this.walletViewLl = walletViewLl;
  }

  @NonNull
  public static MainActivityStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_store, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainActivityStoreBinding>inflateInternal(inflater, R.layout.main_activity_store, root, attachToRoot, component);
  }

  @NonNull
  public static MainActivityStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_store, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainActivityStoreBinding>inflateInternal(inflater, R.layout.main_activity_store, null, false, component);
  }

  public static MainActivityStoreBinding bind(@NonNull View view) {
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
  public static MainActivityStoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainActivityStoreBinding)bind(component, view, R.layout.main_activity_store);
  }
}
