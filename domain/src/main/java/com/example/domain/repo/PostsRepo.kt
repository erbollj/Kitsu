package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.createPost.CreatePostModel
import com.example.domain.model.createPost.getPost.PostAttributesModel
import com.example.domain.model.posts.PostsAttributesModel
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

interface PostsRepo {

    fun getPosts(): Flow<PagingData<PostsAttributesModel>>

    fun createPost(createPostModel: CreatePostModel): Flow<Either<String, PostAttributesModel>>

}