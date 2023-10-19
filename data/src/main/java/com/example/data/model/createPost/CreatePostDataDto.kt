package com.example.data.model.createPost


import com.example.domain.model.createPost.CreatePostDataModel
import com.google.gson.annotations.SerializedName

data class CreatePostDataDto(
    @SerializedName("attributes")
    val attributes: CreatePostAttributesDto? = CreatePostAttributesDto(),
    @SerializedName("relationships")
    val relationships: CreatePostRelationshipsDto? = CreatePostRelationshipsDto(),
    @SerializedName("type")
    val type: String? = ""
)

fun CreatePostDataModel.toDto() =
    CreatePostDataDto(attributes?.toDto(), relationships?.toDto(), type)