package com.example.data.model.createPost.getPost


import com.google.gson.annotations.SerializedName

data class PostDataDto(
    @SerializedName("attributes")
    val attributes: PostAttributesDto? = PostAttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: PostLinksDto? = PostLinksDto(),
    @SerializedName("relationships")
    val relationships: PostRelationshipsDto? = PostRelationshipsDto(),
    @SerializedName("type")
    val type: String? = ""
)