package com.example.kitsuapi.presentation.ui.fragment.main

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentMainBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.MainAdapter
import com.example.kitsuapi.presentation.ui.fragment.anime.AnimeFragment
import com.example.kitsuapi.presentation.ui.fragment.manga.MangaFragment
import com.example.kitsuapi.presentation.ui.fragment.posts.PostsFragment
import com.example.kitsuapi.presentation.ui.fragment.user.UsersFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(R.layout.fragment_main) {

    override val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)
    override val viewModel: MainViewModel by viewModels()
    private val fragmentList = arrayListOf(
        AnimeFragment(),
        MangaFragment(),
        UsersFragment(),
        PostsFragment()
    )

    override fun initialize() {
        super.initialize()

        binding.viewPager.adapter = MainAdapter(fragmentList, this)
        initListeners()

    }

    override fun initListeners() {
        super.initListeners()
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Anime"
                }

                1 -> {
                    tab.text = "Manga"
                }

                2 -> {
                    tab.text = "Users"
                }

                else -> {
                    tab.text = "Posts"
                }
            }
        }.attach()
    }

}