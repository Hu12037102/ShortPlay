package com.inshort.base.other.arouter;

public interface ARouterConfig {
    interface Key{
        String WEB_URL="web_url";
        String WEB_TITLE="web_title";

        String IS_HIS = "is_his";

        int LIST_HISTORY =1; //历史记录
        int LIST_LOVE =2;  //喜爱记录
        String CONTENT = "content";
        String ID = "id";
        String SERIALIZABLE="serializable";
        String NUMBER="number";

        String PARCELABLE="parcelable";

        String DRAMS_ID ="dramsID";  //剧集ID
        String NUMBER_ ="number";  //集数
        String SEARCH_ID ="searchID"; //搜索ID
        String PLAY_PATH ="playPath"; //路径

        String ARCHIVED_VERSION ="archivedVersion"; //版本
        String MAX_EPISODE ="maxEpisode"; //最大集
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
            String DIALOG_NEW_EPISODE = "/home/dialog/new/episode";

        }

        interface Search {
            String FRAGMENT_SEARCH = "/search/fragment/search";

        }

        interface MyList {

            String FRAGMENT_MYLIST="/mylist/fragment/mylist";

            // back his
            String ACTIVITY_BACK_HIS="/back/activity/his";
        }

        interface Play {
            String PLAY_ACTIVITY_PLAY="/play/activity/play";
        }

        interface Login {
            String LOGIN_ACTIVITY_LOGIN="/login/activity/login";
        }

        interface Me {
            String FRAGMENT_ME = "/me/fragment/me";
            String ACTIVITY_SETTING="/me/activity/setting";
            String ACTIVITY_MY_WALLET="/me/activity/my/wallet";
            String DIALOG_DELETE_ACCOUNT="/me/dialog/delete/account";
            String ACTIVITY_TRANSACTION_HISTORY="/me/activity/transaction/history";
            String ACTIVITY_EPISODES_UNLOCKED="/me/activity/episodes/unlocked";
            String ACTIVITY_BONUS_EXPIRE="/me/activity/bonus/expire";
            String ACTIVITY_STORE="/me/activity/store";
            String DIALOG_CHECK_IN="/me/dialog/check/in";
            String DIALOG_CHECK_IN_AWARD="/me/dialog/check/in/award";

        }

        interface Main {
            String ACTIVITY_MAIN = "/main/activity/main";
        }

        interface Comm {
            String ACTIVITY_WEB_CONTENT = "/comm/activity/web/content";
            String DIALOG_TITLE = "/comm/dialog/title";
            String DIALOG_PRIVACY_AGREEMENT = "/comm/dialog/privacy/agreement";
            String DIALOG_VERSION_UPDATING = "/comm/dialog/version/updating";
        }

    }

}
