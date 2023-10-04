package com.example.data.model.anime


import com.example.domain.model.anime.TitlesModel
import com.google.gson.annotations.SerializedName

data class TitlesDto(
    @SerializedName("en")
    val en: String? = null,
    @SerializedName("en_jp")
    val enJp: String? = null,
    @SerializedName("en_us")
    val enUs: String? = null,
    @SerializedName("ja_jp")
    val jaJp: String? = null
)

fun TitlesDto.toModel() = TitlesModel(en, enJp, enUs, jaJp)