package com.example.module_main;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.module_main.databinding.ActivityLanguageBindingImpl;
import com.example.module_main.databinding.MainAcitivityTiktokWebBindingImpl;
import com.example.module_main.databinding.MainAcitivityWebBindingImpl;
import com.example.module_main.databinding.MainActivityBonusBindingImpl;
import com.example.module_main.databinding.MainActivityBonusCenterBindingImpl;
import com.example.module_main.databinding.MainActivityBonusHistoryBindingImpl;
import com.example.module_main.databinding.MainActivityEpisodesBindingImpl;
import com.example.module_main.databinding.MainActivityHomeMoreBindingImpl;
import com.example.module_main.databinding.MainActivityHostBindingImpl;
import com.example.module_main.databinding.MainActivityInviteFriendBindingImpl;
import com.example.module_main.databinding.MainActivityMainBindingImpl;
import com.example.module_main.databinding.MainActivityMyWalletBindingImpl;
import com.example.module_main.databinding.MainActivityNewBonusCenterBindingImpl;
import com.example.module_main.databinding.MainActivitySearchBindingImpl;
import com.example.module_main.databinding.MainActivitySettingBindingImpl;
import com.example.module_main.databinding.MainActivitySplashBindingImpl;
import com.example.module_main.databinding.MainActivityStoreBindingImpl;
import com.example.module_main.databinding.MainActivitySubscriptionBindingImpl;
import com.example.module_main.databinding.MainActivityTrendingBindingImpl;
import com.example.module_main.databinding.MainFlashChristmasLogoBindingImpl;
import com.example.module_main.databinding.MainFragmentHomeBindingImpl;
import com.example.module_main.databinding.MainFragmentMeBindingImpl;
import com.example.module_main.databinding.MainFragmentMylistBindingImpl;
import com.example.module_main.databinding.MainHomeLabelBindingImpl;
import com.example.module_main.databinding.MainIncludeBonusBindingImpl;
import com.example.module_main.databinding.MainIncludeCoinsBindingImpl;
import com.example.module_main.databinding.MainIncludeFlashBindingImpl;
import com.example.module_main.databinding.MainIncludeLoginBindingImpl;
import com.example.module_main.databinding.MainIncludeTitleBindingImpl;
import com.example.module_main.databinding.MainIncludeUserWalletBindingImpl;
import com.example.module_main.databinding.MainIncludeWalletBindingImpl;
import com.example.module_main.databinding.MainIncludeWatchingBindingImpl;
import com.example.module_main.databinding.MainItemSearchHeadViewBindingImpl;
import com.example.module_main.databinding.MainPlayHistoryBindingImpl;
import com.example.module_main.databinding.MainTransactionHisBindingImpl;
import com.example.module_main.databinding.MainTransationAllBindingImpl;
import com.example.module_main.databinding.MainViewStubInviteListBindingImpl;
import com.example.module_main.databinding.MainViewStubInviteNowBindingImpl;
import com.example.module_main.databinding.TrendingContentFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLANGUAGE = 1;

  private static final int LAYOUT_MAINACITIVITYTIKTOKWEB = 2;

  private static final int LAYOUT_MAINACITIVITYWEB = 3;

  private static final int LAYOUT_MAINACTIVITYBONUS = 4;

  private static final int LAYOUT_MAINACTIVITYBONUSCENTER = 5;

  private static final int LAYOUT_MAINACTIVITYBONUSHISTORY = 6;

  private static final int LAYOUT_MAINACTIVITYEPISODES = 7;

  private static final int LAYOUT_MAINACTIVITYHOMEMORE = 8;

  private static final int LAYOUT_MAINACTIVITYHOST = 9;

  private static final int LAYOUT_MAINACTIVITYINVITEFRIEND = 10;

  private static final int LAYOUT_MAINACTIVITYMAIN = 11;

  private static final int LAYOUT_MAINACTIVITYMYWALLET = 12;

  private static final int LAYOUT_MAINACTIVITYNEWBONUSCENTER = 13;

  private static final int LAYOUT_MAINACTIVITYSEARCH = 14;

  private static final int LAYOUT_MAINACTIVITYSETTING = 15;

  private static final int LAYOUT_MAINACTIVITYSPLASH = 16;

  private static final int LAYOUT_MAINACTIVITYSTORE = 17;

  private static final int LAYOUT_MAINACTIVITYSUBSCRIPTION = 18;

  private static final int LAYOUT_MAINACTIVITYTRENDING = 19;

  private static final int LAYOUT_MAINFLASHCHRISTMASLOGO = 20;

  private static final int LAYOUT_MAINFRAGMENTHOME = 21;

  private static final int LAYOUT_MAINFRAGMENTME = 22;

  private static final int LAYOUT_MAINFRAGMENTMYLIST = 23;

  private static final int LAYOUT_MAINHOMELABEL = 24;

  private static final int LAYOUT_MAININCLUDEBONUS = 25;

  private static final int LAYOUT_MAININCLUDECOINS = 26;

  private static final int LAYOUT_MAININCLUDEFLASH = 27;

  private static final int LAYOUT_MAININCLUDELOGIN = 28;

  private static final int LAYOUT_MAININCLUDETITLE = 29;

  private static final int LAYOUT_MAININCLUDEUSERWALLET = 30;

  private static final int LAYOUT_MAININCLUDEWALLET = 31;

  private static final int LAYOUT_MAININCLUDEWATCHING = 32;

  private static final int LAYOUT_MAINITEMSEARCHHEADVIEW = 33;

  private static final int LAYOUT_MAINPLAYHISTORY = 34;

  private static final int LAYOUT_MAINTRANSACTIONHIS = 35;

  private static final int LAYOUT_MAINTRANSATIONALL = 36;

  private static final int LAYOUT_MAINVIEWSTUBINVITELIST = 37;

  private static final int LAYOUT_MAINVIEWSTUBINVITENOW = 38;

  private static final int LAYOUT_TRENDINGCONTENTFRAGMENT = 39;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(39);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.activity_language, LAYOUT_ACTIVITYLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_acitivity_tiktok_web, LAYOUT_MAINACITIVITYTIKTOKWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_acitivity_web, LAYOUT_MAINACITIVITYWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_bonus, LAYOUT_MAINACTIVITYBONUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_bonus_center, LAYOUT_MAINACTIVITYBONUSCENTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_bonus_history, LAYOUT_MAINACTIVITYBONUSHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_episodes, LAYOUT_MAINACTIVITYEPISODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_home_more, LAYOUT_MAINACTIVITYHOMEMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_host, LAYOUT_MAINACTIVITYHOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_invite_friend, LAYOUT_MAINACTIVITYINVITEFRIEND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_main, LAYOUT_MAINACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_my_wallet, LAYOUT_MAINACTIVITYMYWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_new_bonus_center, LAYOUT_MAINACTIVITYNEWBONUSCENTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_search, LAYOUT_MAINACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_setting, LAYOUT_MAINACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_splash, LAYOUT_MAINACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_store, LAYOUT_MAINACTIVITYSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_subscription, LAYOUT_MAINACTIVITYSUBSCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_activity_trending, LAYOUT_MAINACTIVITYTRENDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_flash_christmas_logo, LAYOUT_MAINFLASHCHRISTMASLOGO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_fragment_home, LAYOUT_MAINFRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_fragment_me, LAYOUT_MAINFRAGMENTME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_fragment_mylist, LAYOUT_MAINFRAGMENTMYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_home_label, LAYOUT_MAINHOMELABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_bonus, LAYOUT_MAININCLUDEBONUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_coins, LAYOUT_MAININCLUDECOINS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_flash, LAYOUT_MAININCLUDEFLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_login, LAYOUT_MAININCLUDELOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_title, LAYOUT_MAININCLUDETITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_user_wallet, LAYOUT_MAININCLUDEUSERWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_wallet, LAYOUT_MAININCLUDEWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_include_watching, LAYOUT_MAININCLUDEWATCHING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_item_search_head_view, LAYOUT_MAINITEMSEARCHHEADVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_play_history, LAYOUT_MAINPLAYHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_transaction_his, LAYOUT_MAINTRANSACTIONHIS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_transation_all, LAYOUT_MAINTRANSATIONALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_view_stub_invite_list, LAYOUT_MAINVIEWSTUBINVITELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.main_view_stub_invite_now, LAYOUT_MAINVIEWSTUBINVITENOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_main.R.layout.trending_content_fragment, LAYOUT_TRENDINGCONTENTFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLANGUAGE: {
          if ("layout/activity_language_0".equals(tag)) {
            return new ActivityLanguageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_language is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACITIVITYTIKTOKWEB: {
          if ("layout/main_acitivity_tiktok_web_0".equals(tag)) {
            return new MainAcitivityTiktokWebBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_acitivity_tiktok_web is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACITIVITYWEB: {
          if ("layout/main_acitivity_web_0".equals(tag)) {
            return new MainAcitivityWebBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_acitivity_web is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYBONUS: {
          if ("layout/main_activity_bonus_0".equals(tag)) {
            return new MainActivityBonusBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_bonus is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYBONUSCENTER: {
          if ("layout/main_activity_bonus_center_0".equals(tag)) {
            return new MainActivityBonusCenterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_bonus_center is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYBONUSHISTORY: {
          if ("layout/main_activity_bonus_history_0".equals(tag)) {
            return new MainActivityBonusHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_bonus_history is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYEPISODES: {
          if ("layout/main_activity_episodes_0".equals(tag)) {
            return new MainActivityEpisodesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_episodes is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYHOMEMORE: {
          if ("layout/main_activity_home_more_0".equals(tag)) {
            return new MainActivityHomeMoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_home_more is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYHOST: {
          if ("layout/main_activity_host_0".equals(tag)) {
            return new MainActivityHostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_host is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYINVITEFRIEND: {
          if ("layout/main_activity_invite_friend_0".equals(tag)) {
            return new MainActivityInviteFriendBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_invite_friend is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYMAIN: {
          if ("layout/main_activity_main_0".equals(tag)) {
            return new MainActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYMYWALLET: {
          if ("layout/main_activity_my_wallet_0".equals(tag)) {
            return new MainActivityMyWalletBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_my_wallet is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYNEWBONUSCENTER: {
          if ("layout/main_activity_new_bonus_center_0".equals(tag)) {
            return new MainActivityNewBonusCenterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_new_bonus_center is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYSEARCH: {
          if ("layout/main_activity_search_0".equals(tag)) {
            return new MainActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYSETTING: {
          if ("layout/main_activity_setting_0".equals(tag)) {
            return new MainActivitySettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYSPLASH: {
          if ("layout/main_activity_splash_0".equals(tag)) {
            return new MainActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYSTORE: {
          if ("layout/main_activity_store_0".equals(tag)) {
            return new MainActivityStoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_store is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYSUBSCRIPTION: {
          if ("layout/main_activity_subscription_0".equals(tag)) {
            return new MainActivitySubscriptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_subscription is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITYTRENDING: {
          if ("layout/main_activity_trending_0".equals(tag)) {
            return new MainActivityTrendingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity_trending is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINFLASHCHRISTMASLOGO: {
          if ("layout/main_flash_christmas_logo_0".equals(tag)) {
            return new MainFlashChristmasLogoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_flash_christmas_logo is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINFRAGMENTHOME: {
          if ("layout/main_fragment_home_0".equals(tag)) {
            return new MainFragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINFRAGMENTME: {
          if ("layout/main_fragment_me_0".equals(tag)) {
            return new MainFragmentMeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_fragment_me is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINFRAGMENTMYLIST: {
          if ("layout/main_fragment_mylist_0".equals(tag)) {
            return new MainFragmentMylistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_fragment_mylist is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINHOMELABEL: {
          if ("layout/main_home_label_0".equals(tag)) {
            return new MainHomeLabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_home_label is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDEBONUS: {
          if ("layout/main_include_bonus_0".equals(tag)) {
            return new MainIncludeBonusBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_bonus is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDECOINS: {
          if ("layout/main_include_coins_0".equals(tag)) {
            return new MainIncludeCoinsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_coins is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDEFLASH: {
          if ("layout/main_include_flash_0".equals(tag)) {
            return new MainIncludeFlashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_flash is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDELOGIN: {
          if ("layout/main_include_login_0".equals(tag)) {
            return new MainIncludeLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_login is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDETITLE: {
          if ("layout/main_include_title_0".equals(tag)) {
            return new MainIncludeTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_title is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDEUSERWALLET: {
          if ("layout/main_include_user_wallet_0".equals(tag)) {
            return new MainIncludeUserWalletBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_user_wallet is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDEWALLET: {
          if ("layout/main_include_wallet_0".equals(tag)) {
            return new MainIncludeWalletBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_wallet is invalid. Received: " + tag);
        }
        case  LAYOUT_MAININCLUDEWATCHING: {
          if ("layout/main_include_watching_0".equals(tag)) {
            return new MainIncludeWatchingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_include_watching is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINITEMSEARCHHEADVIEW: {
          if ("layout/main_item_search_head_view_0".equals(tag)) {
            return new MainItemSearchHeadViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_item_search_head_view is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINPLAYHISTORY: {
          if ("layout/main_play_history_0".equals(tag)) {
            return new MainPlayHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_play_history is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINTRANSACTIONHIS: {
          if ("layout/main_transaction_his_0".equals(tag)) {
            return new MainTransactionHisBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_transaction_his is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINTRANSATIONALL: {
          if ("layout/main_transation_all_0".equals(tag)) {
            return new MainTransationAllBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_transation_all is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINVIEWSTUBINVITELIST: {
          if ("layout/main_view_stub_invite_list_0".equals(tag)) {
            return new MainViewStubInviteListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_view_stub_invite_list is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINVIEWSTUBINVITENOW: {
          if ("layout/main_view_stub_invite_now_0".equals(tag)) {
            return new MainViewStubInviteNowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_view_stub_invite_now is invalid. Received: " + tag);
        }
        case  LAYOUT_TRENDINGCONTENTFRAGMENT: {
          if ("layout/trending_content_fragment_0".equals(tag)) {
            return new TrendingContentFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for trending_content_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.chad.library.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(39);

    static {
      sKeys.put("layout/activity_language_0", com.example.module_main.R.layout.activity_language);
      sKeys.put("layout/main_acitivity_tiktok_web_0", com.example.module_main.R.layout.main_acitivity_tiktok_web);
      sKeys.put("layout/main_acitivity_web_0", com.example.module_main.R.layout.main_acitivity_web);
      sKeys.put("layout/main_activity_bonus_0", com.example.module_main.R.layout.main_activity_bonus);
      sKeys.put("layout/main_activity_bonus_center_0", com.example.module_main.R.layout.main_activity_bonus_center);
      sKeys.put("layout/main_activity_bonus_history_0", com.example.module_main.R.layout.main_activity_bonus_history);
      sKeys.put("layout/main_activity_episodes_0", com.example.module_main.R.layout.main_activity_episodes);
      sKeys.put("layout/main_activity_home_more_0", com.example.module_main.R.layout.main_activity_home_more);
      sKeys.put("layout/main_activity_host_0", com.example.module_main.R.layout.main_activity_host);
      sKeys.put("layout/main_activity_invite_friend_0", com.example.module_main.R.layout.main_activity_invite_friend);
      sKeys.put("layout/main_activity_main_0", com.example.module_main.R.layout.main_activity_main);
      sKeys.put("layout/main_activity_my_wallet_0", com.example.module_main.R.layout.main_activity_my_wallet);
      sKeys.put("layout/main_activity_new_bonus_center_0", com.example.module_main.R.layout.main_activity_new_bonus_center);
      sKeys.put("layout/main_activity_search_0", com.example.module_main.R.layout.main_activity_search);
      sKeys.put("layout/main_activity_setting_0", com.example.module_main.R.layout.main_activity_setting);
      sKeys.put("layout/main_activity_splash_0", com.example.module_main.R.layout.main_activity_splash);
      sKeys.put("layout/main_activity_store_0", com.example.module_main.R.layout.main_activity_store);
      sKeys.put("layout/main_activity_subscription_0", com.example.module_main.R.layout.main_activity_subscription);
      sKeys.put("layout/main_activity_trending_0", com.example.module_main.R.layout.main_activity_trending);
      sKeys.put("layout/main_flash_christmas_logo_0", com.example.module_main.R.layout.main_flash_christmas_logo);
      sKeys.put("layout/main_fragment_home_0", com.example.module_main.R.layout.main_fragment_home);
      sKeys.put("layout/main_fragment_me_0", com.example.module_main.R.layout.main_fragment_me);
      sKeys.put("layout/main_fragment_mylist_0", com.example.module_main.R.layout.main_fragment_mylist);
      sKeys.put("layout/main_home_label_0", com.example.module_main.R.layout.main_home_label);
      sKeys.put("layout/main_include_bonus_0", com.example.module_main.R.layout.main_include_bonus);
      sKeys.put("layout/main_include_coins_0", com.example.module_main.R.layout.main_include_coins);
      sKeys.put("layout/main_include_flash_0", com.example.module_main.R.layout.main_include_flash);
      sKeys.put("layout/main_include_login_0", com.example.module_main.R.layout.main_include_login);
      sKeys.put("layout/main_include_title_0", com.example.module_main.R.layout.main_include_title);
      sKeys.put("layout/main_include_user_wallet_0", com.example.module_main.R.layout.main_include_user_wallet);
      sKeys.put("layout/main_include_wallet_0", com.example.module_main.R.layout.main_include_wallet);
      sKeys.put("layout/main_include_watching_0", com.example.module_main.R.layout.main_include_watching);
      sKeys.put("layout/main_item_search_head_view_0", com.example.module_main.R.layout.main_item_search_head_view);
      sKeys.put("layout/main_play_history_0", com.example.module_main.R.layout.main_play_history);
      sKeys.put("layout/main_transaction_his_0", com.example.module_main.R.layout.main_transaction_his);
      sKeys.put("layout/main_transation_all_0", com.example.module_main.R.layout.main_transation_all);
      sKeys.put("layout/main_view_stub_invite_list_0", com.example.module_main.R.layout.main_view_stub_invite_list);
      sKeys.put("layout/main_view_stub_invite_now_0", com.example.module_main.R.layout.main_view_stub_invite_now);
      sKeys.put("layout/trending_content_fragment_0", com.example.module_main.R.layout.trending_content_fragment);
    }
  }
}
