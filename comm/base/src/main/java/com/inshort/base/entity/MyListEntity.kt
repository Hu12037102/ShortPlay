package com.inshort.base.entity

import com.google.gson.annotations.SerializedName

/**

 * @author: 张勇

 * @date: 2024/5/14

 */
data class MyListEntity(
    @SerializedName("playback_history")
    var playbackHistory:ArrayList<HistoryData>,
    @SerializedName("my_list")
    var myList: ArrayList<CollectData>,
    @SerializedName("tips_dict")
    var tipsDict:TipsDict?=null){
    data class HistoryData(
        @SerializedName("cover_image_url")
        val coverImageUrl: String = "", // https://funtv-ap-sourtheast-1-1.s3.amazonaws.com/cover_image/742b24f6-f916-11ed-8d35-000c29f24a09.png?response-content-disposition=inline&response-content-type=image%2Fpng&AWSAccessKeyId=AKIASLC6GLMEQOWBWVU7&Signature=Q0lTL3mIbpBjbT%2BTIZnXzgQ1sk0%3D&Expires=1685070978
        @SerializedName("drama_classify")
        val dramaClassify: List<String> = listOf(),
        @SerializedName("drama_series_id")
        val dramaSeriesId: Int = 0, // 4
        @SerializedName("drama_title")
        val dramaTitle: String = "", // Friends
        @SerializedName("episode_charge_start")
        val episodeChargeStart: Int = 0, // 1
        @SerializedName("episode_coin")
        val episodeCoin: Int = 0, // 2
        @SerializedName("episode_number")
        val episodeNumber: Int = 0, // 1
        @SerializedName("episode_total")
        val episodeTotal: Int = 0, // 11
        @SerializedName("episode_updated")
        val episodeUpdated: Int = 0,
        @SerializedName("is_auto_lock")
        var isAutoLock: Boolean = false, // 相思相见知何日？此时此夜难为情！
        @SerializedName("introduction")
        val introduction: String = "", // 君不见黄河之水天上来，奔流到海不复回。222
        @SerializedName("is_collected")
        var isCollected: Boolean = false, // false
        @SerializedName("max_unlocked_episode")
        var max_unlocked_episode: Int = 0, // false
        @SerializedName("archived_path")
        val archivedPath: String = "", // archived_path
        @SerializedName("collect_sum")
        var collect_sum: Int = 0, // 相思相见知何日？此时此夜难为情！
        @SerializedName("is_finished")
        val isFinished: Boolean = false, // false
        @SerializedName("last_time")
        val lastTime: Int = 0, // 1685009079
        @SerializedName("play_progress")
        val playProgress: Int = 0, // 0
        @SerializedName("playback_record_id")
        val playbackRecordId: Int = 0, // 4
        @SerializedName("progress_percentage")
        val progressPercentage: Int = 0 ,// 0
        @SerializedName("is_delete")
        var isDelete: Boolean = false,//状态选中  false
        @SerializedName("has_updated")
        var hasUpdated: Boolean = false,//状态选中  false
        @SerializedName("archived_version")
        val archivedVersion: String = "", // archived_version
        @SerializedName("is_state")
        var isState: Boolean = false  //删除/点赞  状态切换

    )


    data class CollectData(
        @SerializedName("cover_image_url")
        val coverImageUrl: String = "", // https://funtv-ap-sourtheast-1-1.s3.amazonaws.com/cover_image/2add6a22-f932-11ed-87ef-000c29f24a09.png?response-content-disposition=inline&response-content-type=image%2Fpng&AWSAccessKeyId=AKIASLC6GLMEQOWBWVU7&Signature=3X5bpkYIaRhmrxfgU7onb4GlGf0%3D&Expires=1685070978
        @SerializedName("drama_classify")
        val dramaClassify: List<String> = listOf(),
        @SerializedName("drama_series_id")
        val dramaSeriesId: Int = 0, // 6
        @SerializedName("drama_title")
        val dramaTitle: String = "", // you 3
        @SerializedName("episode_charge_start")
        val episodeChargeStart: Int = 0, // 2
        @SerializedName("is_collected")
        var isCollected: Boolean = false, // false
        @SerializedName("last_time")
        val lastTime: Int = 0, // 1685009079
        @SerializedName("episode_coin")
        val episodeCoin: Int = 0, // 2
        @SerializedName("episode_total")
        val episodeTotal: Int = 0, // 26
        @SerializedName("introduction")
        val introduction: String = "", // 入我相思门，知我相思苦。
        @SerializedName("is_finished")
        val isFinished: Boolean = false, // false
        @SerializedName("episode_number")
        val episodeNumber: Int = 0, // 1
        @SerializedName("list_type")
        val listType: Int = 0, // 1
        @SerializedName("embed_link")
        val embedLink: String = "", // 1
        @SerializedName("episode_updated")
        val episodeUpdated: Int = 0, // 1
        @SerializedName("is_delete")
        var isDelete: Boolean = false, // 状态选中 false
        @SerializedName("has_updated")
        var hasUpdated: Boolean = false,//状态选中  false
        @SerializedName("is_need_tips")
        var isNeedTips: Boolean = false,
        @SerializedName("archived_path")
        val archivedPath: String = "", // archived_path
        @SerializedName("archived_version")
        val archivedVersion: String = "", // archived_version
        @SerializedName("max_unlocked_episode")
        var maxUnlockedEpisode: Int = 0, // 1
        @SerializedName("is_state")
        var isState: Boolean = false  //删除/点赞  状态切换
    )

    data class TipsDict(
        @SerializedName("completed_tips")
        var completedTips: Boolean = false,
        @SerializedName("update_tips")
        var updateTips: Boolean = false,
        @SerializedName("follow_tips")
        var followTips: Boolean = false,
    )


    data class PlayBackHis(
        @SerializedName("cover_image_url")
        var coverImageUrl: String = "",
        @SerializedName("is_need_tips")
        var isNeedTips: Boolean = false,
        @SerializedName("episode_updated")
        val episodeUpdated: Int = 0, // 1
        @SerializedName("drama_series_id")
        val dramaSeriesId: Int = 0, // 6
        @SerializedName("drama_title")
        val dramaTitle: String = "", // you 3
        @SerializedName("is_finished")
        val isFinished: Boolean = false, // false
        @SerializedName("episode_number")
        val episodeNumber: Int = 0, // 1
        @SerializedName("is_delete")
        var isDelete: Boolean = false, // 状态选中 false
        @SerializedName("is_state")
        var isState: Boolean = false  //删除/点赞  状态切换

    )

}
