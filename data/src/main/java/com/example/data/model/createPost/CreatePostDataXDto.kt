package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostDataXModel
import com.google.gson.annotations.SerializedName

data class CreatePostDataXDto(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("type")
    val type: String? = null
)

fun CreatePostDataXModel.toDto() = CreatePostDataXDto(id, type)