package com.example.data.model.anime


import com.example.domain.model.anime.DataModel
import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("attributes")
    val attributes: AttributesDto? = AttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: LinksSelfDto? = LinksSelfDto(),
    @SerializedName("type")
    val type: String? = ""
)

