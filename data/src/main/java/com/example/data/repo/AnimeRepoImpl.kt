package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.network.AnimeApi
import com.example.data.pagging.AnimePagingSource
import com.example.domain.model.anime.AnimeAttributesModel
import com.example.domain.repo.AnimeRepo
import kotlinx.coroutines.flow.Flow

/**
 * Реализация репозитория для работы с данными аниме.
 *
 * @param api Экземпляр AnimeApi для осуществления вызовов API.
 */
class AnimeRepoImpl(private val api: AnimeApi) : AnimeRepo {

    /**
     * Получение данных аниме с поддержкой постраничной загрузки.
     *
     * @param filter Список категорий для фильтрации данных (может быть null).
     * @return Flow с постраничными данными аниме.
     */
    override fun getAnime(filter: List<String>?): Flow<PagingData<AnimeAttributesModel>> {
        return Pager(
            PagingConfig(10),
            pagingSourceFactory = {
                AnimePagingSource(api, filter = filter)
            }).flow
    }

}