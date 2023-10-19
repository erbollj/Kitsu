package com.example.domain.model.posts

data class PostsModel(
    val `data`: List<PostsDataModel>? = listOf(),
    val links: PostsLinksModel? = PostsLinksModel(),
)