package com.example.domain.useCase

import com.example.domain.repo.PostsRepo

class GetPostsUseCase(private val repo: PostsRepo) {

    fun getPosts() = repo.getPosts()

}