package com.example.data.model.anime


import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("first")
    val first: String? = null,
    @SerializedName("last")
    val last: String? = null,
    @SerializedName("next")
    val next: String? = null
)