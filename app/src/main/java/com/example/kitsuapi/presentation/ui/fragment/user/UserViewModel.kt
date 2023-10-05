package com.example.kitsuapi.presentation.ui.fragment.user

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import com.example.domain.useCase.GetUsersUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.users.UsersAttributesUI
import com.example.kitsuapi.presentation.model.users.toUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class UserViewModel(
    private val getUsersUseCase: GetUsersUseCase
) : BaseViewModel() {

    private var _getUsers =
        MutableStateFlow<PagingData<UsersAttributesUI>>(PagingData.empty())
    val getUsers = _getUsers.asStateFlow()

    fun getUsers() {
        viewModelScope.launch {
            getUsersUseCase.getUsers().collect {
                _getUsers.value = it.map { it.toUI() }
            }
        }
    }
}