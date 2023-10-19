package com.example.data.model.filter


import com.google.gson.annotations.SerializedName

data class FilterDataDto(
    @SerializedName("attributes")
    val attributes: FilterAttributesDto? = FilterAttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: FilterLinksDto? = FilterLinksDto(),
    @SerializedName("relationships")
    val relationships: FilterRelationshipsDto? = FilterRelationshipsDto(),
    @SerializedName("type")
    val type: String? = ""
)