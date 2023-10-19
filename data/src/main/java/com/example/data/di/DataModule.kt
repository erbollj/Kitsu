package com.example.data.di

import android.content.Context
import android.content.SharedPreferences
import com.example.data.local.SharedPreferencesManager
import com.example.data.network.AnimeApi
import com.example.data.network.FilterApi
import com.example.data.network.LoginApi
import com.example.data.network.MangaApi
import com.example.data.network.PostsApi
import com.example.data.network.UsersApi
import com.example.data.network.interceptor.TokenInterceptor
import com.example.data.repo.AnimeRepoImpl
import com.example.data.repo.FilterRepoImpl
import com.example.data.repo.LoginRepoImpl
import com.example.data.repo.MangaRepoImpl
import com.example.data.repo.PostsRepoImpl
import com.example.data.repo.UsersRepoImpl
import com.example.domain.repo.AnimeRepo
import com.example.domain.repo.FilterRepo
import com.example.domain.repo.LoginRepo
import com.example.domain.repo.MangaRepo
import com.example.domain.repo.PostsRepo
import com.example.domain.repo.UsersRepo
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {

    single<SharedPreferences> {
        androidContext().getSharedPreferences("MySharedPreferences", Context.MODE_PRIVATE)
    }
    single { TokenInterceptor(get()) }
    single { provideOkHttpClient(get()) }
    single { provideRetrofit(get()) }
    single { provideAnimeApi(get()) }
    single { provideMangaApi(get()) }
    single { provideUsersApi(get()) }
    single { provideFilterApi(get()) }
    single { provideLoginApi(get()) }
    single { providePostsApi(get()) }
    single { SharedPreferencesManager(get()) }
    single<AnimeRepo> { AnimeRepoImpl(get()) }
    single<MangaRepo> { MangaRepoImpl(get()) }
    single<UsersRepo> { UsersRepoImpl(get()) }
    single<FilterRepo> { FilterRepoImpl(get()) }
    single<LoginRepo> { LoginRepoImpl(get()) }
    single<PostsRepo> { PostsRepoImpl(get()) }

}

fun provideOkHttpClient(tokenInterceptor: TokenInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .addInterceptor(tokenInterceptor)
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

fun provideFilterApi(retrofit: Retrofit): FilterApi {
    return retrofit.create(FilterApi::class.java)
}

fun provideLoginApi(retrofit: Retrofit): LoginApi {
    return retrofit.create(LoginApi::class.java)
}

fun providePostsApi(retrofit: Retrofit): PostsApi {
    return retrofit.create(PostsApi::class.java)
}

const val BASE_URL = "https://kitsu.io/api/"