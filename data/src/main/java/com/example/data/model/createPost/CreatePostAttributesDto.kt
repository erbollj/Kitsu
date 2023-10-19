package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostAttributesModel
import com.google.gson.annotations.SerializedName

data class CreatePostAttributesDto(
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("nsfw")
    val nsfw: Boolean? = null,
    @SerializedName("spoiler")
    val spoiler: Boolean? = null
)

fun CreatePostAttributesModel.toDto() = CreatePostAttributesDto(content, nsfw, spoiler)