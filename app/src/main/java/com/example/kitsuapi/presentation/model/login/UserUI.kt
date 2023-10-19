package com.example.kitsuapi.presentation.model.login

import com.example.domain.model.login.UserModel


data class UserUI(
    val accessToken: String? = null,
    val createdAt: Int? = null,
    val expiresIn: Int? = null,
    val refreshToken: String? = null,
    val scope: String? = null,
    val tokenType: String? = null
)

fun UserModel.toUI() = UserUI(accessToken, createdAt, expiresIn, refreshToken, scope, tokenType)