package com.example.kitsuapi.presentation.model.posts

import com.example.domain.model.posts.PostsAttributesModel

data class PostsAttributesUI(
    val blocked: Boolean? = null,
    val commentsCount: Int? = null,
    val content: String? = null,
    val contentFormatted: String? = null,
    val createdAt: String? = null,
    val deletedAt: Any? = null,
    val editedAt: Any? = null,
    val embed: PostsEmbedUI? = null,
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

fun PostsAttributesModel.toUI() = PostsAttributesUI(
    blocked,
    commentsCount,
    content,
    contentFormatted,
    createdAt,
    deletedAt,
    editedAt,
    embed?.toUI(),
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