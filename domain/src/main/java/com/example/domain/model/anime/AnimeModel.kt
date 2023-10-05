package com.example.domain.model.anime


data class AnimeModel(
    val data: List<AnimeDataModel>? = listOf(),
    val links: AnimeLinksModel? = AnimeLinksModel()
)