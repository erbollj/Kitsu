package com.example.data.model.anime


import com.google.gson.annotations.SerializedName

data class AnimeDataDto(
    @SerializedName("attributes")
    val attributes: AnimeAttributesDto? = AnimeAttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: AnimeLinksSelfDto? = AnimeLinksSelfDto(),
    @SerializedName("type")
    val type: String? = ""
)

