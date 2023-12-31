package com.example.kitsuapi.presentation.di

import com.example.kitsuapi.presentation.ui.fragment.anime.AnimeViewModel
import com.example.kitsuapi.presentation.ui.fragment.createPost.PostViewModel
import com.example.kitsuapi.presentation.ui.fragment.filter.FilterViewModel
import com.example.kitsuapi.presentation.ui.fragment.login.LoginViewModel
import com.example.kitsuapi.presentation.ui.fragment.manga.MangaViewModel
import com.example.kitsuapi.presentation.ui.fragment.posts.PostsViewModel
import com.example.kitsuapi.presentation.ui.fragment.user.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {

    viewModel { AnimeViewModel(get()) }
    viewModel { MangaViewModel(get()) }
    viewModel { UserViewModel(get()) }
    viewModel { FilterViewModel(get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { PostsViewModel(get()) }
    viewModel { PostViewModel(get()) }

}