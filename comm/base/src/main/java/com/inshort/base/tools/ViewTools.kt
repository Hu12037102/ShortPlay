package com.inshort.base.tools

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huxiaobai.adapter.BaseRecyclerAdapter
import com.inshort.base.weight.EmptyLayout
import com.scwang.smart.refresh.layout.SmartRefreshLayout

class ViewTools {
    private val mData = ArrayList<View>()

    private fun traversalView(parentView: View?) {
        if (parentView == null) {
            return
        }
        mData.add(parentView)
        if (parentView is ViewGroup) {
            for (i in 0 until parentView.childCount) {
                val view = parentView.getChildAt(i)
                traversalView(view)
            }
        }

    }


    private fun showRecyclerViewDataEmptyView(emptyView: EmptyLayout?) {
        if (emptyView == null) {
            return
        }
        for (view in mData) {
            if (view is RecyclerView) {
                val adapter = view.adapter
                if (adapter is BaseRecyclerAdapter<*> && adapter.itemCount > 0) {
                    emptyView.hide()
                    return
                }
            }
        }
        emptyView.show()
    }

    fun findSmartRefreshLayout(parentView: View?): SmartRefreshLayout? {
        mData.clear()
        traversalView(parentView)
        for (view in mData) {
            if (view is SmartRefreshLayout) {
                return view
            }
        }
        return null
    }


    companion object {
        @JvmStatic
        fun showEmptyView(parentView: View?, emptyView: EmptyLayout?) {
            val tools = ViewTools()
            tools.traversalView(parentView)
            tools.showRecyclerViewDataEmptyView(emptyView)
        }
    }
}