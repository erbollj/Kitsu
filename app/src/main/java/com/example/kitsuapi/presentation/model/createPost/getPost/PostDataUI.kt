package com.example.kitsuapi.presentation.model.createPost.getPost


data class PostDataUI(
    val attributes: PostAttributesUI? = PostAttributesUI(),
    val id: String? = "",
    val links: PostLinksUI? = PostLinksUI(),
    val relationships: PostRelationshipsUI? = PostRelationshipsUI(),
    val type: String? = ""
)