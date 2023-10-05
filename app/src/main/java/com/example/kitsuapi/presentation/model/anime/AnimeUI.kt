package com.example.kitsuapi.presentation.model.anime


data class AnimeUI(
    val data: List<AnimeDataUI>? = listOf(),
    val links: AnimeLinksUI? = AnimeLinksUI()
)