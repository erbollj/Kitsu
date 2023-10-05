package com.example.kitsuapi.presentation.di

import com.example.kitsuapi.presentation.ui.fragment.anime.AnimeViewModel
import com.example.kitsuapi.presentation.ui.fragment.manga.MangaViewModel
import com.example.kitsuapi.presentation.ui.fragment.user.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { AnimeViewModel(get()) }
    viewModel { MangaViewModel(get()) }
    viewModel { UserViewModel(get()) }
}