package com.example.module_play.aliplayer.auivideo;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/9/25
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u0000 ]2\u00020\u0001:\u0001]B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\tH\u0002J\u0006\u00103\u001a\u000201J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\u001bH\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\u000eH\u0016J\n\u0010:\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u001bJ\u0010\u0010=\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0010\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020*H\u0002J\u0010\u0010@\u001a\u0002012\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010A\u001a\u0002012\u0006\u0010?\u001a\u00020*H\u0002J\u0010\u0010B\u001a\u0002012\u0006\u0010C\u001a\u000205H\u0002J\u0010\u0010D\u001a\u0002012\u0006\u0010C\u001a\u000205H\u0002J\u0010\u0010E\u001a\u0002012\u0006\u0010C\u001a\u000205H\u0002J\u0010\u0010F\u001a\u0002012\u0006\u0010C\u001a\u000205H\u0002J\u0006\u0010G\u001a\u000201J\u0010\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020\u001bH\u0002J\b\u0010J\u001a\u00020\u001bH\u0016J\u0010\u0010K\u001a\u0002012\u0006\u00102\u001a\u00020\tH\u0002J\u0010\u0010L\u001a\u0002012\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010M\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010OH\u0002J\u0016\u0010P\u001a\u0002012\u0006\u0010?\u001a\u00020*2\u0006\u0010+\u001a\u00020\tJ\b\u0010Q\u001a\u000201H\u0016J\b\u0010R\u001a\u000201H\u0016J\u0010\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020\u001bH\u0002J\b\u0010U\u001a\u000201H\u0016J\b\u0010V\u001a\u000201H\u0016J\b\u0010W\u001a\u000201H\u0016J\u0006\u0010X\u001a\u000201J\u0006\u0010Y\u001a\u000201J\u0018\u0010Z\u001a\u0002012\b\b\u0002\u0010K\u001a\u00020\t2\u0006\u00100\u001a\u00020\tJ\u0006\u0010[\u001a\u000201J\u0006\u0010\\\u001a\u000201R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"}, d2 = {"Lcom/example/module_play/aliplayer/auivideo/AUIVideoManger;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickListener", "Lcom/example/module_play/ui/listentr/PlayerViewClickListener;", "collectImage", "Landroid/widget/ImageView;", "collectText", "Landroid/widget/TextView;", "currentTv", "episodeName", "epsTv", "flashDiscountTv", "flashInclude", "Landroid/widget/RelativeLayout;", "imageViewReturn", "includeRight", "includeTop", "isHeideStartView", "", "isHeideView", "likeImage", "likeText", "lineTv", "loading", "loadingAnim", "Landroid/graphics/drawable/AnimationDrawable;", "mContext", "mHandler", "Landroid/os/Handler;", "mSeekBar", "Landroidx/appcompat/widget/AppCompatSeekBar;", "numTv", "playBeanData", "Lcom/example/lib_http/bean/data/PlayBeanData;", "position", "startIV", "thumbImage", "titleTv", "totalTv", "collectSum", "", "sum", "episodeView", "getCoverView", "Landroid/view/View;", "getIsHeide", "getSeekBar", "Landroid/widget/ProgressBar;", "getStartIcon", "getTotal", "heideShowView", "isHeide", "init", "initDataButton", "mData", "initDataCenter", "initDataRight", "initViewBottom", "mInflateView", "initViewCenter", "initViewRight", "initViewTop", "isCollect", "isLike", "is_like", "isPlayActivity", "likeSum", "listener", "loadCoverImage", "url", "", "loadData", "loadingAnimStart", "loadingAnimStop", "nestedScrollingEnabled", "isScroll", "onDetached", "onItemClick", "reckonTime", "removeMessages", "seekbarShow", "setSum", "startState", "statePause", "Companion", "module_play_release"})
public class AUIVideoManger extends android.widget.FrameLayout {
    private int position = 0;
    private boolean isHeideView = false;
    private boolean isHeideStartView = false;
    private android.content.Context mContext;
    private android.widget.ImageView thumbImage;
    private android.widget.ImageView startIV;
    private android.widget.ImageView loading;
    private android.graphics.drawable.AnimationDrawable loadingAnim;
    private androidx.appcompat.widget.AppCompatSeekBar mSeekBar;
    private android.widget.RelativeLayout includeRight;
    private android.widget.RelativeLayout flashInclude;
    private android.widget.ImageView likeImage;
    private android.widget.TextView likeText;
    private android.widget.ImageView collectImage;
    private android.widget.TextView collectText;
    private android.widget.TextView flashDiscountTv;
    private android.widget.TextView episodeName;
    private android.widget.TextView epsTv;
    private android.widget.RelativeLayout includeTop;
    private android.widget.RelativeLayout imageViewReturn;
    private android.widget.TextView titleTv;
    private android.widget.TextView numTv;
    private android.widget.TextView currentTv;
    private android.widget.TextView lineTv;
    private android.widget.TextView totalTv;
    private com.example.lib_http.bean.data.PlayBeanData playBeanData;
    private com.example.module_play.ui.listentr.PlayerViewClickListener clickListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_play.aliplayer.auivideo.AUIVideoManger.Companion Companion = null;
    public static final int MSG_PLAY_ = 1;
    public static final int MSG_PLAY_PAGE_ = 2;
    private final android.os.Handler mHandler = null;
    
    public AUIVideoManger(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public AUIVideoManger(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AUIVideoManger(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    private final void init(android.content.Context context) {
    }
    
    private final void initViewRight(android.view.View mInflateView) {
    }
    
    private final void initDataRight(com.example.lib_http.bean.data.PlayBeanData mData) {
    }
    
    private final void isLike(boolean is_like) {
    }
    
    private final void likeSum(int sum) {
    }
    
    public final void isCollect() {
    }
    
    private final void collectSum(int sum) {
    }
    
    private final void initViewTop(android.view.View mInflateView) {
    }
    
    private final void initViewBottom(android.view.View mInflateView) {
    }
    
    private final void initDataButton(com.example.lib_http.bean.data.PlayBeanData mData) {
    }
    
    private final void initViewCenter(android.view.View mInflateView) {
    }
    
    private final void initDataCenter(com.example.lib_http.bean.data.PlayBeanData playBeanData) {
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    com.example.lib_http.bean.data.PlayBeanData mData, int position) {
    }
    
    public final void listener(@org.jetbrains.annotations.Nullable()
    com.example.module_play.ui.listentr.PlayerViewClickListener clickListener) {
    }
    
    private final void loadCoverImage(java.lang.String url) {
    }
    
    private final void nestedScrollingEnabled(boolean isScroll) {
    }
    
    public final void episodeView() {
    }
    
    public final void setSum(int likeSum, int collectSum) {
    }
    
    public final void heideShowView(boolean isHeide) {
    }
    
    public final void startState() {
    }
    
    public final void seekbarShow() {
    }
    
    public final void statePause() {
    }
    
    public void reckonTime() {
    }
    
    public final void removeMessages() {
    }
    
    public void onItemClick() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView getStartIcon() {
        return null;
    }
    
    public boolean getIsHeide() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.view.View getCoverView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.TextView getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.ProgressBar getSeekBar() {
        return null;
    }
    
    public boolean isPlayActivity() {
        return false;
    }
    
    public void loadingAnimStart() {
    }
    
    public void loadingAnimStop() {
    }
    
    public void onDetached() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/module_play/aliplayer/auivideo/AUIVideoManger$Companion;", "", "()V", "MSG_PLAY_", "", "MSG_PLAY_PAGE_", "module_play_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}