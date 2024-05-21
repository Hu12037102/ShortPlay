package com.inshort.search.adapter;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.huxiaobai.adapter.BaseRecyclerAdapter;
import com.inshort.base.compat.DataCompat;
import com.inshort.base.compat.GradientDrawableCompat;
import com.inshort.base.compat.PhoneCompat;
import com.inshort.base.compat.UICompat;
import com.inshort.base.entity.SearchPageEntity;
import com.inshort.base.html.HtmlHandler;
import com.inshort.base.other.glide.GlideCompat;
import com.inshort.search.databinding.ItemSeacherViewBinding;

import java.util.List;

public class SearchAdapter extends BaseRecyclerAdapter<SearchPageEntity.Info> {
    public SearchAdapter(@NonNull Context mContext, @NonNull List<? extends SearchPageEntity.Info> mData) {
        super(mContext, mData);
    }

    @Override
    public void onBindChildViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        SearchPageEntity.Info entity = getMData().get(i);
        if (viewHolder instanceof SearchAdapter.ViewHolder holder) {
            try {
                if (entity.episodeUpdated == 0 || entity.isFinished) {
                    holder.viewBinding.atvUpdate.setVisibility(View.GONE);
                } else {
                    holder.viewBinding.atvUpdate.setVisibility(View.VISIBLE);
                    UICompat.setText(holder.viewBinding.atvUpdate, DataCompat.getResString(getMContext(), com.inshort.base.R.string.update_to_s, DataCompat.toString(entity.episodeUpdated)));
                    ViewCompat.setBackground(holder.viewBinding.atvUpdate, GradientDrawableCompat.getUpdateEpisodeBackground(getMContext()));
                }
                GlideCompat.loadImage(entity.imageUrl, holder.viewBinding.aivContent);
                Spanned spanned = HtmlCompat.fromHtml(
                        //"测试啊本月已成功邀请 <font color=\"#FF0000\">" + 100 + "</font>人",
                        DataCompat.toString(entity.dramaTitle).replace("span", "newSpan"),
                        HtmlCompat.FROM_HTML_MODE_COMPACT,
                        null,
                        new HtmlHandler("newSpan", getMContext())
                );
                UICompat.setText(holder.viewBinding.atvContent, spanned);
                if (i % 2 == 0) {
                    holder.viewBinding.clContent.setPadding(PhoneCompat.dp2px(getMContext(), 18), 0, PhoneCompat.dp2px(getMContext(), 10), 0);
                } else {
                    holder.viewBinding.clContent.setPadding(PhoneCompat.dp2px(getMContext(), 10), 0, PhoneCompat.dp2px(getMContext(), 18), 0);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(ItemSeacherViewBinding.inflate(LayoutInflater.from(getMContext()), viewGroup, false));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemSeacherViewBinding viewBinding;

        public ViewHolder(@NonNull ItemSeacherViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }
    }
}
