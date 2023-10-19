package com.example.data.model.filter


import com.google.gson.annotations.SerializedName

data class FilterDto(
    @SerializedName("data")
    val `data`: List<FilterDataDto>? = listOf(),
    @SerializedName("links")
    val links: FilterLinksXXXXXDto? = FilterLinksXXXXXDto(),
    @SerializedName("meta")
    val meta: FilterMetaDto? = FilterMetaDto()
)