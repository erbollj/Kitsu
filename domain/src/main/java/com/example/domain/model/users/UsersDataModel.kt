package com.example.domain.model.users

data class UsersDataModel(
    val attributes: UsersAttributesModel? = UsersAttributesModel(),
    val id: String? = "",
    val links: UsersLinksSelfModel? = UsersLinksSelfModel(),
    val type: String? = ""
)