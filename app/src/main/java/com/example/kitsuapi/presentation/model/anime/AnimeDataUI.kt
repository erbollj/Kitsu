package com.example.kitsuapi.presentation.model.anime


data class AnimeDataUI(
    val attributes: AnimeAttributesUI? = AnimeAttributesUI(),
    val id: String? = "",
    val links: AnimeLinksSelfUI? = AnimeLinksSelfUI(),
    val type: String? = ""
)