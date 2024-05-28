package com.example.module_play.fragment.episode;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/22
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u001a\u0010\u001c\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/example/module_play/fragment/episode/EpisodeFragment;", "Lcom/example/lib_base/fragment/BaseFragment;", "Lcom/example/lib_base/vm/BaseViewModel;", "Lcom/example/module_play/databinding/PlayFragmentEpisodeBinding;", "()V", "adapter", "Lcom/example/module_play/fragment/episode/EpisodeFragment$EpisodeAdapter;", "close", "Lkotlin/Function1;", "", "", "data", "", "", "episodeNumber", "episodeTotal", "position", "size", "viewModel", "Lcom/example/module_play/vm/PlayViewModel;", "getViewModel", "()Lcom/example/module_play/vm/PlayViewModel;", "setViewModel", "(Lcom/example/module_play/vm/PlayViewModel;)V", "init", "savedInstanceState", "Landroid/os/Bundle;", "initView", "selectPosition", "setEpisodeCurrent", "Companion", "EpisodeAdapter", "module_play_debug"})
public final class EpisodeFragment extends com.example.lib_base.fragment.BaseFragment<com.example.lib_base.vm.BaseViewModel, com.example.module_play.databinding.PlayFragmentEpisodeBinding> {
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> close;
    @org.jetbrains.annotations.Nullable()
    private com.example.module_play.vm.PlayViewModel viewModel;
    private com.example.module_play.fragment.episode.EpisodeFragment.EpisodeAdapter adapter;
    private java.util.List<java.lang.Integer> data;
    private int position = -1;
    private int episodeTotal = -1;
    private int size = -1;
    private int episodeNumber = -1;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.module_play.fragment.episode.EpisodeFragment.Companion Companion = null;
    
    public EpisodeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.module_play.vm.PlayViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.example.module_play.vm.PlayViewModel p0) {
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setEpisodeCurrent(int episodeNumber) {
    }
    
    public final void selectPosition(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> close) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0015J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/example/module_play/fragment/episode/EpisodeFragment$EpisodeAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "(Lcom/example/module_play/fragment/episode/EpisodeFragment;)V", "convert", "", "holder", "item", "onViewAttachedToWindow", "onViewDetachedFromWindow", "module_play_debug"})
    public final class EpisodeAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<java.lang.Integer, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
        
        public EpisodeAdapter() {
            super(0, null);
        }
        
        @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "ResourceType"})
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.viewholder.BaseViewHolder holder, int item) {
        }
        
        /**
         * item里控件实现动画
         * 需要在这个方法里实现
         * convert方法不行
         */
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.viewholder.BaseViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/module_play/fragment/episode/EpisodeFragment$Companion;", "", "()V", "newInstance", "Lcom/example/module_play/fragment/episode/EpisodeFragment;", "position", "", "episodeTotal", "size", "episodeNumber", "module_play_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.module_play.fragment.episode.EpisodeFragment newInstance(int position, int episodeTotal, int size, int episodeNumber) {
            return null;
        }
    }
}