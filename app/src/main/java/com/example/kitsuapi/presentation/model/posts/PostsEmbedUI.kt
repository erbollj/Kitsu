package com.example.kitsuapi.presentation.model.posts

import com.example.domain.model.posts.PostsEmbedModel

data class PostsEmbedUI(
    val image: PostsImageUI? = null,
    val kind: String? = null,
    val title: String? = null,
    val url: String? = null
)

fun PostsEmbedModel.toUI() = PostsEmbedUI(
    image?.toUI(), kind, title, url
)