package com.example.data.model.manga


import com.google.gson.annotations.SerializedName

data class MangaLinksSelfDto(
    @SerializedName("self")
    val self: String? = null
)