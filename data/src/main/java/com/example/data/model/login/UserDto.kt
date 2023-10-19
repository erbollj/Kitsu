package com.example.data.model.login


import com.example.domain.model.login.UserModel
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("access_token")
    val accessToken: String? = null,
    @SerializedName("created_at")
    val createdAt: Int? = null,
    @SerializedName("expires_in")
    val expiresIn: Int? = null,
    @SerializedName("refresh_token")
    val refreshToken: String? = null,
    @SerializedName("scope")
    val scope: String? = null,
    @SerializedName("token_type")
    val tokenType: String? = null
)

fun UserDto.toModel() = UserModel(accessToken, createdAt, expiresIn, refreshToken, scope, tokenType)