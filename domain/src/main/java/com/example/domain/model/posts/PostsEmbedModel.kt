package com.example.domain.model.posts

data class PostsEmbedModel(
    val image: PostsImageModel? = null,
    val kind: String? = null,
    val title: String? = null,
    val url: String? = null
)