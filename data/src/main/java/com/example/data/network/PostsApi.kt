package com.example.data.network

import com.example.data.model.createPost.CreatePostDto
import com.example.data.model.createPost.getPost.PostDto
import com.example.data.model.posts.PostsDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface PostsApi {

    @GET("edge/posts")
    suspend fun getPosts(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
    ): Response<PostsDto>

    @Headers("Content-Type: application/vnd.api+json")
    @POST("edge/posts")
    suspend fun createPost(
        @Body createPostDto: CreatePostDto
    ): Response<PostDto>

}