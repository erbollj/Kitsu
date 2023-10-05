package com.example.kitsuapi.presentation.model.anime

import com.example.domain.model.anime.AnimeTitlesModel


data class AnimeTitlesUI(
    val en: String? = null,
    val enJp: String? = null,
    val enUs: String? = null,
    val jaJp: String? = null
)

fun AnimeTitlesModel.toUI() = AnimeTitlesUI(en, enJp, enUs, jaJp)