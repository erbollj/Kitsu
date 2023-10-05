package com.example.kitsuapi.presentation.model.users

import com.example.domain.model.users.UsersAvatarModel

data class UsersAvatarUI(
    val large: String? = null,
    val medium: String? = null,
    val original: String? = null,
    val small: String? = null,
    val tiny: String? = null
)

fun UsersAvatarModel.toUI() = UsersAvatarUI(large, medium, original, small, tiny)