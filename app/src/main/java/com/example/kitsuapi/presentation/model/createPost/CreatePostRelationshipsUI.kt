package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostRelationshipsModel

data class CreatePostRelationshipsUI(
    val uploads: CreatePostUploadsUI? = CreatePostUploadsUI(),
    val user: CreatePostUserUI? = CreatePostUserUI()
)

fun CreatePostRelationshipsUI.toModel() = CreatePostRelationshipsModel(
    uploads?.toModel(),
    user?.toModel()
)