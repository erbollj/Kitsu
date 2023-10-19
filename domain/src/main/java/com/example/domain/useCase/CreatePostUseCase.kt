package com.example.domain.useCase

import com.example.domain.model.createPost.CreatePostModel
import com.example.domain.repo.PostsRepo

class CreatePostUseCase(val repo: PostsRepo) {

    fun createPost(createPostModel: CreatePostModel) =
        repo.createPost(createPostModel)

}