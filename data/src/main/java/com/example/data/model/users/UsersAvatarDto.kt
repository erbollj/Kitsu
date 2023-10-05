package com.example.data.model.users


import com.example.domain.model.users.UsersAvatarModel
import com.google.gson.annotations.SerializedName

data class UsersAvatarDto(
    @SerializedName("large")
    val large: String? = null,
    @SerializedName("medium")
    val medium: String? = null,
    @SerializedName("original")
    val original: String? = null,
    @SerializedName("small")
    val small: String? = null,
    @SerializedName("tiny")
    val tiny: String? = null
)

fun UsersAvatarDto.toModel() = UsersAvatarModel(large, medium, original, small, tiny)