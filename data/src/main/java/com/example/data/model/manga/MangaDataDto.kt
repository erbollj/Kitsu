package com.example.data.model.manga


import com.google.gson.annotations.SerializedName

data class MangaDataDto(
    @SerializedName("attributes")
    val attributes: MangaAttributesDto? = MangaAttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: MangaLinksSelfDto? = MangaLinksSelfDto(),
    @SerializedName("type")
    val type: String? = ""
)