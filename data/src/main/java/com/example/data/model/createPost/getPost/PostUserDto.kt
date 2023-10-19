package com.example.data.model.createPost.getPost


import com.google.gson.annotations.SerializedName

data class PostUserDto(
    @SerializedName("links")
    val links: PostLinksXDto? = PostLinksXDto()
)