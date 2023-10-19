package com.example.data.pagging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.model.filter.toModel
import com.example.data.network.FilterApi
import com.example.domain.model.filter.FilterAttributesModel

class FilterPagingSource(
    private val api: FilterApi,
    private val limit: Int = 10,
    private val offset: Int = 0
) : PagingSource<Int, FilterAttributesModel>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, FilterAttributesModel> {
        val position = params.key ?: offset
        return try {
            val response = api.getCategories(limit, position).body()?.data?.map { it.attributes }

            LoadResult.Page(
                data = response?.map { it!!.toModel() } ?: emptyList(),
                prevKey = if (position == offset) null else position - limit,
                nextKey = if (response!!.size < limit) null else position + limit
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, FilterAttributesModel>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }

}



