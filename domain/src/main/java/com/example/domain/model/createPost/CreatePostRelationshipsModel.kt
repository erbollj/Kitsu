package com.example.domain.model.createPost

data class CreatePostRelationshipsModel(
    val uploads: CreatePostUploadsModel? = CreatePostUploadsModel(),
    val user: CreatePostUserModel? = CreatePostUserModel()
)