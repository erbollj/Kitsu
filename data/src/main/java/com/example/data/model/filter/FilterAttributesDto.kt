package com.example.data.model.filter


import com.example.domain.model.filter.FilterAttributesModel
import com.google.gson.annotations.SerializedName

data class FilterAttributesDto(
    @SerializedName("childCount")
    val childCount: Int? = null,
    @SerializedName("createdAt")
    val createdAt: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("nsfw")
    val nsfw: Boolean? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("totalMediaCount")
    val totalMediaCount: Int? = null,
    @SerializedName("updatedAt")
    val updatedAt: String? = null
)

fun FilterAttributesDto.toModel() = FilterAttributesModel(
    childCount,
    createdAt,
    description,
    nsfw,
    slug,
    title,
    totalMediaCount,
    updatedAt
)