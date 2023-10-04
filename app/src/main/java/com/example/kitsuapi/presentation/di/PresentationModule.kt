package com.example.kitsuapi.presentation.di

import com.example.kitsuapi.presentation.ui.fragment.anime.AnimeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { AnimeViewModel(get()) }
}