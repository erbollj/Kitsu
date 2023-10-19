package com.example.kitsuapi.presentation.model.posts

data class PostsUI(
    val `data`: List<PostsDataUI>? = listOf(),
    val links: PostsLinksUI? = PostsLinksUI(),
)