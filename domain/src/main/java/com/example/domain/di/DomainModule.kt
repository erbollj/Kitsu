package com.example.domain.di

import com.example.domain.useCase.GetAnimeUseCase
import com.example.domain.useCase.GetMangaUseCase
import com.example.domain.useCase.GetUsersUseCase
import org.koin.dsl.module

val domainModule = module {

    single { GetAnimeUseCase(get()) }
    single { GetMangaUseCase(get()) }
    single { GetUsersUseCase(get()) }

}