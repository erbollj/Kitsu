package com.example.data.model.posts


import com.example.domain.model.posts.PostsImageModel
import com.google.gson.annotations.SerializedName

data class PostsImageDto(
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("width")
    val width: Int? = null
)

fun PostsImageDto.toModel() = PostsImageModel(height, type, url, width)