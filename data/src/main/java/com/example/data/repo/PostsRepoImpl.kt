package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.base.doRequest
import com.example.data.model.createPost.getPost.toModel
import com.example.data.model.createPost.toDto
import com.example.data.network.PostsApi
import com.example.data.pagging.PostsPagingSource
import com.example.domain.model.createPost.CreatePostModel
import com.example.domain.model.createPost.getPost.PostAttributesModel
import com.example.domain.model.posts.PostsAttributesModel
import com.example.domain.repo.PostsRepo
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

class PostsRepoImpl(private val api: PostsApi) : PostsRepo {

    override fun getPosts(): Flow<PagingData<PostsAttributesModel>> {
        return Pager(
            PagingConfig(10),
            pagingSourceFactory = {
                PostsPagingSource(api)
            }).flow
    }

    override fun createPost(createPostModel: CreatePostModel): Flow<Either<String, PostAttributesModel>> =
        doRequest {
            api.createPost(createPostModel.toDto()).body()?.data?.attributes!!.toModel()
        }

}