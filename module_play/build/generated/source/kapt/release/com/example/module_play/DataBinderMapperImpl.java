package com.example.module_play;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.module_play.databinding.PlayActivityAliplayBindingImpl;
import com.example.module_play.databinding.PlayActivityPlayBindingImpl;
import com.example.module_play.databinding.PlayFragmentEpisodeBindingImpl;
import com.example.module_play.databinding.PlayFragmentForBindingImpl;
import com.example.module_play.databinding.PlayFragmentForTwoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_PLAYACTIVITYALIPLAY = 1;

  private static final int LAYOUT_PLAYACTIVITYPLAY = 2;

  private static final int LAYOUT_PLAYFRAGMENTEPISODE = 3;

  private static final int LAYOUT_PLAYFRAGMENTFOR = 4;

  private static final int LAYOUT_PLAYFRAGMENTFORTWO = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_play.R.layout.play_activity_aliplay, LAYOUT_PLAYACTIVITYALIPLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_play.R.layout.play_activity_play, LAYOUT_PLAYACTIVITYPLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_play.R.layout.play_fragment_episode, LAYOUT_PLAYFRAGMENTEPISODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_play.R.layout.play_fragment_for, LAYOUT_PLAYFRAGMENTFOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.module_play.R.layout.play_fragment_for_two, LAYOUT_PLAYFRAGMENTFORTWO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_PLAYACTIVITYALIPLAY: {
          if ("layout/play_activity_aliplay_0".equals(tag)) {
            return new PlayActivityAliplayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for play_activity_aliplay is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYACTIVITYPLAY: {
          if ("layout/play_activity_play_0".equals(tag)) {
            return new PlayActivityPlayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for play_activity_play is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYFRAGMENTEPISODE: {
          if ("layout/play_fragment_episode_0".equals(tag)) {
            return new PlayFragmentEpisodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for play_fragment_episode is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYFRAGMENTFOR: {
          if ("layout/play_fragment_for_0".equals(tag)) {
            return new PlayFragmentForBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for play_fragment_for is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYFRAGMENTFORTWO: {
          if ("layout/play_fragment_for_two_0".equals(tag)) {
            return new PlayFragmentForTwoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for play_fragment_for_two is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.chad.library.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/play_activity_aliplay_0", com.example.module_play.R.layout.play_activity_aliplay);
      sKeys.put("layout/play_activity_play_0", com.example.module_play.R.layout.play_activity_play);
      sKeys.put("layout/play_fragment_episode_0", com.example.module_play.R.layout.play_fragment_episode);
      sKeys.put("layout/play_fragment_for_0", com.example.module_play.R.layout.play_fragment_for);
      sKeys.put("layout/play_fragment_for_two_0", com.example.module_play.R.layout.play_fragment_for_two);
    }
  }
}
