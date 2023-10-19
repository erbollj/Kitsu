package com.example.data.model.filter


import com.google.gson.annotations.SerializedName

data class FilterLinksXXXXXDto(
    @SerializedName("first")
    val first: String? = null,
    @SerializedName("last")
    val last: String? = null,
    @SerializedName("next")
    val next: String? = null
)