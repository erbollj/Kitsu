package com.example.data.di

import com.example.data.network.AnimeApi
import com.example.data.network.MangaApi
import com.example.data.network.UsersApi
import com.example.data.repo.AnimeRepoImpl
import com.example.data.repo.MangaRepoImpl
import com.example.data.repo.UsersRepoImpl
import com.example.domain.repo.AnimeRepo
import com.example.domain.repo.MangaRepo
import com.example.domain.repo.UsersRepo
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {

    single { provideOkHttpClient() }
    single { provideRetrofit(get()) }
    single { provideAnimeApi(get()) }
    single { provideMangaApi(get()) }
    single { provideUsersApi(get()) }
    single<AnimeRepo> { AnimeRepoImpl(get()) }
    single<MangaRepo> { MangaRepoImpl(get()) }
    single<UsersRepo> { UsersRepoImpl(get()) }

}

fun provideOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun provideAnimeApi(retrofit: Retrofit): AnimeApi {
    return retrofit.create(AnimeApi::class.java)
}

fun provideMangaApi(retrofit: Retrofit): MangaApi {
    return retrofit.create(MangaApi::class.java)
}

fun provideUsersApi(retrofit: Retrofit): UsersApi {
    return retrofit.create(UsersApi::class.java)
}

const val BASE_URL = "https://kitsu.io/api/edge/"