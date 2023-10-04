package com.example.kitsuapi.presentation.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.base.BaseViewModel

class MainAdapter(
    val list: ArrayList<BaseFragment<out ViewBinding, out BaseViewModel>>,
    fragment: Fragment
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }

}