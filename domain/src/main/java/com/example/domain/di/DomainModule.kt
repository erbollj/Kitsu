package com.example.domain.di

import com.example.domain.useCase.GetAnimeUseCase
import org.koin.dsl.module

val domainModule = module {

    single { GetAnimeUseCase(get()) }

}