package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsLinksXDto(
    @SerializedName("related")
    val related: String? = null,
    @SerializedName("self")
    val self: String? = null
)