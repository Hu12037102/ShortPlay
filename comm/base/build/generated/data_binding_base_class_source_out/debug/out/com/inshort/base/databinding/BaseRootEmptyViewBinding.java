// Generated by view binder compiler. Do not edit!
package com.inshort.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inshort.base.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BaseRootEmptyViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView aivEmptyContent;

  @NonNull
  public final AppCompatTextView atvEmptyContent;

  private BaseRootEmptyViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView aivEmptyContent, @NonNull AppCompatTextView atvEmptyContent) {
    this.rootView = rootView;
    this.aivEmptyContent = aivEmptyContent;
    this.atvEmptyContent = atvEmptyContent;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BaseRootEmptyViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BaseRootEmptyViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.base_root_empty_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BaseRootEmptyViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.aiv_empty_content;
      AppCompatImageView aivEmptyContent = ViewBindings.findChildViewById(rootView, id);
      if (aivEmptyContent == null) {
        break missingId;
      }

      id = R.id.atv_empty_content;
      AppCompatTextView atvEmptyContent = ViewBindings.findChildViewById(rootView, id);
      if (atvEmptyContent == null) {
        break missingId;
      }

      return new BaseRootEmptyViewBinding((ConstraintLayout) rootView, aivEmptyContent,
          atvEmptyContent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
