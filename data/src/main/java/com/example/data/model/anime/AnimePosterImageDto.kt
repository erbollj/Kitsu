package com.example.data.model.anime


import com.example.domain.model.anime.AnimePosterImageModel
import com.google.gson.annotations.SerializedName

data class AnimePosterImageDto(
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

fun AnimePosterImageDto.toModel() = AnimePosterImageModel(large, medium, original, small, tiny)