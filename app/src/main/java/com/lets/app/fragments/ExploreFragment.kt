package com.lets.app.fragments

import androidx.appcompat.widget.Toolbar
import com.lets.app.R
import kotlinx.android.synthetic.main.fragment_explore.*

class ExploreFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_explore
    }

    override fun getToolbar(): Toolbar {
        return toolbar
    }

    override fun getToolbarTitle(): String {
        return context?.getString(R.string.title_fragment_explore) ?: ""
    }
}