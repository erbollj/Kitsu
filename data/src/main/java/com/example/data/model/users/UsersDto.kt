package com.example.data.model.users


import com.google.gson.annotations.SerializedName

data class UsersDto(
    @SerializedName("data")
    val `data`: List<UsersDataDto>? = listOf(),
    @SerializedName("links")
    val links: UsersLinksDto? = UsersLinksDto(),
)