package com.example.domain.repo

import com.example.domain.model.login.UserDataModel
import com.example.domain.model.login.UserModel
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

interface LoginRepo {

    fun login(userDataModel: UserDataModel): Flow<Either<String, UserModel>>

}