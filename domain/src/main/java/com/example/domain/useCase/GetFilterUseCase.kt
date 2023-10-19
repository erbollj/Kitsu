package com.example.domain.useCase

import com.example.domain.repo.FilterRepo

class GetFilterUseCase(private val repo: FilterRepo) {

    fun getFilter() = repo.getFilter()

}