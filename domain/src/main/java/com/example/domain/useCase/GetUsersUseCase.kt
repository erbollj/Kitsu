package com.example.domain.useCase

import com.example.domain.repo.UsersRepo

class GetUsersUseCase(private val repo: UsersRepo) {
    fun getUsers() = repo.getUsers()
}