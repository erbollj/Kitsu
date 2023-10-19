package com.example.domain.model.createPost

data class CreatePostDataModel(
    val attributes: CreatePostAttributesModel? = CreatePostAttributesModel(),
    val relationships: CreatePostRelationshipsModel? = CreatePostRelationshipsModel(),
    val type: String? = ""
)