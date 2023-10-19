package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.anime.AnimeAttributesModel
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс репозитория для работы с данными аниме.
 */
interface AnimeRepo {

    /**
     * Получение данных аниме с поддержкой постраничной загрузки.
     *
     * @param filter Список категорий для фильтрации данных (может быть null).
     * @return Flow с постраничными данными аниме.
     */
    fun getAnime(filter: List<String>?): Flow<PagingData<AnimeAttributesModel>>

}