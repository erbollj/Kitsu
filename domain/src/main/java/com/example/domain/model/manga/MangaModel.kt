package com.example.domain.model.manga

data class MangaModel(
    val `data`: List<MangaDataModel>? = listOf(),
    val links: MangaLinksModel? = MangaLinksModel(),
)