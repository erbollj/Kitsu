package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostUserModel

data class CreatePostUserUI(
    val `data`: CreatePostDataXUI? = CreatePostDataXUI()
)

fun CreatePostUserUI.toModel() = CreatePostUserModel(data?.toModel())