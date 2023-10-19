package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.filter.FilterAttributesModel
import kotlinx.coroutines.flow.Flow

interface FilterRepo {

    fun getFilter(): Flow<PagingData<FilterAttributesModel>>

}