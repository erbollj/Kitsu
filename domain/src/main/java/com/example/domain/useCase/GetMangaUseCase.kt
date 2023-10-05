package com.example.domain.useCase

import com.example.domain.repo.MangaRepo

class GetMangaUseCase(private val repo: MangaRepo) {
    fun getAnime() = repo.getManga()
}