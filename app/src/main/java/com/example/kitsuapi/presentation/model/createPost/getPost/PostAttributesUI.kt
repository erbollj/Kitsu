package com.example.kitsuapi.presentation.model.createPost.getPost

import com.example.domain.model.createPost.getPost.PostAttributesModel


data class PostAttributesUI(
    val blocked: Boolean? = null,
    val commentsCount: Int? = null,
    val content: String? = null,
    val contentFormatted: String? = null,
    val createdAt: String? = null,
    val deletedAt: Any? = null,
    val editedAt: Any? = null,
    val embed: Any? = null,
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

fun PostAttributesModel.toUI() = PostAttributesUI(
    blocked,
    commentsCount,
    content,
    contentFormatted,
    createdAt,
    deletedAt,
    editedAt,
    embed,
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