package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostUploadsModel
import com.google.gson.annotations.SerializedName

data class CreatePostUploadsDto(
    @SerializedName("data")
    val `data`: List<Any?>? = null
)

fun CreatePostUploadsModel.toDto() = CreatePostUploadsDto(data)