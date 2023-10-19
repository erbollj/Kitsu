package com.example.data.model.filter


import com.google.gson.annotations.SerializedName

data class FilterRelationshipsDto(
    @SerializedName("anime")
    val anime: FilterAnimeDto? = FilterAnimeDto(),
    @SerializedName("drama")
    val drama: FilterDramaDto? = FilterDramaDto(),
    @SerializedName("manga")
    val manga: FilterMangaDto? = FilterMangaDto(),
    @SerializedName("parent")
    val parent: FilterParentDto? = FilterParentDto()
)