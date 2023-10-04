package com.example.kitsuapi.presentation.model.anime

import com.example.domain.model.anime.TitlesModel


data class TitlesUI(
    val en: String? = null,
    val enJp: String? = null,
    val enUs: String? = null,
    val jaJp: String? = null
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, enUs, jaJp)