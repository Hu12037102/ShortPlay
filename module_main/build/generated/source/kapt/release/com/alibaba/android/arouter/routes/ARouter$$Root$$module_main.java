package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class ARouter$$Root$$module_main implements IRouteRoot {
  @Override
  public void loadInto(Map<String, Class<? extends IRouteGroup>> routes) {
    routes.put("home", ARouter$$Group$$home.class);
    routes.put("main", ARouter$$Group$$main.class);
    routes.put("me", ARouter$$Group$$me.class);
    routes.put("myList", ARouter$$Group$$myList.class);
  }
}
