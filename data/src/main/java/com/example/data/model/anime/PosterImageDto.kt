package com.example.data.model.anime


import com.example.domain.model.anime.PosterImageModel
import com.google.gson.annotations.SerializedName

data class PosterImageDto(
    @SerializedName("large")
    val large: String? = "",
    @SerializedName("medium")
    val medium: String? = "",
    @SerializedName("original")
    val original: String? = "",
    @SerializedName("small")
    val small: String? = "",
    @SerializedName("tiny")
    val tiny: String? = ""
)

fun PosterImageDto.toModel() = PosterImageModel(large, medium, original, small, tiny)