package com.example.kitsuapi.presentation.model.posts

import com.example.domain.model.posts.PostsImageModel

data class PostsImageUI(
    val height: Int? = null,
    val type: String? = null,
    val url: String? = null,
    val width: Int? = null
)

fun PostsImageModel.toUI() = PostsImageUI(height, type, url, width)