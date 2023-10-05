package com.example.data.model.users


import com.example.domain.model.users.UsersAttributesModel
import com.google.gson.annotations.SerializedName

data class UsersAttributesDto(
    @SerializedName("about")
    val about: String? = "",
    @SerializedName("avatar")
    val avatar: UsersAvatarDto? = UsersAvatarDto(),
    @SerializedName("birthday")
    val birthday: String? = "",
    @SerializedName("commentsCount")
    val commentsCount: Int? = 0,
    @SerializedName("createdAt")
    val createdAt: String? = "",
    @SerializedName("favoritesCount")
    val favoritesCount: Int? = 0,
    @SerializedName("feedCompleted")
    val feedCompleted: Boolean? = false,
    @SerializedName("followersCount")
    val followersCount: Int? = 0,
    @SerializedName("followingCount")
    val followingCount: Int? = 0,
    @SerializedName("gender")
    val gender: String? = "",
    @SerializedName("lifeSpentOnAnime")
    val lifeSpentOnAnime: Int? = 0,
    @SerializedName("likesGivenCount")
    val likesGivenCount: Int? = 0,
    @SerializedName("likesReceivedCount")
    val likesReceivedCount: Int? = 0,
    @SerializedName("location")
    val location: String? = "",
    @SerializedName("mediaReactionsCount")
    val mediaReactionsCount: Int? = 0,
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("pastNames")
    val pastNames: List<Any>? = listOf(),
    @SerializedName("permissions")
    val permissions: String? = "",
    @SerializedName("postsCount")
    val postsCount: Int? = 0,
    @SerializedName("proExpiresAt")
    val proExpiresAt: String? = "",
    @SerializedName("proTier")
    val proTier: Any? = Any(),
    @SerializedName("profileCompleted")
    val profileCompleted: Boolean? = false,
    @SerializedName("ratingsCount")
    val ratingsCount: Int? = 0,
    @SerializedName("reviewsCount")
    val reviewsCount: Int? = 0,
    @SerializedName("sfwFilterPreference")
    val sfwFilterPreference: String? = "",
    @SerializedName("slug")
    val slug: String? = "",
    @SerializedName("status")
    val status: String? = "",
    @SerializedName("subscribedToNewsletter")
    val subscribedToNewsletter: Boolean? = false,
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("updatedAt")
    val updatedAt: String? = "",
    @SerializedName("waifuOrHusbando")
    val waifuOrHusbando: String? = "",
    @SerializedName("website")
    val website: String? = ""
)

fun UsersAttributesDto.toModel() = UsersAttributesModel(
    about,
    avatar?.toModel(),
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