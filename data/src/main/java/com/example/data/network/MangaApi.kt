package com.example.data.network

import com.example.data.model.manga.MangaDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaApi {
    @GET("manga")
    suspend fun getManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
    ): Response<MangaDto>

}