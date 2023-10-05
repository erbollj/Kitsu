package com.example.data.model.users


import com.google.gson.annotations.SerializedName

data class UsersDataDto(
    @SerializedName("attributes")
    val attributes: UsersAttributesDto? = UsersAttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: UsersLinksSelfDto? = UsersLinksSelfDto(),
    @SerializedName("type")
    val type: String? = ""
)