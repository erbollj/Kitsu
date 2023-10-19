package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostRelationshipsModel
import com.google.gson.annotations.SerializedName

data class CreatePostRelationshipsDto(
    @SerializedName("uploads")
    val uploads: CreatePostUploadsDto? = CreatePostUploadsDto(),
    @SerializedName("user")
    val user: CreatePostUserDto? = CreatePostUserDto()
)

fun CreatePostRelationshipsModel.toDto() =
    CreatePostRelationshipsDto(uploads?.toDto(), user?.toDto())