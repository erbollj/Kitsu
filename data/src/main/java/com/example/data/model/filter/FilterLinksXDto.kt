package com.example.data.model.filter


import com.google.gson.annotations.SerializedName

data class FilterLinksXDto(
    @SerializedName("related")
    val related: String? = null,
    @SerializedName("self")
    val self: String? = null
)