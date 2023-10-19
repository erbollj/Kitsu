package com.example.domain.model.createPost.getPost


data class PostDataModel(
    val attributes: PostAttributesModel? = PostAttributesModel(),
    val id: String? = "",
    val links: PostLinksModel? = PostLinksModel(),
    val relationships: PostRelationshipsModel? = PostRelationshipsModel(),
    val type: String? = ""
)