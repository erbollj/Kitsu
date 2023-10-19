package com.example.kitsuapi.presentation.model.login

import com.example.domain.model.login.UserDataModel


data class UserDataUI(
    val grantType: String? = null,
    val password: String? = null,
    val username: String? = null
)

fun UserDataUI.toModel() = UserDataModel(grantType, password, username)