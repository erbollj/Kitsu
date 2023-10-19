package com.example.data.model.createPost.getPost


import com.google.gson.annotations.SerializedName

data class PostDto(
    @SerializedName("data")
    val `data`: PostDataDto? = PostDataDto()
)