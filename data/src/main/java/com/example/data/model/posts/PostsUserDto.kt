package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsUserDto(
    @SerializedName("links")
    val links: PostsLinksXDto? = PostsLinksXDto()
)