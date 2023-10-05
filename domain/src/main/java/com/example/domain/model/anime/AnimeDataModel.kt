package com.example.domain.model.anime


data class AnimeDataModel(
    val attributes: AnimeAttributesModel? = AnimeAttributesModel(),
    val id: String? = "",
    val links: AnimeLinksSelfModel? = AnimeLinksSelfModel(),
    val type: String? = ""
)