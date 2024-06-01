package com.inshort.play.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.inshort.base.core.viewmodel.BaseCompatViewModel
import com.inshort.base.entity.LikeHistoryEntity
import com.inshort.base.entity.PlayRequestEntity
import com.inshort.base.entity.StoreEntity
import com.inshort.base.entity.VideoPurchaseEntity
import com.inshort.base.entity.VideoUrlEntity
import com.inshort.base.event.SingleLiveEvent
import com.inshort.base.http.RetrofitManger
import com.inshort.base.utils.LogUtils
import com.inshort.base.utils.getPlayUrl
import com.inshort.base.utils.readPlayVideoData
import com.inshort.base.utils.switchPlayPath
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
    var currentPosition:Int = 0  //当前进度
    var extraValue:Long = 0 //当前进度毫秒
    var positionLiveData : MutableLiveData<Int> = MutableLiveData(-1) //当前播放的位置
    var selectEpisodeLiveData : MutableLiveData<VideoUrlEntity.DramaSeries.DramaEpisodeList> = MutableLiveData() // 选中剧集
    var isAutoUnlockLiveData : MutableLiveData<Boolean> = MutableLiveData() // 是否开启默认解锁下一集


    var playVideoLiveData: MutableLiveData<List<VideoUrlEntity.PlayData>> = MutableLiveData() //播放数据
    var dramaSeriesLiveData: MutableLiveData<VideoUrlEntity.DramaSeries> = MutableLiveData() //播放数据
    var playStateLiveData : MutableLiveData<Int> = MutableLiveData(-1)  //播放状态
    var likeHistoryLiveData : MutableLiveData<LikeHistoryEntity> = MutableLiveData()  //点赞/收藏
    var friendLiveData : SingleLiveEvent<String> = SingleLiveEvent() //邀请
    var purchaseLiveData : SingleLiveEvent<VideoPurchaseEntity> = SingleLiveEvent() //金币解锁
    val storeLiveData = MutableLiveData<StoreEntity>()  //商品信息


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
            LogUtils.d("getPlayData data>> $data")
            data?.let {
                //数据请求成功
                mergePlayData(dramsID,it.data,playPath,searchID,maxEpisode)
            }?: getPlayData(dramsID,number,searchID,playPath,maxEpisode,playPath.switchPlayPath(path = playPath))
        }
    }

    /**
     * 请求获取播放数据
     */
    private fun getPlayData(dramsID:Int,number:Int,searchID:Int = 0,playPath:String,maxEpisode:Int = number,url:String){
            // https://d1906xqz6h86jz.cloudfront.net/video/棺中凰妃/archived.json?v=1
            // video/棺中凰妃/archived.json?v=1
        LogUtils.d("getPlayData  >>> $url")
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                val request = Request.Builder().url(url).build()
                OkHttpClient().newCall(request).enqueue(object : Callback {
                    override fun onFailure(call: Call, e: IOException) {
                        getPlayDataError(url,playPath)
                    }
                    override fun onResponse(call: Call, response: Response) {
                        if(response.isSuccessful){
                            val data = response.body?.string()
                            LogUtils.d("getPlayData >> ${Gson().toJson(data)}")
                            data?.let {
                                val playUrlData = Gson().fromJson<VideoUrlEntity>(data,VideoUrlEntity::class.java)
                                if(playUrlData.code == 200  && playUrlData.data.isNotEmpty()){
                                    writePlayVideoData(playPath,data)
                                    //数据请求成功
                                    mergePlayData(dramsID,playUrlData.data,playPath,searchID,maxEpisode)
                                    return
                                }else{ getPlayDataError(url,playPath)}
                            }?: getPlayDataError(url,playPath)
                        }else{ getPlayDataError(url,playPath)}
                    }
                })
            }.onFailure {

            }
        }
    }

    /**
     * 获取播放数据列表失败，重试机制
     */
    private fun getPlayDataError(url:String,path:String){
        url.switchPlayPath(path = path)
//        getPlayData()
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
        httpRequest(dramaSeriesLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestPlayDramaSeries(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    if(searchID > 0)it.searchDramaId = searchID
                }
            ).apply {
                isAutoUnlockLiveData.value = this.data?.isAutoLock
            }
        }
    }

    /**
     * 点赞
     */
    public fun requestLiked(dramsID:Int,episodeNumber:Int,isLiked: Boolean){
        httpRequest(likeHistoryLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestLikeHistory(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    it.episodeNumber = episodeNumber
                    it.isCancel = !isLiked
                }
            )
        }
    }

    /**
     * 收藏
     */
    public fun requestCollection(dramsID:Int,episodeNumber:Int,isCollected: Boolean){
        httpRequest(likeHistoryLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestCollectHistory(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    it.episodeNumber = episodeNumber
                    it.isCancel = !isCollected
                }
            )
        }
    }

    /**
     * 邀请好友
     */
    public fun requestFriend(dramsID:Int,episodeNumber:Int){
        httpRequest(friendLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestFriend(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    it.episodeNumber = episodeNumber
                }
            )
        }
    }

    /**
     * 金币解锁
     */
    public fun purchaseEpisode(dramsID:Int,episodeNumber:Int,position:Int,isPreloading:Boolean){
        httpRequest(purchaseLiveData, isShowLoading = false, isShowEmptyView = false, isJustRefresh = false) {
          RetrofitManger.getInstance().create(PlayService::class.java).requestPurchase(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    it.episodeNumber = episodeNumber
                }
            ).apply {
                this.data?.position= position
                this.data?.episodeNumber = episodeNumber
                this.data?.isPreloading = isPreloading
                updateBalance(this.data?.userBalance,this.data?.userCoinsBalance,this.data?.userBonusBalance)
                dramaSeriesLiveData.value?.dramaEpisodeList?.let {
                  if(it.size > position){ it[position].isPurchased =true }
              }
          }

        }
    }

    /**
     * 获取商品信息
     */
    fun requestStore(dramsID:Int,episodeNumber:Int) {
        httpRequest(storeLiveData, isShowEmptyView = false, isShowLoading = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestStore(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    it.episodeNumber = episodeNumber
                }
            ).also {
                updateBalance(it.data?.balance , it.data?.coinsBalance , it.data?.bonusBalance )
            }
        }
    }

    fun requestIsAutoUnlock(isAutoUn:Boolean,dramsID:Int){
        httpRequest(notResultLiveData, isShowEmptyView = false, isShowLoading = false, isJustRefresh = false) {
            RetrofitManger.getInstance().create(PlayService::class.java).requestAutoLock(
                PlayRequestEntity().also {
                    it.dramaSeriesId = dramsID
                    it.isAutoUnlock = isAutoUn
                }
            )
        }
    }















}