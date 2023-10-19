package com.example.data.network

import com.example.data.model.anime.AnimeDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApi {

    /**
     * Получение списка аниме с учетом пагинации и фильтрации по категориям.
     *
     * @param limit Количество элементов на странице.
     * @param offset Смещение от начала списка.
     * @param filter Список категорий для фильтрации (может быть null).
     * @return Ответ с данными аниме в виде [AnimeDto].
     */
    @GET("edge/anime")
    suspend fun getAnime(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
        @Query("filter[categories]") filter: List<String>? = emptyList()
    ): Response<AnimeDto>

}