package com.example.data.pagging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.model.users.toModel
import com.example.data.network.UsersApi
import com.example.domain.model.users.UsersAttributesModel

class UsersPagingSource(
    private val api: UsersApi,
    private val limit: Int = 10,
    private val offset: Int = 0
) : PagingSource<Int, UsersAttributesModel>() {

    override fun getRefreshKey(state: PagingState<Int, UsersAttributesModel>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UsersAttributesModel> {
        val position = params.key ?: offset
        return try {
            val response = api.getUsers(limit, position).body()?.data?.map { it.attributes }

            LoadResult.Page(
                data = response!!.map { it!!.toModel() },
                prevKey = if (position == offset) null else position - limit,
                nextKey = if (response.size < limit) null else position + limit
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

}