package com.example.data.model.manga


import com.google.gson.annotations.SerializedName

data class MangaLinksDto(
    @SerializedName("first")
    val first: String? = null,
    @SerializedName("last")
    val last: String? = null,
    @SerializedName("next")
    val next: String? = null
)