package com.inshort.base.other.arouter;

public interface ARouterConfig {
<<<<<<< HEAD
    interface Key{
        String WEB_URL="web_url";
        String WEB_TITLE="web_title";

        String IS_HIS = "is_his";

        int LIST_HISTORY =1; //历史记录
        int LIST_LOVE =2;  //喜爱记录
=======
    interface Key {
        String WEB_URL = "web_url";
        String WEB_TITLE = "web_title";
        String CONTENT = "content";
        String ID = "id";
>>>>>>> feature.inshort.1000.hql
    }

    interface Path {
        interface Splash {
            String ACTIVITY_SPLASH = "/splash/activity/splash";

        }

        interface Home {
            String FRAGMENT_HOME = "/home/fragment/home";
            String ACTIVITY_TRENDING = "/home/activity/trending";
            String FRAGMENT_TRENDING_CONTENT = "/home/fragment/trending/content";
            String ACTIVITY_VIEW_MORE = "/home/activity/view/more";

        }

        interface Search {
            String FRAGMENT_SEARCH = "/search/fragment/search";

        }

        interface MyList {
<<<<<<< HEAD
            String FRAGMENT_MYLIST="/mylist/fragment/mylist";

            // back his
            String ACTIVITY_BACK_HIS="/back/activity/his";
=======
            String FRAGMENT_MYLIST = "/mylist/fragment/mylist";
>>>>>>> feature.inshort.1000.hql
        }

        interface Login {

        }

        interface Me {
            String FRAGMENT_ME = "/me/fragment/me";

        }

        interface Main {
            String ACTIVITY_MAIN = "/main/activity/main";
        }

        interface Comm {
            String ACTIVITY_WEB_CONTENT = "/comm/activity/web/content";
        }

    }

}
