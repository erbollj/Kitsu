package com.example.domain.useCase

import com.example.domain.repo.AnimeRepo

class GetAnimeUseCase(private val repo: AnimeRepo) {
    fun getAnime() = repo.getAnime()
}