package com.example.data.network

import com.example.data.model.users.UsersDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UsersApi {

    @GET("users")
    suspend fun getUsers(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): Response<UsersDto>
}