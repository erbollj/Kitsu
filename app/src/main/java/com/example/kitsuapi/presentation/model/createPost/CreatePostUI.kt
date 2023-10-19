package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostModel

data class CreatePostUI(
    val `data`: CreatePostDataUI? = CreatePostDataUI()
)

fun CreatePostUI.toModel() = CreatePostModel(data?.toModel())