package com.example.domain.model.anime



data class AnimeModel(
    val data: List<DataModel>? = listOf(),
    val links: LinksModel? = LinksModel()
)