package com.example.data.repo

import com.example.data.base.doRequest
import com.example.data.model.login.toDto
import com.example.data.model.login.toModel
import com.example.data.network.LoginApi
import com.example.domain.model.login.UserDataModel
import com.example.domain.model.login.UserModel
import com.example.domain.repo.LoginRepo
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

class LoginRepoImpl(private val api: LoginApi) : LoginRepo {

    override fun login(userDataModel: UserDataModel): Flow<Either<String, UserModel>> = doRequest {
        api.login(userDataModel.toDto()).body()!!.toModel()
    }

}