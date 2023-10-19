package com.example.kitsuapi.presentation.model.createPost

import com.example.domain.model.createPost.CreatePostDataModel

data class CreatePostDataUI(
    val attributes: CreatePostAttributesUI? = CreatePostAttributesUI(),
    val relationships: CreatePostRelationshipsUI? = CreatePostRelationshipsUI(),
    val type: String? = ""
)

fun CreatePostDataUI.toModel() =
    CreatePostDataModel(attributes?.toModel(), relationships?.toModel(), type)