package com.example.kitsuapi.presentation.model.users

import com.example.domain.model.users.UsersAttributesModel

data class UsersAttributesUI(
    val about: String? = "",
    val avatar: UsersAvatarUI? = UsersAvatarUI(),
    val birthday: String? = "",
    val commentsCount: Int? = 0,
    val createdAt: String? = "",
    val favoritesCount: Int? = 0,
    val feedCompleted: Boolean? = false,
    val followersCount: Int? = 0,
    val followingCount: Int? = 0,
    val gender: String? = "",
    val lifeSpentOnAnime: Int? = 0,
    val likesGivenCount: Int? = 0,
    val likesReceivedCount: Int? = 0,
    val location: String? = "",
    val mediaReactionsCount: Int? = 0,
    val name: String? = "",
    val pastNames: List<Any>? = listOf(),
    val permissions: String? = "",
    val postsCount: Int? = 0,
    val proExpiresAt: String? = "",
    val proTier: Any? = Any(),
    val profileCompleted: Boolean? = false,
    val ratingsCount: Int? = 0,
    val reviewsCount: Int? = 0,
    val sfwFilterPreference: String? = "",
    val slug: String? = "",
    val status: String? = "",
    val subscribedToNewsletter: Boolean? = false,
    val title: String? = "",
    val updatedAt: String? = "",
    val waifuOrHusbando: String? = "",
    val website: String? = ""
)

fun UsersAttributesModel.toUI() = UsersAttributesUI(
    about,
    avatar?.toUI(),
    birthday,
    commentsCount,
    createdAt,
    favoritesCount,
    feedCompleted,
    followersCount,
    followingCount,
    gender,
    lifeSpentOnAnime,
    likesGivenCount,
    likesReceivedCount,
    location,
    mediaReactionsCount,
    name,
    pastNames,
    permissions,
    postsCount,
    proExpiresAt,
    proTier,
    profileCompleted,
    ratingsCount,
    reviewsCount,
    sfwFilterPreference,
    slug,
    status,
    subscribedToNewsletter,
    title,
    updatedAt,
    waifuOrHusbando,
    website
)