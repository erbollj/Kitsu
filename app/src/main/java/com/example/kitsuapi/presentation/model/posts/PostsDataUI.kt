package com.example.kitsuapi.presentation.model.posts

data class PostsDataUI(
    val attributes: PostsAttributesUI? = PostsAttributesUI(),
    val id: String? = "",
    val links: PostsLinksSelfUI? = PostsLinksSelfUI(),
    val relationships: PostsRelationshipsUI? = PostsRelationshipsUI(),
    val type: String? = ""
)