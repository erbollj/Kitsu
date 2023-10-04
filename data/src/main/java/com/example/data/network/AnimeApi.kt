package com.example.data.network

import com.example.data.model.anime.AnimeDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApi {
    @GET("anime")
    suspend fun getAnime(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
    ): Response<AnimeDto>
}