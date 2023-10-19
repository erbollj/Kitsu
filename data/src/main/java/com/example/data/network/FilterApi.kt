package com.example.data.network

import com.example.data.model.filter.FilterDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FilterApi {

    @GET("edge/categories")
    suspend fun getCategories(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
    ): Response<FilterDto>

}
