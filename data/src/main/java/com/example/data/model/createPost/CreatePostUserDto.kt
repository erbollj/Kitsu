package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostUserModel
import com.google.gson.annotations.SerializedName

data class CreatePostUserDto(
    @SerializedName("data")
    val `data`: CreatePostDataXDto? = CreatePostDataXDto()
)

fun CreatePostUserModel.toDto() = CreatePostUserDto(data?.toDto())