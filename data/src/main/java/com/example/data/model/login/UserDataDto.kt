package com.example.data.model.login


import com.example.domain.model.login.UserDataModel
import com.google.gson.annotations.SerializedName

data class UserDataDto(
    @SerializedName("grant_type")
    val grantType: String? = null,
    @SerializedName("password")
    val password: String? = null,
    @SerializedName("username")
    val username: String? = null
)

fun UserDataModel.toDto() = UserDataDto(grantType, password, username)