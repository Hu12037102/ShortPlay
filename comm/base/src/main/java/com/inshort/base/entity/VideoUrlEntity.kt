package com.inshort.base.entity

import com.google.gson.annotations.SerializedName

/**

 * @author: 张勇

 * @date: 2024/5/24

 */
data class VideoUrlEntity(
    @SerializedName("code")
    val code: Int = 0, // 200
    @SerializedName("data")
    val `data`: List<PlayData> = listOf(),
    @SerializedName("message")
    val message: String = "" // Success

){
    /**
     * 播放数据
     */
    data class PlayData(
        @SerializedName("id")
        var id: Int = 0, // 1
        @SerializedName("episode_number")
        val episodeNumber: Int = 0,
        @SerializedName("play_url")
        val playUrl: String = "",
        @SerializedName("is_purchased")
        var isPurchased: Boolean = false,
        @SerializedName("archived_path")
        var archivedPath: String = "",
        @SerializedName("m3u8")
        var m3u8: String = "" ,
        @SerializedName("thumbnails_image_url")
        val thumbnailsImageUrl: String = "",
        @SerializedName("episode_coins")
        var episodeCoins: Int = 0,
        @SerializedName("is_liked")
        var isLiked: Boolean = false,
        @SerializedName("like_sum")
        var likeSum: Int = 0,

    )


    /**
     * 剧集信息
     */
    data class DramaSeries(
        @SerializedName("play_history")
        val playHistory: PlayHistory = PlayHistory(),
        @SerializedName("drama_title")
        val dramaTitle: String = "",
        @SerializedName("episode_updated")
        val episodeUpdated: Int = 0,
        @SerializedName("collect_sum")
        var collectSum: Int =0,
        @SerializedName("episode_charge_start")
        val episodeChargeStart: Int = 0, // 1
        @SerializedName("cover_image_url")
        val coverImageUrl: String = "",
        @SerializedName("is_finished")
        val isFinished: Boolean = false,
        @SerializedName("update_time_desc")
        var updateTimeDesc: String = "",
        @SerializedName("is_popup_prompts_to_add_collection")
        var isPopupPromptsToAddCollection: Boolean = false,
        @SerializedName("is_auto_unlock")
        var isAutoLock: Boolean = false,
        @SerializedName("is_collected")
        var is_collected: Boolean = false,
        @SerializedName("drama_episode_list")
        var dramaEpisodeList: ArrayList<DramaEpisodeList>? = ArrayList(),
        @SerializedName("is_drama_update_reserved")
        var isDramaUpdateReserved: Boolean = false,



        ){
        data class PlayHistory(
            @SerializedName("episode_number")
            val episodeNumber: Int = 0, //
            @SerializedName("play_progress")
            val playProgress: Int = 0, //
            @SerializedName("progress_percentage")
            val progressPercentage: Int =0, // #ff0000
            @SerializedName("last_time")
            val lastTime: Int = 0, // #ff0000
            @SerializedName("thumbnails_image_url")
            val thumbnails_image_url: String = "", // #ff0000
            @SerializedName("play_url_list")
            var playUrlList: List<String> = listOf(),

        )
        data class DramaEpisodeList(
            @SerializedName("episode_number")
            val episodeNumber: Int = 0, //
            @SerializedName("is_purchased")
            var isPurchased: Boolean = false,
            @SerializedName("episode_coins")
            var episodeCoins: Int = 0,
            @SerializedName("is_liked")
            var isLiked: Boolean = false,
            @SerializedName("like_sum")
            var likeSum: Int = 0,

        )



    }
}
