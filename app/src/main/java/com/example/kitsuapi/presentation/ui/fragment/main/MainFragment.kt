package com.example.kitsuapi.presentation.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.kitsuapi.databinding.FragmentMainBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.MainAdapter
import com.example.kitsuapi.presentation.ui.fragment.anime.AnimeFragment
import com.example.kitsuapi.presentation.ui.fragment.manga.MangaFragment
import com.example.kitsuapi.presentation.ui.fragment.user.UsersFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment: BaseFragment<FragmentMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModels()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun initView() {

        val fragmentList = arrayListOf(
            AnimeFragment(),
            MangaFragment(),
            UsersFragment()
        )

        binding.viewPager.adapter = MainAdapter(fragmentList, this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Characters"
                }

                1 -> {
                    tab.text = "Locations"
                }

                else -> {
                    tab.text = "Episodes"
                }
            }
        }.attach()

    }

    override fun initListener() {
    }

}