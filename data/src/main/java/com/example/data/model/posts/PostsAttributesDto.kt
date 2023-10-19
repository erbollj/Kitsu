package com.example.data.model.posts


import com.example.domain.model.posts.PostsAttributesModel
import com.google.gson.annotations.SerializedName

data class PostsAttributesDto(
    @SerializedName("blocked")
    val blocked: Boolean? = null,
    @SerializedName("commentsCount")
    val commentsCount: Int? = null,
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("contentFormatted")
    val contentFormatted: String? = null,
    @SerializedName("createdAt")
    val createdAt: String? = null,
    @SerializedName("deletedAt")
    val deletedAt: Any? = null,
    @SerializedName("editedAt")
    val editedAt: Any? = null,
    @SerializedName("embed")
    val embed: PostsEmbedDto? = null,
    @SerializedName("embedUrl")
    val embedUrl: Any? = null,
    @SerializedName("lockedAt")
    val lockedAt: Any? = null,
    @SerializedName("lockedReason")
    val lockedReason: Any? = null,
    @SerializedName("nsfw")
    val nsfw: Boolean? = null,
    @SerializedName("postLikesCount")
    val postLikesCount: Int? = null,
    @SerializedName("spoiler")
    val spoiler: Boolean? = null,
    @SerializedName("targetInterest")
    val targetInterest: Any? = null,
    @SerializedName("topLevelCommentsCount")
    val topLevelCommentsCount: Int? = null,
    @SerializedName("updatedAt")
    val updatedAt: String? = null
)

fun PostsAttributesDto.toModel() = PostsAttributesModel(
    blocked,
    commentsCount,
    content,
    contentFormatted,
    createdAt,
    deletedAt,
    editedAt,
    embed?.toModel(),
    embedUrl,
    lockedAt,
    lockedReason,
    nsfw,
    postLikesCount,
    spoiler,
    targetInterest,
    topLevelCommentsCount,
    updatedAt
)