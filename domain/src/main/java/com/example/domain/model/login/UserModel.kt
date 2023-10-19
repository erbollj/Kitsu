package com.example.domain.model.login


data class UserModel(
    val accessToken: String? = null,
    val createdAt: Int? = null,
    val expiresIn: Int? = null,
    val refreshToken: String? = null,
    val scope: String? = null,
    val tokenType: String? = null
)