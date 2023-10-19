package com.example.domain.model.posts

data class PostsDataModel(
    val attributes: PostsAttributesModel? = PostsAttributesModel(),
    val id: String? = "",
    val links: PostsLinksSelfModel? = PostsLinksSelfModel(),
    val relationships: PostsRelationshipsModel? = PostsRelationshipsModel(),
    val type: String? = ""
)