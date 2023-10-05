package com.example.data.model.users


import com.google.gson.annotations.SerializedName

data class UsersLinksSelfDto(
    @SerializedName("self")
    val self: String? = null
)