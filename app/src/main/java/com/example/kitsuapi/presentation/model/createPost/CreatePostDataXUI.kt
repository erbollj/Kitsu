package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostDataXModel

data class CreatePostDataXUI(
    val id: String? = null,
    val type: String? = null
)

fun CreatePostDataXUI.toModel() = CreatePostDataXModel(id, type)