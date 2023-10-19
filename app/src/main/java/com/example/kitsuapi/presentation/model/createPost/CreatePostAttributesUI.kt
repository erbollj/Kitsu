package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostAttributesModel

data class CreatePostAttributesUI(
    val content: String? = null,
    val nsfw: Boolean? = null,
    val spoiler: Boolean? = null
)

fun CreatePostAttributesUI.toModel() = CreatePostAttributesModel(content, nsfw, spoiler)