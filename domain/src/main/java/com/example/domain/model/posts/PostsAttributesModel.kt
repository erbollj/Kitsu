package com.example.domain.model.posts

data class PostsAttributesModel(
    val blocked: Boolean? = null,
    val commentsCount: Int? = null,
    val content: String? = null,
    val contentFormatted: String? = null,
    val createdAt: String? = null,
    val deletedAt: Any? = null,
    val editedAt: Any? = null,
    val embed: PostsEmbedModel? = null,
    val embedUrl: Any? = null,
    val lockedAt: Any? = null,
    val lockedReason: Any? = null,
    val nsfw: Boolean? = null,
    val postLikesCount: Int? = null,
    val spoiler: Boolean? = null,
    val targetInterest: Any? = null,
    val topLevelCommentsCount: Int? = null,
    val updatedAt: String? = null
)
