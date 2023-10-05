package com.example.data.model.manga


import com.example.domain.model.manga.MangaAttributesModel
import com.google.gson.annotations.SerializedName

data class MangaAttributesDto(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>? = listOf(),
    @SerializedName("ageRating")
    val ageRating: String? = "",
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: Any? = Any(),
    @SerializedName("averageRating")
    val averageRating: String? = "",
    @SerializedName("canonicalTitle")
    val canonicalTitle: String? = "",
    @SerializedName("chapterCount")
    val chapterCount: Int? = 0,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int? = 0,
    @SerializedName("createdAt")
    val createdAt: String? = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("endDate")
    val endDate: String? = "",
    @SerializedName("favoritesCount")
    val favoritesCount: Int? = 0,
    @SerializedName("mangaType")
    val mangaType: String? = "",
    @SerializedName("nextRelease")
    val nextRelease: Any? = Any(),
    @SerializedName("popularityRank")
    val popularityRank: Int? = 0,
    @SerializedName("posterImage")
    val posterImage: MangaPosterImageDto? = MangaPosterImageDto(),
    @SerializedName("ratingRank")
    val ratingRank: Int? = 0,
    @SerializedName("serialization")
    val serialization: String? = "",
    @SerializedName("slug")
    val slug: String? = "",
    @SerializedName("startDate")
    val startDate: String? = "",
    @SerializedName("status")
    val status: String? = "",
    @SerializedName("subtype")
    val subtype: String? = "",
    @SerializedName("synopsis")
    val synopsis: String? = "",
    @SerializedName("tba")
    val tba: Any? = Any(),
    @SerializedName("titles")
    val titles: MangaTitlesDto? = MangaTitlesDto(),
    @SerializedName("updatedAt")
    val updatedAt: String? = "",
    @SerializedName("userCount")
    val userCount: Int? = 0,
    @SerializedName("volumeCount")
    val volumeCount: Int? = 0
)

fun MangaAttributesDto.toModel() = MangaAttributesModel(
    abbreviatedTitles,
    ageRating,
    ageRatingGuide,
    averageRating,
    canonicalTitle,
    chapterCount,
    coverImageTopOffset,
    createdAt,
    description,
    endDate,
    favoritesCount,
    mangaType,
    nextRelease,
    popularityRank,
    posterImage?.toModel(),
    ratingRank,
    serialization,
    slug,
    startDate,
    status,
    subtype,
    synopsis,
    tba,
    titles?.toModel(),
    updatedAt,
    userCount
)