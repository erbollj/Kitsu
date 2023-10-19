package com.example.data.network

import com.example.data.model.login.UserDataDto
import com.example.data.model.login.UserDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {

    @POST("oauth/token")
    suspend fun login(@Body userDataDto: UserDataDto): Response<UserDto>

}