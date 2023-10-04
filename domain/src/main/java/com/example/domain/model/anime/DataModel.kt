package com.example.domain.model.anime



data class DataModel(
    val attributes: AttributesModel? = AttributesModel(),
    val id: String? = "",
    val links: LinksSelfModel? = LinksSelfModel(),
    val type: String? = ""
)