package com.example.data.model.users


import com.google.gson.annotations.SerializedName

data class UsersLinksDto(
    @SerializedName("first")
    val first: String? = null,
    @SerializedName("last")
    val last: String? = null,
    @SerializedName("next")
    val next: String? = null
)