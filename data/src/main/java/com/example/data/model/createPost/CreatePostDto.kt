package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostModel
import com.google.gson.annotations.SerializedName

data class CreatePostDto(
    @SerializedName("data")
    val `data`: CreatePostDataDto? = CreatePostDataDto()
)

fun CreatePostModel.toDto() = CreatePostDto(data?.toDto())