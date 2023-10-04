package com.example.data.model.anime


import com.example.domain.model.anime.LinksSelfModel
import com.google.gson.annotations.SerializedName

data class LinksSelfDto(
    @SerializedName("self")
    val self: String? = null
)

fun LinksSelfDto.toModel() = LinksSelfModel(self)