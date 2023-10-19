package com.example.data.model.posts


import com.example.domain.model.posts.PostsEmbedModel
import com.google.gson.annotations.SerializedName

data class PostsEmbedDto(
    @SerializedName("image")
    val image: PostsImageDto? = null,
    @SerializedName("kind")
    val kind: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("url")
    val url: String? = null
)

fun PostsEmbedDto.toModel() = PostsEmbedModel(image?.toModel(), kind, title, url)