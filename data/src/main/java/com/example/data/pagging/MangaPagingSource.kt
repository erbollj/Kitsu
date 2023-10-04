//package com.example.data.pagging
//
//import android.util.Log
//import androidx.paging.PagingSource
//import androidx.paging.PagingState
//import com.example.data.model.anime.toModel
//import com.example.domain.model.manga.AttributesModel
//import com.example.data.network.MangaApi
//
//class MangaPagingSource (
//    private val api: MangaApi,
//    private val limit: Int = 10,
//    private val offset: Int = 0
//) : PagingSource<Int, AttributesModel>() {
//
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AttributesModel> {
//        val position = params.key ?: offset
//        return try {
//            val response = api.getManga(limit, position).body()?.data
//            Log.e("ololo", "load: " + response )
//            Log.e("ololo", "load: " + api.getManga(limit, offset).body() )
//            LoadResult.Page(
//                data = response?.map { it. } ?: emptyList(),
//                prevKey = if (position == offset) null else position - limit,
//                nextKey = if (response!!.size < limit) null else position + limit
//            )
//        } catch (exception: Exception) {
//            LoadResult.Error(exception)
//        }
//    }
//
//    override fun getRefreshKey(state: PagingState<Int, AttributesModel>): Int? {
//        val anchorPosition = state.anchorPosition ?: return null
//        val page = state.closestPageToPosition(anchorPosition) ?: return null
//        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
//    }
//}
//
//
//
