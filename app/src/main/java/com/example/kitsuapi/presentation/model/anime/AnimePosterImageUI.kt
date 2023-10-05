package com.example.kitsuapi.presentation.model.anime

import com.example.domain.model.anime.AnimePosterImageModel


data class AnimePosterImageUI(
    val large: String? = "",
    val medium: String? = "",
    val original: String? = "",
    val small: String? = "",
    val tiny: String? = ""
)

fun AnimePosterImageModel.toUI() = AnimePosterImageUI(large, medium, original, small, tiny)