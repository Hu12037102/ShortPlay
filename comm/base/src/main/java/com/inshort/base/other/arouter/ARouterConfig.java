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

        }

        interface Search {

        }

        interface MyList {

        }

        interface Login {

        }

        interface Me {

        }
        interface Main{
            String ACTIVITY_MAIN="/main/activity/main";
        }
        interface Comm{
            String ACTIVITY_WEB_CONTENT="/comm/activity/web/content";
        }

    }
}
