package com.example.domain.di

import com.example.domain.useCase.CreatePostUseCase
import com.example.domain.useCase.GetAnimeUseCase
import com.example.domain.useCase.GetFilterUseCase
import com.example.domain.useCase.GetMangaUseCase
import com.example.domain.useCase.GetPostsUseCase
import com.example.domain.useCase.GetUsersUseCase
import com.example.domain.useCase.LoginUseCase
import org.koin.dsl.module

val domainModule = module {

    single { GetAnimeUseCase(get()) }
    single { GetMangaUseCase(get()) }
    single { GetUsersUseCase(get()) }
    single { GetFilterUseCase(get()) }
    single { LoginUseCase(get()) }
    single { GetPostsUseCase(get()) }
    single { CreatePostUseCase(get()) }

}