package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsLinksSelfDto(
    @SerializedName("self")
    val self: String? = null
)