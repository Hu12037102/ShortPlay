package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.example.module_main.fragment.me.MeFragment;
import com.example.module_main.ui.bonus.BonusHistoryActivity;
import com.example.module_main.ui.invite.InviteFriendActivity;
import com.example.module_main.ui.setting.LanguageActivity;
import com.example.module_main.ui.wallet.StoreActivity;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class ARouter$$Group$$me implements IRouteGroup {
  @Override
  public void loadInto(Map<String, RouteMeta> atlas) {
    atlas.put("/me/InviteFriendActivity", RouteMeta.build(RouteType.ACTIVITY, InviteFriendActivity.class, "/me/invitefriendactivity", "me", null, -1, -2147483648));
    atlas.put("/me/MeFragment", RouteMeta.build(RouteType.FRAGMENT, MeFragment.class, "/me/mefragment", "me", null, -1, -2147483648));
    atlas.put("/me/MeFragment/BonusHistoryActivity", RouteMeta.build(RouteType.ACTIVITY, BonusHistoryActivity.class, "/me/mefragment/bonushistoryactivity", "me", null, -1, -2147483648));
    atlas.put("/me/MeFragment/WalletActivity", RouteMeta.build(RouteType.ACTIVITY, StoreActivity.class, "/me/mefragment/walletactivity", "me", null, -1, -2147483648));
    atlas.put("/me/languageActivity", RouteMeta.build(RouteType.ACTIVITY, LanguageActivity.class, "/me/languageactivity", "me", null, -1, -2147483648));
  }
}
