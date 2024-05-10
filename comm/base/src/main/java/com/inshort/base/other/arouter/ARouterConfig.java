package com.inshort.base.other.arouter;

public interface ARouterConfig {
    interface Key{
        String WEB_URL="web_url";
        String WEB_TITLE="web_title";
    }
    interface Path {
        interface Splash {
            String ACTIVITY_SPLASH="/splash/activity/splash";

        }

        interface Home {
            String FRAGMENT_HOME="/home/fragment/home";

        }

        interface Search {
            String FRAGMENT_SEARCH="/search/fragment/search";

        }

        interface MyList {
            String FRAGMENT_MYLIST="/mylist/fragment/mylist";
        }

        interface Login {

        }

        interface Me {
            String FRAGMENT_ME="/me/fragment/me";

        }
        interface Main{
            String ACTIVITY_MAIN="/main/activity/main";
        }
        interface Comm{
            String ACTIVITY_WEB_CONTENT="/comm/activity/web/content";
        }

    }

}
