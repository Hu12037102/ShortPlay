package com.inshort.base.compat

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huxiaobai.adapter.BaseRecyclerAdapter
import com.inshort.base.weight.view.EmptyLayout

object AdapterCompat {
    @JvmStatic
    fun notifyDataEmptyView(emptyView: EmptyLayout?, data: List<*>?) {
        if (emptyView == null || data == null) {
            return
        }
        if (CollectionCompat.isEmptyList(data)) {
            emptyView.show()
        } else {
            emptyView.hide()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    @JvmStatic
    fun <T> notifyAdapterAddDateChanged(
        emptyView: EmptyLayout? = null,
        adapter: RecyclerView.Adapter<*>?,
        isRefresh: Boolean = true,
        parentData: ArrayList<T>,
        addData: List<T>?,
        notMoreFootView: View? = null
    ) {
        if (isRefresh) {
            parentData.clear()
        }
        if (CollectionCompat.notEmptyList(addData)) {
            parentData.addAll(addData!!)
        }
        if (adapter is BaseRecyclerAdapter<*> && notMoreFootView != null) {
            if (adapter.mHasFootView) {
                adapter.removeFootView()
            }
            adapter.addFootView(notMoreFootView)
            /* if (CollectionCompat.isEmptyList(addData) && CollectionCompat.notEmptyList(parentData)) {
                 adapter.addFootView(notMoreFootView)
             } else {
                 adapter.removeFootView()
             }*/

        }

        adapter?.notifyDataSetChanged()
        notifyDataEmptyView(emptyView, parentData)
    }

    @SuppressLint("NotifyDataSetChanged")
    @JvmStatic
    fun <T> notifyAdapterUpdateDateChanged(
        emptyView: EmptyLayout?,
        adapter: RecyclerView.Adapter<*>?,
        parentData: ArrayList<T>,
    ) {
        adapter?.notifyDataSetChanged()
        notifyDataEmptyView(emptyView, parentData)
    }

    @JvmStatic
    fun showRecyclerViewDataEmptyView(parentView: View?, emptyView: EmptyLayout?) {
        if (emptyView == null) {
            return
        }

        if (parentView is ViewGroup) {
            if (parentView is RecyclerView) {
                val adapter = parentView.adapter
                if (adapter is BaseRecyclerAdapter<*> && adapter.itemCount > 0) {
                    emptyView.hide()
                    return
                } else {
                    emptyView.show()
                }
            } else {
                for (i in 0 until parentView.childCount) {
                    val childView = parentView.getChildAt(i)
                    showRecyclerViewDataEmptyView(childView, emptyView)
                }
            }
        } else {
            emptyView.show()
        }

    }

}