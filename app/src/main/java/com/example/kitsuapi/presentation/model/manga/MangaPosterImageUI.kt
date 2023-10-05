package com.example.kitsuapi.presentation.model.manga

import com.example.domain.model.manga.MangaPosterImageModel

data class MangaPosterImageUI(
    val large: String? = "",
    val medium: String? = "",
    val original: String? = "",
    val small: String? = "",
    val tiny: String? = ""
)

fun MangaPosterImageModel.toUI() = MangaPosterImageUI(large, medium, original, small, tiny)