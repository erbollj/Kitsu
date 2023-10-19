package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsDto(
    @SerializedName("data")
    val `data`: List<PostsDataDto>? = listOf(),
    @SerializedName("links")
    val links: PostsLinksDto? = PostsLinksDto(),
)