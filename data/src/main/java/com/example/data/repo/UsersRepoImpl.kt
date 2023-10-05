package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.network.UsersApi
import com.example.data.pagging.UsersPagingSource
import com.example.domain.model.users.UsersAttributesModel
import com.example.domain.repo.UsersRepo
import kotlinx.coroutines.flow.Flow

class UsersRepoImpl(private val api: UsersApi) : UsersRepo {

    override fun getUsers(): Flow<PagingData<UsersAttributesModel>> {
        return Pager(
            PagingConfig(10),
            pagingSourceFactory = {
                UsersPagingSource(api)
            }).flow
    }

}