package com.example.data.pagging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.model.manga.toModel
import com.example.data.network.MangaApi
import com.example.domain.model.manga.MangaAttributesModel

class MangaPagingSource(
    private val api: MangaApi,
    private val limit: Int = 20,
    private val offset: Int = 0
) : PagingSource<Int, MangaAttributesModel>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MangaAttributesModel> {
        val position = params.key ?: offset
        return try {
            val response = api.getManga(limit, position).body()?.data?.map { it.attributes }

            LoadResult.Page(
                data = response!!.map { it!!.toModel() },
                prevKey = if (position == offset) null else position - limit,
                nextKey = if (response.size < limit) null else position + limit
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, MangaAttributesModel>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }
}



