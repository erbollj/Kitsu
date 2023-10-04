package com.example.kitsuapi.presentation.model.anime

import com.example.domain.model.anime.PosterImageModel


data class PosterImageUI(
    val large: String? = "",
    val medium: String? = "",
    val original: String? = "",
    val small: String? = "",
    val tiny: String? = ""
)

fun PosterImageModel.toUI() = PosterImageUI(large, medium, original, small, tiny)