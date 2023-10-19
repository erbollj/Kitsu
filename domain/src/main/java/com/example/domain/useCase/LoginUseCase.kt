package com.example.domain.useCase

import com.example.domain.model.login.UserDataModel
import com.example.domain.repo.LoginRepo

class LoginUseCase(private val repo: LoginRepo) {

    fun login(userDataModel: UserDataModel) = repo.login(userDataModel)

}