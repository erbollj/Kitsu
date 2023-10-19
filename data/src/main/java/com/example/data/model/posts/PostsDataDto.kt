package com.example.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostsDataDto(
    @SerializedName("attributes")
    val attributes: PostsAttributesDto? = PostsAttributesDto(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("links")
    val links: PostsLinksSelfDto? = PostsLinksSelfDto(),
    @SerializedName("relationships")
    val relationships: PostsRelationshipsDto? = PostsRelationshipsDto(),
    @SerializedName("type")
    val type: String? = ""
)