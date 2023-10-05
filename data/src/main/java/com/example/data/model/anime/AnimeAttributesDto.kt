package com.example.data.model.anime


import com.example.domain.model.anime.AnimeAttributesModel
import com.google.gson.annotations.SerializedName

data class AnimeAttributesDto(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>? = listOf(),
    @SerializedName("ageRating")
    val ageRating: String? = "",
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String? = "",
    @SerializedName("averageRating")
    val averageRating: String? = "",
    @SerializedName("canonicalTitle")
    val canonicalTitle: String? = "",
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int? = 0,
    @SerializedName("createdAt")
    val createdAt: String? = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("endDate")
    val endDate: String? = "",
    @SerializedName("episodeCount")
    val episodeCount: Int? = 0,
    @SerializedName("episodeLength")
    val episodeLength: Int? = 0,
    @SerializedName("favoritesCount")
    val favoritesCount: Int? = 0,
    @SerializedName("nextRelease")
    val nextRelease: Any? = Any(),
    @SerializedName("nsfw")
    val nsfw: Boolean? = false,
    @SerializedName("popularityRank")
    val popularityRank: Int? = 0,
    @SerializedName("posterImage")
    val posterImageDto: AnimePosterImageDto? = AnimePosterImageDto(),
    @SerializedName("ratingRank")
    val ratingRank: Int? = 0,
    @SerializedName("showType")
    val showType: String? = "",
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
    val tba: String? = "",
    @SerializedName("titles")
    val titlesDto: AnimeTitlesDto? = AnimeTitlesDto(),
    @SerializedName("totalLength")
    val totalLength: Int? = 0,
    @SerializedName("updatedAt")
    val updatedAt: String? = "",
    @SerializedName("userCount")
    val userCount: Int? = 0,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String? = ""
)

fun AnimeAttributesDto.toModel() = AnimeAttributesModel(
    abbreviatedTitles,
    ageRating,
    ageRatingGuide,
    averageRating,
    canonicalTitle,
    coverImageTopOffset,
    createdAt,
    description,
    endDate,
    episodeCount,
    episodeLength,
    favoritesCount,
    nextRelease,
    nsfw,
    popularityRank,
    posterImageDto?.toModel(),
    ratingRank,
    showType,
    slug,
    startDate,
    status,
    subtype,
    synopsis,
    tba,
    titlesDto?.toModel(),
    totalLength,
    updatedAt,
    userCount,
    youtubeVideoId
)