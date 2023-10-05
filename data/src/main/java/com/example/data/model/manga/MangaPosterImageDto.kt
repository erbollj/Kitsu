package com.example.data.model.manga


import com.example.domain.model.manga.MangaPosterImageModel
import com.google.gson.annotations.SerializedName

data class MangaPosterImageDto(
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

fun MangaPosterImageDto.toModel() = MangaPosterImageModel(large, medium, original, small, tiny)