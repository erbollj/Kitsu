package com.example.data.model.filter


import com.google.gson.annotations.SerializedName

data class FilterParentDto(
    @SerializedName("links")
    val links: FilterLinksXDto? = FilterLinksXDto()
)