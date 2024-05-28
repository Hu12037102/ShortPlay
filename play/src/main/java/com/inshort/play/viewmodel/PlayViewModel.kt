package com.inshort.play.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.PlayRequestEntity
import com.inshort.base.entity.VideoUrlEntity
import com.inshort.base.http.RetrofitManger
import com.inshort.base.utils.getPlayUrl
import com.inshort.base.utils.readPlayVideoData
import com.inshort.base.utils.writePlayVideoData
import com.inshort.play.PlayService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

/**

 * @author: 张勇

 * @date: 2024/5/21

 */
class PlayViewModel : BaseCompatViewModel() {
    var playVideoLiveData: MutableLiveData<List<VideoUrlEntity.PlayData>> = MutableLiveData() //播放数据
    var dramaSeriesLiveData: MutableLiveData<VideoUrlEntity.DramaSeries> = MutableLiveData() //播放数据




    /**
     * 获取播放数据列表
     */
    fun requestVideoData(dramsID:Int,number:Int,searchID:Int = 0,playPath:String?=null,maxEpisode:Int = number){
        if(!playPath.isNullOrEmpty()){
            val maxLocked = if(maxEpisode >=number)maxEpisode else maxEpisode
            getCacheVideoData(dramsID,number,searchID,playPath,maxLocked)
        }
    }

    /**
     * 缓存判断
     */
    private fun getCacheVideoData(dramsID:Int,number:Int,searchID:Int = 0,playPath:String,maxEpisode:Int = number){
        viewModelScope.launch(Dispatchers.IO) {
            val data = readPlayVideoData(playPath)
            data?.let {
                //数据请求成功
                mergePlayData(dramsID,it.data,playPath,searchID,maxEpisode)
            }?: getPlayData(dramsID,number,searchID,playPath,maxEpisode)
        }
    }

    /**
     * 请求获取播放数据
     */
    private fun getPlayData(dramsID:Int,number:Int,searchID:Int = 0,playPath:String,maxEpisode:Int = number){
            // https://d1906xqz6h86jz.cloudfront.net/video/棺中凰妃/archived.json?v=1
            // video/棺中凰妃/archived.json?v=1
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                val request = Request.Builder().url("https://d1906xqz6h86jz.cloudfront.net/video/棺中凰妃/archived.json?v=1").build()
                OkHttpClient().newCall(request).enqueue(object : Callback {
                    override fun onFailure(call: Call, e: IOException) {

                    }

                    override fun onResponse(call: Call, response: Response) {
                        if(response.isSuccessful){
                            val data = response.body?.string()
                            data?.let {
                                val playUrlData = Gson().fromJson<VideoUrlEntity>(data,VideoUrlEntity::class.java)
                                if(playUrlData.code == 200  && playUrlData.data.isNotEmpty()){
                                    writePlayVideoData(playPath,data)
                                    //数据请求成功
                                    mergePlayData(dramsID,playUrlData.data,playPath,searchID,maxEpisode)
                                    return
                                }
                            }
                        }
                    }
                })
            }
        }
    }


    /**
     * 整合播放数据
     */
    private fun mergePlayData(dramsID:Int,data:List<VideoUrlEntity.PlayData>,playPath:String,searchID:Int = 0,maxUnlockedEpisode:Int){
        viewModelScope.launch(Dispatchers.Main) {
            for (index in data.indices){
                data[index].id = index
                data[index].archivedPath = playPath
                data[index].m3u8 = data[index].playUrl.getPlayUrl()
                data[index].isPurchased = index + 1 <= maxUnlockedEpisode
            }
            playVideoLiveData.value = data
            //获取剧集信息
            requestDramaSeries(dramsID,searchID)
        }
    }


    /**
     * 获取剧集信息
     */
    private fun requestDramaSeries(dramsID:Int,searchID:Int = 0){
        httpRequest(dramaSeriesLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = true) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestPlayDramaSeries(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    if(searchID > 0)it.searchDramaId = searchID
                }
            )
        }
    }

    /**
     * 整合剧集信息数据
     */
    public fun mergeDramaSeries(dramaSeriesData:VideoUrlEntity.DramaSeries){
//            playVideoLiveData.value?.let {
//                dramaSeriesData.dramaEpisodeList?.run{
//                    for (index in it.indices){
//                        it[index].startEpisodeCurrent = dramaSeriesData.playHistory.episodeNumber
//                        it[index].dramaTitle = dramaSeriesData.dramaTitle
//                        it[index].playProgress = dramaSeriesData.playHistory.playProgress
//                        it[index].episodeUpdated = dramaSeriesData.episodeUpdated
//                        it[index].collectSum = dramaSeriesData.collectSum
//                        it[index].episodeChargeStart = dramaSeriesData.episodeChargeStart
//                        it[index].isFinished = dramaSeriesData.isFinished
//                        it[index].updateTimeDesc = dramaSeriesData.updateTimeDesc
//                        it[index].isPopupPromptsToAddCollection = dramaSeriesData.isPopupPromptsToAddCollection
//                        it[index].isDramaUpdateReserved = dramaSeriesData.isDramaUpdateReserved
//                    }
//
//
//                }
//        }
    }




















}