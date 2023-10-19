package com.example.data.model.createPost.getPost


import com.google.gson.annotations.SerializedName

data class PostRelationshipsDto(
    @SerializedName("user")
    val user: PostUserDto? = PostUserDto()
)