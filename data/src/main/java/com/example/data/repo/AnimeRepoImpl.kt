package com.example.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.network.AnimeApi
import com.example.data.pagging.AnimePagingSource
import com.example.domain.model.anime.AnimeAttributesModel
import com.example.domain.repo.AnimeRepo
import kotlinx.coroutines.flow.Flow

class AnimeRepoImpl(private val api: AnimeApi) : AnimeRepo {

    override fun getAnime(): Flow<PagingData<AnimeAttributesModel>> {
        return Pager(
            PagingConfig(10),
            pagingSourceFactory = {
                AnimePagingSource(api)
            }).flow
    }

}