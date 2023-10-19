package com.example.kitsuapi.presentation.model.filter

import com.example.domain.model.filter.FilterAttributesModel

data class FilterAttributesUI(
    val childCount: Int? = null,
    val createdAt: String? = null,
    val description: String? = null,
    val nsfw: Boolean? = null,
    val slug: String? = null,
    val title: String? = null,
    val totalMediaCount: Int? = null,
    val updatedAt: String? = null
)

fun FilterAttributesModel.toUI() = FilterAttributesUI(
    childCount,
    createdAt,
    description,
    nsfw,
    slug,
    title,
    totalMediaCount,
    updatedAt
)