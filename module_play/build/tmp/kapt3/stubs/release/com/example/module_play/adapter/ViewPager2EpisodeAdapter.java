package com.example.module_play.adapter;

import java.lang.System;

/**
 * @author: 张勇
 *
 * @date: 2023/5/22
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0006J\b\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/module_play/adapter/ViewPager2EpisodeAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "list", "", "", "episodeTotal", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "episodeNumber", "(Ljava/util/List;ILandroidx/fragment/app/FragmentActivity;I)V", "mFragment", "Lcom/example/module_play/fragment/episode/EpisodeFragment;", "mFragmentList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "getFragment", "getItemCount", "module_play_release"})
public final class ViewPager2EpisodeAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.util.List<java.lang.String> list = null;
    private final int episodeTotal = 0;
    private final int episodeNumber = 0;
    private com.example.module_play.fragment.episode.EpisodeFragment mFragment;
    private java.util.ArrayList<com.example.module_play.fragment.episode.EpisodeFragment> mFragmentList;
    
    public ViewPager2EpisodeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list, int episodeTotal, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity, int episodeNumber) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.module_play.fragment.episode.EpisodeFragment getFragment(int position) {
        return null;
    }
}