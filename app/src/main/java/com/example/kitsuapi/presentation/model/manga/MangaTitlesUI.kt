package com.example.kitsuapi.presentation.model.manga

import com.example.domain.model.manga.MangaTitlesModel

data class MangaTitlesUI(
    val en: String? = null,
    val en_jp: String? = null,
    val en_us: String? = null,
    val ja_jp: String? = null
)

fun MangaTitlesModel.toUI() = MangaTitlesUI(en, en_jp, en_us, ja_jp)