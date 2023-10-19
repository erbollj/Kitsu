package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsRelationshipsDto(
    @SerializedName("user")
    val user: PostsUserDto? = PostsUserDto()
)