// Generated by data binding compiler. Do not edit!
package com.example.module_main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.example.module_main.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainActivityNewBonusCenterBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView atvBonusCount;

  @NonNull
  public final AppCompatTextView atvCoinsCount;

  @NonNull
  public final AppCompatTextView atvNotAdEmpty;

  @NonNull
  public final AppCompatTextView atvWalletTitle;

  @NonNull
  public final ConstraintLayout clBonus;

  @NonNull
  public final ConstraintLayout clSign;

  @NonNull
  public final ConstraintLayout clTitleParent;

  @NonNull
  public final ConstraintLayout clWallet;

  @NonNull
  public final ConstraintLayout clWatchAd;

  @NonNull
  public final MainIncludeLoginBinding includeLogin;

  @NonNull
  public final ImageView ivBonusAlpha;

  @NonNull
  public final ImageView ivCheck;

  @NonNull
  public final ImageView ivClose;

  @NonNull
  public final ImageView ivInvite;

  @NonNull
  public final ImageView ivInviteBonus;

  @NonNull
  public final ImageView ivWatch;

  @NonNull
  public final ImageView mainLoadingIv;

  @NonNull
  public final RecyclerView rvSign;

  @NonNull
  public final RecyclerView rvWatchAd;

  @NonNull
  public final ViewStubProxy tryAgainView;

  @NonNull
  public final TextView tvBonusCenterTitle;

  @NonNull
  public final TextView tvCheckIn;

  @NonNull
  public final TextView tvInviteMoney;

  @NonNull
  public final TextView tvInviteTitle;

  @NonNull
  public final TextView tvSignContent;

  @NonNull
  public final TextView tvWatchTitle;

  protected MainActivityNewBonusCenterBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatTextView atvBonusCount, AppCompatTextView atvCoinsCount,
      AppCompatTextView atvNotAdEmpty, AppCompatTextView atvWalletTitle, ConstraintLayout clBonus,
      ConstraintLayout clSign, ConstraintLayout clTitleParent, ConstraintLayout clWallet,
      ConstraintLayout clWatchAd, MainIncludeLoginBinding includeLogin, ImageView ivBonusAlpha,
      ImageView ivCheck, ImageView ivClose, ImageView ivInvite, ImageView ivInviteBonus,
      ImageView ivWatch, ImageView mainLoadingIv, RecyclerView rvSign, RecyclerView rvWatchAd,
      ViewStubProxy tryAgainView, TextView tvBonusCenterTitle, TextView tvCheckIn,
      TextView tvInviteMoney, TextView tvInviteTitle, TextView tvSignContent,
      TextView tvWatchTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.atvBonusCount = atvBonusCount;
    this.atvCoinsCount = atvCoinsCount;
    this.atvNotAdEmpty = atvNotAdEmpty;
    this.atvWalletTitle = atvWalletTitle;
    this.clBonus = clBonus;
    this.clSign = clSign;
    this.clTitleParent = clTitleParent;
    this.clWallet = clWallet;
    this.clWatchAd = clWatchAd;
    this.includeLogin = includeLogin;
    this.ivBonusAlpha = ivBonusAlpha;
    this.ivCheck = ivCheck;
    this.ivClose = ivClose;
    this.ivInvite = ivInvite;
    this.ivInviteBonus = ivInviteBonus;
    this.ivWatch = ivWatch;
    this.mainLoadingIv = mainLoadingIv;
    this.rvSign = rvSign;
    this.rvWatchAd = rvWatchAd;
    this.tryAgainView = tryAgainView;
    this.tvBonusCenterTitle = tvBonusCenterTitle;
    this.tvCheckIn = tvCheckIn;
    this.tvInviteMoney = tvInviteMoney;
    this.tvInviteTitle = tvInviteTitle;
    this.tvSignContent = tvSignContent;
    this.tvWatchTitle = tvWatchTitle;
  }

  @NonNull
  public static MainActivityNewBonusCenterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_new_bonus_center, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityNewBonusCenterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainActivityNewBonusCenterBinding>inflateInternal(inflater, R.layout.main_activity_new_bonus_center, root, attachToRoot, component);
  }

  @NonNull
  public static MainActivityNewBonusCenterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_activity_new_bonus_center, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainActivityNewBonusCenterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainActivityNewBonusCenterBinding>inflateInternal(inflater, R.layout.main_activity_new_bonus_center, null, false, component);
  }

  public static MainActivityNewBonusCenterBinding bind(@NonNull View view) {
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
  public static MainActivityNewBonusCenterBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (MainActivityNewBonusCenterBinding)bind(component, view, R.layout.main_activity_new_bonus_center);
  }
}
