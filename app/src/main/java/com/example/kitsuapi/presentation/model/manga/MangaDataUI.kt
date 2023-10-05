package com.example.kitsuapi.presentation.model.manga

data class MangaDataUI(
    val attributes: MangaAttributesUI? = MangaAttributesUI(),
    val id: String? = "",
    val links: MangaLinksSelfUI? = MangaLinksSelfUI(),
    val type: String? = ""
)