package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostUploadsModel

data class CreatePostUploadsUI(
    val `data`: List<Any?>? = null
)

fun CreatePostUploadsUI.toModel() = CreatePostUploadsModel(data)