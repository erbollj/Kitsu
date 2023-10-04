package com.example.data.model.anime


import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("data")
    val `data`: List<DataDto>? = listOf(),
    @SerializedName("links")
    val links: LinksDto? = LinksDto(),
)