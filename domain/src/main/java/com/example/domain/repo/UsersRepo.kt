package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.users.UsersAttributesModel
import kotlinx.coroutines.flow.Flow

interface UsersRepo {

    fun getUsers(): Flow<PagingData<UsersAttributesModel>>

}