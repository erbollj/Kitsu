package com.example.kitsuapi.presentation.model.users

data class UsersDataUI(
    val attributes: UsersAttributesUI? = UsersAttributesUI(),
    val id: String? = "",
    val links: UsersLinksSelfUI? = UsersLinksSelfUI(),
    val type: String? = ""
)