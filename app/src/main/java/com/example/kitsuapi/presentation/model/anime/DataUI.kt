package com.example.kitsuapi.presentation.model.anime



data class DataUI(
    val attributes: AttributesUI? = AttributesUI(),
    val id: String? = "",
    val links: LinksSelfUi? = LinksSelfUi(),
    val type: String? = ""
)