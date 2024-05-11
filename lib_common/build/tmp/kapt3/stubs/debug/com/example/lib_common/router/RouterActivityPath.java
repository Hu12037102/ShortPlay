package com.example.lib_common.router;

import java.lang.System;

/**
 * RouterActivityPath 组件化路由
 *
 * 用于组件化开发中,ARouter Activity/Fragment路径统一注册, 注册的路径请写好注释、标注业务功能
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath;", "", "()V", "ForYou", "Home", "Login", "Main", "Me", "MyList", "lib_common_debug"})
public final class RouterActivityPath {
    
    public RouterActivityPath() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath$Main;", "", "()V", "MAIN", "", "PAGER_MAIN", "PAGER_MAIN_WEB", "lib_common_debug"})
    public static final class Main {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lib_common.router.RouterActivityPath.Main INSTANCE = null;
        private static final java.lang.String MAIN = "/main";
        
        /**
         * 主页面
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_MAIN = "/main/MainActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_MAIN_WEB = "/main/WebViewActivity";
        
        private Main() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath$Login;", "", "()V", "LOGIN", "", "PAGER_LOGIN", "lib_common_debug"})
    public static final class Login {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lib_common.router.RouterActivityPath.Login INSTANCE = null;
        private static final java.lang.String LOGIN = "/login";
        
        /**
         * 登录页面
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_LOGIN = "/login/LoginActivity";
        
        private Login() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath$Home;", "", "()V", "HOME", "", "PAGER_BONUS", "PAGER_HOME", "PAGER_HOME_MORE", "PAGER_NEW_BONUS", "PAGER_SEARCH", "PAGER_TRENDING", "PAGER_TRENDING_CONTENT", "lib_common_debug"})
    public static final class Home {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lib_common.router.RouterActivityPath.Home INSTANCE = null;
        private static final java.lang.String HOME = "/home";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_HOME = "/home/MainFragment";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_BONUS = "/home/BonusCenterActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_NEW_BONUS = "/home/NewBonusCenterActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_SEARCH = "/home/SearchActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_TRENDING = "/home/TrendingActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_HOME_MORE = "/home/HomeMoreActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_TRENDING_CONTENT = "/home/TrendingContentFragment";
        
        private Home() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath$ForYou;", "", "()V", "FOR_YOU", "", "PAGER_FOR_YOU", "PAGER_FOR_YOU_PLAY", "PAGER_FOR_YOU_PLAY2", "lib_common_debug"})
    public static final class ForYou {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lib_common.router.RouterActivityPath.ForYou INSTANCE = null;
        private static final java.lang.String FOR_YOU = "/forYou";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_FOR_YOU = "/forYou/ForYouFragment2";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_FOR_YOU_PLAY = "/forYou/PlayActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_FOR_YOU_PLAY2 = "/forYou/PlayActivity2";
        
        private ForYou() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath$MyList;", "", "()V", "MY_LIST", "", "PAGER_MY_LIST", "lib_common_debug"})
    public static final class MyList {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lib_common.router.RouterActivityPath.MyList INSTANCE = null;
        private static final java.lang.String MY_LIST = "/myList";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_MY_LIST = "/myList/MyListFragment";
        
        private MyList() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/lib_common/router/RouterActivityPath$Me;", "", "()V", "ME", "", "PAGER_BONUS_HISTORY", "PAGER_ME", "PAGER_ME_INVITE_FRIEND", "PAGER_ME_WALLET", "PAGE_LANGUAGE", "lib_common_debug"})
    public static final class Me {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lib_common.router.RouterActivityPath.Me INSTANCE = null;
        private static final java.lang.String ME = "/me";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_ME = "/me/MeFragment";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_ME_WALLET = "/me/MeFragment/WalletActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_ME_INVITE_FRIEND = "/me/InviteFriendActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGER_BONUS_HISTORY = "/me/MeFragment/BonusHistoryActivity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGE_LANGUAGE = "/me/languageActivity";
        
        private Me() {
            super();
        }
    }
}