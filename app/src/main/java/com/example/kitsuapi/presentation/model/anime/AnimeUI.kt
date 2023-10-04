package com.example.kitsuapi.presentation.model.anime

import com.example.domain.model.anime.AnimeModel


data class AnimeUI(
    val `data`: List<DataUI>? = listOf(),
    val links: LinksUI? = LinksUI()
)