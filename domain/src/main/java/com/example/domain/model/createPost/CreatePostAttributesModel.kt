package com.example.domain.model.createPost

data class CreatePostAttributesModel(
    val content: String? = null,
    val nsfw: Boolean? = null,
    val spoiler: Boolean? = null
)