package com.example.domain.model.users

data class UsersModel(
    val `data`: List<UsersDataModel>? = listOf(),
    val links: UsersLinksModel? = UsersLinksModel(),
)