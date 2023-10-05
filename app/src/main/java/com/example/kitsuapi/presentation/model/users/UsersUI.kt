package com.example.kitsuapi.presentation.model.users

data class UsersUI(
    val `data`: List<UsersDataUI>? = listOf(),
    val links: UsersLinksUI? = UsersLinksUI(),
)