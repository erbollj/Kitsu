package com.example.data.model.manga


import com.example.domain.model.manga.MangaTitlesModel
import com.google.gson.annotations.SerializedName

data class MangaTitlesDto(
    @SerializedName("en")
    val en: String? = null,
    @SerializedName("en_jp")
    val enJp: String? = null,
    @SerializedName("en_us")
    val enUs: String? = null,
    @SerializedName("ja_jp")
    val jaJp: String? = null
)

fun MangaTitlesDto.toModel() = MangaTitlesModel(en, enJp, enUs, jaJp)