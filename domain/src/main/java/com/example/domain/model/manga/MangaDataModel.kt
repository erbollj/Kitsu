package com.example.domain.model.manga

data class MangaDataModel(
    val attributes: MangaAttributesModel? = MangaAttributesModel(),
    val id: String? = "",
    val links: MangaLinksSelfModel? = MangaLinksSelfModel(),
    val type: String? = ""
)