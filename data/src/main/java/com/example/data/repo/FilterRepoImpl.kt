package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.network.FilterApi
import com.example.data.pagging.FilterPagingSource
import com.example.domain.model.filter.FilterAttributesModel
import com.example.domain.repo.FilterRepo
import kotlinx.coroutines.flow.Flow

class FilterRepoImpl(private val api: FilterApi) : FilterRepo {

    override fun getFilter(): Flow<PagingData<FilterAttributesModel>> {
        return Pager(
            PagingConfig(10),
            pagingSourceFactory = {
                FilterPagingSource(api)
            }).flow
    }

}