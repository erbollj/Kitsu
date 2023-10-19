package com.example.data.model.createPost.getPost


import com.google.gson.annotations.SerializedName

data class PostLinksXDto(
    @SerializedName("related")
    val related: String? = null,
    @SerializedName("self")
    val self: String? = null
)