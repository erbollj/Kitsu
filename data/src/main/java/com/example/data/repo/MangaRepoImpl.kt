package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.network.MangaApi
import com.example.data.pagging.MangaPagingSource
import com.example.domain.model.manga.MangaAttributesModel
import com.example.domain.repo.MangaRepo
import kotlinx.coroutines.flow.Flow

class MangaRepoImpl(private val api: MangaApi) : MangaRepo {

    override fun getManga(filter: List<String>?): Flow<PagingData<MangaAttributesModel>> {
        return Pager(
            PagingConfig(10),
            pagingSourceFactory = {
                MangaPagingSource(api, filter = filter)
            }).flow
    }

}