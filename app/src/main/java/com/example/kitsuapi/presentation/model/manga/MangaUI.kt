package com.example.kitsuapi.presentation.model.manga

data class MangaUI(
    val `data`: List<MangaDataUI>? = listOf(),
    val links: MangaLinksUI? = MangaLinksUI(),
)