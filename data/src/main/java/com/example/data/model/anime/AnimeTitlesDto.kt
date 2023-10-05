package com.example.data.model.anime


import com.example.domain.model.anime.AnimeTitlesModel
import com.google.gson.annotations.SerializedName

data class AnimeTitlesDto(
    @SerializedName("en")
    val en: String? = null,
    @SerializedName("en_jp")
    val enJp: String? = null,
    @SerializedName("en_us")
    val enUs: String? = null,
    @SerializedName("ja_jp")
    val jaJp: String? = null
)

fun AnimeTitlesDto.toModel() = AnimeTitlesModel(en, enJp, enUs, jaJp)