package com.example.data.pagging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.model.anime.toModel
import com.example.data.network.AnimeApi
import com.example.domain.model.anime.AnimeAttributesModel

/**
 * Источник для постраничной загрузки данных по аниме.
 *
 * @param api Экземпляр AnimeApi для осуществления вызовов API.
 * @param limit Количество элементов для загрузки на одной странице (по умолчанию: 10).
 * @param offset Начальное смещение для пагинации данных (по умолчанию: 0).
 * @param filter Список категорий для фильтрации данных по аниме (может быть null).
 *
 * @see [AnimeApi]
 * @see [PagingSource]
 */
class AnimePagingSource(
    private val api: AnimeApi,
    private val limit: Int = 10,
    private val offset: Int = 0,
    private val filter: List<String>?
) : PagingSource<Int, AnimeAttributesModel>() {

    /**
     * Загрузка данных для конкретной страницы аниме.
     *
     * @param params Параметры загрузки, включая ключ пагинации.
     * @return Результат загрузки данных для страницы.
     */
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AnimeAttributesModel> {
        val position = params.key ?: offset
        return try {
            val response = api.getAnime(limit, position, filter).body()?.data?.map { it.attributes }

            LoadResult.Page(
                data = response?.map { it!!.toModel() } ?: emptyList(),
                prevKey = if (position == offset) null else position - limit,
                nextKey = if (response!!.size < limit) null else position + limit
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    /**
     * Получение ключа обновления для страницы аниме.
     *
     * @param state Состояние пейджинга, включая текущую позицию.
     * @return Ключ для обновления данных страницы.
     */
    override fun getRefreshKey(state: PagingState<Int, AnimeAttributesModel>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }

}



