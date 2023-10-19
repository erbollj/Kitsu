package com.example.kitsuapi.presentation.ui.fragment.login

import com.example.domain.useCase.LoginUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.login.UserDataUI
import com.example.kitsuapi.presentation.model.login.UserUI
import com.example.kitsuapi.presentation.model.login.toModel
import com.example.kitsuapi.presentation.model.login.toUI
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel(
    private val useCase: LoginUseCase,
) : BaseViewModel() {

    private val _login = mutableUiStateFlow<UserUI>()
    val login = _login.asStateFlow()

    fun login(userDataUI: UserDataUI) =
        useCase.login(userDataUI.toModel()).gatherRequest(_login) { it.toUI() }

}