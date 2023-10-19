package com.example.domain.model.filter

data class FilterAttributesModel(
    val childCount: Int? = null,
    val createdAt: String? = null,
    val description: String? = null,
    val nsfw: Boolean? = null,
    val slug: String? = null,
    val title: String? = null,
    val totalMediaCount: Int? = null,
    val updatedAt: String? = null
)