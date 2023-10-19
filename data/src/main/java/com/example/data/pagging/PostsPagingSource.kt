package com.example.data.pagging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.model.posts.toModel
import com.example.data.network.PostsApi
import com.example.domain.model.posts.PostsAttributesModel

class PostsPagingSource(
    private val api: PostsApi,
    private val limit: Int = 10,
    private val offset: Int = 0,
) : PagingSource<Int, PostsAttributesModel>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PostsAttributesModel> {
        val position = params.key ?: offset
        return try {
            val response = api.getPosts(limit, position).body()?.data?.map { it.attributes }

            LoadResult.Page(
                data = response?.map { it!!.toModel() } ?: emptyList(),
                prevKey = if (position == offset) null else position - limit,
                nextKey = if (response!!.size < limit) null else position + limit
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, PostsAttributesModel>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }

}