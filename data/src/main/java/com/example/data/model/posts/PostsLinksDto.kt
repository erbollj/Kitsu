package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsLinksDto(
    @SerializedName("first")
    val first: String? = null,
    @SerializedName("last")
    val last: String? = null,
    @SerializedName("next")
    val next: String? = null
)