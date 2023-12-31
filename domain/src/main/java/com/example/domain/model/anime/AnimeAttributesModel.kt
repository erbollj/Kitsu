package com.example.domain.model.anime


data class AnimeAttributesModel(
    val abbreviatedTitles: List<String>? = listOf(),
    val ageRating: String? = "",
    val ageRatingGuide: String? = "",
    val averageRating: String? = "",
    val canonicalTitle: String? = "",
    val coverImageTopOffset: Int? = 0,
    val createdAt: String? = "",
    val description: String? = "",
    val endDate: String? = "",
    val episodeCount: Int? = 0,
    val episodeLength: Int? = 0,
    val favoritesCount: Int? = 0,
    val nextRelease: Any? = Any(),
    val nsfw: Boolean? = false,
    val popularityRank: Int? = 0,
    val posterImageModel: AnimePosterImageModel? = AnimePosterImageModel(),
    val ratingRank: Int? = 0,
    val showType: String? = "",
    val slug: String? = "",
    val startDate: String? = "",
    val status: String? = "",
    val subtype: String? = "",
    val synopsis: String? = "",
    val tba: String? = "",
    val titlesModel: AnimeTitlesModel? = AnimeTitlesModel(),
    val totalLength: Int? = 0,
    val updatedAt: String? = "",
    val userCount: Int? = 0,
    val youtubeVideoId: String? = ""
)