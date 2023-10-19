package com.example.domain.useCase

import com.example.domain.repo.AnimeRepo

/**
 * Use case для получения данных аниме.
 *
 * @param repo Репозиторий для работы с данными аниме.
 */
class GetAnimeUseCase(private val repo: AnimeRepo) {

    /**
     * Получение данных аниме с возможностью фильтрации.
     *
     * @param filter Список категорий для фильтрации данных (может быть null).
     * @return Flow с постраничными данными аниме.
     */
    fun getAnime(filter: List<String>?) = repo.getAnime(filter)

}