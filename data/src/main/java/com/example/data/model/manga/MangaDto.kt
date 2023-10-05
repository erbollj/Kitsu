package com.example.data.model.manga


import com.google.gson.annotations.SerializedName

data class MangaDto(
    @SerializedName("data")
    val `data`: List<MangaDataDto>? = listOf(),
    @SerializedName("links")
    val links: MangaLinksDto? = MangaLinksDto(),
)